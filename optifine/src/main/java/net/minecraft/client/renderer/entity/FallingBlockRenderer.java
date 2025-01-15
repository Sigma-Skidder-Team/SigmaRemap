package net.minecraft.client.renderer.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import java.util.Random;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.texture.AtlasTexture;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.item.FallingBlockEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FallingBlockRenderer extends EntityRenderer<FallingBlockEntity>
{
    public FallingBlockRenderer(EntityRendererManager p_i2539_1_)
    {
        super(p_i2539_1_);
        this.shadowSize = 0.5F;
    }

    public void render(FallingBlockEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn)
    {
        BlockState blockstate = entityIn.getBlockState();

        if (blockstate.getRenderType() == BlockRenderType.MODEL)
        {
            World world = entityIn.getWorldObj();

            if (blockstate != world.getBlockState(new BlockPos(entityIn)) && blockstate.getRenderType() != BlockRenderType.INVISIBLE)
            {
                matrixStackIn.push();
                BlockPos blockpos = new BlockPos(entityIn.getPosX(), entityIn.getBoundingBox().maxY, entityIn.getPosZ());
                matrixStackIn.translate(-0.5D, 0.0D, -0.5D);
                BlockRendererDispatcher blockrendererdispatcher = Minecraft.getInstance().getBlockRendererDispatcher();
                blockrendererdispatcher.getBlockModelRenderer().renderModel(world, blockrendererdispatcher.getModelForState(blockstate), blockstate, blockpos, matrixStackIn, bufferIn.getBuffer(RenderTypeLookup.getChunkRenderType(blockstate)), false, new Random(), blockstate.getPositionRandom(entityIn.getOrigin()), OverlayTexture.NO_OVERLAY);
                matrixStackIn.pop();
                super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
            }
        }
    }

    public ResourceLocation getEntityTexture(FallingBlockEntity entity)
    {
        return AtlasTexture.LOCATION_BLOCKS_TEXTURE;
    }
}
