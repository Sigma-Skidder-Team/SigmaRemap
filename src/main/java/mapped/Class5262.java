// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;

public class Class5262 extends Class5260<byte[]>
{
    public Class5262() {
        super(byte[].class);
    }
    
    public byte[] method16385(final ByteBuf byteBuf) {
        final byte[] array = new byte[byteBuf.readableBytes()];
        byteBuf.readBytes(array);
        return array;
    }
    
    public void method16386(final ByteBuf byteBuf, final byte[] array) {
        byteBuf.writeBytes(array);
    }
}
