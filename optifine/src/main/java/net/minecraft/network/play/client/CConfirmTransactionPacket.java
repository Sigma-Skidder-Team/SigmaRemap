package net.minecraft.network.play.client;

import java.io.IOException;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.IServerPlayNetHandler;

public class CConfirmTransactionPacket implements IPacket<IServerPlayNetHandler>
{
    private int windowId;
    private short uid;
    private boolean accepted;

    public CConfirmTransactionPacket()
    {
    }

    public CConfirmTransactionPacket(int p_i3235_1_, short p_i3235_2_, boolean p_i3235_3_)
    {
        this.windowId = p_i3235_1_;
        this.uid = p_i3235_2_;
        this.accepted = p_i3235_3_;
    }

    public void processPacket(IServerPlayNetHandler handler)
    {
        handler.processConfirmTransaction(this);
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.windowId = buf.readByte();
        this.uid = buf.readShort();
        this.accepted = buf.readByte() != 0;
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeByte(this.windowId);
        buf.writeShort(this.uid);
        buf.writeByte(this.accepted ? 1 : 0);
    }

    public int getWindowId()
    {
        return this.windowId;
    }

    public short getUid()
    {
        return this.uid;
    }
}
