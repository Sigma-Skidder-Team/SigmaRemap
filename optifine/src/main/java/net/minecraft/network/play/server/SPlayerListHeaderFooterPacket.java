package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.text.ITextComponent;

public class SPlayerListHeaderFooterPacket implements IPacket<IClientPlayNetHandler>
{
    private ITextComponent header;
    private ITextComponent footer;

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.header = buf.readTextComponent();
        this.footer = buf.readTextComponent();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeTextComponent(this.header);
        buf.writeTextComponent(this.footer);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handlePlayerListHeaderFooter(this);
    }

    public ITextComponent getHeader()
    {
        return this.header;
    }

    public ITextComponent getFooter()
    {
        return this.footer;
    }
}
