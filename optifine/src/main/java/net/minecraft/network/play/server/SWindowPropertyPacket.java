package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

public class SWindowPropertyPacket implements IPacket<IClientPlayNetHandler>
{
    private int windowId;
    private int property;
    private int value;

    public SWindowPropertyPacket()
    {
    }

    public SWindowPropertyPacket(int p_i2655_1_, int p_i2655_2_, int p_i2655_3_)
    {
        this.windowId = p_i2655_1_;
        this.property = p_i2655_2_;
        this.value = p_i2655_3_;
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleWindowProperty(this);
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.windowId = buf.readUnsignedByte();
        this.property = buf.readShort();
        this.value = buf.readShort();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeByte(this.windowId);
        buf.writeShort(this.property);
        buf.writeShort(this.value);
    }

    public int getWindowId()
    {
        return this.windowId;
    }

    public int getProperty()
    {
        return this.property;
    }

    public int getValue()
    {
        return this.value;
    }
}
