package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

public class SCloseWindowPacket implements IPacket<IClientPlayNetHandler>
{
    private int windowId;

    public SCloseWindowPacket()
    {
    }

    public SCloseWindowPacket(int entityIn)
    {
        this.windowId = entityIn;
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleCloseWindow(this);
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.windowId = buf.readUnsignedByte();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeByte(this.windowId);
    }
}
