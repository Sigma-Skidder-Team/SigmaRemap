package net.minecraft.network.play.client;

import java.io.IOException;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.IServerPlayNetHandler;

public class CChatMessagePacket implements IPacket<IServerPlayNetHandler>
{
    private String message;

    public CChatMessagePacket()
    {
    }

    public CChatMessagePacket(String p_i3572_1_)
    {
        if (p_i3572_1_.length() > 256)
        {
            p_i3572_1_ = p_i3572_1_.substring(0, 256);
        }

        this.message = p_i3572_1_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.message = buf.readString(256);
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeString(this.message);
    }

    public void processPacket(IServerPlayNetHandler handler)
    {
        handler.processChatMessage(this);
    }

    public String getMessage()
    {
        return this.message;
    }
}
