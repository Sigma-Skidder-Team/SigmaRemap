// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelHandler$Sharable;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.MessageToByteEncoder;

@ChannelHandler$Sharable
public class Class9340 extends MessageToByteEncoder<ByteBuf>
{
    public void encode(final ChannelHandlerContext channelHandlerContext, final ByteBuf byteBuf, final ByteBuf byteBuf2) throws Exception {
        final int readableBytes = byteBuf.readableBytes();
        final int method29484 = PacketBuffer.method29484(readableBytes);
        if (method29484 <= 3) {
            final PacketBuffer class8654 = new PacketBuffer(byteBuf2);
            class8654.ensureWritable(method29484 + readableBytes);
            class8654.writeVarInt(readableBytes);
            class8654.writeBytes(byteBuf, byteBuf.readerIndex(), readableBytes);
            return;
        }
        throw new IllegalArgumentException("unable to fit " + readableBytes + " into " + 3);
    }
}
