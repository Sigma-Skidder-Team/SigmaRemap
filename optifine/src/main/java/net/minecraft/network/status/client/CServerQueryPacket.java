package net.minecraft.network.status.client;

import java.io.IOException;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.status.IServerStatusNetHandler;

public class CServerQueryPacket implements IPacket<IServerStatusNetHandler>
{
    public void readPacketData(PacketBuffer buf) throws IOException
    {
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
    }

    public void processPacket(IServerStatusNetHandler handler)
    {
        handler.processServerQuery(this);
    }
}
