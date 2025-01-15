// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.MarkerManager;
import org.apache.logging.log4j.LogManager;
import java.io.IOException;
import io.netty.util.AttributeKey;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.Logger;
import io.netty.handler.codec.MessageToByteEncoder;

public class Class8386 extends MessageToByteEncoder<Class4252<?>>
{
    private static final Logger field34377;
    private static final Marker field34378;
    private final Class2060 field34379;
    
    public Class8386(final Class2060 field34379) {
        this.field34379 = field34379;
    }
    
    public void encode(final ChannelHandlerContext channelHandlerContext, final Class4252<?> obj, final ByteBuf byteBuf) throws Exception {
        final Class2208 class2208 = (Class2208)channelHandlerContext.channel().attr((AttributeKey)Class3641.field16893).get();
        if (class2208 == null) {
            throw new RuntimeException("ConnectionProtocol unknown: " + obj);
        }
        final Integer method8387 = class2208.method8387(this.field34379, obj);
        if (Class8386.field34377.isDebugEnabled()) {
            Class8386.field34377.debug(Class8386.field34378, "OUT: [{}:{}] {}", channelHandlerContext.channel().attr((AttributeKey)Class3641.field16893).get(), (Object)method8387, (Object)obj.getClass().getName());
        }
        if (method8387 == null) {
            throw new IOException("Can't serialize unregistered packet");
        }
        final Class8654 class2209 = new Class8654(byteBuf);
        class2209.method29505(method8387);
        try {
            obj.method12755(class2209);
            return;
        }
        catch (final Throwable t) {
            Class8386.field34377.error((Object)t);
            if (obj.method12763()) {
                throw new Class6577(t);
            }
        }
        throw;
    }
    
    static {
        field34377 = LogManager.getLogger();
        field34378 = MarkerManager.getMarker("PACKET_SENT", Class3641.field16892);
    }
}
