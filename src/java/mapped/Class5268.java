// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;

public class Class5268 extends Class5260<Byte> implements Class5264<Byte>
{
    public Class5268() {
        super(Byte.class);
    }
    
    public Byte method16400(final ByteBuf byteBuf) {
        return byteBuf.readByte();
    }
    
    public void method16401(final ByteBuf byteBuf, final Byte b) {
        byteBuf.writeByte((int)b);
    }
    
    public Byte method16402(final Object o) {
        if (o instanceof Number) {
            return ((Number)o).byteValue();
        }
        if (!(o instanceof Boolean)) {
            return (Byte)o;
        }
        return (byte)(((boolean)o) ? 1 : 0);
    }
}
