// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.channel.ChannelHandlerContext;
import javax.crypto.Cipher;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.MessageToByteEncoder;

public class Class7664 extends MessageToByteEncoder<ByteBuf>
{
    private static String[] field30442;
    private final Class8323 field30443;
    
    public Class7664(final Cipher cipher) {
        this.field30443 = new Class8323(cipher);
    }
    
    public void encode(final ChannelHandlerContext channelHandlerContext, final ByteBuf byteBuf, final ByteBuf byteBuf2) throws Exception {
        this.field30443.method27710(byteBuf, byteBuf2);
    }
}
