// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4321 implements IPacket<Class5813>
{
    private static String[] field19361;
    private int field19362;
    
    public Class4321() {
    }
    
    public Class4321(final int field19362) {
        this.field19362 = field19362;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19362 = class8654.readShort();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeShort(this.field19362);
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17434(this);
    }
    
    public int method12985() {
        return this.field19362;
    }
}
