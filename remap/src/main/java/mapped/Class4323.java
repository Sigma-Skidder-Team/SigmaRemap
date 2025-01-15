// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4323 implements IPacket<Class5813>
{
    private static String[] field19365;
    private Class2218 field19366;
    
    public Class4323() {
    }
    
    public Class4323(final Class2218 field19366) {
        this.field19366 = field19366;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19366 = class8654.method29499(Class2218.class);
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.method29500(this.field19366);
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17419(this);
    }
    
    public Class2218 method12987() {
        return this.field19366;
    }
}
