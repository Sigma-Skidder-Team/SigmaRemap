package mapped;

import io.netty.buffer.ByteBuf;

public class Class4768 extends Class4750<Integer> {
   public Class4768() {
      super(Integer.class);
   }

   public Integer method14894(ByteBuf var1) throws Exception {
      int var4 = Class4750.field22544.method14907(var1);
      return var4 != 0 ? var4 - 1 : null;
   }

   public void method14895(ByteBuf var1, Integer var2) throws Exception {
      if (var2 != null) {
         Class4750.field22544.method14908(var1, var2 + 1);
      } else {
         Class4750.field22544.method14908(var1, 0);
      }
   }
}
