package remapped;

import io.netty.buffer.ByteBuf;

public class class_6831 extends class_8039<class_9523> {
   public class_6831() {
      super(class_9523.class);
   }

   public class_9523 method_31323(ByteBuf var1) throws Exception {
      short var4 = class_8039.field_41166.method_42475(var1);
      int var5 = class_8039.field_41157.method_15647(var1);
      return new class_8035(var4 >> 12 & 15, var4 & 255, var4 >> 8 & 15, var5);
   }

   public void method_31322(ByteBuf var1, class_9523 var2) throws Exception {
      class_8039.field_41166.method_42477(var1, (short)(var2.method_43936() << 12 | var2.method_43930() << 8 | var2.method_43931()));
      class_8039.field_41157.method_15644(var1, var2.method_43935());
   }
}
