// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.ByteOrder;
import io.netty.buffer.ByteBuf;

public class Class5314 extends Class5260<Class7668>
{
    public Class5314() {
        super("Chunk Section Type", Class7668.class);
    }
    
    public Class7668 method16429(final ByteBuf byteBuf) throws Exception {
        final Class7668 class7668 = new Class7668();
        final ByteBuf order = byteBuf.order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < 4096; ++i) {
            final short short1 = order.readShort();
            class7668.method24324(i, short1 >> 4, short1 & 0xF);
        }
        return class7668;
    }
    
    public void method16430(final ByteBuf byteBuf, final Class7668 class7668) throws Exception {
        throw new UnsupportedOperationException();
    }
}
