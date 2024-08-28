package mapped;

import io.netty.buffer.ByteBuf;

public class Class4813 extends Class4806 {
   private static String[] field22595;

   public Class8656 method14894(ByteBuf var1) throws Exception {
      byte var4 = var1.readByte();
      if (var4 != 127) {
         int var5 = (var4 & 224) >> 5;
         Class1948 var6 = Class1948.method8206(var5);
         int var7 = var4 & 31;
         return new Class8656(var7, var6, var6.method8208().method14894(var1));
      } else {
         return null;
      }
   }

   public void method14895(ByteBuf var1, Class8656 var2) throws Exception {
      byte var5 = (byte)(var2.method31150().method8207() << 5 | var2.method31148() & 31);
      var1.writeByte(var5);
      var2.method31150().method8208().method14895(var1, var2.method31152());
   }
}
