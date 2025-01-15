package net.minecraft.client.renderer.entity.model;

import net.minecraft.entity.Entity;

public class PigModel<T extends Entity> extends QuadrupedModel<T>
{
    public PigModel()
    {
        this(0.0F);
    }

    public PigModel(float p_i3559_1_)
    {
        super(6, p_i3559_1_, false, 4.0F, 4.0F, 2.0F, 2.0F, 24);
        this.headModel.setTextureOffset(16, 16).addBox(-2.0F, 0.0F, -9.0F, 4.0F, 3.0F, 1.0F, p_i3559_1_);
    }
}
