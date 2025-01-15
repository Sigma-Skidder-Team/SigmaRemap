package net.minecraft.network.play.client;

import java.io.IOException;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.IServerPlayNetHandler;

public class CEnchantItemPacket implements IPacket<IServerPlayNetHandler>
{
    private int windowId;
    private int button;

    public CEnchantItemPacket()
    {
    }

    public CEnchantItemPacket(int p_i1365_1_, int p_i1365_2_)
    {
        this.windowId = p_i1365_1_;
        this.button = p_i1365_2_;
    }

    public void processPacket(IServerPlayNetHandler handler)
    {
        handler.processEnchantItem(this);
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.windowId = buf.readByte();
        this.button = buf.readByte();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeByte(this.windowId);
        buf.writeByte(this.button);
    }

    public int getWindowId()
    {
        return this.windowId;
    }

    public int getButton()
    {
        return this.button;
    }
}
