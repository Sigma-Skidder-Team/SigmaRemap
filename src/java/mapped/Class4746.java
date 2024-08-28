package mapped;

import io.netty.buffer.ByteBuf;

public class Class4746 extends Class4747<byte[], Integer> {
   public Class4746(Integer var1) {
      super(var1, byte[].class);
   }

   public byte[] method14893(ByteBuf var1, Integer var2) throws Exception {
      if (var1.readableBytes() >= var2) {
         byte[] var5 = new byte[var2];
         var1.readBytes(var5);
         return var5;
      } else {
         throw new RuntimeException("Readable bytes does not match expected!");
      }
   }

   public void method14892(ByteBuf var1, Integer var2, byte[] var3) throws Exception {
      var1.writeBytes(var3);
   }
}
