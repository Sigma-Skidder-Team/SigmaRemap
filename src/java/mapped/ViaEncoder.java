package mapped;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.util.List;

@Sharable
public class ViaEncoder extends MessageToMessageEncoder<ByteBuf> {
   private final Class7161 field35936;
   private boolean field35937 = false;

   public void encode(ChannelHandlerContext var1, ByteBuf var2, List<Object> var3) throws Exception {
      if (var2.readableBytes() == 0) {
         throw ViaVersion3.getInstance().method34425() ? new ViaVersion4() : ViaVersion4.field16532;
      } else {
         var2.retain();
         this.field35936.method22447();
         if (this.field35936.method22468()) {
            int var6 = Class4750.field22544.method14894(var2);
            ByteBuf var7 = var2.alloc().buffer();

            try {
               Class8563 var8 = new Class8563(var6, var2, this.field35936);
               Class6038 var9 = this.field35936.<Class6038>method22438(Class6038.class);
               var9.method18683().method19369(Class2302.field15718, var9.method18673(), var8);
               var8.method30563(var7);
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
      if (!Class8190.method28486(var2, ViaVersion4.class)) {
         super.exceptionCaught(var1, var2);
      }
   }

   public ViaEncoder(Class7161 var1) {
      if (var1 != null) {
         this.field35936 = var1;
      } else {
         throw new NullPointerException("info is marked non-null but is null");
      }
   }
}
