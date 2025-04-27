// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import io.netty.buffer.Unpooled;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.channel.ChannelFutureListener;
import java.nio.charset.StandardCharsets;
import java.net.InetSocketAddress;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import org.apache.logging.log4j.Logger;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class Class9503 extends ChannelInboundHandlerAdapter
{
    private static final Logger field40883;
    private final Class7639 field40884;
    
    public Class9503(final Class7639 field40884) {
        this.field40884 = field40884;
    }
    
    public void channelRead(final ChannelHandlerContext channelHandlerContext, final Object o) throws Exception {
        final ByteBuf byteBuf = (ByteBuf)o;
        byteBuf.markReaderIndex();
        boolean b = true;
        try {
            if (byteBuf.readUnsignedByte() == 254) {
                final InetSocketAddress inetSocketAddress = (InetSocketAddress)channelHandlerContext.channel().remoteAddress();
                final MinecraftServer method24064 = this.field40884.method24064();
                switch (byteBuf.readableBytes()) {
                    case 0: {
                        Class9503.field40883.debug("Ping: (<1.3.x) from {}:{}", inetSocketAddress.getAddress(), inetSocketAddress.getPort());
                        this.method35392(channelHandlerContext, this.method35393(String.format("%s§%d§%d", method24064.method1532(), method24064.method1484(), method24064.method1485())));
                        break;
                    }
                    case 1: {
                        if (byteBuf.readUnsignedByte() != 1) {
                            return;
                        }
                        Class9503.field40883.debug("Ping: (1.4-1.5.x) from {}:{}", inetSocketAddress.getAddress(), inetSocketAddress.getPort());
                        this.method35392(channelHandlerContext, this.method35393(String.format("§1\u0000%d\u0000%s\u0000%s\u0000%d\u0000%d", 127, method24064.method1483(), method24064.method1532(), method24064.method1484(), method24064.method1485())));
                        break;
                    }
                    default: {
                        if (!(byteBuf.readUnsignedByte() == 1 & byteBuf.readUnsignedByte() == 250 & "MC|PingHost".equals(new String(byteBuf.readBytes(byteBuf.readShort() * 2).array(), StandardCharsets.UTF_16BE)) & byteBuf.readUnsignedByte() >= 73 & 3 + byteBuf.readBytes(byteBuf.readShort() * 2).array().length + 4 == byteBuf.readUnsignedShort() & byteBuf.readInt() <= 65535 & byteBuf.readableBytes() == 0)) {
                            return;
                        }
                        Class9503.field40883.debug("Ping: (1.6) from {}:{}", inetSocketAddress.getAddress(), inetSocketAddress.getPort());
                        final ByteBuf method24065 = this.method35393(String.format("§1\u0000%d\u0000%s\u0000%s\u0000%d\u0000%d", 127, method24064.method1483(), method24064.method1532(), method24064.method1484(), method24064.method1485()));
                        try {
                            this.method35392(channelHandlerContext, method24065);
                        }
                        finally {
                            method24065.release();
                        }
                        break;
                    }
                }
                byteBuf.release();
                b = false;
            }
        }
        catch (final RuntimeException ex) {}
        finally {
            if (b) {
                byteBuf.resetReaderIndex();
                channelHandlerContext.channel().pipeline().remove("legacy_query");
                channelHandlerContext.fireChannelRead(o);
            }
        }
    }
    
    private void method35392(final ChannelHandlerContext channelHandlerContext, final ByteBuf byteBuf) {
        channelHandlerContext.pipeline().firstContext().writeAndFlush(byteBuf).addListener(ChannelFutureListener.CLOSE);
    }
    
    private ByteBuf method35393(final String s) {
        final ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(255);
        final char[] charArray = s.toCharArray();
        buffer.writeShort(charArray.length);
        final char[] array = charArray;
        for (int length = array.length, i = 0; i < length; ++i) {
            buffer.writeChar(array[i]);
        }
        return buffer;
    }
    
    static {
        field40883 = LogManager.getLogger();
    }
}
