package net.minecraft.client.renderer.chunk;

import javax.annotation.Nullable;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.IFluidState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ILightReader;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.level.ColorResolver;
import net.minecraft.world.lighting.WorldLightManager;

public class ChunkRenderCache implements ILightReader
{
    protected final int chunkStartX;
    protected final int chunkStartZ;
    protected final BlockPos cacheStartPos;
    protected final int cacheSizeX;
    protected final int cacheSizeY;
    protected final int cacheSizeZ;
    protected final Chunk[][] chunks;
    protected final BlockState[] blockStates;
    protected final IFluidState[] fluidStates;
    protected final World world;

    @Nullable
    public static ChunkRenderCache generateCache(World worldIn, BlockPos from, BlockPos to, int padding)
    {
        return generateCache(worldIn, from, to, padding, true);
    }

    public static ChunkRenderCache generateCache(World p_generateCache_0_, BlockPos p_generateCache_1_, BlockPos p_generateCache_2_, int p_generateCache_3_, boolean p_generateCache_4_)
    {
        int i = p_generateCache_1_.getX() - p_generateCache_3_ >> 4;
        int j = p_generateCache_1_.getZ() - p_generateCache_3_ >> 4;
        int k = p_generateCache_2_.getX() + p_generateCache_3_ >> 4;
        int l = p_generateCache_2_.getZ() + p_generateCache_3_ >> 4;
        Chunk[][] achunk = new Chunk[k - i + 1][l - j + 1];

        for (int i1 = i; i1 <= k; ++i1)
        {
            for (int j1 = j; j1 <= l; ++j1)
            {
                achunk[i1 - i][j1 - j] = p_generateCache_0_.getChunk(i1, j1);
            }
        }

        boolean flag = true;

        if (p_generateCache_4_)
        {
            for (int l1 = p_generateCache_1_.getX() >> 4; l1 <= p_generateCache_2_.getX() >> 4; ++l1)
            {
                for (int k1 = p_generateCache_1_.getZ() >> 4; k1 <= p_generateCache_2_.getZ() >> 4; ++k1)
                {
                    Chunk chunk = achunk[l1 - i][k1 - j];

                    if (!chunk.isEmptyBetween(p_generateCache_1_.getY(), p_generateCache_2_.getY()))
                    {
                        flag = false;
                    }
                }
            }
        }
        else
        {
            flag = false;
        }

        if (flag)
        {
            return null;
        }
        else
        {
            int i2 = 1;
            BlockPos blockpos = p_generateCache_1_.add(-1, -1, -1);
            BlockPos blockpos1 = p_generateCache_2_.add(1, 1, 1);
            return new ChunkRenderCache(p_generateCache_0_, i, j, achunk, blockpos, blockpos1);
        }
    }

    public ChunkRenderCache(World p_i177_1_, int p_i177_2_, int p_i177_3_, Chunk[][] p_i177_4_, BlockPos p_i177_5_, BlockPos p_i177_6_)
    {
        this.world = p_i177_1_;
        this.chunkStartX = p_i177_2_;
        this.chunkStartZ = p_i177_3_;
        this.chunks = p_i177_4_;
        this.cacheStartPos = p_i177_5_;
        this.cacheSizeX = p_i177_6_.getX() - p_i177_5_.getX() + 1;
        this.cacheSizeY = p_i177_6_.getY() - p_i177_5_.getY() + 1;
        this.cacheSizeZ = p_i177_6_.getZ() - p_i177_5_.getZ() + 1;
        this.blockStates = null;
        this.fluidStates = null;
    }

    protected final int getIndex(BlockPos pos)
    {
        return this.getIndex(pos.getX(), pos.getY(), pos.getZ());
    }

    protected int getIndex(int xIn, int yIn, int zIn)
    {
        int i = xIn - this.cacheStartPos.getX();
        int j = yIn - this.cacheStartPos.getY();
        int k = zIn - this.cacheStartPos.getZ();
        return k * this.cacheSizeX * this.cacheSizeY + j * this.cacheSizeX + i;
    }

    public BlockState getBlockState(BlockPos pos)
    {
        int i = (pos.getX() >> 4) - this.chunkStartX;
        int j = (pos.getZ() >> 4) - this.chunkStartZ;
        return this.chunks[i][j].getBlockState(pos);
    }

    public IFluidState getFluidState(BlockPos pos)
    {
        int i = (pos.getX() >> 4) - this.chunkStartX;
        int j = (pos.getZ() >> 4) - this.chunkStartZ;
        return this.chunks[i][j].getFluidState(pos);
    }

    public WorldLightManager getLightManager()
    {
        return this.world.getLightManager();
    }

    @Nullable
    public TileEntity getTileEntity(BlockPos pos)
    {
        return this.getTileEntity(pos, Chunk.CreateEntityType.IMMEDIATE);
    }

    @Nullable
    public TileEntity getTileEntity(BlockPos pos, Chunk.CreateEntityType creationType)
    {
        int i = (pos.getX() >> 4) - this.chunkStartX;
        int j = (pos.getZ() >> 4) - this.chunkStartZ;
        return this.chunks[i][j].getTileEntity(pos, creationType);
    }

    public int getBlockColor(BlockPos blockPosIn, ColorResolver colorResolverIn)
    {
        return this.world.getBlockColor(blockPosIn, colorResolverIn);
    }

    public Biome getBiome(BlockPos p_getBiome_1_)
    {
        return this.world.getBiome(p_getBiome_1_);
    }
}
