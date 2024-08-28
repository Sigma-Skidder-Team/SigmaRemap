package mapped;

import com.google.common.base.Preconditions;
import io.netty.buffer.ByteBuf;

public class Class4796 extends Class4750<int[]> {
   public Class4796() {
      super(int[].class);
   }

   public int[] method14894(ByteBuf var1) throws Exception {
      int var4 = Class4750.field22544.method14907(var1);
      Preconditions.checkArgument(var1.isReadable(var4));
      int[] var5 = new int[var4];

      for (int var6 = 0; var6 < var5.length; var6++) {
         var5[var6] = Class4750.field22544.method14907(var1);
      }

      return var5;
   }

   public void method14895(ByteBuf var1, int[] var2) throws Exception {
      Class4750.field22544.method14908(var1, var2.length);

      for (int var8 : var2) {
         Class4750.field22544.method14908(var1, var8);
      }
   }
}
