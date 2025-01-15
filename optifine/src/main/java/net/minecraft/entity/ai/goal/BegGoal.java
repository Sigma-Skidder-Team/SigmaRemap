package net.minecraft.entity.ai.goal;

import java.util.EnumSet;
import net.minecraft.entity.EntityPredicate;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class BegGoal extends Goal
{
    private final WolfEntity wolf;
    private PlayerEntity player;
    private final World world;
    private final float minPlayerDistance;
    private int timeoutCounter;
    private final EntityPredicate field_220688_f;

    public BegGoal(WolfEntity p_i743_1_, float p_i743_2_)
    {
        this.wolf = p_i743_1_;
        this.world = p_i743_1_.world;
        this.minPlayerDistance = p_i743_2_;
        this.field_220688_f = (new EntityPredicate()).setDistance((double)p_i743_2_).allowInvulnerable().allowFriendlyFire().setSkipAttackChecks();
        this.setMutexFlags(EnumSet.of(Goal.Flag.LOOK));
    }

    public boolean shouldExecute()
    {
        this.player = this.world.getClosestPlayer(this.field_220688_f, this.wolf);
        return this.player == null ? false : this.hasTemptationItemInHand(this.player);
    }

    public boolean shouldContinueExecuting()
    {
        if (!this.player.isAlive())
        {
            return false;
        }
        else if (this.wolf.getDistanceSq(this.player) > (double)(this.minPlayerDistance * this.minPlayerDistance))
        {
            return false;
        }
        else
        {
            return this.timeoutCounter > 0 && this.hasTemptationItemInHand(this.player);
        }
    }

    public void startExecuting()
    {
        this.wolf.setBegging(true);
        this.timeoutCounter = 40 + this.wolf.getRNG().nextInt(40);
    }

    public void resetTask()
    {
        this.wolf.setBegging(false);
        this.player = null;
    }

    public void tick()
    {
        this.wolf.getLookController().setLookPosition(this.player.getPosX(), this.player.getPosYEye(), this.player.getPosZ(), 10.0F, (float)this.wolf.getVerticalFaceSpeed());
        --this.timeoutCounter;
    }

    private boolean hasTemptationItemInHand(PlayerEntity player)
    {
        for (Hand hand : Hand.values())
        {
            ItemStack itemstack = player.getHeldItem(hand);

            if (this.wolf.isTamed() && itemstack.getItem() == Items.BONE)
            {
                return true;
            }

            if (this.wolf.isBreedingItem(itemstack))
            {
                return true;
            }
        }

        return false;
    }
}
