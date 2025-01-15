// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4274 implements IPacket<Class5811>
{
    private static String[] field19168;
    private long field19169;
    
    public Class4274() {
    }
    
    public Class4274(final long field19169) {
        this.field19169 = field19169;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19169 = class8654.readLong();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeLong(this.field19169);
    }
    
    public void method12826(final Class5811 class5811) {
        class5811.method17416(this);
    }
}
