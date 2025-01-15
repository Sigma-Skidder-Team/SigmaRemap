package net.optifine.override;

import java.util.Arrays;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.chunk.ChunkRenderCache;
import net.minecraft.fluid.IFluidState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ILightReader;
import net.minecraft.world.LightType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.level.ColorResolver;
import net.minecraft.world.lighting.WorldLightManager;
import net.optifine.render.RenderEnv;
import net.optifine.util.ArrayCache;

public class ChunkCacheOF implements ILightReader
{
    private final ChunkRenderCache chunkCache;
    private final int posX;
    private final int posY;
    private final int posZ;
    private final int sizeX;
    private final int sizeY;
    private final int sizeZ;
    private final int sizeXY;
    private int[] skyLights;
    private int[] blockLights;
    private BlockState[] blockStates;
    private Biome[] biomes;
    private final int arraySize;
    private RenderEnv renderEnv;
    private static final ArrayCache cacheSkyLights = new ArrayCache(Integer.TYPE, 16);
    private static final ArrayCache cacheBlockLights = new ArrayCache(Integer.TYPE, 16);
    private static final ArrayCache cacheBlockStates = new ArrayCache(BlockState.class, 16);
    private static final ArrayCache cacheBiomes = new ArrayCache(Biome.class, 16);

    public ChunkCacheOF(ChunkRenderCache chunkCache, BlockPos posFromIn, BlockPos posToIn, int subIn)
    {
        this.chunkCache = chunkCache;
        int i = posFromIn.getX() - subIn >> 4;
        int j = posFromIn.getY() - subIn >> 4;
        int k = posFromIn.getZ() - subIn >> 4;
        int l = posToIn.getX() + subIn >> 4;
        int i1 = posToIn.getY() + subIn >> 4;
        int j1 = posToIn.getZ() + subIn >> 4;
        this.sizeX = l - i + 1 << 4;
        this.sizeY = i1 - j + 1 << 4;
        this.sizeZ = j1 - k + 1 << 4;
        this.sizeXY = this.sizeX * this.sizeY;
        this.arraySize = this.sizeX * this.sizeY * this.sizeZ;
        this.posX = i << 4;
        this.posY = j << 4;
        this.posZ = k << 4;
    }

    private int getPositionIndex(BlockPos pos)
    {
        int i = pos.getX() - this.posX;

        if (i >= 0 && i < this.sizeX)
        {
            int j = pos.getY() - this.posY;

            if (j >= 0 && j < this.sizeY)
            {
                int k = pos.getZ() - this.posZ;
                return k >= 0 && k < this.sizeZ ? k * this.sizeXY + j * this.sizeX + i : -1;
            }
            else
            {
                return -1;
            }
        }
        else
        {
            return -1;
        }
    }

    public int getLightFor(LightType type, BlockPos pos)
    {
        int[] aint;

        if (type == LightType.SKY)
        {
            aint = this.skyLights;
        }
        else
        {
            if (type != LightType.BLOCK)
            {
                return this.getLightForRaw(type, pos);
            }

            aint = this.blockLights;
        }

        int i = this.getPositionIndex(pos);

        if (i >= 0 && i < this.arraySize && aint != null)
        {
            int j = aint[i];

            if (j == -1)
            {
                j = this.getLightForRaw(type, pos);
                aint[i] = j;
            }

            return j;
        }
        else
        {
            return this.getLightForRaw(type, pos);
        }
    }

    private int getLightForRaw(LightType type, BlockPos pos)
    {
        return this.chunkCache.getLightFor(type, pos);
    }

    public BlockState getBlockState(BlockPos pos)
    {
        int i = this.getPositionIndex(pos);

        if (i >= 0 && i < this.arraySize && this.blockStates != null)
        {
            BlockState blockstate = this.blockStates[i];

            if (blockstate == null)
            {
                blockstate = this.chunkCache.getBlockState(pos);
                this.blockStates[i] = blockstate;
            }

            return blockstate;
        }
        else
        {
            return this.chunkCache.getBlockState(pos);
        }
    }

    public void renderStart()
    {
        if (this.skyLights == null)
        {
            this.skyLights = (int[])cacheSkyLights.allocate(this.arraySize);
        }

        if (this.blockLights == null)
        {
            this.blockLights = (int[])cacheBlockLights.allocate(this.arraySize);
        }

        Arrays.fill(this.skyLights, -1);
        Arrays.fill(this.blockLights, -1);

        if (this.blockStates == null)
        {
            this.blockStates = (BlockState[])cacheBlockStates.allocate(this.arraySize);
        }

        Arrays.fill(this.blockStates, (Object)null);

        if (this.biomes == null)
        {
            this.biomes = (Biome[])cacheBiomes.allocate(this.arraySize);
        }

        Arrays.fill(this.biomes, (Object)null);
    }

    public void renderFinish()
    {
        cacheSkyLights.free(this.skyLights);
        this.skyLights = null;
        cacheBlockLights.free(this.blockLights);
        this.blockLights = null;
        cacheBlockStates.free(this.blockStates);
        this.blockStates = null;
        cacheBiomes.free(this.biomes);
        this.biomes = null;
    }

    public Biome getBiome(BlockPos pos)
    {
        int i = this.getPositionIndex(pos);

        if (i >= 0 && i < this.arraySize && this.biomes != null)
        {
            Biome biome = this.biomes[i];

            if (biome == null)
            {
                biome = this.chunkCache.getBiome(pos);
                this.biomes[i] = biome;
            }

            return biome;
        }
        else
        {
            return this.chunkCache.getBiome(pos);
        }
    }

    public TileEntity getTileEntity(BlockPos pos)
    {
        return this.chunkCache.getTileEntity(pos, Chunk.CreateEntityType.CHECK);
    }

    public TileEntity getTileEntity(BlockPos pos, Chunk.CreateEntityType type)
    {
        return this.chunkCache.getTileEntity(pos, type);
    }

    public boolean canSeeSky(BlockPos pos)
    {
        return this.chunkCache.canSeeSky(pos);
    }

    public IFluidState getFluidState(BlockPos pos)
    {
        return this.getBlockState(pos).getFluidState();
    }

    public int getBlockColor(BlockPos blockPosIn, ColorResolver colorResolverIn)
    {
        return this.chunkCache.getBlockColor(blockPosIn, colorResolverIn);
    }

    public WorldLightManager getLightManager()
    {
        return this.chunkCache.getLightManager();
    }

    public RenderEnv getRenderEnv()
    {
        return this.renderEnv;
    }

    public void setRenderEnv(RenderEnv renderEnv)
    {
        this.renderEnv = renderEnv;
    }
}
