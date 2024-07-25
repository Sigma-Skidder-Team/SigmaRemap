package remapped;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.util.zip.Deflater;

public class class_5013 extends MessageToByteEncoder<ByteBuf> {
   private static String[] field_25924;
   private final byte[] field_25926 = new byte[8192];
   private final Deflater field_25927;
   private int field_25925;

   public class_5013(int var1) {
      this.field_25925 = var1;
      this.field_25927 = new Deflater();
   }

   public void encode(ChannelHandlerContext var1, ByteBuf var2, ByteBuf var3) throws Exception {
      int var6 = var2.readableBytes();
      class_8248 var7 = new class_8248(var3);
      if (var6 >= this.field_25925) {
         byte[] var8 = new byte[var6];
         var2.readBytes(var8);
         var7.method_37743(var8.length);
         this.field_25927.setInput(var8, 0, var6);
         this.field_25927.finish();

         while (!this.field_25927.finished()) {
            int var9 = this.field_25927.deflate(this.field_25926);
            var7.writeBytes(this.field_25926, 0, var9);
         }

         this.field_25927.reset();
      } else {
         var7.method_37743(0);
         var7.writeBytes(var2);
      }
   }

   public void method_23076(int var1) {
      this.field_25925 = var1;
   }
}
