package net.minecraft.entity.passive;

import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.DoublePlantBlock;
import net.minecraft.block.StemBlock;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.Pose;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.entity.ai.controller.FlyingMovementController;
import net.minecraft.entity.ai.controller.LookController;
import net.minecraft.entity.ai.goal.BreedGoal;
import net.minecraft.entity.ai.goal.FollowParentGoal;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.network.DebugPacketSender;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.pathfinding.FlyingPathNavigator;
import net.minecraft.pathfinding.Path;
import net.minecraft.pathfinding.PathNavigator;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.tileentity.BeehiveTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.village.PointOfInterest;
import net.minecraft.village.PointOfInterestManager;
import net.minecraft.village.PointOfInterestType;
import net.minecraft.world.Difficulty;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class BeeEntity extends AnimalEntity implements IFlyingAnimal
{
    private static final DataParameter<Byte> DATA_FLAGS_ID = EntityDataManager.createKey(BeeEntity.class, DataSerializers.BYTE);
    private static final DataParameter<Integer> ANGER_TIME = EntityDataManager.createKey(BeeEntity.class, DataSerializers.VARINT);
    private UUID lastHurtBy;
    private float rollAmount;
    private float rollAmountO;
    private int timeSinceSting;
    private int ticksWithoutNectarSinceExitingHive;
    private int stayOutOfHiveCountdown;
    private int numCropsGrownSincePollination;
    private int remainingCooldownBeforeLocatingNewHive = 0;
    private int remainingCooldownBeforeLocatingNewFlower = 0;
    @Nullable
    private BlockPos savedFlowerPos = null;
    @Nullable
    private BlockPos hivePos = null;
    private BeeEntity.PollinateGoal pollinateGoal;
    private BeeEntity.FindBeehiveGoal findBeehiveGoal;
    private BeeEntity.FindFlowerGoal findFlowerGoal;
    private int underWaterTicks;

    public BeeEntity(EntityType <? extends BeeEntity > p_i938_1_, World p_i938_2_)
    {
        super(p_i938_1_, p_i938_2_);
        this.moveController = new FlyingMovementController(this, 20, true);
        this.lookController = new BeeEntity.BeeLookController(this);
        this.setPathPriority(PathNodeType.WATER, -1.0F);
        this.setPathPriority(PathNodeType.COCOA, -1.0F);
        this.setPathPriority(PathNodeType.FENCE, -1.0F);
    }

    protected void registerData()
    {
        super.registerData();
        this.dataManager.register(DATA_FLAGS_ID, (byte)0);
        this.dataManager.register(ANGER_TIME, 0);
    }

    public float getBlockPathWeight(BlockPos pos, IWorldReader worldIn)
    {
        return worldIn.getBlockState(pos).isAir() ? 10.0F : 0.0F;
    }

    protected void registerGoals()
    {
        this.goalSelector.addGoal(0, new BeeEntity.StingGoal(this, (double)1.4F, true));
        this.goalSelector.addGoal(1, new BeeEntity.EnterBeehiveGoal());
        this.goalSelector.addGoal(2, new BreedGoal(this, 1.0D));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1.25D, Ingredient.fromTag(ItemTags.FLOWERS), false));
        this.pollinateGoal = new BeeEntity.PollinateGoal();
        this.goalSelector.addGoal(4, this.pollinateGoal);
        this.goalSelector.addGoal(5, new FollowParentGoal(this, 1.25D));
        this.goalSelector.addGoal(5, new BeeEntity.UpdateBeehiveGoal());
        this.findBeehiveGoal = new BeeEntity.FindBeehiveGoal();
        this.goalSelector.addGoal(5, this.findBeehiveGoal);
        this.findFlowerGoal = new BeeEntity.FindFlowerGoal();
        this.goalSelector.addGoal(6, this.findFlowerGoal);
        this.goalSelector.addGoal(7, new BeeEntity.FindPollinationTargetGoal());
        this.goalSelector.addGoal(8, new BeeEntity.WanderGoal());
        this.goalSelector.addGoal(9, new SwimGoal(this));
        this.targetSelector.addGoal(1, (new BeeEntity.AngerGoal(this)).setCallsForHelp(new Class[0]));
        this.targetSelector.addGoal(2, new BeeEntity.AttackPlayerGoal(this));
    }

    public void writeAdditional(CompoundNBT compound)
    {
        super.writeAdditional(compound);

        if (this.func_226409_eA_())
        {
            compound.put("HivePos", NBTUtil.writeBlockPos(this.func_226410_eB_()));
        }

        if (this.func_226425_er_())
        {
            compound.put("FlowerPos", NBTUtil.writeBlockPos(this.func_226424_eq_()));
        }

        compound.putBoolean("HasNectar", this.func_226411_eD_());
        compound.putBoolean("HasStung", this.func_226412_eE_());
        compound.putInt("TicksSincePollination", this.ticksWithoutNectarSinceExitingHive);
        compound.putInt("CannotEnterHiveTicks", this.stayOutOfHiveCountdown);
        compound.putInt("CropsGrownSincePollination", this.numCropsGrownSincePollination);
        compound.putInt("Anger", this.func_226418_eL_());

        if (this.lastHurtBy != null)
        {
            compound.putString("HurtBy", this.lastHurtBy.toString());
        }
        else
        {
            compound.putString("HurtBy", "");
        }
    }

    public void readAdditional(CompoundNBT compound)
    {
        this.hivePos = null;

        if (compound.contains("HivePos"))
        {
            this.hivePos = NBTUtil.readBlockPos(compound.getCompound("HivePos"));
        }

        this.savedFlowerPos = null;

        if (compound.contains("FlowerPos"))
        {
            this.savedFlowerPos = NBTUtil.readBlockPos(compound.getCompound("FlowerPos"));
        }

        super.readAdditional(compound);
        this.func_226447_r_(compound.getBoolean("HasNectar"));
        this.func_226449_s_(compound.getBoolean("HasStung"));
        this.func_226453_u_(compound.getInt("Anger"));
        this.ticksWithoutNectarSinceExitingHive = compound.getInt("TicksSincePollination");
        this.stayOutOfHiveCountdown = compound.getInt("CannotEnterHiveTicks");
        this.numCropsGrownSincePollination = compound.getInt("CropsGrownSincePollination");
        String s = compound.getString("HurtBy");

        if (!s.isEmpty())
        {
            this.lastHurtBy = UUID.fromString(s);
            PlayerEntity playerentity = this.world.getPlayerByUuid(this.lastHurtBy);
            this.setRevengeTarget(playerentity);

            if (playerentity != null)
            {
                this.attackingPlayer = playerentity;
                this.recentlyHit = this.getRevengeTimer();
            }
        }
    }

    public boolean attackEntityAsMob(Entity entityIn)
    {
        boolean flag = entityIn.attackEntityFrom(DamageSource.func_226252_a_(this), (float)((int)this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getValue()));

        if (flag)
        {
            this.applyEnchantments(this, entityIn);

            if (entityIn instanceof LivingEntity)
            {
                ((LivingEntity)entityIn).setBeeStingCount(((LivingEntity)entityIn).getBeeStingCount() + 1);
                int i = 0;

                if (this.world.getDifficulty() == Difficulty.NORMAL)
                {
                    i = 10;
                }
                else if (this.world.getDifficulty() == Difficulty.HARD)
                {
                    i = 18;
                }

                if (i > 0)
                {
                    ((LivingEntity)entityIn).addPotionEffect(new EffectInstance(Effects.POISON, i * 20, 0));
                }
            }

            this.func_226449_s_(true);
            this.setAttackTarget((LivingEntity)null);
            this.playSound(SoundEvents.field_226128_ac_, 1.0F, 1.0F);
        }

        return flag;
    }

    public void tick()
    {
        super.tick();

        if (this.func_226411_eD_() && this.func_226419_eM_() < 10 && this.rand.nextFloat() < 0.05F)
        {
            for (int i = 0; i < this.rand.nextInt(2) + 1; ++i)
            {
                this.func_226397_a_(this.world, this.getPosX() - (double)0.3F, this.getPosX() + (double)0.3F, this.getPosZ() - (double)0.3F, this.getPosZ() + (double)0.3F, this.getPosYHeight(0.5D), ParticleTypes.FALLING_NECTAR);
            }
        }

        this.func_226416_eJ_();
    }

    private void func_226397_a_(World p_226397_1_, double p_226397_2_, double p_226397_4_, double p_226397_6_, double p_226397_8_, double p_226397_10_, IParticleData p_226397_12_)
    {
        p_226397_1_.addParticle(p_226397_12_, MathHelper.lerp(p_226397_1_.rand.nextDouble(), p_226397_2_, p_226397_4_), p_226397_10_, MathHelper.lerp(p_226397_1_.rand.nextDouble(), p_226397_6_, p_226397_8_), 0.0D, 0.0D, 0.0D);
    }

    private void func_226433_h_(BlockPos p_226433_1_)
    {
        Vec3d vec3d = new Vec3d(p_226433_1_);
        int i = 0;
        BlockPos blockpos = new BlockPos(this);
        int j = (int)vec3d.y - blockpos.getY();

        if (j > 2)
        {
            i = 4;
        }
        else if (j < -2)
        {
            i = -4;
        }

        int k = 6;
        int l = 8;
        int i1 = blockpos.manhattanDistance(p_226433_1_);

        if (i1 < 15)
        {
            k = i1 / 2;
            l = i1 / 2;
        }

        Vec3d vec3d1 = RandomPositionGenerator.func_226344_b_(this, k, l, i, vec3d, (double)((float)Math.PI / 10F));

        if (vec3d1 != null)
        {
            this.navigator.func_226335_a_(0.5F);
            this.navigator.tryMoveToXYZ(vec3d1.x, vec3d1.y, vec3d1.z, 1.0D);
        }
    }

    @Nullable
    public BlockPos func_226424_eq_()
    {
        return this.savedFlowerPos;
    }

    public boolean func_226425_er_()
    {
        return this.savedFlowerPos != null;
    }

    public void func_226431_g_(BlockPos p_226431_1_)
    {
        this.savedFlowerPos = p_226431_1_;
    }

    private boolean func_226414_eH_()
    {
        return this.ticksWithoutNectarSinceExitingHive > 3600;
    }

    private boolean func_226415_eI_()
    {
        if (this.stayOutOfHiveCountdown <= 0 && !this.pollinateGoal.func_226503_k_() && !this.func_226412_eE_())
        {
            boolean flag = this.func_226414_eH_() || this.world.isRaining() || this.world.isNightTime() || this.func_226411_eD_();
            return flag && !this.func_226417_eK_();
        }
        else
        {
            return false;
        }
    }

    public void func_226450_t_(int p_226450_1_)
    {
        this.stayOutOfHiveCountdown = p_226450_1_;
    }

    public float func_226455_v_(float p_226455_1_)
    {
        return MathHelper.lerp(p_226455_1_, this.rollAmountO, this.rollAmount);
    }

    private void func_226416_eJ_()
    {
        this.rollAmountO = this.rollAmount;

        if (this.func_226423_eQ_())
        {
            this.rollAmount = Math.min(1.0F, this.rollAmount + 0.2F);
        }
        else
        {
            this.rollAmount = Math.max(0.0F, this.rollAmount - 0.24F);
        }
    }

    public void setRevengeTarget(@Nullable LivingEntity livingBase)
    {
        super.setRevengeTarget(livingBase);

        if (livingBase != null)
        {
            this.lastHurtBy = livingBase.getUniqueID();
        }
    }

    protected void updateAITasks()
    {
        boolean flag = this.func_226412_eE_();

        if (this.isInWaterOrBubbleColumn())
        {
            ++this.underWaterTicks;
        }
        else
        {
            this.underWaterTicks = 0;
        }

        if (this.underWaterTicks > 20)
        {
            this.attackEntityFrom(DamageSource.DROWN, 1.0F);
        }

        if (flag)
        {
            ++this.timeSinceSting;

            if (this.timeSinceSting % 5 == 0 && this.rand.nextInt(MathHelper.clamp(1200 - this.timeSinceSting, 1, 1200)) == 0)
            {
                this.attackEntityFrom(DamageSource.GENERIC, this.getHealth());
            }
        }

        if (this.func_226427_ez_())
        {
            int i = this.func_226418_eL_();
            this.func_226453_u_(i - 1);
            LivingEntity livingentity = this.getAttackTarget();

            if (i == 0 && livingentity != null)
            {
                this.func_226391_a_(livingentity);
            }
        }

        if (!this.func_226411_eD_())
        {
            ++this.ticksWithoutNectarSinceExitingHive;
        }
    }

    public void func_226426_eu_()
    {
        this.ticksWithoutNectarSinceExitingHive = 0;
    }

    private boolean func_226417_eK_()
    {
        if (this.hivePos == null)
        {
            return false;
        }
        else
        {
            TileEntity tileentity = this.world.getTileEntity(this.hivePos);
            return tileentity instanceof BeehiveTileEntity && ((BeehiveTileEntity)tileentity).func_226968_d_();
        }
    }

    public boolean func_226427_ez_()
    {
        return this.func_226418_eL_() > 0;
    }

    private int func_226418_eL_()
    {
        return this.dataManager.get(ANGER_TIME);
    }

    private void func_226453_u_(int p_226453_1_)
    {
        this.dataManager.set(ANGER_TIME, p_226453_1_);
    }

    private boolean func_226435_i_(BlockPos p_226435_1_)
    {
        TileEntity tileentity = this.world.getTileEntity(p_226435_1_);

        if (tileentity instanceof BeehiveTileEntity)
        {
            return !((BeehiveTileEntity)tileentity).func_226970_h_();
        }
        else
        {
            return false;
        }
    }

    public boolean func_226409_eA_()
    {
        return this.hivePos != null;
    }

    @Nullable
    public BlockPos func_226410_eB_()
    {
        return this.hivePos;
    }

    protected void sendDebugPackets()
    {
        super.sendDebugPackets();
        DebugPacketSender.func_229749_a_(this);
    }

    private int func_226419_eM_()
    {
        return this.numCropsGrownSincePollination;
    }

    private void func_226420_eN_()
    {
        this.numCropsGrownSincePollination = 0;
    }

    private void func_226421_eO_()
    {
        ++this.numCropsGrownSincePollination;
    }

    public void livingTick()
    {
        super.livingTick();

        if (!this.world.isRemote)
        {
            if (this.stayOutOfHiveCountdown > 0)
            {
                --this.stayOutOfHiveCountdown;
            }

            if (this.remainingCooldownBeforeLocatingNewHive > 0)
            {
                --this.remainingCooldownBeforeLocatingNewHive;
            }

            if (this.remainingCooldownBeforeLocatingNewFlower > 0)
            {
                --this.remainingCooldownBeforeLocatingNewFlower;
            }

            boolean flag = this.func_226427_ez_() && !this.func_226412_eE_() && this.getAttackTarget() != null && this.getAttackTarget().getDistanceSq(this) < 4.0D;
            this.func_226452_t_(flag);

            if (this.ticksExisted % 20 == 0 && !this.func_226422_eP_())
            {
                this.hivePos = null;
            }
        }
    }

    private boolean func_226422_eP_()
    {
        if (!this.func_226409_eA_())
        {
            return false;
        }
        else
        {
            TileEntity tileentity = this.world.getTileEntity(this.hivePos);
            return tileentity != null && tileentity.getType() == TileEntityType.field_226985_G_;
        }
    }

    public boolean func_226411_eD_()
    {
        return this.func_226456_v_(8);
    }

    private void func_226447_r_(boolean p_226447_1_)
    {
        if (p_226447_1_)
        {
            this.func_226426_eu_();
        }

        this.func_226404_d_(8, p_226447_1_);
    }

    public boolean func_226412_eE_()
    {
        return this.func_226456_v_(4);
    }

    private void func_226449_s_(boolean p_226449_1_)
    {
        this.func_226404_d_(4, p_226449_1_);
    }

    private boolean func_226423_eQ_()
    {
        return this.func_226456_v_(2);
    }

    private void func_226452_t_(boolean p_226452_1_)
    {
        this.func_226404_d_(2, p_226452_1_);
    }

    private boolean func_226437_j_(BlockPos p_226437_1_)
    {
        return !this.func_226401_b_(p_226437_1_, 48);
    }

    private void func_226404_d_(int p_226404_1_, boolean p_226404_2_)
    {
        if (p_226404_2_)
        {
            this.dataManager.set(DATA_FLAGS_ID, (byte)(this.dataManager.get(DATA_FLAGS_ID) | p_226404_1_));
        }
        else
        {
            this.dataManager.set(DATA_FLAGS_ID, (byte)(this.dataManager.get(DATA_FLAGS_ID) & ~p_226404_1_));
        }
    }

    private boolean func_226456_v_(int p_226456_1_)
    {
        return (this.dataManager.get(DATA_FLAGS_ID) & p_226456_1_) != 0;
    }

    protected void registerAttributes()
    {
        super.registerAttributes();
        this.getAttributes().registerAttribute(SharedMonsterAttributes.FLYING_SPEED);
        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
        this.getAttribute(SharedMonsterAttributes.FLYING_SPEED).setBaseValue((double)0.6F);
        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)0.3F);
        this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.0D);
        this.getAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(48.0D);
    }

    protected PathNavigator createNavigator(World worldIn)
    {
        FlyingPathNavigator flyingpathnavigator = new FlyingPathNavigator(this, worldIn)
        {
            public boolean canEntityStandOnPos(BlockPos pos)
            {
                return !this.world.getBlockState(pos.down()).isAir();
            }
            public void tick()
            {
                if (!BeeEntity.this.pollinateGoal.func_226503_k_())
                {
                    super.tick();
                }
            }
        };
        flyingpathnavigator.setCanOpenDoors(false);
        flyingpathnavigator.setCanSwim(false);
        flyingpathnavigator.setCanEnterDoors(true);
        return flyingpathnavigator;
    }

    public boolean isBreedingItem(ItemStack stack)
    {
        return stack.getItem().isIn(ItemTags.FLOWERS);
    }

    private boolean func_226439_k_(BlockPos p_226439_1_)
    {
        return this.world.isBlockPresent(p_226439_1_) && this.world.getBlockState(p_226439_1_).getBlock().isIn(BlockTags.FLOWERS);
    }

    protected void playStepSound(BlockPos pos, BlockState blockIn)
    {
    }

    protected SoundEvent getAmbientSound()
    {
        return null;
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return SoundEvents.field_226125_Z_;
    }

    protected SoundEvent getDeathSound()
    {
        return SoundEvents.field_226124_Y_;
    }

    protected float getSoundVolume()
    {
        return 0.4F;
    }

    public BeeEntity createChild(AgeableEntity ageable)
    {
        return EntityType.BEE.create(this.world);
    }

    protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn)
    {
        return this.isChild() ? sizeIn.height * 0.5F : sizeIn.height * 0.5F;
    }

    public boolean onLivingFall(float distance, float damageMultiplier)
    {
        return false;
    }

    protected void updateFallState(double y, boolean onGroundIn, BlockState state, BlockPos pos)
    {
    }

    protected boolean makeFlySound()
    {
        return true;
    }

    public void func_226413_eG_()
    {
        this.func_226447_r_(false);
        this.func_226420_eN_();
    }

    public boolean func_226391_a_(Entity p_226391_1_)
    {
        this.func_226453_u_(400 + this.rand.nextInt(400));

        if (p_226391_1_ instanceof LivingEntity)
        {
            this.setRevengeTarget((LivingEntity)p_226391_1_);
        }

        return true;
    }

    public boolean attackEntityFrom(DamageSource source, float amount)
    {
        if (this.isInvulnerableTo(source))
        {
            return false;
        }
        else
        {
            Entity entity = source.getTrueSource();

            if (!this.world.isRemote && entity instanceof PlayerEntity && !((PlayerEntity)entity).isCreative() && this.canEntityBeSeen(entity) && !this.isAIDisabled())
            {
                this.pollinateGoal.func_226504_l_();
                this.func_226391_a_(entity);
            }

            return super.attackEntityFrom(source, amount);
        }
    }

    public CreatureAttribute getCreatureAttribute()
    {
        return CreatureAttribute.ARTHROPOD;
    }

    protected void handleFluidJump(Tag<Fluid> fluidTag)
    {
        this.setMotion(this.getMotion().add(0.0D, 0.01D, 0.0D));
    }

    private boolean func_226401_b_(BlockPos p_226401_1_, int p_226401_2_)
    {
        return p_226401_1_.withinDistance(new BlockPos(this), (double)p_226401_2_);
    }

    class AngerGoal extends HurtByTargetGoal
    {
        AngerGoal(BeeEntity p_i3481_2_)
        {
            super(p_i3481_2_);
        }

        protected void setAttackTarget(MobEntity mobIn, LivingEntity targetIn)
        {
            if (mobIn instanceof BeeEntity && this.goalOwner.canEntityBeSeen(targetIn) && ((BeeEntity)mobIn).func_226391_a_(targetIn))
            {
                mobIn.setAttackTarget(targetIn);
            }
        }
    }

    static class AttackPlayerGoal extends NearestAttackableTargetGoal<PlayerEntity>
    {
        AttackPlayerGoal(BeeEntity p_i990_1_)
        {
            super(p_i990_1_, PlayerEntity.class, true);
        }

        public boolean shouldExecute()
        {
            return this.func_226465_h_() && super.shouldExecute();
        }

        public boolean shouldContinueExecuting()
        {
            boolean flag = this.func_226465_h_();

            if (flag && this.goalOwner.getAttackTarget() != null)
            {
                return super.shouldContinueExecuting();
            }
            else
            {
                this.target = null;
                return false;
            }
        }

        private boolean func_226465_h_()
        {
            BeeEntity beeentity = (BeeEntity)this.goalOwner;
            return beeentity.func_226427_ez_() && !beeentity.func_226412_eE_();
        }
    }

    class BeeLookController extends LookController
    {
        BeeLookController(MobEntity p_i2321_2_)
        {
            super(p_i2321_2_);
        }

        public void tick()
        {
            if (!BeeEntity.this.func_226427_ez_())
            {
                super.tick();
            }
        }

        protected boolean func_220680_b()
        {
            return !BeeEntity.this.pollinateGoal.func_226503_k_();
        }
    }

    class EnterBeehiveGoal extends BeeEntity.PassiveGoal
    {
        private EnterBeehiveGoal()
        {
        }

        public boolean func_225506_g_()
        {
            if (BeeEntity.this.func_226409_eA_() && BeeEntity.this.func_226415_eI_() && BeeEntity.this.hivePos.withinDistance(BeeEntity.this.getPositionVec(), 2.0D))
            {
                TileEntity tileentity = BeeEntity.this.world.getTileEntity(BeeEntity.this.hivePos);

                if (tileentity instanceof BeehiveTileEntity)
                {
                    BeehiveTileEntity beehivetileentity = (BeehiveTileEntity)tileentity;

                    if (!beehivetileentity.func_226970_h_())
                    {
                        return true;
                    }

                    BeeEntity.this.hivePos = null;
                }
            }

            return false;
        }

        public boolean func_225507_h_()
        {
            return false;
        }

        public void startExecuting()
        {
            TileEntity tileentity = BeeEntity.this.world.getTileEntity(BeeEntity.this.hivePos);

            if (tileentity instanceof BeehiveTileEntity)
            {
                BeehiveTileEntity beehivetileentity = (BeehiveTileEntity)tileentity;
                beehivetileentity.func_226961_a_(BeeEntity.this, BeeEntity.this.func_226411_eD_());
            }
        }
    }

    public class FindBeehiveGoal extends BeeEntity.PassiveGoal
    {
        private int field_226468_c_ = BeeEntity.this.world.rand.nextInt(10);
        private List<BlockPos> field_226469_d_ = Lists.newArrayList();
        @Nullable
        private Path field_226470_e_ = null;

        FindBeehiveGoal()
        {
            this.setMutexFlags(EnumSet.of(Goal.Flag.MOVE));
        }

        public boolean func_225506_g_()
        {
            return BeeEntity.this.hivePos != null && !BeeEntity.this.detachHome() && BeeEntity.this.func_226415_eI_() && !this.func_226476_d_(BeeEntity.this.hivePos) && BeeEntity.this.world.getBlockState(BeeEntity.this.hivePos).isIn(BlockTags.BEEHIVES);
        }

        public boolean func_225507_h_()
        {
            return this.func_225506_g_();
        }

        public void startExecuting()
        {
            this.field_226468_c_ = 0;
            super.startExecuting();
        }

        public void resetTask()
        {
            this.field_226468_c_ = 0;
            BeeEntity.this.navigator.clearPath();
            BeeEntity.this.navigator.func_226336_g_();
        }

        public void tick()
        {
            if (BeeEntity.this.hivePos != null)
            {
                ++this.field_226468_c_;

                if (this.field_226468_c_ > 600)
                {
                    this.func_226478_k_();
                }
                else if (!BeeEntity.this.navigator.func_226337_n_())
                {
                    if (!BeeEntity.this.func_226401_b_(BeeEntity.this.hivePos, 16))
                    {
                        if (BeeEntity.this.func_226437_j_(BeeEntity.this.hivePos))
                        {
                            this.func_226479_l_();
                        }
                        else
                        {
                            BeeEntity.this.func_226433_h_(BeeEntity.this.hivePos);
                        }
                    }
                    else
                    {
                        boolean flag = this.func_226472_a_(BeeEntity.this.hivePos);

                        if (!flag)
                        {
                            this.func_226478_k_();
                        }
                        else if (this.field_226470_e_ != null && BeeEntity.this.navigator.getPath().isSamePath(this.field_226470_e_))
                        {
                            this.func_226479_l_();
                        }
                        else
                        {
                            this.field_226470_e_ = BeeEntity.this.navigator.getPath();
                        }
                    }
                }
            }
        }

        private boolean func_226472_a_(BlockPos p_226472_1_)
        {
            BeeEntity.this.navigator.func_226335_a_(10.0F);
            BeeEntity.this.navigator.tryMoveToXYZ((double)p_226472_1_.getX(), (double)p_226472_1_.getY(), (double)p_226472_1_.getZ(), 1.0D);
            return BeeEntity.this.navigator.getPath() != null && BeeEntity.this.navigator.getPath().func_224771_h();
        }

        private boolean func_226473_b_(BlockPos p_226473_1_)
        {
            return this.field_226469_d_.contains(p_226473_1_);
        }

        private void func_226475_c_(BlockPos p_226475_1_)
        {
            this.field_226469_d_.add(p_226475_1_);

            while (this.field_226469_d_.size() > 3)
            {
                this.field_226469_d_.remove(0);
            }
        }

        private void func_226477_j_()
        {
            this.field_226469_d_.clear();
        }

        private void func_226478_k_()
        {
            if (BeeEntity.this.hivePos != null)
            {
                this.func_226475_c_(BeeEntity.this.hivePos);
            }

            this.func_226479_l_();
        }

        private void func_226479_l_()
        {
            BeeEntity.this.hivePos = null;
            BeeEntity.this.remainingCooldownBeforeLocatingNewHive = 200;
        }

        private boolean func_226476_d_(BlockPos p_226476_1_)
        {
            if (BeeEntity.this.func_226401_b_(p_226476_1_, 2))
            {
                return true;
            }
            else
            {
                Path path = BeeEntity.this.navigator.getPath();
                return path != null && path.func_224770_k().equals(p_226476_1_) && path.func_224771_h() && path.isFinished();
            }
        }
    }

    public class FindFlowerGoal extends BeeEntity.PassiveGoal
    {
        private int field_226481_c_ = BeeEntity.this.world.rand.nextInt(10);

        FindFlowerGoal()
        {
            this.setMutexFlags(EnumSet.of(Goal.Flag.MOVE));
        }

        public boolean func_225506_g_()
        {
            return BeeEntity.this.savedFlowerPos != null && !BeeEntity.this.detachHome() && this.func_226482_j_() && BeeEntity.this.func_226439_k_(BeeEntity.this.savedFlowerPos) && !BeeEntity.this.func_226401_b_(BeeEntity.this.savedFlowerPos, 2);
        }

        public boolean func_225507_h_()
        {
            return this.func_225506_g_();
        }

        public void startExecuting()
        {
            this.field_226481_c_ = 0;
            super.startExecuting();
        }

        public void resetTask()
        {
            this.field_226481_c_ = 0;
            BeeEntity.this.navigator.clearPath();
            BeeEntity.this.navigator.func_226336_g_();
        }

        public void tick()
        {
            if (BeeEntity.this.savedFlowerPos != null)
            {
                ++this.field_226481_c_;

                if (this.field_226481_c_ > 600)
                {
                    BeeEntity.this.savedFlowerPos = null;
                }
                else if (!BeeEntity.this.navigator.func_226337_n_())
                {
                    if (BeeEntity.this.func_226437_j_(BeeEntity.this.savedFlowerPos))
                    {
                        BeeEntity.this.savedFlowerPos = null;
                    }
                    else
                    {
                        BeeEntity.this.func_226433_h_(BeeEntity.this.savedFlowerPos);
                    }
                }
            }
        }

        private boolean func_226482_j_()
        {
            return BeeEntity.this.ticksWithoutNectarSinceExitingHive > 2400;
        }
    }

    class FindPollinationTargetGoal extends BeeEntity.PassiveGoal
    {
        private FindPollinationTargetGoal()
        {
        }

        public boolean func_225506_g_()
        {
            if (BeeEntity.this.func_226419_eM_() >= 10)
            {
                return false;
            }
            else if (BeeEntity.this.rand.nextFloat() < 0.3F)
            {
                return false;
            }
            else
            {
                return BeeEntity.this.func_226411_eD_() && BeeEntity.this.func_226422_eP_();
            }
        }

        public boolean func_225507_h_()
        {
            return this.func_225506_g_();
        }

        public void tick()
        {
            if (BeeEntity.this.rand.nextInt(30) == 0)
            {
                for (int i = 1; i <= 2; ++i)
                {
                    BlockPos blockpos = (new BlockPos(BeeEntity.this)).down(i);
                    BlockState blockstate = BeeEntity.this.world.getBlockState(blockpos);
                    Block block = blockstate.getBlock();
                    boolean flag = false;
                    IntegerProperty integerproperty = null;

                    if (block.isIn(BlockTags.BEE_GROWABLES))
                    {
                        if (block instanceof CropsBlock)
                        {
                            CropsBlock cropsblock = (CropsBlock)block;

                            if (!cropsblock.isMaxAge(blockstate))
                            {
                                flag = true;
                                integerproperty = cropsblock.getAgeProperty();
                            }
                        }
                        else if (block instanceof StemBlock)
                        {
                            int j = blockstate.get(StemBlock.AGE);

                            if (j < 7)
                            {
                                flag = true;
                                integerproperty = StemBlock.AGE;
                            }
                        }
                        else if (block == Blocks.SWEET_BERRY_BUSH)
                        {
                            int k = blockstate.get(SweetBerryBushBlock.AGE);

                            if (k < 3)
                            {
                                flag = true;
                                integerproperty = SweetBerryBushBlock.AGE;
                            }
                        }

                        if (flag)
                        {
                            BeeEntity.this.world.playEvent(2005, blockpos, 0);
                            BeeEntity.this.world.setBlockState(blockpos, blockstate.with(integerproperty, Integer.valueOf(blockstate.get(integerproperty) + 1)));
                            BeeEntity.this.func_226421_eO_();
                        }
                    }
                }
            }
        }
    }

    abstract class PassiveGoal extends Goal
    {
        private PassiveGoal()
        {
        }

        public abstract boolean func_225506_g_();

        public abstract boolean func_225507_h_();

        public boolean shouldExecute()
        {
            return this.func_225506_g_() && !BeeEntity.this.func_226427_ez_();
        }

        public boolean shouldContinueExecuting()
        {
            return this.func_225507_h_() && !BeeEntity.this.func_226427_ez_();
        }
    }

    class PollinateGoal extends BeeEntity.PassiveGoal
    {
        private final Predicate<BlockState> field_226492_c_ = (p_226499_0_) ->
        {
            if (p_226499_0_.isIn(BlockTags.TALL_FLOWERS))
            {
                if (p_226499_0_.getBlock() == Blocks.SUNFLOWER)
                {
                    return p_226499_0_.get(DoublePlantBlock.HALF) == DoubleBlockHalf.UPPER;
                }
                else
                {
                    return true;
                }
            }
            else {
                return p_226499_0_.isIn(BlockTags.SMALL_FLOWERS);
            }
        };
        private int field_226493_d_ = 0;
        private int field_226494_e_ = 0;
        private boolean field_226495_f_;
        private Vec3d field_226496_g_;
        private int field_226497_h_ = 0;

        PollinateGoal()
        {
            this.setMutexFlags(EnumSet.of(Goal.Flag.MOVE));
        }

        public boolean func_225506_g_()
        {
            if (BeeEntity.this.remainingCooldownBeforeLocatingNewFlower > 0)
            {
                return false;
            }
            else if (BeeEntity.this.func_226411_eD_())
            {
                return false;
            }
            else if (BeeEntity.this.world.isRaining())
            {
                return false;
            }
            else if (BeeEntity.this.rand.nextFloat() < 0.7F)
            {
                return false;
            }
            else
            {
                Optional<BlockPos> optional = this.func_226507_o_();

                if (optional.isPresent())
                {
                    BeeEntity.this.savedFlowerPos = optional.get();
                    BeeEntity.this.navigator.tryMoveToXYZ((double)BeeEntity.this.savedFlowerPos.getX() + 0.5D, (double)BeeEntity.this.savedFlowerPos.getY() + 0.5D, (double)BeeEntity.this.savedFlowerPos.getZ() + 0.5D, (double)1.2F);
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }

        public boolean func_225507_h_()
        {
            if (!this.field_226495_f_)
            {
                return false;
            }
            else if (!BeeEntity.this.func_226425_er_())
            {
                return false;
            }
            else if (BeeEntity.this.world.isRaining())
            {
                return false;
            }
            else if (this.func_226502_j_())
            {
                return BeeEntity.this.rand.nextFloat() < 0.2F;
            }
            else if (BeeEntity.this.ticksExisted % 20 == 0 && !BeeEntity.this.func_226439_k_(BeeEntity.this.savedFlowerPos))
            {
                BeeEntity.this.savedFlowerPos = null;
                return false;
            }
            else
            {
                return true;
            }
        }

        private boolean func_226502_j_()
        {
            return this.field_226493_d_ > 400;
        }

        private boolean func_226503_k_()
        {
            return this.field_226495_f_;
        }

        private void func_226504_l_()
        {
            this.field_226495_f_ = false;
        }

        public void startExecuting()
        {
            this.field_226493_d_ = 0;
            this.field_226497_h_ = 0;
            this.field_226494_e_ = 0;
            this.field_226495_f_ = true;
            BeeEntity.this.func_226426_eu_();
        }

        public void resetTask()
        {
            if (this.func_226502_j_())
            {
                BeeEntity.this.func_226447_r_(true);
            }

            this.field_226495_f_ = false;
            BeeEntity.this.navigator.clearPath();
            BeeEntity.this.remainingCooldownBeforeLocatingNewFlower = 200;
        }

        public void tick()
        {
            ++this.field_226497_h_;

            if (this.field_226497_h_ > 600)
            {
                BeeEntity.this.savedFlowerPos = null;
            }
            else
            {
                Vec3d vec3d = (new Vec3d(BeeEntity.this.savedFlowerPos)).add(0.5D, (double)0.6F, 0.5D);

                if (vec3d.distanceTo(BeeEntity.this.getPositionVec()) > 1.0D)
                {
                    this.field_226496_g_ = vec3d;
                    this.func_226505_m_();
                }
                else
                {
                    if (this.field_226496_g_ == null)
                    {
                        this.field_226496_g_ = vec3d;
                    }

                    boolean flag = BeeEntity.this.getPositionVec().distanceTo(this.field_226496_g_) <= 0.1D;
                    boolean flag1 = true;

                    if (!flag && this.field_226497_h_ > 600)
                    {
                        BeeEntity.this.savedFlowerPos = null;
                    }
                    else
                    {
                        if (flag)
                        {
                            boolean flag2 = BeeEntity.this.rand.nextInt(100) == 0;

                            if (flag2)
                            {
                                this.field_226496_g_ = new Vec3d(vec3d.getX() + (double)this.func_226506_n_(), vec3d.getY(), vec3d.getZ() + (double)this.func_226506_n_());
                                BeeEntity.this.navigator.clearPath();
                            }
                            else
                            {
                                flag1 = false;
                            }

                            BeeEntity.this.getLookController().setLookPosition(vec3d.getX(), vec3d.getY(), vec3d.getZ());
                        }

                        if (flag1)
                        {
                            this.func_226505_m_();
                        }

                        ++this.field_226493_d_;

                        if (BeeEntity.this.rand.nextFloat() < 0.05F && this.field_226493_d_ > this.field_226494_e_ + 60)
                        {
                            this.field_226494_e_ = this.field_226493_d_;
                            BeeEntity.this.playSound(SoundEvents.field_226129_ad_, 1.0F, 1.0F);
                        }
                    }
                }
            }
        }

        private void func_226505_m_()
        {
            BeeEntity.this.getMoveHelper().setMoveTo(this.field_226496_g_.getX(), this.field_226496_g_.getY(), this.field_226496_g_.getZ(), (double)0.35F);
        }

        private float func_226506_n_()
        {
            return (BeeEntity.this.rand.nextFloat() * 2.0F - 1.0F) * 0.33333334F;
        }

        private Optional<BlockPos> func_226507_o_()
        {
            return this.func_226500_a_(this.field_226492_c_, 5.0D);
        }

        private Optional<BlockPos> func_226500_a_(Predicate<BlockState> p_226500_1_, double p_226500_2_)
        {
            BlockPos blockpos = new BlockPos(BeeEntity.this);
            BlockPos.Mutable blockpos$mutable = new BlockPos.Mutable();

            for (int i = 0; (double)i <= p_226500_2_; i = i > 0 ? -i : 1 - i)
            {
                for (int j = 0; (double)j < p_226500_2_; ++j)
                {
                    for (int k = 0; k <= j; k = k > 0 ? -k : 1 - k)
                    {
                        for (int l = k < j && k > -j ? j : 0; l <= j; l = l > 0 ? -l : 1 - l)
                        {
                            blockpos$mutable.setPos(blockpos).move(k, i - 1, l);

                            if (blockpos.withinDistance(blockpos$mutable, p_226500_2_) && p_226500_1_.test(BeeEntity.this.world.getBlockState(blockpos$mutable)))
                            {
                                return Optional.of(blockpos$mutable);
                            }
                        }
                    }
                }
            }

            return Optional.empty();
        }
    }

    class StingGoal extends MeleeAttackGoal
    {
        StingGoal(CreatureEntity p_i1096_2_, double sessionTypeIn, boolean p_i1096_5_)
        {
            super(p_i1096_2_, sessionTypeIn, p_i1096_5_);
        }

        public boolean shouldExecute()
        {
            return super.shouldExecute() && BeeEntity.this.func_226427_ez_() && !BeeEntity.this.func_226412_eE_();
        }

        public boolean shouldContinueExecuting()
        {
            return super.shouldContinueExecuting() && BeeEntity.this.func_226427_ez_() && !BeeEntity.this.func_226412_eE_();
        }
    }

    class UpdateBeehiveGoal extends BeeEntity.PassiveGoal
    {
        private UpdateBeehiveGoal()
        {
        }

        public boolean func_225506_g_()
        {
            return BeeEntity.this.remainingCooldownBeforeLocatingNewHive == 0 && !BeeEntity.this.func_226409_eA_() && BeeEntity.this.func_226415_eI_();
        }

        public boolean func_225507_h_()
        {
            return false;
        }

        public void startExecuting()
        {
            BeeEntity.this.remainingCooldownBeforeLocatingNewHive = 200;
            List<BlockPos> list = this.func_226489_j_();

            if (!list.isEmpty())
            {
                for (BlockPos blockpos : list)
                {
                    if (!BeeEntity.this.findBeehiveGoal.func_226473_b_(blockpos))
                    {
                        BeeEntity.this.hivePos = blockpos;
                        return;
                    }
                }

                BeeEntity.this.findBeehiveGoal.func_226477_j_();
                BeeEntity.this.hivePos = list.get(0);
            }
        }

        private List<BlockPos> func_226489_j_()
        {
            BlockPos blockpos = new BlockPos(BeeEntity.this);
            PointOfInterestManager pointofinterestmanager = ((ServerWorld)BeeEntity.this.world).getPointOfInterestManager();
            Stream<PointOfInterest> stream = pointofinterestmanager.func_219146_b((p_226486_0_) ->
            {
                return p_226486_0_ == PointOfInterestType.field_226356_s_ || p_226486_0_ == PointOfInterestType.field_226357_t_;
            }, blockpos, 20, PointOfInterestManager.Status.ANY);
            return stream.map(PointOfInterest::getPos).filter((p_226487_1_) ->
            {
                return BeeEntity.this.func_226435_i_(p_226487_1_);
            }).sorted(Comparator.comparingDouble((p_226488_1_) ->
            {
                return p_226488_1_.distanceSq(blockpos);
            })).collect(Collectors.toList());
        }
    }

    class WanderGoal extends Goal
    {
        WanderGoal()
        {
            this.setMutexFlags(EnumSet.of(Goal.Flag.MOVE));
        }

        public boolean shouldExecute()
        {
            return BeeEntity.this.navigator.noPath() && BeeEntity.this.rand.nextInt(10) == 0;
        }

        public boolean shouldContinueExecuting()
        {
            return BeeEntity.this.navigator.func_226337_n_();
        }

        public void startExecuting()
        {
            Vec3d vec3d = this.func_226509_g_();

            if (vec3d != null)
            {
                BeeEntity.this.navigator.setPath(BeeEntity.this.navigator.getPathToPos(new BlockPos(vec3d), 1), 1.0D);
            }
        }

        @Nullable
        private Vec3d func_226509_g_()
        {
            Vec3d vec3d;

            if (BeeEntity.this.func_226422_eP_() && !BeeEntity.this.func_226401_b_(BeeEntity.this.hivePos, 40))
            {
                Vec3d vec3d1 = new Vec3d(BeeEntity.this.hivePos);
                vec3d = vec3d1.subtract(BeeEntity.this.getPositionVec()).normalize();
            }
            else
            {
                vec3d = BeeEntity.this.getLook(0.0F);
            }

            int i = 8;
            Vec3d vec3d2 = RandomPositionGenerator.func_226340_a_(BeeEntity.this, 8, 7, vec3d, ((float)Math.PI / 2F), 2, 1);
            return vec3d2 != null ? vec3d2 : RandomPositionGenerator.func_226338_a_(BeeEntity.this, 8, 4, -2, vec3d, (double)((float)Math.PI / 2F));
        }
    }
}
