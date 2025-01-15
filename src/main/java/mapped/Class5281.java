// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;

public class Class5281 extends Class5278<byte[], Integer>
{
    public Class5281(final Integer n) {
        super(n, byte[].class);
    }
    
    public byte[] method16418(final ByteBuf byteBuf, final Integer n) throws Exception {
        if (byteBuf.readableBytes() >= n) {
            final byte[] array = new byte[(int)n];
            byteBuf.readBytes(array);
            return array;
        }
        throw new RuntimeException("Readable bytes does not match expected!");
    }
    
    public void method16419(final ByteBuf byteBuf, final Integer n, final byte[] array) throws Exception {
        byteBuf.writeBytes(array);
    }
}
