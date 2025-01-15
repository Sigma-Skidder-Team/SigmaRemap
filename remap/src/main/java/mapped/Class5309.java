// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;

public class Class5309 extends Class5260<String>
{
    public Class5309() {
        super(String.class);
    }
    
    public String method16431(final ByteBuf byteBuf) throws Exception {
        if (byteBuf.readBoolean()) {
            return Class5260.field22308.method16378(byteBuf);
        }
        return null;
    }
    
    public void method16432(final ByteBuf byteBuf, final String s) throws Exception {
        if (s != null) {
            byteBuf.writeBoolean(true);
            Class5260.field22308.method16379(byteBuf, s);
        }
        else {
            byteBuf.writeBoolean(false);
        }
    }
}
