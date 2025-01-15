package net.minecraft.network.play.client;

import java.io.IOException;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.IServerPlayNetHandler;

public class CKeepAlivePacket implements IPacket<IServerPlayNetHandler>
{
    private long key;

    public CKeepAlivePacket()
    {
    }

    public CKeepAlivePacket(long p_i2747_1_)
    {
        this.key = p_i2747_1_;
    }

    public void processPacket(IServerPlayNetHandler handler)
    {
        handler.processKeepAlive(this);
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.key = buf.readLong();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeLong(this.key);
    }

    public long getKey()
    {
        return this.key;
    }
}
