// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;

public class Class5270 extends Class5260<Long> implements Class5264<Long>
{
    public Class5270() {
        super("VarLong", Long.class);
    }
    
    public void method16388(final ByteBuf byteBuf, Long value) {
        do {
            int n = (int)(value & 0x7FL);
            value = value >>> 7;
            if (value != 0L) {
                n |= 0x80;
            }
            byteBuf.writeByte(n);
        } while (value != 0L);
    }
    
    public Long method16387(final ByteBuf byteBuf) {
        long l = 0L;
        int n = 0;
        while (true) {
            final byte byte1 = byteBuf.readByte();
            l |= (long) (byte1 & 0x7F) << n++ * 7;
            if (n > 10) {
                throw new RuntimeException("VarLong too big");
            }
            if ((byte1 & 0x80) == 0x80) {
                continue;
            }
            return l;
        }
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
