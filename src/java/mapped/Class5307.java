// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import io.netty.buffer.ByteBuf;

public class Class5307 extends Class5260<Class8087>
{
    public Class5307() {
        super("Particle", Class8087.class);
    }
    
    public void method16442(final ByteBuf byteBuf, final Class8087 class8087) throws Exception {
        Class5260.field22312.method16379(byteBuf, class8087.method26549());
        for (final Class9348 class8088 : class8087.method26550()) {
            class8088.method34655().method16379(byteBuf, class8088.method34656());
        }
    }
    
    public Class8087 method16443(final ByteBuf byteBuf) throws Exception {
        final int intValue = Class5260.field22312.method16378(byteBuf);
        final Class8087 class8087 = new Class8087(intValue);
        switch (intValue) {
            case 3:
            case 20: {
                class8087.method26550().add(new Class9348(Class5260.field22312, Class5260.field22312.method16378(byteBuf)));
                break;
            }
            case 11: {
                class8087.method26550().add(new Class9348(Class5260.field22302, Class5260.field22302.method16378(byteBuf)));
                class8087.method26550().add(new Class9348(Class5260.field22302, Class5260.field22302.method16378(byteBuf)));
                class8087.method26550().add(new Class9348(Class5260.field22302, Class5260.field22302.method16378(byteBuf)));
                class8087.method26550().add(new Class9348(Class5260.field22302, Class5260.field22302.method16378(byteBuf)));
                break;
            }
            case 27: {
                class8087.method26550().add(new Class9348(Class5260.field22334, Class5260.field22334.method16378(byteBuf)));
                break;
            }
        }
        return class8087;
    }
}
