package net.minecraft.network.play.client;

import java.io.IOException;
import net.minecraft.entity.player.ChatVisibility;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.util.HandSide;

public class CClientSettingsPacket implements IPacket<IServerPlayNetHandler>
{
    private String lang;
    private int view;
    private ChatVisibility chatVisibility;
    private boolean enableColors;
    private int modelPartFlags;
    private HandSide mainHand;

    public CClientSettingsPacket()
    {
    }

    public CClientSettingsPacket(String p_i2575_1_, int p_i2575_2_, ChatVisibility p_i2575_3_, boolean p_i2575_4_, int p_i2575_5_, HandSide p_i2575_6_)
    {
        this.lang = p_i2575_1_;
        this.view = p_i2575_2_;
        this.chatVisibility = p_i2575_3_;
        this.enableColors = p_i2575_4_;
        this.modelPartFlags = p_i2575_5_;
        this.mainHand = p_i2575_6_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.lang = buf.readString(16);
        this.view = buf.readByte();
        this.chatVisibility = buf.readEnumValue(ChatVisibility.class);
        this.enableColors = buf.readBoolean();
        this.modelPartFlags = buf.readUnsignedByte();
        this.mainHand = buf.readEnumValue(HandSide.class);
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeString(this.lang);
        buf.writeByte(this.view);
        buf.writeEnumValue(this.chatVisibility);
        buf.writeBoolean(this.enableColors);
        buf.writeByte(this.modelPartFlags);
        buf.writeEnumValue(this.mainHand);
    }

    public void processPacket(IServerPlayNetHandler handler)
    {
        handler.processClientSettings(this);
    }

    public String getLang()
    {
        return this.lang;
    }

    public ChatVisibility getChatVisibility()
    {
        return this.chatVisibility;
    }

    public boolean isColorsEnabled()
    {
        return this.enableColors;
    }

    public int getModelPartFlags()
    {
        return this.modelPartFlags;
    }

    public HandSide getMainHand()
    {
        return this.mainHand;
    }
}
