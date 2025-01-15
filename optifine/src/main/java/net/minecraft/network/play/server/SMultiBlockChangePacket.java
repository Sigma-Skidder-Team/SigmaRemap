package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.chunk.Chunk;

public class SMultiBlockChangePacket implements IPacket<IClientPlayNetHandler>
{
    private ChunkPos chunkPos;
    private SMultiBlockChangePacket.UpdateData[] changedBlocks;

    public SMultiBlockChangePacket()
    {
    }

    public SMultiBlockChangePacket(int p_i4162_1_, short[] p_i4162_2_, Chunk p_i4162_3_)
    {
        this.chunkPos = p_i4162_3_.getPos();
        this.changedBlocks = new SMultiBlockChangePacket.UpdateData[p_i4162_1_];

        for (int i = 0; i < this.changedBlocks.length; ++i)
        {
            this.changedBlocks[i] = new SMultiBlockChangePacket.UpdateData(p_i4162_2_[i], p_i4162_3_);
        }
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.chunkPos = new ChunkPos(buf.readInt(), buf.readInt());
        this.changedBlocks = new SMultiBlockChangePacket.UpdateData[buf.readVarInt()];

        for (int i = 0; i < this.changedBlocks.length; ++i)
        {
            this.changedBlocks[i] = new SMultiBlockChangePacket.UpdateData(buf.readShort(), Block.BLOCK_STATE_IDS.getByValue(buf.readVarInt()));
        }
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeInt(this.chunkPos.x);
        buf.writeInt(this.chunkPos.z);
        buf.writeVarInt(this.changedBlocks.length);

        for (SMultiBlockChangePacket.UpdateData smultiblockchangepacket$updatedata : this.changedBlocks)
        {
            buf.writeShort(smultiblockchangepacket$updatedata.getOffset());
            buf.writeVarInt(Block.getStateId(smultiblockchangepacket$updatedata.getBlockState()));
        }
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleMultiBlockChange(this);
    }

    public SMultiBlockChangePacket.UpdateData[] getChangedBlocks()
    {
        return this.changedBlocks;
    }

    public class UpdateData
    {
        private final short offset;
        private final BlockState blockState;

        public UpdateData(short p_i827_2_, BlockState p_i827_3_)
        {
            this.offset = p_i827_2_;
            this.blockState = p_i827_3_;
        }

        public UpdateData(short p_i828_2_, Chunk p_i828_3_)
        {
            this.offset = p_i828_2_;
            this.blockState = p_i828_3_.getBlockState(this.getPos());
        }

        public BlockPos getPos()
        {
            return new BlockPos(SMultiBlockChangePacket.this.chunkPos.getBlock(this.offset >> 12 & 15, this.offset & 255, this.offset >> 8 & 15));
        }

        public short getOffset()
        {
            return this.offset;
        }

        public BlockState getBlockState()
        {
            return this.blockState;
        }
    }
}
