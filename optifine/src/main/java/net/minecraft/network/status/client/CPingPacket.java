package net.minecraft.network.status.client;

import java.io.IOException;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.status.IServerStatusNetHandler;

public class CPingPacket implements IPacket<IServerStatusNetHandler>
{
    private long clientTime;

    public CPingPacket()
    {
    }

    public CPingPacket(long p_i3451_1_)
    {
        this.clientTime = p_i3451_1_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.clientTime = buf.readLong();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeLong(this.clientTime);
    }

    public void processPacket(IServerStatusNetHandler handler)
    {
        handler.processPing(this);
    }

    public long getClientTime()
    {
        return this.clientTime;
    }
}
