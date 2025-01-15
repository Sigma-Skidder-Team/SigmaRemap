package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

public class SUpdateTimePacket implements IPacket<IClientPlayNetHandler>
{
    private long totalWorldTime;
    private long worldTime;

    public SUpdateTimePacket()
    {
    }

    public SUpdateTimePacket(long p_i2048_1_, long p_i2048_3_, boolean p_i2048_5_)
    {
        this.totalWorldTime = p_i2048_1_;
        this.worldTime = p_i2048_3_;

        if (!p_i2048_5_)
        {
            this.worldTime = -this.worldTime;

            if (this.worldTime == 0L)
            {
                this.worldTime = -1L;
            }
        }
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.totalWorldTime = buf.readLong();
        this.worldTime = buf.readLong();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeLong(this.totalWorldTime);
        buf.writeLong(this.worldTime);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleTimeUpdate(this);
    }

    public long getTotalWorldTime()
    {
        return this.totalWorldTime;
    }

    public long getWorldTime()
    {
        return this.worldTime;
    }
}
