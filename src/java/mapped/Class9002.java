// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import javax.crypto.Cipher;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.MessageToMessageDecoder;

public class Class9002 extends MessageToMessageDecoder<ByteBuf>
{
    private static String[] field38003;
    private final Class8323 field38004;
    
    public Class9002(final Cipher cipher) {
        this.field38004 = new Class8323(cipher);
    }
    
    public void decode(final ChannelHandlerContext channelHandlerContext, final ByteBuf byteBuf, final List<Object> list) throws Exception {
        list.add(this.field38004.method27709(channelHandlerContext, byteBuf));
    }
}
