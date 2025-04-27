// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4265 implements IPacket<Class5813>
{
    private static String[] field19134;
    private int field19135;
    private String field19136;
    
    public Class4265() {
    }
    
    public Class4265(final int field19135, final String field19136) {
        this.field19135 = field19135;
        this.field19136 = field19136;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19135 = class8654.readVarInt();
        this.field19136 = class8654.readString(32500);
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19135);
        class8654.method29515(this.field19136, 32500);
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17446(this);
    }
    
    public int method12801() {
        return this.field19135;
    }
    
    public String method12802() {
        return this.field19136;
    }
}
