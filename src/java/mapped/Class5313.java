// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;

public class Class5313 extends Class5260<Class8322>
{
    public Class5313() {
        super(Class8322.class);
    }
    
    public Class8322 method16412(final ByteBuf byteBuf) throws Exception {
        if (byteBuf.readBoolean()) {
            return Class5260.field22318.method16378(byteBuf);
        }
        return null;
    }
    
    public void method16413(final ByteBuf byteBuf, final Class8322 class8322) throws Exception {
        byteBuf.writeBoolean(class8322 != null);
        if (class8322 != null) {
            Class5260.field22318.method16379(byteBuf, class8322);
        }
    }
}
