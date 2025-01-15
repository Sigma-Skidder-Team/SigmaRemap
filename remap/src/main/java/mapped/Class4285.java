// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4285 implements IPacket<Class5813>
{
    private static String[] field19221;
    private Class2061 field19222;
    
    public Class4285() {
    }
    
    public Class4285(final Class2061 field19222) {
        this.field19222 = field19222;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19222 = class8654.method29499(Class2061.class);
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.method29500(this.field19222);
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17440(this);
    }
}
