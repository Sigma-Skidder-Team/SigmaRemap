package remapped;

import io.netty.buffer.ByteBuf;

public class class_6822 extends class_8039<class_9348> {
   public class_6822() {
      super(class_9348.class);
   }

   public class_9348 method_31298(ByteBuf var1) throws Exception {
      int var4 = class_8039.field_41179.method_9912(var1);
      int var5 = class_8039.field_41179.method_9912(var1);
      int var6 = class_8039.field_41179.method_9912(var1);
      return new class_9348(var4, var5, var6);
   }

   public void method_31297(ByteBuf var1, class_9348 var2) throws Exception {
      class_8039.field_41179.method_33275(var1, Integer.valueOf(var2.method_43135()));
      class_8039.field_41179.method_33275(var1, Integer.valueOf(var2.method_43130()));
      class_8039.field_41179.method_33275(var1, Integer.valueOf(var2.method_43136()));
   }
}
