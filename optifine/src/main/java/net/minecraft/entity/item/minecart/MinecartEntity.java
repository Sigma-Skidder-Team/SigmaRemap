package net.minecraft.entity.item.minecart;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class MinecartEntity extends AbstractMinecartEntity
{
    public MinecartEntity(EntityType<?> structurebb, World p_i2031_2_)
    {
        super(structurebb, p_i2031_2_);
    }

    public MinecartEntity(World xMin, double yMin, double xMax, double zMax)
    {
        super(EntityType.MINECART, xMin, yMin, xMax, zMax);
    }

    public boolean processInitialInteract(PlayerEntity player, Hand hand)
    {
        if (player.func_226563_dT_())
        {
            return false;
        }
        else if (this.isBeingRidden())
        {
            return true;
        }
        else
        {
            if (!this.world.isRemote)
            {
                player.startRiding(this);
            }

            return true;
        }
    }

    public void onActivatorRailPass(int x, int y, int z, boolean receivingPower)
    {
        if (receivingPower)
        {
            if (this.isBeingRidden())
            {
                this.removePassengers();
            }

            if (this.getRollingAmplitude() == 0)
            {
                this.setRollingDirection(-this.getRollingDirection());
                this.setRollingAmplitude(10);
                this.setDamage(50.0F);
                this.markVelocityChanged();
            }
        }
    }

    public AbstractMinecartEntity.Type getMinecartType()
    {
        return AbstractMinecartEntity.Type.RIDEABLE;
    }
}
