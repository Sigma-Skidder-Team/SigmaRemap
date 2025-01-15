package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

public class SConfirmTransactionPacket implements IPacket<IClientPlayNetHandler>
{
    private int windowId;
    private short actionNumber;
    private boolean accepted;

    public SConfirmTransactionPacket()
    {
    }

    public SConfirmTransactionPacket(int p_i1748_1_, short p_i1748_2_, boolean p_i1748_3_)
    {
        this.windowId = p_i1748_1_;
        this.actionNumber = p_i1748_2_;
        this.accepted = p_i1748_3_;
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleConfirmTransaction(this);
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.windowId = buf.readUnsignedByte();
        this.actionNumber = buf.readShort();
        this.accepted = buf.readBoolean();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeByte(this.windowId);
        buf.writeShort(this.actionNumber);
        buf.writeBoolean(this.accepted);
    }

    public int getWindowId()
    {
        return this.windowId;
    }

    public short getActionNumber()
    {
        return this.actionNumber;
    }

    public boolean wasAccepted()
    {
        return this.accepted;
    }
}
