package remapped;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.util.List;

@Sharable
public class class_4397 extends MessageToMessageEncoder<ByteBuf> {
   private final class_1455 field_21525;
   private boolean field_21524 = false;

   public void encode(ChannelHandlerContext var1, ByteBuf var2, List<Object> var3) throws Exception {
      if (var2.readableBytes() == 0) {
         throw class_3446.method_15883().method_33731() ? new class_6400() : class_6400.field_32673;
      } else {
         var2.retain();
         this.field_21525.method_6719();
         if (this.field_21525.method_6742()) {
            int var6 = class_8039.field_41157.method_15648(var2);
            ByteBuf var7 = var2.alloc().buffer();

            try {
               class_5051 var8 = new class_5051(var6, var2, this.field_21525);
               class_3790 var9 = this.field_21525.<class_3790>method_6746(class_3790.class);
               var9.method_17596().method_18999(class_3842.field_18756, var9.method_17598(), var8);
               var8.method_23254(var7);
               var2.clear();
               var2.release();
               var2 = var7;
            } catch (Throwable var10) {
               var2.clear();
               var2.release();
               var7.release();
               throw var10;
            }
         }

         var3.add(var2);
      }
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) throws Exception {
      if (!class_3844.method_17837(var2, class_6400.class)) {
         super.exceptionCaught(var1, var2);
      }
   }

   public class_4397(class_1455 var1) {
      if (var1 != null) {
         this.field_21525 = var1;
      } else {
         throw new NullPointerException("info is marked non-null but is null");
      }
   }
}
