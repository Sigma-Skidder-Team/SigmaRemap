// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4257 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19100;
    private int field19101;
    private Class1932 field19102;
    
    public Class4257() {
    }
    
    public Class4257(final int field19101, final Class3662<?> class3662) {
        this.field19101 = field19101;
        this.field19102 = class3662.method11298();
    }
    
    public Class1932 method12779() {
        return this.field19102;
    }
    
    public int method12780() {
        return this.field19101;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19101 = class8654.readByte();
        this.field19102 = class8654.method29516();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeByte(this.field19101);
        class8654.method29517(this.field19102);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17362(this);
    }
}
