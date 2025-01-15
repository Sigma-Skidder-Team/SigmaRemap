// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;

public class Class5273 extends Class5260<Short> implements Class5264<Short>
{
    public Class5273() {
        super("Unsigned Byte", Short.class);
    }
    
    public Short method16394(final ByteBuf byteBuf) {
        return byteBuf.readUnsignedByte();
    }
    
    public void method16395(final ByteBuf byteBuf, final Short n) {
        byteBuf.writeByte((int)n);
    }
    
    public Short method16396(final Object o) {
        if (o instanceof Number) {
            return ((Number)o).shortValue();
        }
        if (!(o instanceof Boolean)) {
            return (short)o;
        }
        return (short)(((boolean)o) ? 1 : 0);
    }
}
