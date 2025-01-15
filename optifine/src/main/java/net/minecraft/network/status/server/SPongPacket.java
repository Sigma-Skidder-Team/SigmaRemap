package net.minecraft.network.status.server;

import java.io.IOException;
import net.minecraft.client.network.status.IClientStatusNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

public class SPongPacket implements IPacket<IClientStatusNetHandler>
{
    private long clientTime;

    public SPongPacket()
    {
    }

    public SPongPacket(long p_i3279_1_)
    {
        this.clientTime = p_i3279_1_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.clientTime = buf.readLong();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeLong(this.clientTime);
    }

    public void processPacket(IClientStatusNetHandler handler)
    {
        handler.handlePong(this);
    }
}
