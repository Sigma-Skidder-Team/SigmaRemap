package net.minecraft.network.play.client;

import java.io.IOException;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.IServerPlayNetHandler;

public class CCloseWindowPacket implements IPacket<IServerPlayNetHandler>
{
    private int windowId;

    public CCloseWindowPacket()
    {
    }

    public CCloseWindowPacket(int creature)
    {
        this.windowId = creature;
    }

    public void processPacket(IServerPlayNetHandler handler)
    {
        handler.processCloseWindow(this);
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.windowId = buf.readByte();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeByte(this.windowId);
    }
}
