// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4366 implements IPacket<Class5813>
{
    private static String[] field19561;
    private int field19562;
    private int field19563;
    
    public Class4366() {
    }
    
    public Class4366(final int field19562, final int field19563) {
        this.field19562 = field19562;
        this.field19563 = field19563;
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17422(this);
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19562 = class8654.readByte();
        this.field19563 = class8654.readByte();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeByte(this.field19562);
        class8654.writeByte(this.field19563);
    }
    
    public int method13131() {
        return this.field19562;
    }
    
    public int method13132() {
        return this.field19563;
    }
}
