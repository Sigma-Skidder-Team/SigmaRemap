package net.minecraft.client.renderer.entity.model;

import net.minecraft.entity.monster.GiantEntity;

public class GiantModel extends AbstractZombieModel<GiantEntity>
{
    public GiantModel()
    {
        this(0.0F, false);
    }

    public GiantModel(float p_i924_1_, boolean p_i924_2_)
    {
        super(p_i924_1_, 0.0F, 64, p_i924_2_ ? 32 : 64);
    }

    public boolean func_212850_a_(GiantEntity p_212850_1_)
    {
        return false;
    }
}
