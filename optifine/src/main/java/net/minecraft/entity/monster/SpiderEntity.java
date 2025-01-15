package net.minecraft.entity.monster;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Pose;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.LeapAtTargetGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.ClimberPathNavigator;
import net.minecraft.pathfinding.PathNavigator;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.Difficulty;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class SpiderEntity extends MonsterEntity
{
    private static final DataParameter<Byte> CLIMBING = EntityDataManager.createKey(SpiderEntity.class, DataSerializers.BYTE);

    public SpiderEntity(EntityType <? extends SpiderEntity > p_i550_1_, World p_i550_2_)
    {
        super(p_i550_1_, p_i550_2_);
    }

    protected void registerGoals()
    {
        this.goalSelector.addGoal(1, new SwimGoal(this));
        this.goalSelector.addGoal(3, new LeapAtTargetGoal(this, 0.4F));
        this.goalSelector.addGoal(4, new SpiderEntity.AttackGoal(this));
        this.goalSelector.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 0.8D));
        this.goalSelector.addGoal(6, new LookAtGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.addGoal(6, new LookRandomlyGoal(this));
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new SpiderEntity.TargetGoal<>(this, PlayerEntity.class));
        this.targetSelector.addGoal(3, new SpiderEntity.TargetGoal<>(this, IronGolemEntity.class));
    }

    public double getMountedYOffset()
    {
        return (double)(this.getHeight() * 0.5F);
    }

    protected PathNavigator createNavigator(World worldIn)
    {
        return new ClimberPathNavigator(this, worldIn);
    }

    protected void registerData()
    {
        super.registerData();
        this.dataManager.register(CLIMBING, (byte)0);
    }

    public void tick()
    {
        super.tick();

        if (!this.world.isRemote)
        {
            this.setBesideClimbableBlock(this.collidedHorizontally);
        }
    }

    protected void registerAttributes()
    {
        super.registerAttributes();
        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(16.0D);
        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)0.3F);
    }

    protected SoundEvent getAmbientSound()
    {
        return SoundEvents.ENTITY_SPIDER_AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return SoundEvents.ENTITY_SPIDER_HURT;
    }

    protected SoundEvent getDeathSound()
    {
        return SoundEvents.ENTITY_SPIDER_DEATH;
    }

    protected void playStepSound(BlockPos pos, BlockState blockIn)
    {
        this.playSound(SoundEvents.ENTITY_SPIDER_STEP, 0.15F, 1.0F);
    }

    public boolean isOnLadder()
    {
        return this.isBesideClimbableBlock();
    }

    public void setMotionMultiplier(BlockState p_213295_1_, Vec3d p_213295_2_)
    {
        if (p_213295_1_.getBlock() != Blocks.COBWEB)
        {
            super.setMotionMultiplier(p_213295_1_, p_213295_2_);
        }
    }

    public CreatureAttribute getCreatureAttribute()
    {
        return CreatureAttribute.ARTHROPOD;
    }

    public boolean isPotionApplicable(EffectInstance potioneffectIn)
    {
        return potioneffectIn.getPotion() == Effects.POISON ? false : super.isPotionApplicable(potioneffectIn);
    }

    public boolean isBesideClimbableBlock()
    {
        return (this.dataManager.get(CLIMBING) & 1) != 0;
    }

    public void setBesideClimbableBlock(boolean climbing)
    {
        byte b0 = this.dataManager.get(CLIMBING);

        if (climbing)
        {
            b0 = (byte)(b0 | 1);
        }
        else
        {
            b0 = (byte)(b0 & -2);
        }

        this.dataManager.set(CLIMBING, b0);
    }

    @Nullable
    public ILivingEntityData onInitialSpawn(IWorld worldIn, DifficultyInstance difficultyIn, SpawnReason reason, @Nullable ILivingEntityData spawnDataIn, @Nullable CompoundNBT dataTag)
    {
        spawnDataIn = super.onInitialSpawn(worldIn, difficultyIn, reason, spawnDataIn, dataTag);

        if (worldIn.getRandom().nextInt(100) == 0)
        {
            SkeletonEntity skeletonentity = EntityType.SKELETON.create(this.world);
            skeletonentity.setLocationAndAngles(this.getPosX(), this.getPosY(), this.getPosZ(), this.rotationYaw, 0.0F);
            skeletonentity.onInitialSpawn(worldIn, difficultyIn, reason, (ILivingEntityData)null, (CompoundNBT)null);
            worldIn.addEntity(skeletonentity);
            skeletonentity.startRiding(this);
        }

        if (spawnDataIn == null)
        {
            spawnDataIn = new SpiderEntity.GroupData();

            if (worldIn.getDifficulty() == Difficulty.HARD && worldIn.getRandom().nextFloat() < 0.1F * difficultyIn.getClampedAdditionalDifficulty())
            {
                ((SpiderEntity.GroupData)spawnDataIn).setRandomEffect(worldIn.getRandom());
            }
        }

        if (spawnDataIn instanceof SpiderEntity.GroupData)
        {
            Effect effect = ((SpiderEntity.GroupData)spawnDataIn).effect;

            if (effect != null)
            {
                this.addPotionEffect(new EffectInstance(effect, Integer.MAX_VALUE));
            }
        }

        return spawnDataIn;
    }

    protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn)
    {
        return 0.65F;
    }

    static class AttackGoal extends MeleeAttackGoal
    {
        public AttackGoal(SpiderEntity message)
        {
            super(message, 1.0D, true);
        }

        public boolean shouldExecute()
        {
            return super.shouldExecute() && !this.attacker.isBeingRidden();
        }

        public boolean shouldContinueExecuting()
        {
            float f = this.attacker.getBrightness();

            if (f >= 0.5F && this.attacker.getRNG().nextInt(100) == 0)
            {
                this.attacker.setAttackTarget((LivingEntity)null);
                return false;
            }
            else
            {
                return super.shouldContinueExecuting();
            }
        }

        protected double getAttackReachSqr(LivingEntity attackTarget)
        {
            return (double)(4.0F + attackTarget.getWidth());
        }
    }

    public static class GroupData implements ILivingEntityData
    {
        public Effect effect;

        public void setRandomEffect(Random rand)
        {
            int i = rand.nextInt(5);

            if (i <= 1)
            {
                this.effect = Effects.SPEED;
            }
            else if (i <= 2)
            {
                this.effect = Effects.STRENGTH;
            }
            else if (i <= 3)
            {
                this.effect = Effects.REGENERATION;
            }
            else if (i <= 4)
            {
                this.effect = Effects.INVISIBILITY;
            }
        }
    }

    static class TargetGoal<T extends LivingEntity> extends NearestAttackableTargetGoal<T>
    {
        public TargetGoal(SpiderEntity p_i3610_1_, Class<T> p_i3610_2_)
        {
            super(p_i3610_1_, p_i3610_2_, true);
        }

        public boolean shouldExecute()
        {
            float f = this.goalOwner.getBrightness();
            return f >= 0.5F ? false : super.shouldExecute();
        }
    }
}
