// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Iterables;
import java.nio.charset.StandardCharsets;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.channel.ChannelFutureListener;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.buffer.ByteBuf;
import io.netty.channel.SimpleChannelInboundHandler;
import net.minecraft.util.math.MathHelper;

public class Class8224 extends SimpleChannelInboundHandler<ByteBuf>
{
    public final /* synthetic */ Class6819 field33781;
    
    public Class8224(final Class6819 field33781) {
        this.field33781 = field33781;
    }
    
    public void channelActive(final ChannelHandlerContext channelHandlerContext) throws Exception {
        super.channelActive(channelHandlerContext);
        final ByteBuf buffer = Unpooled.buffer();
        try {
            buffer.writeByte(254);
            buffer.writeByte(1);
            buffer.writeByte(250);
            final char[] charArray = "MC|PingHost".toCharArray();
            buffer.writeShort(charArray.length);
            final char[] array = charArray;
            for (int length = array.length, i = 0; i < length; ++i) {
                buffer.writeChar(array[i]);
            }
            buffer.writeShort(7 + 2 * this.field33781.field26768.method25492().length());
            buffer.writeByte(127);
            final char[] charArray2 = this.field33781.field26768.method25492().toCharArray();
            buffer.writeShort(charArray2.length);
            final char[] array2 = charArray2;
            for (int length2 = array2.length, j = 0; j < length2; ++j) {
                buffer.writeChar(array2[j]);
            }
            buffer.writeInt(this.field33781.field26768.method25493());
            channelHandlerContext.channel().writeAndFlush(buffer).addListener(ChannelFutureListener.CLOSE_ON_FAILURE);
        }
        finally {
            buffer.release();
        }
    }
    
    public void channelRead0(final ChannelHandlerContext channelHandlerContext, final ByteBuf byteBuf) throws Exception {
        if (byteBuf.readUnsignedByte() == 255) {
            final String[] array = (String[])Iterables.toArray(Class8115.method26700().split((CharSequence)new String(byteBuf.readBytes(byteBuf.readShort() * 2).array(), StandardCharsets.UTF_16BE)), (Class)String.class);
            if ("§1".equals(array[0])) {
                MathHelper.method35675(array[1], 0);
                final String field41618 = array[2];
                final String field41619 = array[3];
                final int method35675 = MathHelper.method35675(array[4], -1);
                final int method35676 = MathHelper.method35675(array[5], -1);
                this.field33781.field26769.field41617 = -1;
                this.field33781.field26769.field41618 = field41618;
                this.field33781.field26769.field41615 = field41619;
                this.field33781.field26769.field41614 = TextFormatting.GRAY + "" + method35675 + TextFormatting.DARK_GRAY + "/" + TextFormatting.GRAY + method35676;
            }
        }
        channelHandlerContext.close();
    }
    
    public void exceptionCaught(final ChannelHandlerContext channelHandlerContext, final Throwable t) throws Exception {
        channelHandlerContext.close();
    }
}
