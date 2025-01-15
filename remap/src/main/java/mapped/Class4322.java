// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4322 implements IPacket<Class5807>
{
    private static String[] field19363;
    private int field19364;
    
    public Class4322() {
    }
    
    public Class4322(final int field19364) {
        this.field19364 = field19364;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19364 = class8654.readVarInt();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19364);
    }
    
    public void method12841(final Class5807 class5807) {
        class5807.method17407(this);
    }
    
    public int method12986() {
        return this.field19364;
    }
}
