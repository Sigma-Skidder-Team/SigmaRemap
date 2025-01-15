package net.minecraft.client.renderer.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.AtlasTexture;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.item.FireworkRocketEntity;
import net.minecraft.util.ResourceLocation;

public class FireworkRocketRenderer extends EntityRenderer<FireworkRocketEntity>
{
    private final net.minecraft.client.renderer.ItemRenderer itemRenderer;

    public FireworkRocketRenderer(EntityRendererManager p_i1804_1_, net.minecraft.client.renderer.ItemRenderer p_i1804_2_)
    {
        super(p_i1804_1_);
        this.itemRenderer = p_i1804_2_;
    }

    public void render(FireworkRocketEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn)
    {
        matrixStackIn.push();
        matrixStackIn.rotate(this.renderManager.getCameraOrientation());
        matrixStackIn.rotate(Vector3f.YP.rotationDegrees(180.0F));

        if (entityIn.func_213889_i())
        {
            matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(180.0F));
            matrixStackIn.rotate(Vector3f.YP.rotationDegrees(180.0F));
            matrixStackIn.rotate(Vector3f.XP.rotationDegrees(90.0F));
        }

        this.itemRenderer.renderItem(entityIn.getItem(), ItemCameraTransforms.TransformType.GROUND, packedLightIn, OverlayTexture.NO_OVERLAY, matrixStackIn, bufferIn);
        matrixStackIn.pop();
        super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
    }

    public ResourceLocation getEntityTexture(FireworkRocketEntity entity)
    {
        return AtlasTexture.LOCATION_BLOCKS_TEXTURE;
    }
}
