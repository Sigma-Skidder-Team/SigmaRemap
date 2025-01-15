package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

public class SUnloadChunkPacket implements IPacket<IClientPlayNetHandler>
{
    private int x;
    private int z;

    public SUnloadChunkPacket()
    {
    }

    public SUnloadChunkPacket(int p_i3218_1_, int p_i3218_2_)
    {
        this.x = p_i3218_1_;
        this.z = p_i3218_2_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.x = buf.readInt();
        this.z = buf.readInt();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeInt(this.x);
        buf.writeInt(this.z);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.processChunkUnload(this);
    }

    public int getX()
    {
        return this.x;
    }

    public int getZ()
    {
        return this.z;
    }
}
