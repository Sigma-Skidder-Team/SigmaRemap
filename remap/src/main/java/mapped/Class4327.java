// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.UUID;
import com.mojang.authlib.GameProfile;

public class Class4327 implements IPacket<Class5802>
{
    private static String[] field19374;
    private GameProfile field19375;
    
    public Class4327() {
    }
    
    public Class4327(final GameProfile field19375) {
        this.field19375 = field19375;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19375 = new GameProfile(null, class8654.method29513(16));
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.method29514(this.field19375.getName());
    }
    
    public void method12990(final Class5802 class5802) {
        class5802.method17388(this);
    }
    
    public GameProfile method12991() {
        return this.field19375;
    }
}
