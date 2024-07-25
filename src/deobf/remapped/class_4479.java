package remapped;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class class_4479 extends ByteToMessageDecoder {
   private static final Logger field_21840 = LogManager.getLogger();
   private static final Marker field_21841 = MarkerManager.getMarker("PACKET_RECEIVED", class_5121.field_26430);
   private final class_4739 field_21839;

   public class_4479(class_4739 var1) {
      this.field_21839 = var1;
   }

   public void decode(ChannelHandlerContext var1, ByteBuf var2, List<Object> var3) throws Exception {
      if (var2.readableBytes() != 0) {
         class_8248 var6 = new class_8248(var2);
         int var7 = var6.method_37778();
         class_6310 var8 = ((class_5776)var1.channel().attr(class_5121.field_26414).get()).method_26114(this.field_21839, var7);
         if (var8 == null) {
            throw new IOException("Bad packet id " + var7);
         }

         var8.method_28775(var6);
         if (var6.readableBytes() > 0) {
            throw new IOException(
               "Packet "
                  + ((class_5776)var1.channel().attr(class_5121.field_26414).get()).method_26117()
                  + "/"
                  + var7
                  + " ("
                  + var8.getClass().getSimpleName()
                  + ") was larger than I expected, found "
                  + var6.readableBytes()
                  + " bytes extra whilst reading packet "
                  + var7
            );
         }

         var3.add(var8);
         if (field_21840.isDebugEnabled()) {
            field_21840.debug(field_21841, " IN: [{}:{}] {}", var1.channel().attr(class_5121.field_26414).get(), var7, var8.getClass().getName());
         }
      }
   }
}
