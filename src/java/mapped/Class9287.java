// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelHandler$Sharable;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.MessageToMessageDecoder;

@ChannelHandler$Sharable
public class Class9287 extends MessageToMessageDecoder<ByteBuf>
{
    private static String[] field39828;
    private final Class6108 field39829;
    
    public void decode(final ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, final List<Object> list) throws Exception {
        if (byteBuf.readableBytes() > 0) {
            if (this.field39829.method18223()) {
                return;
            }
            this.field39829.method18215();
            this.field39829.method18232().readLock().lock();
            if (this.field39829.method18222()) {
                final int intValue = Class5260.field22312.method16378(byteBuf);
                final ByteBuf buffer = channelHandlerContext.alloc().buffer();
                try {
                    if (intValue == 1000) {
                        buffer.writeBytes(byteBuf);
                    }
                    else {
                        final Class8699 class8699 = new Class8699(intValue, byteBuf, this.field39829);
                        final Class6651 class8700 = this.field39829.method18207(Class6651.class);
                        class8700.method20211().method16318(Class2128.field12427, class8700.method20206(), class8699);
                        class8699.method29826(buffer);
                    }
                    byteBuf.clear();
                    byteBuf = buffer;
                }
                catch (final Throwable t) {
                    byteBuf.clear();
                    buffer.release();
                    this.field39829.method18232().readLock().unlock();
                    throw t;
                }
            }
            else {
                byteBuf.retain();
            }
            this.field39829.method18232().readLock().unlock();
            list.add(byteBuf);
        }
    }
    
    public void exceptionCaught(final ChannelHandlerContext channelHandlerContext, final Throwable t) throws Exception {
        if (!Class8485.method28338(t, Class2334.class)) {
            super.exceptionCaught(channelHandlerContext, t);
        }
    }
    
    public Class9287(final Class6108 field39829) {
        this.field39829 = field39829;
    }
}
