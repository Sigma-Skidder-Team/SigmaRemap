package mapped;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class Class8399 extends ByteToMessageDecoder {
   private static final Logger field36043 = LogManager.getLogger();
   private static final Marker field36044 = MarkerManager.getMarker("PACKET_RECEIVED", NetworkManager.field38641);
   private final Class1975 field36045;

   public Class8399(Class1975 var1) {
      this.field36045 = var1;
   }

   public void decode(ChannelHandlerContext var1, ByteBuf var2, List<Object> var3) throws Exception {
      if (var2.readableBytes() != 0) {
         PacketBuffer var6 = new PacketBuffer(var2);
         int var7 = var6.method35714();
         Packet var8 = ((Class1858)var1.channel().attr(NetworkManager.field38642).get()).method8103(this.field36045, var7);
         if (var8 == null) {
            throw new IOException("Bad packet id " + var7);
         }

         var8.method17175(var6);
         if (var6.readableBytes() > 0) {
            throw new IOException(
               "Packet "
                  + ((Class1858)var1.channel().attr(NetworkManager.field38642).get()).method8104()
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
         if (field36043.isDebugEnabled()) {
            field36043.debug(field36044, " IN: [{}:{}] {}", var1.channel().attr(NetworkManager.field38642).get(), var7, var8.getClass().getName());
         }
      }
   }
}
