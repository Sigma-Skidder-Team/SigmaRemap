package mapped;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;

@Sharable
public class Class8370 extends MessageToMessageDecoder<ByteBuf> {
   private static String[] field35931;
   private final Class7161 field35932;

   public void decode(ChannelHandlerContext var1, ByteBuf var2, List<Object> var3) throws Exception {
      if (var2.readableBytes() > 0) {
         if (this.field35932.method22470()) {
            return;
         }

         boolean var6 = this.field35932.method22448();
         if (this.field35932.method22468()) {
            int var7 = Class4750.field22544.method14894(var2);
            ByteBuf var8 = var1.alloc().buffer();

            try {
               if (var7 == 1000) {
                  var8.writeBytes(var2);
               } else {
                  Class8563 var9 = new Class8563(var7, var2, this.field35932);
                  Class6038 var10 = this.field35932.<Class6038>method22438(Class6038.class);
                  var10.method18683().method19369(Class2302.field15717, var10.method18673(), var9);
                  var9.method30563(var8);
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
      if (!Class8190.method28486(var2, ViaVersion4.class)) {
         super.exceptionCaught(var1, var2);
      }
   }

   public Class8370(Class7161 var1) {
      this.field35932 = var1;
   }
}
