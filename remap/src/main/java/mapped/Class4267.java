// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4267 implements IPacket<Class5813>
{
    private static String[] field19144;
    private int field19145;
    
    public Class4267() {
    }
    
    public Class4267(final int field19145) {
        this.field19145 = field19145;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19145 = class8654.readVarInt();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19145);
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17449(this);
    }
    
    public int method12809() {
        return this.field19145;
    }
}
