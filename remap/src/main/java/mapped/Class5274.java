// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;

public class Class5274 extends Class5260<Integer> implements Class5264<Integer>
{
    public Class5274() {
        super(Integer.class);
    }
    
    public Integer method16391(final ByteBuf byteBuf) {
        return byteBuf.readUnsignedShort();
    }
    
    public void method16392(final ByteBuf byteBuf, final Integer n) {
        byteBuf.writeShort((int)n);
    }
    
    public Integer method16393(final Object o) {
        if (o instanceof Number) {
            return ((Number)o).intValue();
        }
        if (!(o instanceof Boolean)) {
            return (Integer)o;
        }
        return ((boolean)o) ? 1 : 0;
    }
}