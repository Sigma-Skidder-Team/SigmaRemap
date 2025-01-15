package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;

public class SUpdateTileEntityPacket implements IPacket<IClientPlayNetHandler>
{
    private BlockPos blockPos;
    private int tileEntityType;
    private CompoundNBT nbt;

    public SUpdateTileEntityPacket()
    {
    }

    public SUpdateTileEntityPacket(BlockPos p_i4010_1_, int p_i4010_2_, CompoundNBT p_i4010_3_)
    {
        this.blockPos = p_i4010_1_;
        this.tileEntityType = p_i4010_2_;
        this.nbt = p_i4010_3_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.blockPos = buf.readBlockPos();
        this.tileEntityType = buf.readUnsignedByte();
        this.nbt = buf.readCompoundTag();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeBlockPos(this.blockPos);
        buf.writeByte((byte)this.tileEntityType);
        buf.writeCompoundTag(this.nbt);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleUpdateTileEntity(this);
    }

    public BlockPos getPos()
    {
        return this.blockPos;
    }

    public int getTileEntityType()
    {
        return this.tileEntityType;
    }

    public CompoundNBT getNbtCompound()
    {
        return this.nbt;
    }
}
