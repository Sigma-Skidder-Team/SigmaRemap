// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.Unpooled;
import io.netty.handler.codec.DecoderException;
import java.util.List;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.util.zip.Inflater;
import io.netty.handler.codec.ByteToMessageDecoder;

public class Class9213 extends ByteToMessageDecoder
{
    private final Inflater field39025;
    private int field39026;
    
    public Class9213(final int field39026) {
        this.field39026 = field39026;
        this.field39025 = new Inflater();
    }
    
    public void decode(final ChannelHandlerContext channelHandlerContext, final ByteBuf byteBuf, final List<Object> list) throws Exception {
        if (byteBuf.readableBytes() != 0) {
            final Class8654 class8654 = new Class8654(byteBuf);
            final int method29501 = class8654.method29501();
            if (method29501 != 0) {
                if (method29501 < this.field39026) {
                    throw new DecoderException("Badly compressed packet - size of " + method29501 + " is below server threshold of " + this.field39026);
                }
                if (method29501 > 2097152) {
                    throw new DecoderException("Badly compressed packet - size of " + method29501 + " is larger than protocol maximum of " + 2097152);
                }
                final byte[] input = new byte[class8654.readableBytes()];
                class8654.readBytes(input);
                this.field39025.setInput(input);
                final byte[] output = new byte[method29501];
                this.field39025.inflate(output);
                list.add(Unpooled.wrappedBuffer(output));
                this.field39025.reset();
            }
            else {
                list.add(class8654.readBytes(class8654.readableBytes()));
            }
        }
    }
    
    public void method33695(final int field39026) {
        this.field39026 = field39026;
    }
}
