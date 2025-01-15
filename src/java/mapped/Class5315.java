// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;

public class Class5315 extends Class5260<Integer>
{
    public Class5315() {
        super(Integer.class);
    }
    
    public Integer method16391(final ByteBuf byteBuf) throws Exception {
        final int intValue = Class5260.field22312.method16378(byteBuf);
        if (intValue != 0) {
            return intValue - 1;
        }
        return null;
    }
    
    public void method16392(final ByteBuf byteBuf, final Integer n) throws Exception {
        if (n != null) {
            Class5260.field22312.method16379(byteBuf, n + 1);
        }
        else {
            Class5260.field22312.method16379(byteBuf, 0);
        }
    }
}
