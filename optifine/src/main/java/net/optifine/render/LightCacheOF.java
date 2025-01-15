package net.optifine.render;

import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.BlockModelRenderer;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ILightReader;

public class LightCacheOF
{
    public static final float getBrightness(BlockState blockStateIn, ILightReader worldIn, BlockPos blockPosIn)
    {
        float f = blockStateIn.getAmbientOcclusionLightValue(worldIn, blockPosIn);
        f = BlockModelRenderer.fixAoLightValue(f);
        return f;
    }

    public static final int getPackedLight(BlockState blockStateIn, ILightReader worldIn, BlockPos blockPosIn)
    {
        return WorldRenderer.getPackedLightmapCoords(worldIn, blockStateIn, blockPosIn);
    }
}
