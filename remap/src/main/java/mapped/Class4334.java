// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4334 implements IPacket<Class5813>
{
    private static String[] field19409;
    private Class313 field19410;
    private ResourceLocation field19411;
    
    public Class4334() {
    }
    
    public Class4334(final Class313 field19410, final ResourceLocation field19411) {
        this.field19410 = field19410;
        this.field19411 = field19411;
    }
    
    public static Class4334 method13013(final Class8863 class8863) {
        return new Class4334(Class313.field1843, class8863.method31042());
    }
    
    public static Class4334 method13014() {
        return new Class4334(Class313.field1844, null);
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19410 = class8654.method29499(Class313.class);
        if (this.field19410 == Class313.field1843) {
            this.field19411 = class8654.method29516();
        }
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.method29500(this.field19410);
        if (this.field19410 == Class313.field1843) {
            class8654.method29517(this.field19411);
        }
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17445(this);
    }
    
    public Class313 method13015() {
        return this.field19410;
    }
    
    public ResourceLocation method13016() {
        return this.field19411;
    }
}
