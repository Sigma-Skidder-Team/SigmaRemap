// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.UUID;
import com.mojang.authlib.GameProfile;

public class Class4367 implements IPacket<Class5807>
{
    private GameProfile field19564;
    
    public Class4367() {
    }
    
    public Class4367(final GameProfile field19564) {
        this.field19564 = field19564;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19564 = new GameProfile(UUID.fromString(class8654.method29513(36)), class8654.method29513(16));
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        final UUID id = this.field19564.getId();
        class8654.method29514((id != null) ? id.toString() : "");
        class8654.method29514(this.field19564.getName());
    }
    
    public void method12841(final Class5807 class5807) {
        class5807.method17405(this);
    }
    
    public GameProfile method13133() {
        return this.field19564;
    }
}
