package net.minecraft.client.renderer.entity.model;

import net.minecraft.entity.monster.ZombieEntity;

public class ZombieModel<T extends ZombieEntity> extends AbstractZombieModel<T>
{
    public ZombieModel(float p_i3094_1_, boolean p_i3094_2_)
    {
        this(p_i3094_1_, 0.0F, 64, p_i3094_2_ ? 32 : 64);
    }

    protected ZombieModel(float p_i3095_1_, float p_i3095_2_, int p_i3095_3_, int p_i3095_4_)
    {
        super(p_i3095_1_, p_i3095_2_, p_i3095_3_, p_i3095_4_);
    }

    public boolean func_212850_a_(T p_212850_1_)
    {
        return p_212850_1_.isAggressive();
    }
}
