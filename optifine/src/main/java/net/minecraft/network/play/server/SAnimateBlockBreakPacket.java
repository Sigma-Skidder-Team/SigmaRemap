package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;

public class SAnimateBlockBreakPacket implements IPacket<IClientPlayNetHandler>
{
    private int breakerId;
    private BlockPos position;
    private int progress;

    public SAnimateBlockBreakPacket()
    {
    }

    public SAnimateBlockBreakPacket(int p_i309_1_, BlockPos p_i309_2_, int p_i309_3_)
    {
        this.breakerId = p_i309_1_;
        this.position = p_i309_2_;
        this.progress = p_i309_3_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.breakerId = buf.readVarInt();
        this.position = buf.readBlockPos();
        this.progress = buf.readUnsignedByte();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeVarInt(this.breakerId);
        buf.writeBlockPos(this.position);
        buf.writeByte(this.progress);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleBlockBreakAnim(this);
    }

    public int getBreakerId()
    {
        return this.breakerId;
    }

    public BlockPos getPosition()
    {
        return this.position;
    }

    public int getProgress()
    {
        return this.progress;
    }
}
