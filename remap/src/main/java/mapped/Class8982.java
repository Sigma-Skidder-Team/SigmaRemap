// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.channel.ChannelHandlerContext;
import java.util.zip.Deflater;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.MessageToByteEncoder;

public class Class8982 extends MessageToByteEncoder<ByteBuf>
{
    private static String[] field37857;
    private final byte[] field37858;
    private final Deflater field37859;
    private int field37860;
    
    public Class8982(final int field37860) {
        this.field37858 = new byte[8192];
        this.field37860 = field37860;
        this.field37859 = new Deflater();
    }
    
    public void encode(final ChannelHandlerContext channelHandlerContext, final ByteBuf byteBuf, final ByteBuf byteBuf2) throws Exception {
        final int readableBytes = byteBuf.readableBytes();
        final PacketBuffer class8654 = new PacketBuffer(byteBuf2);
        if (readableBytes >= this.field37860) {
            final byte[] input = new byte[readableBytes];
            byteBuf.readBytes(input);
            class8654.writeVarInt(input.length);
            this.field37859.setInput(input, 0, readableBytes);
            this.field37859.finish();
            while (!this.field37859.finished()) {
                class8654.writeBytes(this.field37858, 0, this.field37859.deflate(this.field37858));
            }
            this.field37859.reset();
        }
        else {
            class8654.writeVarInt(0);
            class8654.writeBytes(byteBuf);
        }
    }
    
    public void method31932(final int field37860) {
        this.field37860 = field37860;
    }
}
