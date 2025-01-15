// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4380 implements IPacket<Class5813>
{
    private static String[] field19619;
    private Class316 field19620;
    
    public Class4380() {
    }
    
    public Class4380(final Class316 field19620) {
        this.field19620 = field19620;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19620 = class8654.method29499(Class316.class);
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.method29500(this.field19620);
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17417(this);
    }
    
    public Class316 method13169() {
        return this.field19620;
    }
}
