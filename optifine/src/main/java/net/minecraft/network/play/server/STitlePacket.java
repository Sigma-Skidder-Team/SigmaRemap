package net.minecraft.network.play.server;

import java.io.IOException;
import javax.annotation.Nullable;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.text.ITextComponent;

public class STitlePacket implements IPacket<IClientPlayNetHandler>
{
    private STitlePacket.Type type;
    private ITextComponent message;
    private int fadeInTime;
    private int displayTime;
    private int fadeOutTime;

    public STitlePacket()
    {
    }

    public STitlePacket(STitlePacket.Type p_i3182_1_, ITextComponent p_i3182_2_)
    {
        this(p_i3182_1_, p_i3182_2_, -1, -1, -1);
    }

    public STitlePacket(int p_i3183_1_, int p_i3183_2_, int p_i3183_3_)
    {
        this(STitlePacket.Type.TIMES, (ITextComponent)null, p_i3183_1_, p_i3183_2_, p_i3183_3_);
    }

    public STitlePacket(STitlePacket.Type p_i3184_1_, @Nullable ITextComponent p_i3184_2_, int p_i3184_3_, int p_i3184_4_, int p_i3184_5_)
    {
        this.type = p_i3184_1_;
        this.message = p_i3184_2_;
        this.fadeInTime = p_i3184_3_;
        this.displayTime = p_i3184_4_;
        this.fadeOutTime = p_i3184_5_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.type = buf.readEnumValue(STitlePacket.Type.class);

        if (this.type == STitlePacket.Type.TITLE || this.type == STitlePacket.Type.SUBTITLE || this.type == STitlePacket.Type.ACTIONBAR)
        {
            this.message = buf.readTextComponent();
        }

        if (this.type == STitlePacket.Type.TIMES)
        {
            this.fadeInTime = buf.readInt();
            this.displayTime = buf.readInt();
            this.fadeOutTime = buf.readInt();
        }
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeEnumValue(this.type);

        if (this.type == STitlePacket.Type.TITLE || this.type == STitlePacket.Type.SUBTITLE || this.type == STitlePacket.Type.ACTIONBAR)
        {
            buf.writeTextComponent(this.message);
        }

        if (this.type == STitlePacket.Type.TIMES)
        {
            buf.writeInt(this.fadeInTime);
            buf.writeInt(this.displayTime);
            buf.writeInt(this.fadeOutTime);
        }
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleTitle(this);
    }

    public STitlePacket.Type getType()
    {
        return this.type;
    }

    public ITextComponent getMessage()
    {
        return this.message;
    }

    public int getFadeInTime()
    {
        return this.fadeInTime;
    }

    public int getDisplayTime()
    {
        return this.displayTime;
    }

    public int getFadeOutTime()
    {
        return this.fadeOutTime;
    }

    public static enum Type
    {
        TITLE,
        SUBTITLE,
        ACTIONBAR,
        TIMES,
        CLEAR,
        RESET;
    }
}
