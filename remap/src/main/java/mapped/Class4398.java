// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4398 implements IPacket<Class5804>
{
    private static String[] field19703;
    private int field19704;
    private String field19705;
    private int field19706;
    private Class2208 field19707;
    
    public Class4398() {
    }
    
    public Class4398(final String field19705, final int field19706, final Class2208 field19707) {
        this.field19704 = Class9528.method35579().getProtocolVersion();
        this.field19705 = field19705;
        this.field19706 = field19706;
        this.field19707 = field19707;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19704 = class8654.readVarInt();
        this.field19705 = class8654.method29513(255);
        this.field19706 = class8654.readUnsignedShort();
        this.field19707 = Class2208.method8390(class8654.readVarInt());
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19704);
        class8654.method29514(this.field19705);
        class8654.writeShort(this.field19706);
        class8654.writeVarInt(this.field19707.method8389());
    }
    
    public void method13234(final Class5804 class5804) {
        class5804.method17403(this);
    }
    
    public Class2208 method13235() {
        return this.field19707;
    }
    
    public int method13236() {
        return this.field19704;
    }
}
