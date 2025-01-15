// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.crypto.ShortBufferException;
import io.netty.channel.ChannelHandlerContext;
import io.netty.buffer.ByteBuf;
import javax.crypto.Cipher;

public class Class8323
{
    private static String[] field34189;
    private final Cipher field34190;
    private byte[] field34191;
    private byte[] field34192;
    
    public Class8323(final Cipher field34190) {
        this.field34191 = new byte[0];
        this.field34192 = new byte[0];
        this.field34190 = field34190;
    }
    
    private byte[] method27708(final ByteBuf byteBuf) {
        final int readableBytes = byteBuf.readableBytes();
        if (this.field34191.length < readableBytes) {
            this.field34191 = new byte[readableBytes];
        }
        byteBuf.readBytes(this.field34191, 0, readableBytes);
        return this.field34191;
    }
    
    public ByteBuf method27709(final ChannelHandlerContext channelHandlerContext, final ByteBuf byteBuf) throws ShortBufferException {
        final int readableBytes = byteBuf.readableBytes();
        final byte[] method27708 = this.method27708(byteBuf);
        final ByteBuf heapBuffer = channelHandlerContext.alloc().heapBuffer(this.field34190.getOutputSize(readableBytes));
        heapBuffer.writerIndex(this.field34190.update(method27708, 0, readableBytes, heapBuffer.array(), heapBuffer.arrayOffset()));
        return heapBuffer;
    }
    
    public void method27710(final ByteBuf byteBuf, final ByteBuf byteBuf2) throws ShortBufferException {
        final int readableBytes = byteBuf.readableBytes();
        final byte[] method27708 = this.method27708(byteBuf);
        final int outputSize = this.field34190.getOutputSize(readableBytes);
        if (this.field34192.length < outputSize) {
            this.field34192 = new byte[outputSize];
        }
        byteBuf2.writeBytes(this.field34192, 0, this.field34190.update(method27708, 0, readableBytes, this.field34192));
    }
}
