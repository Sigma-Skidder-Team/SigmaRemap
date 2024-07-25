package remapped;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class class_302 extends MessageToByteEncoder<class_6310<?>> {
   private static final Logger field_1109 = LogManager.getLogger();
   private static final Marker field_1106 = MarkerManager.getMarker("PACKET_SENT", class_5121.field_26430);
   private final class_4739 field_1107;

   public class_302(class_4739 var1) {
      this.field_1107 = var1;
   }

   public void encode(ChannelHandlerContext var1, class_6310<?> var2, ByteBuf var3) throws Exception {
      class_5776 var6 = (class_5776)var1.channel().attr(class_5121.field_26414).get();
      if (var6 == null) {
         throw new RuntimeException("ConnectionProtocol unknown: " + var2);
      } else {
         Integer var7 = var6.method_26120(this.field_1107, var2);
         if (field_1109.isDebugEnabled()) {
            field_1109.debug(field_1106, "OUT: [{}:{}] {}", var1.channel().attr(class_5121.field_26414).get(), var7, var2.getClass().getName());
         }

         if (var7 == null) {
            throw new IOException("Can't serialize unregistered packet");
         } else {
            class_8248 var8 = new class_8248(var3);
            var8.method_37743(var7);

            try {
               var2.method_28776(var8);
            } catch (Throwable var10) {
               field_1109.error(var10);
               if (var2.method_28774()) {
                  throw new class_7585(var10);
               } else {
                  throw var10;
               }
            }
         }
      }
   }
}
