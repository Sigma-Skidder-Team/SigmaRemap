package net.minecraft.client.renderer.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.client.renderer.entity.layers.PhantomEyesLayer;
import net.minecraft.client.renderer.entity.model.PhantomModel;
import net.minecraft.entity.monster.PhantomEntity;
import net.minecraft.util.ResourceLocation;

public class PhantomRenderer extends MobRenderer<PhantomEntity, PhantomModel<PhantomEntity>>
{
    private static final ResourceLocation PHANTOM_LOCATION = new ResourceLocation("textures/entity/phantom.png");

    public PhantomRenderer(EntityRendererManager p_i2739_1_)
    {
        super(p_i2739_1_, new PhantomModel<>(), 0.75F);
        this.addLayer(new PhantomEyesLayer<>(this));
    }

    public ResourceLocation getEntityTexture(PhantomEntity entity)
    {
        return PHANTOM_LOCATION;
    }

    protected void preRenderCallback(PhantomEntity entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime)
    {
        int i = entitylivingbaseIn.getPhantomSize();
        float f = 1.0F + 0.15F * (float)i;
        matrixStackIn.scale(f, f, f);
        matrixStackIn.translate(0.0D, 1.3125D, 0.1875D);
    }

    protected void applyRotations(PhantomEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks)
    {
        super.applyRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);
        matrixStackIn.rotate(Vector3f.XP.rotationDegrees(entityLiving.rotationPitch));
    }
}
