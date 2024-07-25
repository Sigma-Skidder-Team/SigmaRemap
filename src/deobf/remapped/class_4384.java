package remapped;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;

@Sharable
public class class_4384 extends MessageToMessageDecoder<ByteBuf> {
   private static String[] field_21500;
   private final class_1455 field_21501;

   public void decode(ChannelHandlerContext var1, ByteBuf var2, List<Object> var3) throws Exception {
      if (var2.readableBytes() > 0) {
         if (this.field_21501.method_6720()) {
            return;
         }

         boolean var6 = this.field_21501.method_6726();
         if (this.field_21501.method_6742()) {
            int var7 = class_8039.field_41157.method_15648(var2);
            ByteBuf var8 = var1.alloc().buffer();

            try {
               if (var7 == 1000) {
                  var8.writeBytes(var2);
               } else {
                  class_5051 var9 = new class_5051(var7, var2, this.field_21501);
                  class_3790 var10 = this.field_21501.<class_3790>method_6746(class_3790.class);
                  var10.method_17596().method_18999(class_3842.field_18754, var10.method_17598(), var9);
                  var9.method_23254(var8);
               }

               var2.clear();
               var2 = var8;
            } catch (Throwable var11) {
               var2.clear();
               var8.release();
               throw var11;
            }
         } else {
            var2.retain();
         }

         var3.add(var2);
      }
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) throws Exception {
      if (!class_3844.method_17837(var2, class_6400.class)) {
         super.exceptionCaught(var1, var2);
      }
   }

   public class_4384(class_1455 var1) {
      this.field_21501 = var1;
   }
}
