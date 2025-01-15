// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4348 implements IPacket<Class5813>
{
    private static String[] field19474;
    private int field19475;
    
    public Class4348() {
    }
    
    public Class4348(final int field19475) {
        this.field19475 = field19475;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19475 = class8654.readVarInt();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19475);
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17443(this);
    }
    
    public int method13058() {
        return this.field19475;
    }
}
