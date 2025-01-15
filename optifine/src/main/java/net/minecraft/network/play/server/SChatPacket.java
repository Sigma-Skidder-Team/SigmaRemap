package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.ITextComponent;

public class SChatPacket implements IPacket<IClientPlayNetHandler>
{
    private ITextComponent chatComponent;
    private ChatType type;

    public SChatPacket()
    {
    }

    public SChatPacket(ITextComponent p_i2217_1_)
    {
        this(p_i2217_1_, ChatType.SYSTEM);
    }

    public SChatPacket(ITextComponent p_i2218_1_, ChatType p_i2218_2_)
    {
        this.chatComponent = p_i2218_1_;
        this.type = p_i2218_2_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.chatComponent = buf.readTextComponent();
        this.type = ChatType.byId(buf.readByte());
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeTextComponent(this.chatComponent);
        buf.writeByte(this.type.getId());
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleChat(this);
    }

    public ITextComponent getChatComponent()
    {
        return this.chatComponent;
    }

    public boolean isSystem()
    {
        return this.type == ChatType.SYSTEM || this.type == ChatType.GAME_INFO;
    }

    public ChatType getType()
    {
        return this.type;
    }

    public boolean shouldSkipErrors()
    {
        return true;
    }
}
