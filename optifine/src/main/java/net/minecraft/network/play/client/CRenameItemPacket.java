package net.minecraft.network.play.client;

import java.io.IOException;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.IServerPlayNetHandler;

public class CRenameItemPacket implements IPacket<IServerPlayNetHandler>
{
    private String name;

    public CRenameItemPacket()
    {
    }

    public CRenameItemPacket(String p_i4173_1_)
    {
        this.name = p_i4173_1_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.name = buf.readString(32767);
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeString(this.name);
    }

    public void processPacket(IServerPlayNetHandler handler)
    {
        handler.processRenameItem(this);
    }

    public String getName()
    {
        return this.name;
    }
}
