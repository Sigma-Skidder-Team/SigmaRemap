package net.minecraft.entity.passive;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public abstract class AmbientEntity extends MobEntity
{
    protected AmbientEntity(EntityType <? extends AmbientEntity > p_i1814_1_, World p_i1814_2_)
    {
        super(p_i1814_1_, p_i1814_2_);
    }

    public boolean canBeLeashedTo(PlayerEntity player)
    {
        return false;
    }
}
