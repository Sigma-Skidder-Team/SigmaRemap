package net.minecraft.network.play.client;

import java.io.IOException;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.util.math.BlockPos;

public class CQueryTileEntityNBTPacket implements IPacket<IServerPlayNetHandler>
{
    private int transactionId;
    private BlockPos pos;

    public CQueryTileEntityNBTPacket()
    {
    }

    public CQueryTileEntityNBTPacket(int p_i1309_1_, BlockPos p_i1309_2_)
    {
        this.transactionId = p_i1309_1_;
        this.pos = p_i1309_2_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.transactionId = buf.readVarInt();
        this.pos = buf.readBlockPos();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeVarInt(this.transactionId);
        buf.writeBlockPos(this.pos);
    }

    public void processPacket(IServerPlayNetHandler handler)
    {
        handler.processNBTQueryBlockEntity(this);
    }

    public int getTransactionId()
    {
        return this.transactionId;
    }

    public BlockPos getPosition()
    {
        return this.pos;
    }
}
