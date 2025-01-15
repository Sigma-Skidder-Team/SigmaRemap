package net.minecraft.entity.passive;

import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.block.BlockState;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Pose;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.goal.BegGoal;
import net.minecraft.entity.ai.goal.BreedGoal;
import net.minecraft.entity.ai.goal.FollowOwnerGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.LeapAtTargetGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.NonTamedTargetGoal;
import net.minecraft.entity.ai.goal.OwnerHurtByTargetGoal;
import net.minecraft.entity.ai.goal.OwnerHurtTargetGoal;
import net.minecraft.entity.ai.goal.SitGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.monster.AbstractSkeletonEntity;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.entity.monster.GhastEntity;
import net.minecraft.entity.passive.horse.AbstractHorseEntity;
import net.minecraft.entity.passive.horse.LlamaEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.DyeColor;
import net.minecraft.item.DyeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class WolfEntity extends TameableEntity
{
    private static final DataParameter<Boolean> BEGGING = EntityDataManager.createKey(WolfEntity.class, DataSerializers.BOOLEAN);
    private static final DataParameter<Integer> COLLAR_COLOR = EntityDataManager.createKey(WolfEntity.class, DataSerializers.VARINT);
    public static final Predicate<LivingEntity> field_213441_bD = (p_213440_0_) ->
    {
        EntityType<?> entitytype = p_213440_0_.getType();
        return entitytype == EntityType.SHEEP || entitytype == EntityType.RABBIT || entitytype == EntityType.FOX;
    };
    private float headRotationCourse;
    private float headRotationCourseOld;
    private boolean isWet;
    private boolean isShaking;
    private float timeWolfIsShaking;
    private float prevTimeWolfIsShaking;

    public WolfEntity(EntityType <? extends WolfEntity > p_i2559_1_, World p_i2559_2_)
    {
        super(p_i2559_1_, p_i2559_2_);
        this.setTamed(false);
    }

    protected void registerGoals()
    {
        this.sitGoal = new SitGoal(this);
        this.goalSelector.addGoal(1, new SwimGoal(this));
        this.goalSelector.addGoal(2, this.sitGoal);
        this.goalSelector.addGoal(3, new WolfEntity.AvoidEntityGoal(this, LlamaEntity.class, 24.0F, 1.5D, 1.5D));
        this.goalSelector.addGoal(4, new LeapAtTargetGoal(this, 0.4F));
        this.goalSelector.addGoal(5, new MeleeAttackGoal(this, 1.0D, true));
        this.goalSelector.addGoal(6, new FollowOwnerGoal(this, 1.0D, 10.0F, 2.0F, false));
        this.goalSelector.addGoal(7, new BreedGoal(this, 1.0D));
        this.goalSelector.addGoal(8, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
        this.goalSelector.addGoal(9, new BegGoal(this, 8.0F));
        this.goalSelector.addGoal(10, new LookAtGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.addGoal(10, new LookRandomlyGoal(this));
        this.targetSelector.addGoal(1, new OwnerHurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
        this.targetSelector.addGoal(3, (new HurtByTargetGoal(this)).setCallsForHelp());
        this.targetSelector.addGoal(4, new NonTamedTargetGoal<>(this, AnimalEntity.class, false, field_213441_bD));
        this.targetSelector.addGoal(4, new NonTamedTargetGoal<>(this, TurtleEntity.class, false, TurtleEntity.TARGET_DRY_BABY));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal<>(this, AbstractSkeletonEntity.class, false));
    }

    protected void registerAttributes()
    {
        super.registerAttributes();
        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)0.3F);

        if (this.isTamed())
        {
            this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
        }
        else
        {
            this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(8.0D);
        }

        this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.0D);
    }

    public void setAttackTarget(@Nullable LivingEntity entitylivingbaseIn)
    {
        super.setAttackTarget(entitylivingbaseIn);

        if (entitylivingbaseIn == null)
        {
            this.setAngry(false);
        }
        else if (!this.isTamed())
        {
            this.setAngry(true);
        }
    }

    protected void registerData()
    {
        super.registerData();
        this.dataManager.register(BEGGING, false);
        this.dataManager.register(COLLAR_COLOR, DyeColor.RED.getId());
    }

    protected void playStepSound(BlockPos pos, BlockState blockIn)
    {
        this.playSound(SoundEvents.ENTITY_WOLF_STEP, 0.15F, 1.0F);
    }

    public void writeAdditional(CompoundNBT compound)
    {
        super.writeAdditional(compound);
        compound.putBoolean("Angry", this.isAngry());
        compound.putByte("CollarColor", (byte)this.getCollarColor().getId());
    }

    public void readAdditional(CompoundNBT compound)
    {
        super.readAdditional(compound);
        this.setAngry(compound.getBoolean("Angry"));

        if (compound.contains("CollarColor", 99))
        {
            this.setCollarColor(DyeColor.byId(compound.getInt("CollarColor")));
        }
    }

    protected SoundEvent getAmbientSound()
    {
        if (this.isAngry())
        {
            return SoundEvents.ENTITY_WOLF_GROWL;
        }
        else if (this.rand.nextInt(3) == 0)
        {
            return this.isTamed() && this.getHealth() < 10.0F ? SoundEvents.ENTITY_WOLF_WHINE : SoundEvents.ENTITY_WOLF_PANT;
        }
        else
        {
            return SoundEvents.ENTITY_WOLF_AMBIENT;
        }
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return SoundEvents.ENTITY_WOLF_HURT;
    }

    protected SoundEvent getDeathSound()
    {
        return SoundEvents.ENTITY_WOLF_DEATH;
    }

    protected float getSoundVolume()
    {
        return 0.4F;
    }

    public void livingTick()
    {
        super.livingTick();

        if (!this.world.isRemote && this.isWet && !this.isShaking && !this.hasPath() && this.onGround)
        {
            this.isShaking = true;
            this.timeWolfIsShaking = 0.0F;
            this.prevTimeWolfIsShaking = 0.0F;
            this.world.setEntityState(this, (byte)8);
        }

        if (!this.world.isRemote && this.getAttackTarget() == null && this.isAngry())
        {
            this.setAngry(false);
        }
    }

    public void tick()
    {
        super.tick();

        if (this.isAlive())
        {
            this.headRotationCourseOld = this.headRotationCourse;

            if (this.isBegging())
            {
                this.headRotationCourse += (1.0F - this.headRotationCourse) * 0.4F;
            }
            else
            {
                this.headRotationCourse += (0.0F - this.headRotationCourse) * 0.4F;
            }

            if (this.isInWaterRainOrBubbleColumn())
            {
                this.isWet = true;
                this.isShaking = false;
                this.timeWolfIsShaking = 0.0F;
                this.prevTimeWolfIsShaking = 0.0F;
            }
            else if ((this.isWet || this.isShaking) && this.isShaking)
            {
                if (this.timeWolfIsShaking == 0.0F)
                {
                    this.playSound(SoundEvents.ENTITY_WOLF_SHAKE, this.getSoundVolume(), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
                }

                this.prevTimeWolfIsShaking = this.timeWolfIsShaking;
                this.timeWolfIsShaking += 0.05F;

                if (this.prevTimeWolfIsShaking >= 2.0F)
                {
                    this.isWet = false;
                    this.isShaking = false;
                    this.prevTimeWolfIsShaking = 0.0F;
                    this.timeWolfIsShaking = 0.0F;
                }

                if (this.timeWolfIsShaking > 0.4F)
                {
                    float f = (float)this.getPosY();
                    int i = (int)(MathHelper.sin((this.timeWolfIsShaking - 0.4F) * (float)Math.PI) * 7.0F);
                    Vec3d vec3d = this.getMotion();

                    for (int j = 0; j < i; ++j)
                    {
                        float f1 = (this.rand.nextFloat() * 2.0F - 1.0F) * this.getWidth() * 0.5F;
                        float f2 = (this.rand.nextFloat() * 2.0F - 1.0F) * this.getWidth() * 0.5F;
                        this.world.addParticle(ParticleTypes.SPLASH, this.getPosX() + (double)f1, (double)(f + 0.8F), this.getPosZ() + (double)f2, vec3d.x, vec3d.y, vec3d.z);
                    }
                }
            }
        }
    }

    public void onDeath(DamageSource cause)
    {
        this.isWet = false;
        this.isShaking = false;
        this.prevTimeWolfIsShaking = 0.0F;
        this.timeWolfIsShaking = 0.0F;
        super.onDeath(cause);
    }

    public boolean isWolfWet()
    {
        return this.isWet;
    }

    public float getShadingWhileWet(float p_70915_1_)
    {
        return 0.75F + MathHelper.lerp(p_70915_1_, this.prevTimeWolfIsShaking, this.timeWolfIsShaking) / 2.0F * 0.25F;
    }

    public float getShakeAngle(float p_70923_1_, float p_70923_2_)
    {
        float f = (MathHelper.lerp(p_70923_1_, this.prevTimeWolfIsShaking, this.timeWolfIsShaking) + p_70923_2_) / 1.8F;

        if (f < 0.0F)
        {
            f = 0.0F;
        }
        else if (f > 1.0F)
        {
            f = 1.0F;
        }

        return MathHelper.sin(f * (float)Math.PI) * MathHelper.sin(f * (float)Math.PI * 11.0F) * 0.15F * (float)Math.PI;
    }

    public float getInterestedAngle(float p_70917_1_)
    {
        return MathHelper.lerp(p_70917_1_, this.headRotationCourseOld, this.headRotationCourse) * 0.15F * (float)Math.PI;
    }

    protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn)
    {
        return sizeIn.height * 0.8F;
    }

    public int getVerticalFaceSpeed()
    {
        return this.isSitting() ? 20 : super.getVerticalFaceSpeed();
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

            if (this.sitGoal != null)
            {
                this.sitGoal.setSitting(false);
            }

            if (entity != null && !(entity instanceof PlayerEntity) && !(entity instanceof AbstractArrowEntity))
            {
                amount = (amount + 1.0F) / 2.0F;
            }

            return super.attackEntityFrom(source, amount);
        }
    }

    public boolean attackEntityAsMob(Entity entityIn)
    {
        boolean flag = entityIn.attackEntityFrom(DamageSource.causeMobDamage(this), (float)((int)this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getValue()));

        if (flag)
        {
            this.applyEnchantments(this, entityIn);
        }

        return flag;
    }

    public void setTamed(boolean tamed)
    {
        super.setTamed(tamed);

        if (tamed)
        {
            this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
            this.setHealth(20.0F);
        }
        else
        {
            this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(8.0D);
        }

        this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(4.0D);
    }

    public boolean processInteract(PlayerEntity player, Hand hand)
    {
        ItemStack itemstack = player.getHeldItem(hand);
        Item item = itemstack.getItem();

        if (itemstack.getItem() instanceof SpawnEggItem)
        {
            return super.processInteract(player, hand);
        }
        else if (this.world.isRemote)
        {
            return this.isOwner(player) || item == Items.BONE && !this.isAngry();
        }
        else
        {
            if (this.isTamed())
            {
                if (item.isFood() && item.getFood().isMeat() && this.getHealth() < this.getMaxHealth())
                {
                    if (!player.abilities.isCreativeMode)
                    {
                        itemstack.shrink(1);
                    }

                    this.heal((float)item.getFood().getHealing());
                    return true;
                }

                if (!(item instanceof DyeItem))
                {
                    boolean flag = super.processInteract(player, hand);

                    if (!flag || this.isChild())
                    {
                        this.sitGoal.setSitting(!this.isSitting());
                    }

                    return flag;
                }

                DyeColor dyecolor = ((DyeItem)item).getDyeColor();

                if (dyecolor != this.getCollarColor())
                {
                    this.setCollarColor(dyecolor);

                    if (!player.abilities.isCreativeMode)
                    {
                        itemstack.shrink(1);
                    }

                    return true;
                }

                if (this.isOwner(player) && !this.isBreedingItem(itemstack))
                {
                    this.sitGoal.setSitting(!this.isSitting());
                    this.isJumping = false;
                    this.navigator.clearPath();
                    this.setAttackTarget((LivingEntity)null);
                }
            }
            else if (item == Items.BONE && !this.isAngry())
            {
                if (!player.abilities.isCreativeMode)
                {
                    itemstack.shrink(1);
                }

                if (this.rand.nextInt(3) == 0)
                {
                    this.setTamedBy(player);
                    this.navigator.clearPath();
                    this.setAttackTarget((LivingEntity)null);
                    this.sitGoal.setSitting(true);
                    this.world.setEntityState(this, (byte)7);
                }
                else
                {
                    this.world.setEntityState(this, (byte)6);
                }

                return true;
            }

            return super.processInteract(player, hand);
        }
    }

    public void handleStatusUpdate(byte id)
    {
        if (id == 8)
        {
            this.isShaking = true;
            this.timeWolfIsShaking = 0.0F;
            this.prevTimeWolfIsShaking = 0.0F;
        }
        else
        {
            super.handleStatusUpdate(id);
        }
    }

    public float getTailRotation()
    {
        if (this.isAngry())
        {
            return 1.5393804F;
        }
        else
        {
            return this.isTamed() ? (0.55F - (this.getMaxHealth() - this.getHealth()) * 0.02F) * (float)Math.PI : ((float)Math.PI / 5F);
        }
    }

    public boolean isBreedingItem(ItemStack stack)
    {
        Item item = stack.getItem();
        return item.isFood() && item.getFood().isMeat();
    }

    public int getMaxSpawnedInChunk()
    {
        return 8;
    }

    public boolean isAngry()
    {
        return (this.dataManager.get(TAMED) & 2) != 0;
    }

    public void setAngry(boolean angry)
    {
        byte b0 = this.dataManager.get(TAMED);

        if (angry)
        {
            this.dataManager.set(TAMED, (byte)(b0 | 2));
        }
        else
        {
            this.dataManager.set(TAMED, (byte)(b0 & -3));
        }
    }

    public DyeColor getCollarColor()
    {
        return DyeColor.byId(this.dataManager.get(COLLAR_COLOR));
    }

    public void setCollarColor(DyeColor collarcolor)
    {
        this.dataManager.set(COLLAR_COLOR, collarcolor.getId());
    }

    public WolfEntity createChild(AgeableEntity ageable)
    {
        WolfEntity wolfentity = EntityType.WOLF.create(this.world);
        UUID uuid = this.getOwnerId();

        if (uuid != null)
        {
            wolfentity.setOwnerId(uuid);
            wolfentity.setTamed(true);
        }

        return wolfentity;
    }

    public void setBegging(boolean beg)
    {
        this.dataManager.set(BEGGING, beg);
    }

    public boolean canMateWith(AnimalEntity otherAnimal)
    {
        if (otherAnimal == this)
        {
            return false;
        }
        else if (!this.isTamed())
        {
            return false;
        }
        else if (!(otherAnimal instanceof WolfEntity))
        {
            return false;
        }
        else
        {
            WolfEntity wolfentity = (WolfEntity)otherAnimal;

            if (!wolfentity.isTamed())
            {
                return false;
            }
            else if (wolfentity.isSitting())
            {
                return false;
            }
            else
            {
                return this.isInLove() && wolfentity.isInLove();
            }
        }
    }

    public boolean isBegging()
    {
        return this.dataManager.get(BEGGING);
    }

    public boolean shouldAttackEntity(LivingEntity target, LivingEntity owner)
    {
        if (!(target instanceof CreeperEntity) && !(target instanceof GhastEntity))
        {
            if (target instanceof WolfEntity)
            {
                WolfEntity wolfentity = (WolfEntity)target;
                return !wolfentity.isTamed() || wolfentity.getOwner() != owner;
            }
            else if (target instanceof PlayerEntity && owner instanceof PlayerEntity && !((PlayerEntity)owner).canAttackPlayer((PlayerEntity)target))
            {
                return false;
            }
            else if (target instanceof AbstractHorseEntity && ((AbstractHorseEntity)target).isTame())
            {
                return false;
            }
            else
            {
                return !(target instanceof TameableEntity) || !((TameableEntity)target).isTamed();
            }
        }
        else
        {
            return false;
        }
    }

    public boolean canBeLeashedTo(PlayerEntity player)
    {
        return !this.isAngry() && super.canBeLeashedTo(player);
    }

    class AvoidEntityGoal<T extends LivingEntity> extends net.minecraft.entity.ai.goal.AvoidEntityGoal<T>
    {
        private final WolfEntity wolf;

        public AvoidEntityGoal(WolfEntity p_i3854_2_, Class<T> p_i3854_3_, float p_i3854_4_, double p_i3854_5_, double p_i3854_7_)
        {
            super(p_i3854_2_, p_i3854_3_, p_i3854_4_, p_i3854_5_, p_i3854_7_);
            this.wolf = p_i3854_2_;
        }

        public boolean shouldExecute()
        {
            if (super.shouldExecute() && this.avoidTarget instanceof LlamaEntity)
            {
                return !this.wolf.isTamed() && this.avoidLlama((LlamaEntity)this.avoidTarget);
            }
            else
            {
                return false;
            }
        }

        private boolean avoidLlama(LlamaEntity p_190854_1_)
        {
            return p_190854_1_.getStrength() >= WolfEntity.this.rand.nextInt(5);
        }

        public void startExecuting()
        {
            WolfEntity.this.setAttackTarget((LivingEntity)null);
            super.startExecuting();
        }

        public void tick()
        {
            WolfEntity.this.setAttackTarget((LivingEntity)null);
            super.tick();
        }
    }
}
