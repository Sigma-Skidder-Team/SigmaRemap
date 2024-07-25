package remapped;

import io.netty.buffer.ByteBuf;

public class class_206 extends class_2523<byte[], Integer> {
   public class_206(Integer var1) {
      super(var1, byte[].class);
   }

   public byte[] method_883(ByteBuf var1, Integer var2) throws Exception {
      if (var1.readableBytes() >= var2) {
         byte[] var5 = new byte[var2];
         var1.readBytes(var5);
         return var5;
      } else {
         throw new RuntimeException("Readable bytes does not match expected!");
      }
   }

   public void method_882(ByteBuf var1, Integer var2, byte[] var3) throws Exception {
      var1.writeBytes(var3);
   }
}
