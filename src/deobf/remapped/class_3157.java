package remapped;

import com.google.common.base.Preconditions;
import io.netty.buffer.ByteBuf;

public class class_3157 extends class_8039<int[]> {
   public class_3157() {
      super(int[].class);
   }

   public int[] method_14557(ByteBuf var1) throws Exception {
      int var4 = class_8039.field_41157.method_15647(var1);
      Preconditions.checkArgument(var1.isReadable(var4));
      int[] var5 = new int[var4];

      for (int var6 = 0; var6 < var5.length; var6++) {
         var5[var6] = class_8039.field_41157.method_15647(var1);
      }

      return var5;
   }

   public void method_14556(ByteBuf var1, int[] var2) throws Exception {
      class_8039.field_41157.method_15644(var1, var2.length);

      for (int var8 : var2) {
         class_8039.field_41157.method_15644(var1, var8);
      }
   }
}
