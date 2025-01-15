// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;

public class Class5306 extends Class5260<Class9119>
{
    public Class5306() {
        super(Class9119.class);
    }
    
    public Class9119 method16440(final ByteBuf byteBuf) throws Exception {
        return new Class9119(Class5260.field22292.method16378(byteBuf), Class5260.field22292.method16378(byteBuf), Class5260.field22312.method16378(byteBuf));
    }
    
    public void method16441(final ByteBuf byteBuf, final Class9119 class9119) throws Exception {
        Class5260.field22292.method16379(byteBuf, class9119.method33015());
        Class5260.field22292.method16379(byteBuf, class9119.method33016());
        Class5260.field22312.method16379(byteBuf, class9119.method33017());
    }
}
