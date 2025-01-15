package net.minecraft.network.play.client;

import java.io.IOException;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.IServerPlayNetHandler;

public class CResourcePackStatusPacket implements IPacket<IServerPlayNetHandler>
{
    private CResourcePackStatusPacket.Action action;

    public CResourcePackStatusPacket()
    {
    }

    public CResourcePackStatusPacket(CResourcePackStatusPacket.Action p_i3716_1_)
    {
        this.action = p_i3716_1_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.action = buf.readEnumValue(CResourcePackStatusPacket.Action.class);
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeEnumValue(this.action);
    }

    public void processPacket(IServerPlayNetHandler handler)
    {
        handler.handleResourcePackStatus(this);
    }

    public static enum Action
    {
        SUCCESSFULLY_LOADED,
        DECLINED,
        FAILED_DOWNLOAD,
        ACCEPTED;
    }
}
