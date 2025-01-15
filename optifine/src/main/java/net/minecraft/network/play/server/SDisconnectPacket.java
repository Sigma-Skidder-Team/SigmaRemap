package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.text.ITextComponent;

public class SDisconnectPacket implements IPacket<IClientPlayNetHandler>
{
    private ITextComponent reason;

    public SDisconnectPacket()
    {
    }

    public SDisconnectPacket(ITextComponent p_i3785_1_)
    {
        this.reason = p_i3785_1_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.reason = buf.readTextComponent();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeTextComponent(this.reason);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleDisconnect(this);
    }

    public ITextComponent getReason()
    {
        return this.reason;
    }
}
