package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tags.NetworkTagManager;

public class STagsListPacket implements IPacket<IClientPlayNetHandler>
{
    private NetworkTagManager tags;

    public STagsListPacket()
    {
    }

    public STagsListPacket(NetworkTagManager p_i1154_1_)
    {
        this.tags = p_i1154_1_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.tags = NetworkTagManager.read(buf);
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        this.tags.write(buf);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleTags(this);
    }

    public NetworkTagManager getTags()
    {
        return this.tags;
    }
}
