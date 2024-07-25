package remapped;

import io.netty.buffer.ByteBuf;

public class class_3235 extends class_8039<Integer> {
   public class_3235() {
      super(Integer.class);
   }

   public Integer method_14828(ByteBuf var1) throws Exception {
      int var4 = class_8039.field_41157.method_15647(var1);
      return var4 != 0 ? var4 - 1 : null;
   }

   public void method_14827(ByteBuf var1, Integer var2) throws Exception {
      if (var2 != null) {
         class_8039.field_41157.method_15644(var1, var2 + 1);
      } else {
         class_8039.field_41157.method_15644(var1, 0);
      }
   }
}
