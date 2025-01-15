package net.minecraft.network.play.client;

import java.io.IOException;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.IServerPlayNetHandler;

public class CHeldItemChangePacket implements IPacket<IServerPlayNetHandler>
{
    private int slotId;

    public CHeldItemChangePacket()
    {
    }

    public CHeldItemChangePacket(int p_i3341_1_)
    {
        this.slotId = p_i3341_1_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.slotId = buf.readShort();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeShort(this.slotId);
    }

    public void processPacket(IServerPlayNetHandler handler)
    {
        handler.processHeldItemChange(this);
    }

    public int getSlotId()
    {
        return this.slotId;
    }
}
