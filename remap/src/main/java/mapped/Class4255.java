// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4255 implements IPacket<Class5813>
{
    private static String[] field19089;
    private int field19090;
    private short field19091;
    private boolean field19092;
    
    public Class4255() {
    }
    
    public Class4255(final int field19090, final short field19091, final boolean field19092) {
        this.field19090 = field19090;
        this.field19091 = field19091;
        this.field19092 = field19092;
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17421(this);
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19090 = class8654.readByte();
        this.field19091 = class8654.readShort();
        this.field19092 = (class8654.readByte() != 0);
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeByte(this.field19090);
        class8654.writeShort(this.field19091);
        class8654.writeByte(this.field19092 ? 1 : 0);
    }
    
    public int method12771() {
        return this.field19090;
    }
    
    public short method12772() {
        return this.field19091;
    }
}
