package remapped;

import java.util.concurrent.Executor;

public class class_1582 implements class_1870 {
   private final class_1870 field_8285;
   private final class_2696<Runnable> field_8284;

   public class_1582(class_1870 var1, Executor var2) {
      this.field_8285 = var1;
      this.field_8284 = class_2696.method_12148(var2, "progressListener");
   }

   @Override
   public void method_8296(class_2034 var1) {
      this.field_8284.method_40495(() -> this.field_8285.method_8296(var1));
   }

   @Override
   public void method_8297(class_2034 var1, class_7335 var2) {
      this.field_8284.method_40495(() -> this.field_8285.method_8297(var1, var2));
   }

   @Override
   public void method_8298() {
      this.field_8284.method_40495(this.field_8285::method_8298);
   }
}
