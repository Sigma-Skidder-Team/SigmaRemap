// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.MarkerManager;
import org.apache.logging.log4j.LogManager;
import java.io.IOException;
import io.netty.util.AttributeKey;
import java.util.List;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.Logger;
import io.netty.handler.codec.ByteToMessageDecoder;

public class Class6965 extends ByteToMessageDecoder
{
    private static final Logger field27243;
    private static final Marker field27244;
    private final Class2060 field27245;
    
    public Class6965(final Class2060 field27245) {
        this.field27245 = field27245;
    }
    
    public void decode(final ChannelHandlerContext channelHandlerContext, final ByteBuf byteBuf, final List<Object> list) throws Exception {
        if (byteBuf.readableBytes() != 0) {
            final Class8654 class8654 = new Class8654(byteBuf);
            final int method29501 = class8654.method29501();
            final Class4252<?> method29502 = ((Class2208)channelHandlerContext.channel().attr((AttributeKey)Class3641.field16893).get()).method8388(this.field27245, method29501);
            if (method29502 == null) {
                throw new IOException("Bad packet id " + method29501);
            }
            method29502.method12754(class8654);
            if (class8654.readableBytes() > 0) {
                throw new IOException("Packet " + ((Class2208)channelHandlerContext.channel().attr((AttributeKey)Class3641.field16893).get()).method8389() + "/" + method29501 + " (" + method29502.getClass().getSimpleName() + ") was larger than I expected, found " + class8654.readableBytes() + " bytes extra whilst reading packet " + method29501);
            }
            list.add(method29502);
            if (Class6965.field27243.isDebugEnabled()) {
                Class6965.field27243.debug(Class6965.field27244, " IN: [{}:{}] {}", channelHandlerContext.channel().attr((AttributeKey)Class3641.field16893).get(), (Object)method29501, (Object)method29502.getClass().getName());
            }
        }
    }
    
    static {
        field27243 = LogManager.getLogger();
        field27244 = MarkerManager.getMarker("PACKET_RECEIVED", Class3641.field16892);
    }
}
