package remapped;

import java.io.IOException;

public class class_2492 implements Packet<class_1243> {
   private static String[] field_12397;
   private int field_12396;

   public class_2492() {
   }

   public class_2492(int var1) {
      this.field_12396 = var1;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_12396 = var1.method_37778();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_12396);
   }

   public void method_11404(class_1243 var1) {
      var1.method_5576(this);
   }

   public int method_11403() {
      return this.field_12396;
   }
}
