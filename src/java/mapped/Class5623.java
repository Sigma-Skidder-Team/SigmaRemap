package mapped;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class Class5623 extends MessageToByteEncoder<Packet<?>> {
   private static final Logger field24933 = LogManager.getLogger();
   private static final Marker field24934 = MarkerManager.getMarker("PACKET_SENT", NetworkManager.field38641);
   private final Class1975 field24935;

   public Class5623(Class1975 var1) {
      this.field24935 = var1;
   }

   public void encode(ChannelHandlerContext var1, Packet<?> var2, ByteBuf var3) throws Exception {
      ProtocolType var6 = var1.channel().attr(NetworkManager.field38642).get();
      if (var6 == null) {
         throw new RuntimeException("ConnectionProtocol unknown: " + var2);
      } else {
         Integer var7 = var6.method8102(this.field24935, var2);
         if (field24933.isDebugEnabled()) {
            field24933.debug(field24934, "OUT: [{}:{}] {}", var1.channel().attr(NetworkManager.field38642).get(), var7, var2.getClass().getName());
         }

         if (var7 == null) {
            throw new IOException("Can't serialize unregistered packet");
         } else {
            PacketBuffer var8 = new PacketBuffer(var3);
            var8.writeVarInt(var7);

            try {
               var2.writePacketData(var8);
            } catch (Throwable var10) {
               field24933.error(var10);
               if (var2.method17181()) {
                  throw new Class9233(var10);
               } else {
                  throw var10;
               }
            }
         }
      }
   }
}
