package net.minecraft.network.login.server;

import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.util.UUID;
import net.minecraft.client.network.login.IClientLoginNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

public class SLoginSuccessPacket implements IPacket<IClientLoginNetHandler>
{
    private GameProfile profile;

    public SLoginSuccessPacket()
    {
    }

    public SLoginSuccessPacket(GameProfile p_i3146_1_)
    {
        this.profile = p_i3146_1_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        String s = buf.readString(36);
        String s1 = buf.readString(16);
        UUID uuid = UUID.fromString(s);
        this.profile = new GameProfile(uuid, s1);
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        UUID uuid = this.profile.getId();
        buf.writeString(uuid == null ? "" : uuid.toString());
        buf.writeString(this.profile.getName());
    }

    public void processPacket(IClientLoginNetHandler handler)
    {
        handler.handleLoginSuccess(this);
    }

    public GameProfile getProfile()
    {
        return this.profile;
    }
}
