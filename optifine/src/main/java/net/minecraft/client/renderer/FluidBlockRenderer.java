package net.minecraft.client.renderer;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StainedGlassBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.model.FaceBakery;
import net.minecraft.client.renderer.model.ModelBakery;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.IFluidState;
import net.minecraft.state.properties.SlabType;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.ILightReader;
import net.optifine.Config;
import net.optifine.CustomColors;
import net.optifine.reflect.Reflector;
import net.optifine.render.RenderEnv;
import net.optifine.shaders.SVertexBuilder;

public class FluidBlockRenderer
{
    private final TextureAtlasSprite[] atlasSpritesLava = new TextureAtlasSprite[2];
    private final TextureAtlasSprite[] atlasSpritesWater = new TextureAtlasSprite[2];
    private TextureAtlasSprite atlasSpriteWaterOverlay;

    protected void initAtlasSprites()
    {
        this.atlasSpritesLava[0] = Minecraft.getInstance().getModelManager().getBlockModelShapes().getModel(Blocks.LAVA.getDefaultState()).getParticleTexture();
        this.atlasSpritesLava[1] = ModelBakery.LOCATION_LAVA_FLOW.getSprite();
        this.atlasSpritesWater[0] = Minecraft.getInstance().getModelManager().getBlockModelShapes().getModel(Blocks.WATER.getDefaultState()).getParticleTexture();
        this.atlasSpritesWater[1] = ModelBakery.LOCATION_WATER_FLOW.getSprite();
        this.atlasSpriteWaterOverlay = ModelBakery.LOCATION_WATER_OVERLAY.getSprite();
    }

    private static boolean isAdjacentFluidSameAs(IBlockReader worldIn, BlockPos pos, Direction side, IFluidState state)
    {
        BlockPos blockpos = pos.offset(side);
        IFluidState ifluidstate = worldIn.getFluidState(blockpos);
        return ifluidstate.getFluid().isEquivalentTo(state.getFluid());
    }

    private static boolean isNeighbourSideCovered(IBlockReader reader, BlockPos pos, Direction face, float heightIn)
    {
        BlockPos blockpos = pos.offset(face);
        BlockState blockstate = reader.getBlockState(blockpos);

        if (blockstate.isSolid())
        {
            VoxelShape voxelshape = VoxelShapes.create(0.0D, 0.0D, 0.0D, 1.0D, (double)heightIn, 1.0D);
            VoxelShape voxelshape1 = blockstate.getRenderShape(reader, blockpos);
            return VoxelShapes.isCubeSideCovered(voxelshape, voxelshape1, face);
        }
        else
        {
            return false;
        }
    }

    public boolean render(ILightReader lightReaderIn, BlockPos posIn, IVertexBuilder vertexBuilderIn, IFluidState fluidStateIn)
    {
        BlockState blockstate = fluidStateIn.getBlockState();
        boolean flag7;

        try
        {
            if (Config.isShaders())
            {
                SVertexBuilder.pushEntity(blockstate, vertexBuilderIn);
            }

            boolean flag = fluidStateIn.isTagged(FluidTags.LAVA);
            TextureAtlasSprite[] atextureatlassprite = flag ? this.atlasSpritesLava : this.atlasSpritesWater;

            if (Reflector.ForgeHooksClient_getFluidSprites.exists())
            {
                TextureAtlasSprite[] atextureatlassprite1 = (TextureAtlasSprite[])Reflector.call(Reflector.ForgeHooksClient_getFluidSprites, lightReaderIn, posIn, fluidStateIn);

                if (atextureatlassprite1 != null)
                {
                    atextureatlassprite = atextureatlassprite1;
                }
            }

            RenderEnv renderenv = vertexBuilderIn.getRenderEnv(blockstate, posIn);
            int i = -1;
            float f = 1.0F;

            if (Reflector.IForgeFluid_getAttributes.exists())
            {
                Object object = Reflector.call(fluidStateIn.getFluid(), Reflector.IForgeFluid_getAttributes);

                if (object != null && Reflector.FluidAttributes_getColor.exists())
                {
                    i = Reflector.callInt(object, Reflector.FluidAttributes_getColor, lightReaderIn, posIn);
                    f = (float)(i >> 24 & 255) / 255.0F;
                }
            }

            boolean flag9 = !isAdjacentFluidSameAs(lightReaderIn, posIn, Direction.UP, fluidStateIn);
            boolean flag1 = !isAdjacentFluidSameAs(lightReaderIn, posIn, Direction.DOWN, fluidStateIn) && !isNeighbourSideCovered(lightReaderIn, posIn, Direction.DOWN, 0.8888889F);
            boolean flag2 = !isAdjacentFluidSameAs(lightReaderIn, posIn, Direction.NORTH, fluidStateIn);
            boolean flag3 = !isAdjacentFluidSameAs(lightReaderIn, posIn, Direction.SOUTH, fluidStateIn);
            boolean flag4 = !isAdjacentFluidSameAs(lightReaderIn, posIn, Direction.WEST, fluidStateIn);
            boolean flag5 = !isAdjacentFluidSameAs(lightReaderIn, posIn, Direction.EAST, fluidStateIn);

            if (flag9 || flag1 || flag5 || flag4 || flag2 || flag3)
            {
                if (i < 0)
                {
                    i = CustomColors.getFluidColor(lightReaderIn, blockstate, posIn, renderenv);
                }

                float f35 = (float)(i >> 16 & 255) / 255.0F;
                float f1 = (float)(i >> 8 & 255) / 255.0F;
                float f2 = (float)(i & 255) / 255.0F;
                flag7 = false;
                float f3 = 0.5F;
                float f4 = 1.0F;
                float f5 = 0.8F;
                float f6 = 0.6F;
                float f7 = this.getFluidHeight(lightReaderIn, posIn, fluidStateIn.getFluid());
                float f8 = this.getFluidHeight(lightReaderIn, posIn.south(), fluidStateIn.getFluid());
                float f9 = this.getFluidHeight(lightReaderIn, posIn.east().south(), fluidStateIn.getFluid());
                float f10 = this.getFluidHeight(lightReaderIn, posIn.east(), fluidStateIn.getFluid());
                double d0 = (double)(posIn.getX() & 15);
                double d1 = (double)(posIn.getY() & 15);
                double d2 = (double)(posIn.getZ() & 15);
                float f11 = 0.001F;
                float f12 = flag1 ? 0.001F : 0.0F;

                if (flag9 && !isNeighbourSideCovered(lightReaderIn, posIn, Direction.UP, Math.min(Math.min(f7, f8), Math.min(f9, f10))))
                {
                    flag7 = true;
                    f7 -= 0.001F;
                    f8 -= 0.001F;
                    f9 -= 0.001F;
                    f10 -= 0.001F;
                    Vec3d vec3d = fluidStateIn.getFlow(lightReaderIn, posIn);
                    float f13;
                    float f14;
                    float f15;
                    float f16;
                    float f17;
                    float f18;
                    float f19;
                    float f20;

                    if (vec3d.x == 0.0D && vec3d.z == 0.0D)
                    {
                        TextureAtlasSprite textureatlassprite1 = atextureatlassprite[0];
                        vertexBuilderIn.setSprite(textureatlassprite1);
                        f13 = textureatlassprite1.getInterpolatedU(0.0D);
                        f17 = textureatlassprite1.getInterpolatedV(0.0D);
                        f14 = f13;
                        f18 = textureatlassprite1.getInterpolatedV(16.0D);
                        f15 = textureatlassprite1.getInterpolatedU(16.0D);
                        f19 = f18;
                        f16 = f15;
                        f20 = f17;
                    }
                    else
                    {
                        TextureAtlasSprite textureatlassprite = atextureatlassprite[1];
                        vertexBuilderIn.setSprite(textureatlassprite);
                        float f21 = (float)MathHelper.atan2(vec3d.z, vec3d.x) - ((float)Math.PI / 2F);
                        float f22 = MathHelper.sin(f21) * 0.25F;
                        float f23 = MathHelper.cos(f21) * 0.25F;
                        float f24 = 8.0F;
                        f13 = textureatlassprite.getInterpolatedU((double)(8.0F + (-f23 - f22) * 16.0F));
                        f17 = textureatlassprite.getInterpolatedV((double)(8.0F + (-f23 + f22) * 16.0F));
                        f14 = textureatlassprite.getInterpolatedU((double)(8.0F + (-f23 + f22) * 16.0F));
                        f18 = textureatlassprite.getInterpolatedV((double)(8.0F + (f23 + f22) * 16.0F));
                        f15 = textureatlassprite.getInterpolatedU((double)(8.0F + (f23 + f22) * 16.0F));
                        f19 = textureatlassprite.getInterpolatedV((double)(8.0F + (f23 - f22) * 16.0F));
                        f16 = textureatlassprite.getInterpolatedU((double)(8.0F + (f23 - f22) * 16.0F));
                        f20 = textureatlassprite.getInterpolatedV((double)(8.0F + (-f23 - f22) * 16.0F));
                    }

                    float f46 = (f13 + f14 + f15 + f16) / 4.0F;
                    float f47 = (f17 + f18 + f19 + f20) / 4.0F;
                    float f48 = (float)atextureatlassprite[0].getWidth() / (atextureatlassprite[0].getMaxU() - atextureatlassprite[0].getMinU());
                    float f49 = (float)atextureatlassprite[0].getHeight() / (atextureatlassprite[0].getMaxV() - atextureatlassprite[0].getMinV());
                    float f50 = 4.0F / Math.max(f49, f48);
                    f13 = MathHelper.lerp(f50, f13, f46);
                    f14 = MathHelper.lerp(f50, f14, f46);
                    f15 = MathHelper.lerp(f50, f15, f46);
                    f16 = MathHelper.lerp(f50, f16, f46);
                    f17 = MathHelper.lerp(f50, f17, f47);
                    f18 = MathHelper.lerp(f50, f18, f47);
                    f19 = MathHelper.lerp(f50, f19, f47);
                    f20 = MathHelper.lerp(f50, f20, f47);
                    int j = this.getCombinedAverageLight(lightReaderIn, posIn);
                    float f25 = 1.0F * f35;
                    float f26 = 1.0F * f1;
                    float f27 = 1.0F * f2;
                    this.vertex(vertexBuilderIn, d0 + 0.0D, d1 + (double)f7, d2 + 0.0D, f25, f26, f27, f, f13, f17, j);
                    this.vertex(vertexBuilderIn, d0 + 0.0D, d1 + (double)f8, d2 + 1.0D, f25, f26, f27, f, f14, f18, j);
                    this.vertex(vertexBuilderIn, d0 + 1.0D, d1 + (double)f9, d2 + 1.0D, f25, f26, f27, f, f15, f19, j);
                    this.vertex(vertexBuilderIn, d0 + 1.0D, d1 + (double)f10, d2 + 0.0D, f25, f26, f27, f, f16, f20, j);

                    if (fluidStateIn.shouldRenderSides(lightReaderIn, posIn.up()))
                    {
                        this.vertex(vertexBuilderIn, d0 + 0.0D, d1 + (double)f7, d2 + 0.0D, f25, f26, f27, f, f13, f17, j);
                        this.vertex(vertexBuilderIn, d0 + 1.0D, d1 + (double)f10, d2 + 0.0D, f25, f26, f27, f, f16, f20, j);
                        this.vertex(vertexBuilderIn, d0 + 1.0D, d1 + (double)f9, d2 + 1.0D, f25, f26, f27, f, f15, f19, j);
                        this.vertex(vertexBuilderIn, d0 + 0.0D, d1 + (double)f8, d2 + 1.0D, f25, f26, f27, f, f14, f18, j);
                    }
                }

                if (flag1)
                {
                    vertexBuilderIn.setSprite(atextureatlassprite[0]);
                    float f36 = atextureatlassprite[0].getMinU();
                    float f37 = atextureatlassprite[0].getMaxU();
                    float f39 = atextureatlassprite[0].getMinV();
                    float f41 = atextureatlassprite[0].getMaxV();
                    int i1 = this.getCombinedAverageLight(lightReaderIn, posIn.down());
                    float f42 = FaceBakery.getFaceBrightness(Direction.DOWN);
                    float f43 = f42 * f35;
                    float f44 = f42 * f1;
                    float f45 = f42 * f2;
                    this.vertex(vertexBuilderIn, d0, d1 + (double)f12, d2 + 1.0D, f43, f44, f45, f, f36, f41, i1);
                    this.vertex(vertexBuilderIn, d0, d1 + (double)f12, d2, f43, f44, f45, f, f36, f39, i1);
                    this.vertex(vertexBuilderIn, d0 + 1.0D, d1 + (double)f12, d2, f43, f44, f45, f, f37, f39, i1);
                    this.vertex(vertexBuilderIn, d0 + 1.0D, d1 + (double)f12, d2 + 1.0D, f43, f44, f45, f, f37, f41, i1);
                    flag7 = true;
                }

                for (int l = 0; l < 4; ++l)
                {
                    float f38;
                    float f40;
                    double d3;
                    double d4;
                    double d5;
                    double d6;
                    Direction direction;
                    boolean flag10;

                    if (l == 0)
                    {
                        f38 = f7;
                        f40 = f10;
                        d3 = d0;
                        d5 = d0 + 1.0D;
                        d4 = d2 + (double)0.001F;
                        d6 = d2 + (double)0.001F;
                        direction = Direction.NORTH;
                        flag10 = flag2;
                    }
                    else if (l == 1)
                    {
                        f38 = f9;
                        f40 = f8;
                        d3 = d0 + 1.0D;
                        d5 = d0;
                        d4 = d2 + 1.0D - (double)0.001F;
                        d6 = d2 + 1.0D - (double)0.001F;
                        direction = Direction.SOUTH;
                        flag10 = flag3;
                    }
                    else if (l == 2)
                    {
                        f38 = f8;
                        f40 = f7;
                        d3 = d0 + (double)0.001F;
                        d5 = d0 + (double)0.001F;
                        d4 = d2 + 1.0D;
                        d6 = d2;
                        direction = Direction.WEST;
                        flag10 = flag4;
                    }
                    else
                    {
                        f38 = f10;
                        f40 = f9;
                        d3 = d0 + 1.0D - (double)0.001F;
                        d5 = d0 + 1.0D - (double)0.001F;
                        d4 = d2;
                        d6 = d2 + 1.0D;
                        direction = Direction.EAST;
                        flag10 = flag5;
                    }

                    if (flag10 && !isNeighbourSideCovered(lightReaderIn, posIn, direction, Math.max(f38, f40)))
                    {
                        flag7 = true;
                        BlockPos blockpos = posIn.offset(direction);
                        TextureAtlasSprite textureatlassprite2 = atextureatlassprite[1];
                        float f51 = 0.0F;
                        float f52 = 0.0F;
                        boolean flag11 = !flag;

                        if (Reflector.IForgeBlockState_shouldDisplayFluidOverlay.exists())
                        {
                            flag11 = atextureatlassprite[2] != null;
                        }

                        if (flag11)
                        {
                            BlockState blockstate1 = lightReaderIn.getBlockState(blockpos);
                            Block block = blockstate1.getBlock();
                            boolean flag8 = false;

                            if (Reflector.IForgeBlockState_shouldDisplayFluidOverlay.exists())
                            {
                                flag8 = Reflector.callBoolean(blockstate1, Reflector.IForgeBlockState_shouldDisplayFluidOverlay, lightReaderIn, blockpos, fluidStateIn);
                            }

                            if (flag8 || block == Blocks.GLASS || block instanceof StainedGlassBlock || block == Blocks.BEACON || block == Blocks.SLIME_BLOCK)
                            {
                                textureatlassprite2 = this.atlasSpriteWaterOverlay;
                            }

                            if (block == Blocks.FARMLAND || block == Blocks.GRASS_PATH)
                            {
                                f51 = 0.9375F;
                                f52 = 0.9375F;
                            }

                            if (block instanceof SlabBlock)
                            {
                                SlabBlock slabblock = (SlabBlock)block;

                                if (blockstate1.get(SlabBlock.TYPE) == SlabType.BOTTOM)
                                {
                                    f51 = 0.5F;
                                    f52 = 0.5F;
                                }
                            }
                        }

                        vertexBuilderIn.setSprite(textureatlassprite2);

                        if (!(f38 <= f51) || !(f40 <= f52))
                        {
                            f51 = Math.min(f51, f38);
                            f52 = Math.min(f52, f40);

                            if (f51 > f11)
                            {
                                f51 -= f11;
                            }

                            if (f52 > f11)
                            {
                                f52 -= f11;
                            }

                            float f53 = textureatlassprite2.getInterpolatedV((double)((1.0F - f51) * 16.0F * 0.5F));
                            float f54 = textureatlassprite2.getInterpolatedV((double)((1.0F - f52) * 16.0F * 0.5F));
                            float f55 = textureatlassprite2.getInterpolatedU(0.0D);
                            float f56 = textureatlassprite2.getInterpolatedU(8.0D);
                            float f28 = textureatlassprite2.getInterpolatedV((double)((1.0F - f38) * 16.0F * 0.5F));
                            float f29 = textureatlassprite2.getInterpolatedV((double)((1.0F - f40) * 16.0F * 0.5F));
                            float f30 = textureatlassprite2.getInterpolatedV(8.0D);
                            int k = this.getCombinedAverageLight(lightReaderIn, blockpos);
                            float f31 = l < 2 ? FaceBakery.getFaceBrightness(Direction.NORTH) : FaceBakery.getFaceBrightness(Direction.WEST);
                            float f32 = 1.0F * f31 * f35;
                            float f33 = 1.0F * f31 * f1;
                            float f34 = 1.0F * f31 * f2;
                            this.vertex(vertexBuilderIn, d3, d1 + (double)f38, d4, f32, f33, f34, f, f55, f28, k);
                            this.vertex(vertexBuilderIn, d5, d1 + (double)f40, d6, f32, f33, f34, f, f56, f29, k);
                            this.vertex(vertexBuilderIn, d5, d1 + (double)f12, d6, f32, f33, f34, f, f56, f54, k);
                            this.vertex(vertexBuilderIn, d3, d1 + (double)f12, d4, f32, f33, f34, f, f55, f53, k);

                            if (textureatlassprite2 != this.atlasSpriteWaterOverlay)
                            {
                                this.vertex(vertexBuilderIn, d3, d1 + (double)f12, d4, f32, f33, f34, f, f55, f53, k);
                                this.vertex(vertexBuilderIn, d5, d1 + (double)f12, d6, f32, f33, f34, f, f56, f54, k);
                                this.vertex(vertexBuilderIn, d5, d1 + (double)f40, d6, f32, f33, f34, f, f56, f29, k);
                                this.vertex(vertexBuilderIn, d3, d1 + (double)f38, d4, f32, f33, f34, f, f55, f28, k);
                            }
                        }
                    }
                }

                vertexBuilderIn.setSprite((TextureAtlasSprite)null);
                return flag7;
            }

            flag7 = false;
        }
        finally
        {
            if (Config.isShaders())
            {
                SVertexBuilder.popEntity(vertexBuilderIn);
            }
        }

        return flag7;
    }

    private void vertexVanilla(IVertexBuilder vertexBuilderIn, double x, double y, double z, float red, float green, float blue, float u, float v, int packedLight)
    {
        vertexBuilderIn.pos(x, y, z).color(red, green, blue, 1.0F).tex(u, v).lightmap(packedLight).normal(0.0F, 1.0F, 0.0F).endVertex();
    }

    private void vertex(IVertexBuilder p_vertex_1_, double p_vertex_2_, double p_vertex_4_, double p_vertex_6_, float p_vertex_8_, float p_vertex_9_, float p_vertex_10_, float p_vertex_11_, float p_vertex_12_, float p_vertex_13_, int p_vertex_14_)
    {
        p_vertex_1_.pos(p_vertex_2_, p_vertex_4_, p_vertex_6_).color(p_vertex_8_, p_vertex_9_, p_vertex_10_, p_vertex_11_).tex(p_vertex_12_, p_vertex_13_).lightmap(p_vertex_14_).normal(0.0F, 1.0F, 0.0F).endVertex();
    }

    private int getCombinedAverageLight(ILightReader lightReaderIn, BlockPos posIn)
    {
        int i = WorldRenderer.getCombinedLight(lightReaderIn, posIn);
        int j = WorldRenderer.getCombinedLight(lightReaderIn, posIn.up());
        int k = i & 255;
        int l = j & 255;
        int i1 = i >> 16 & 255;
        int j1 = j >> 16 & 255;
        return (k > l ? k : l) | (i1 > j1 ? i1 : j1) << 16;
    }

    private float getFluidHeight(IBlockReader reader, BlockPos pos, Fluid fluidIn)
    {
        int i = 0;
        float f = 0.0F;

        for (int j = 0; j < 4; ++j)
        {
            BlockPos blockpos = pos.add(-(j & 1), 0, -(j >> 1 & 1));

            if (reader.getFluidState(blockpos.up()).getFluid().isEquivalentTo(fluidIn))
            {
                return 1.0F;
            }

            IFluidState ifluidstate = reader.getFluidState(blockpos);

            if (ifluidstate.getFluid().isEquivalentTo(fluidIn))
            {
                float f1 = ifluidstate.getActualHeight(reader, blockpos);

                if (f1 >= 0.8F)
                {
                    f += f1 * 10.0F;
                    i += 10;
                }
                else
                {
                    f += f1;
                    ++i;
                }
            }
            else if (!reader.getBlockState(blockpos).getMaterial().isSolid())
            {
                ++i;
            }
        }

        return f / (float)i;
    }
}
