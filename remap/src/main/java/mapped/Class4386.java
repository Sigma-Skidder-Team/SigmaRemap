// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4386 implements IPacket<Class5813>
{
    private static String[] field19651;
    private String field19652;
    private int field19653;
    private Class2047 field19654;
    private boolean field19655;
    private int field19656;
    private Class2226 field19657;
    
    public Class4386() {
    }
    
    public Class4386(final String field19652, final int field19653, final Class2047 field19654, final boolean field19655, final int field19656, final Class2226 field19657) {
        this.field19652 = field19652;
        this.field19653 = field19653;
        this.field19654 = field19654;
        this.field19655 = field19655;
        this.field19656 = field19656;
        this.field19657 = field19657;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19652 = class8654.readString(16);
        this.field19653 = class8654.readByte();
        this.field19654 = class8654.method29499(Class2047.class);
        this.field19655 = class8654.readBoolean();
        this.field19656 = class8654.readUnsignedByte();
        this.field19657 = class8654.method29499(Class2226.class);
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeString(this.field19652);
        class8654.writeByte(this.field19653);
        class8654.method29500(this.field19654);
        class8654.writeBoolean(this.field19655);
        class8654.writeByte(this.field19656);
        class8654.method29500(this.field19657);
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17420(this);
    }
    
    public String method13197() {
        return this.field19652;
    }
    
    public Class2047 method13198() {
        return this.field19654;
    }
    
    public boolean method13199() {
        return this.field19655;
    }
    
    public int method13200() {
        return this.field19656;
    }
    
    public Class2226 method13201() {
        return this.field19657;
    }
}
