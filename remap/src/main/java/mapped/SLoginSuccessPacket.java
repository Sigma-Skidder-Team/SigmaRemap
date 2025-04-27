// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.UUID;
import com.mojang.authlib.GameProfile;

public class SLoginSuccessPacket implements IPacket<IClientLoginNetHandler>
{
    private GameProfile profile;
    
    public SLoginSuccessPacket() {
    }
    
    public SLoginSuccessPacket(final GameProfile profile) {
        this.profile = profile;
    }
    
    @Override
    public void readPacketData(PacketBuffer buf) throws IOException
    {
        int[] aint = new int[4];

        for (int i = 0; i < aint.length; ++i)
        {
            aint[i] = buf.readInt();
        }

        UUID uuid = UUIDCodec.decodeUUID(aint);
        String s = buf.readString(16);
        this.profile = new GameProfile(uuid, s);
    }
    
    @Override
    public void writePacketData(PacketBuffer buf) throws IOException
    {
        for (int i : UUIDCodec.encodeUUID(this.profile.getId()))
        {
            buf.writeInt(i);
        }

        buf.writeString(this.profile.getName());
    }
    
    public void processPacket(final IClientLoginNetHandler IClientLoginNetHandler) {
        IClientLoginNetHandler.handleLoginSuccess(this);
    }
    
    public GameProfile method13133() {
        return this.profile;
    }
}
