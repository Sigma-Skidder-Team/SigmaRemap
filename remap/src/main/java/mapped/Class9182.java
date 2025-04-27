// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelHandler$Sharable;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.MessageToMessageEncoder;

@ChannelHandler$Sharable
public class Class9182 extends MessageToMessageEncoder<ByteBuf>
{
    private final Class6108 field38905;
    private final boolean field38906;
    
    public void encode(final ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, final List<Object> list) throws Exception {
        if (byteBuf.readableBytes() == 0) {
            throw Class8563.method28794().method33559() ? new Class2334() : Class2334.field14077;
        }
        byteBuf.retain();
        this.field38905.method18214();
        if (this.field38905.method18222()) {
            final int intValue = Class5260.field22312.method16378(byteBuf);
            final ByteBuf buffer = byteBuf.alloc().buffer();
            try {
                final Class8699 class8699 = new Class8699(intValue, byteBuf, this.field38905);
                final Class6651 class8700 = this.field38905.method18207(Class6651.class);
                class8700.method20211().method16318(Class2128.field12428, class8700.method20206(), class8699);
                class8699.method29826(buffer);
                byteBuf.clear();
                byteBuf.release();
                byteBuf = buffer;
            }
            catch (final Throwable t) {
                byteBuf.clear();
                byteBuf.release();
                buffer.release();
                throw t;
            }
        }
        list.add(byteBuf);
    }
    
    public void exceptionCaught(final ChannelHandlerContext channelHandlerContext, final Throwable t) throws Exception {
        if (!Class8485.method28338(t, Class2334.class)) {
            super.exceptionCaught(channelHandlerContext, t);
        }
    }
    
    public Class9182(final Class6108 field38905) {
        this.field38906 = false;
        if (field38905 != null) {
            this.field38905 = field38905;
            return;
        }
        throw new NullPointerException("info is marked non-null but is null");
    }
}
