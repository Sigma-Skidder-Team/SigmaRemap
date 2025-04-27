// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4283 implements IPacket<IClientPlayNetHandler>
{
    private String field19217;
    private String field19218;
    
    public Class4283() {
    }
    
    public Class4283(final String field19217, final String field19218) {
        this.field19217 = field19217;
        this.field19218 = field19218;
        if (field19218.length() <= 40) {
            return;
        }
        throw new IllegalArgumentException("Hash is too long (max 40, was " + field19218.length() + ")");
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19217 = class8654.readString(32767);
        this.field19218 = class8654.readString(40);
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeString(this.field19217);
        class8654.writeString(this.field19218);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17347(this);
    }
    
    public String method12870() {
        return this.field19217;
    }
    
    public String method12871() {
        return this.field19218;
    }
}
