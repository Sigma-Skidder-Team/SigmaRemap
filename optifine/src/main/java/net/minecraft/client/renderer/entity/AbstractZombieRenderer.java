package net.minecraft.client.renderer.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.layers.BipedArmorLayer;
import net.minecraft.client.renderer.entity.model.ZombieModel;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.util.ResourceLocation;

public abstract class AbstractZombieRenderer<T extends ZombieEntity, M extends ZombieModel<T>> extends BipedRenderer<T, M>
{
    private static final ResourceLocation field_217771_a = new ResourceLocation("textures/entity/zombie/zombie.png");

    protected AbstractZombieRenderer(EntityRendererManager p_i2576_1_, M p_i2576_2_, M p_i2576_3_, M p_i2576_4_)
    {
        super(p_i2576_1_, p_i2576_2_, 0.5F);
        this.addLayer(new BipedArmorLayer<>(this, p_i2576_3_, p_i2576_4_));
    }

    public ResourceLocation getEntityTexture(ZombieEntity entity)
    {
        return field_217771_a;
    }

    protected void applyRotations(T entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks)
    {
        if (entityLiving.isDrowning())
        {
            rotationYaw += (float)(Math.cos((double)entityLiving.ticksExisted * 3.25D) * Math.PI * 0.25D);
        }

        super.applyRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);
    }
}
