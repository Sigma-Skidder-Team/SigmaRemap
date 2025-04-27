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

public class Class8386 extends MessageToByteEncoder<IPacket<?>>
{
    private static final Logger field34377;
    private static final Marker field34378;

    public Class8386(final Class2060 field34379) {
    }
    
    public void encode(final ChannelHandlerContext channelHandlerContext, final IPacket<?> obj, final ByteBuf byteBuf) throws Exception {
        final PacketBuffer class2209 = new PacketBuffer(byteBuf);
        try {
            obj.writePacketData(class2209);
            return;
        }
        catch (final Throwable t) {
            Class8386.field34377.error(t);
            if (obj.shouldSkipErrors()) {
                throw new Class6577(t);
            }
        }
    }
    
    static {
        field34377 = LogManager.getLogger();
        field34378 = MarkerManager.getMarker("PACKET_SENT", NetworkManager.field16892);
    }
}
