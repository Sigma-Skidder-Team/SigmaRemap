// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;

public class Class5263 extends Class5260<Long> implements Class5264<Long>
{
    public Class5263() {
        super(Long.class);
    }
    
    public Long method16387(final ByteBuf byteBuf) {
        return byteBuf.readLong();
    }
    
    public void method16388(final ByteBuf byteBuf, final Long n) {
        byteBuf.writeLong(n);
    }
    
    public Long method16389(final Object o) {
        if (o instanceof Number) {
            return ((Number)o).longValue();
        }
        if (!(o instanceof Boolean)) {
            return (Long)o;
        }
        return (long)(((boolean)o) ? 1 : 0);
    }
}
