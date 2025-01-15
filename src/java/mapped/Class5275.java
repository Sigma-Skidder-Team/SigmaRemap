// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;

public class Class5275 extends Class5260<Integer> implements Class5264<Integer>
{
    public Class5275() {
        super("VarInt", Integer.class);
    }
    
    public void method16392(final ByteBuf byteBuf, Integer value) {
        do {
            int n = value & 0x7F;
            value >>>= 7;
            if (value != 0) {
                n |= 0x80;
            }
            byteBuf.writeByte(n);
        } while (value != 0);
    }
    
    public Integer method16391(final ByteBuf byteBuf) {
        int i = 0;
        int n = 0;
        while (true) {
            final byte byte1 = byteBuf.readByte();
            i |= (byte1 & 0x7F) << n++ * 7;
            if (n > 5) {
                throw new RuntimeException("VarInt too big");
            }
            if ((byte1 & 0x80) == 0x80) {
                continue;
            }
            return i;
        }
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
