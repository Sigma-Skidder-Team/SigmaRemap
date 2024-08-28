package mapped;

import io.netty.buffer.ByteBuf;

public class Class4805 extends Class4802 {
   public Class4805() {
      super("Flat Item Array");
   }

   public Class9738[] method14894(ByteBuf var1) throws Exception {
      short var4 = Class4750.field22534.method14909(var1);
      Class9738[] var5 = new Class9738[var4];

      for (int var6 = 0; var6 < var4; var6++) {
         var5[var6] = Class4750.field22568.method14894(var1);
      }

      return var5;
   }

   public void method14895(ByteBuf var1, Class9738[] var2) throws Exception {
      Class4750.field22534.method14910(var1, (short)var2.length);

      for (Class9738 var8 : var2) {
         Class4750.field22568.method14895(var1, var8);
      }
   }
}
