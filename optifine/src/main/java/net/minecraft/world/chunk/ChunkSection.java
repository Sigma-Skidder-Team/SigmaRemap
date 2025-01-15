package net.minecraft.world.chunk;

import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.IFluidState;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.palette.IPalette;
import net.minecraft.util.palette.PaletteIdentity;
import net.minecraft.util.palette.PalettedContainer;
import net.optifine.ChunkDataOF;
import net.optifine.ChunkSectionDataOF;

public class ChunkSection
{
    private static final IPalette<BlockState> REGISTRY_PALETTE = new PaletteIdentity<>(Block.BLOCK_STATE_IDS, Blocks.AIR.getDefaultState());
    private final int yBase;
    private short blockRefCount;
    private short blockTickRefCount;
    private short fluidRefCount;
    private final PalettedContainer<BlockState> data;
    public static final ThreadLocal<ChunkDataOF> THREAD_CHUNK_DATA_OF = new ThreadLocal<>();

    public ChunkSection(int p_i227_1_)
    {
        this(p_i227_1_, (short)0, (short)0, (short)0);
    }

    public ChunkSection(int p_i228_1_, short p_i228_2_, short p_i228_3_, short p_i228_4_)
    {
        this.yBase = p_i228_1_;
        this.blockRefCount = p_i228_2_;
        this.blockTickRefCount = p_i228_3_;
        this.fluidRefCount = p_i228_4_;
        this.data = new PalettedContainer<>(REGISTRY_PALETTE, Block.BLOCK_STATE_IDS, NBTUtil::readBlockState, NBTUtil::writeBlockState, Blocks.AIR.getDefaultState());
    }

    public BlockState getBlockState(int x, int y, int z)
    {
        return this.data.get(x, y, z);
    }

    public IFluidState getFluidState(int x, int y, int z)
    {
        return this.data.get(x, y, z).getFluidState();
    }

    public void lock()
    {
        this.data.lock();
    }

    public void unlock()
    {
        this.data.unlock();
    }

    public BlockState setBlockState(int x, int y, int z, BlockState blockStateIn)
    {
        return this.setBlockState(x, y, z, blockStateIn, true);
    }

    public BlockState setBlockState(int x, int y, int z, BlockState state, boolean useLocks)
    {
        BlockState blockstate;

        if (useLocks)
        {
            blockstate = this.data.lockedSwap(x, y, z, state);
        }
        else
        {
            blockstate = this.data.swap(x, y, z, state);
        }

        IFluidState ifluidstate = blockstate.getFluidState();
        IFluidState ifluidstate1 = state.getFluidState();

        if (!blockstate.isAir())
        {
            --this.blockRefCount;

            if (blockstate.ticksRandomly())
            {
                --this.blockTickRefCount;
            }
        }

        if (!ifluidstate.isEmpty())
        {
            --this.fluidRefCount;
        }

        if (!state.isAir())
        {
            ++this.blockRefCount;

            if (state.ticksRandomly())
            {
                ++this.blockTickRefCount;
            }
        }

        if (!ifluidstate1.isEmpty())
        {
            ++this.fluidRefCount;
        }

        return blockstate;
    }

    public boolean isEmpty()
    {
        return this.blockRefCount == 0;
    }

    public static boolean isEmpty(@Nullable ChunkSection section)
    {
        return section == Chunk.EMPTY_SECTION || section.isEmpty();
    }

    public boolean needsRandomTickAny()
    {
        return this.needsRandomTick() || this.needsRandomTickFluid();
    }

    public boolean needsRandomTick()
    {
        return this.blockTickRefCount > 0;
    }

    public boolean needsRandomTickFluid()
    {
        return this.fluidRefCount > 0;
    }

    public int getYLocation()
    {
        return this.yBase;
    }

    public void recalculateRefCounts()
    {
        ChunkDataOF chunkdataof = THREAD_CHUNK_DATA_OF.get();

        if (chunkdataof != null)
        {
            ChunkSectionDataOF[] achunksectiondataof = chunkdataof.getChunkSectionDatas();

            if (achunksectiondataof != null)
            {
                int i = this.yBase >> 4;

                if (i >= 0 && i < achunksectiondataof.length)
                {
                    ChunkSectionDataOF chunksectiondataof = achunksectiondataof[i];

                    if (chunksectiondataof != null)
                    {
                        this.blockRefCount = chunksectiondataof.getBlockRefCount();
                        this.blockTickRefCount = chunksectiondataof.getTickRefCount();
                        this.fluidRefCount = chunksectiondataof.getFluidRefCount();
                        achunksectiondataof[i] = null;
                        return;
                    }
                }
            }
        }

        this.blockRefCount = 0;
        this.blockTickRefCount = 0;
        this.fluidRefCount = 0;
        this.data.count((p_lambda$recalculateRefCounts$0_1_, p_lambda$recalculateRefCounts$0_2_) ->
        {
            IFluidState ifluidstate = p_lambda$recalculateRefCounts$0_1_.getFluidState();

            if (!p_lambda$recalculateRefCounts$0_1_.isAir())
            {
                this.blockRefCount = (short)(this.blockRefCount + p_lambda$recalculateRefCounts$0_2_);

                if (p_lambda$recalculateRefCounts$0_1_.ticksRandomly())
                {
                    this.blockTickRefCount = (short)(this.blockTickRefCount + p_lambda$recalculateRefCounts$0_2_);
                }
            }

            if (!ifluidstate.isEmpty())
            {
                this.blockRefCount = (short)(this.blockRefCount + p_lambda$recalculateRefCounts$0_2_);

                if (ifluidstate.ticksRandomly())
                {
                    this.fluidRefCount = (short)(this.fluidRefCount + p_lambda$recalculateRefCounts$0_2_);
                }
            }
        });
    }

    public PalettedContainer<BlockState> getData()
    {
        return this.data;
    }

    public void read(PacketBuffer packetBufferIn)
    {
        this.blockRefCount = packetBufferIn.readShort();
        this.data.read(packetBufferIn);
    }

    public void write(PacketBuffer packetBufferIn)
    {
        packetBufferIn.writeShort(this.blockRefCount);
        this.data.write(packetBufferIn);
    }

    public int getSize()
    {
        return 2 + this.data.getSerializedSize();
    }

    public boolean contains(BlockState state)
    {
        return this.data.contains(state);
    }

    public short getBlockRefCount()
    {
        return this.blockRefCount;
    }

    public short getTickRefCount()
    {
        return this.blockTickRefCount;
    }

    public short getFluidRefCount()
    {
        return this.fluidRefCount;
    }
}
