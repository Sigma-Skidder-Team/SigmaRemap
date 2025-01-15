package net.optifine;

import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeContainer;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkSection;

public class ChunkOF extends Chunk
{
    private ChunkDataOF chunkDataOF;

    public ChunkOF(World worldIn, ChunkPos chunkPosIn, BiomeContainer biomeContainerIn)
    {
        super(worldIn, chunkPosIn, biomeContainerIn);
    }

    public ChunkDataOF getChunkDataOF()
    {
        return this.chunkDataOF;
    }

    public void setChunkDataOF(ChunkDataOF chunkDataOF)
    {
        this.chunkDataOF = chunkDataOF;
    }

    public static ChunkDataOF makeChunkDataOF(Chunk chunkIn)
    {
        ChunkSectionDataOF[] achunksectiondataof = null;
        ChunkSection chunksection = chunkIn.getLastExtendedBlockStorage();

        if (chunksection != null)
        {
            int i = (chunksection.getYLocation() >> 4) + 1;
            achunksectiondataof = new ChunkSectionDataOF[i];
            ChunkSection[] achunksection = chunkIn.getSections();

            for (int j = 0; j < i; ++j)
            {
                ChunkSection chunksection1 = achunksection[j];

                if (chunksection1 != null)
                {
                    short short1 = chunksection1.getBlockRefCount();
                    short short2 = chunksection1.getTickRefCount();
                    short short3 = chunksection1.getFluidRefCount();
                    achunksectiondataof[j] = new ChunkSectionDataOF(short1, short2, short3);
                }
            }
        }

        ChunkDataOF chunkdataof = new ChunkDataOF(achunksectiondataof);
        return chunkdataof;
    }
}
