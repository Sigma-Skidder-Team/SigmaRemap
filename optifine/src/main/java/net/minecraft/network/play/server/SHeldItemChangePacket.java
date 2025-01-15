package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

public class SHeldItemChangePacket implements IPacket<IClientPlayNetHandler>
{
    private int heldItemHotbarIndex;

    public SHeldItemChangePacket()
    {
    }

    public SHeldItemChangePacket(int p_i3907_1_)
    {
        this.heldItemHotbarIndex = p_i3907_1_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.heldItemHotbarIndex = buf.readByte();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeByte(this.heldItemHotbarIndex);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleHeldItemChange(this);
    }

    public int getHeldItemHotbarIndex()
    {
        return this.heldItemHotbarIndex;
    }
}
