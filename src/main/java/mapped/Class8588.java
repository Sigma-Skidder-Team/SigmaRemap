// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.handler.codec.CorruptedFrameException;
import io.netty.buffer.Unpooled;
import java.util.List;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

public class Class8588 extends ByteToMessageDecoder
{
    public void decode(final ChannelHandlerContext channelHandlerContext, final ByteBuf byteBuf, final List<Object> list) throws Exception {
        byteBuf.markReaderIndex();
        final byte[] array = new byte[3];
        for (int i = 0; i < array.length; ++i) {
            if (!byteBuf.isReadable()) {
                byteBuf.resetReaderIndex();
                return;
            }
            array[i] = byteBuf.readByte();
            if (array[i] >= 0) {
                final Class8654 class8654 = new Class8654(Unpooled.wrappedBuffer(array));
                try {
                    final int method29501 = class8654.method29501();
                    if (byteBuf.readableBytes() >= method29501) {
                        list.add(byteBuf.readBytes(method29501));
                        return;
                    }
                    byteBuf.resetReaderIndex();
                }
                finally {
                    class8654.release();
                }
                return;
            }
        }
        throw new CorruptedFrameException("length wider than 21-bit");
    }
}
