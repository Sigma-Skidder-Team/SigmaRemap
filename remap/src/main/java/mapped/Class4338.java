// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4338 implements IPacket<Class5813>
{
    private static String[] field19421;
    private Class2113 field19422;
    
    public Class4338() {
    }
    
    public Class4338(final Class2113 field19422) {
        this.field19422 = field19422;
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17458(this);
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19422 = Class2113.method8237(class8654.readUnsignedByte());
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeByte(this.field19422.method8235());
    }
    
    public Class2113 method13022() {
        return this.field19422;
    }
}
