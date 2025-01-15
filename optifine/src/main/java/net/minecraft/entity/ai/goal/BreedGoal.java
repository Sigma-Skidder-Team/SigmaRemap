package net.minecraft.entity.ai.goal;

import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityPredicate;
import net.minecraft.entity.item.ExperienceOrbEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.stats.Stats;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;

public class BreedGoal extends Goal
{
    private static final EntityPredicate field_220689_d = (new EntityPredicate()).setDistance(8.0D).allowInvulnerable().allowFriendlyFire().setLineOfSiteRequired();
    protected final AnimalEntity animal;
    private final Class <? extends AnimalEntity > mateClass;
    protected final World world;
    protected AnimalEntity targetMate;
    private int spawnBabyDelay;
    private final double moveSpeed;

    public BreedGoal(AnimalEntity p_i2763_1_, double p_i2763_2_)
    {
        this(p_i2763_1_, p_i2763_2_, p_i2763_1_.getClass());
    }

    public BreedGoal(AnimalEntity p_i2764_1_, double p_i2764_2_, Class <? extends AnimalEntity > p_i2764_4_)
    {
        this.animal = p_i2764_1_;
        this.world = p_i2764_1_.world;
        this.mateClass = p_i2764_4_;
        this.moveSpeed = p_i2764_2_;
        this.setMutexFlags(EnumSet.of(Goal.Flag.MOVE, Goal.Flag.LOOK));
    }

    public boolean shouldExecute()
    {
        if (!this.animal.isInLove())
        {
            return false;
        }
        else
        {
            this.targetMate = this.getNearbyMate();
            return this.targetMate != null;
        }
    }

    public boolean shouldContinueExecuting()
    {
        return this.targetMate.isAlive() && this.targetMate.isInLove() && this.spawnBabyDelay < 60;
    }

    public void resetTask()
    {
        this.targetMate = null;
        this.spawnBabyDelay = 0;
    }

    public void tick()
    {
        this.animal.getLookController().setLookPositionWithEntity(this.targetMate, 10.0F, (float)this.animal.getVerticalFaceSpeed());
        this.animal.getNavigator().tryMoveToEntityLiving(this.targetMate, this.moveSpeed);
        ++this.spawnBabyDelay;

        if (this.spawnBabyDelay >= 60 && this.animal.getDistanceSq(this.targetMate) < 9.0D)
        {
            this.spawnBaby();
        }
    }

    @Nullable
    private AnimalEntity getNearbyMate()
    {
        List<AnimalEntity> list = this.world.getTargettableEntitiesWithinAABB(this.mateClass, field_220689_d, this.animal, this.animal.getBoundingBox().grow(8.0D));
        double d0 = Double.MAX_VALUE;
        AnimalEntity animalentity = null;

        for (AnimalEntity animalentity1 : list)
        {
            if (this.animal.canMateWith(animalentity1) && this.animal.getDistanceSq(animalentity1) < d0)
            {
                animalentity = animalentity1;
                d0 = this.animal.getDistanceSq(animalentity1);
            }
        }

        return animalentity;
    }

    protected void spawnBaby()
    {
        AgeableEntity ageableentity = this.animal.createChild(this.targetMate);

        if (ageableentity != null)
        {
            ServerPlayerEntity serverplayerentity = this.animal.getLoveCause();

            if (serverplayerentity == null && this.targetMate.getLoveCause() != null)
            {
                serverplayerentity = this.targetMate.getLoveCause();
            }

            if (serverplayerentity != null)
            {
                serverplayerentity.addStat(Stats.ANIMALS_BRED);
                CriteriaTriggers.BRED_ANIMALS.trigger(serverplayerentity, this.animal, this.targetMate, ageableentity);
            }

            this.animal.setGrowingAge(6000);
            this.targetMate.setGrowingAge(6000);
            this.animal.resetInLove();
            this.targetMate.resetInLove();
            ageableentity.setGrowingAge(-24000);
            ageableentity.setLocationAndAngles(this.animal.getPosX(), this.animal.getPosY(), this.animal.getPosZ(), 0.0F, 0.0F);
            this.world.addEntity(ageableentity);
            this.world.setEntityState(this.animal, (byte)18);

            if (this.world.getGameRules().getBoolean(GameRules.DO_MOB_LOOT))
            {
                this.world.addEntity(new ExperienceOrbEntity(this.world, this.animal.getPosX(), this.animal.getPosY(), this.animal.getPosZ(), this.animal.getRNG().nextInt(7) + 1));
            }
        }
    }
}
