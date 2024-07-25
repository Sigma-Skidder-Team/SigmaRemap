package remapped;

import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class class_2434 {
   private static String[] field_12096;
   private final LongSupplier field_12098;
   private final IntSupplier field_12095;
   private class_3025 field_12097 = class_8677.field_44535;

   public class_2434(LongSupplier var1, IntSupplier var2) {
      this.field_12098 = var1;
      this.field_12095 = var2;
   }

   public boolean method_11087() {
      return this.field_12097 != class_8677.field_44535;
   }

   public void method_11090() {
      this.field_12097 = class_8677.field_44535;
   }

   public void method_11089() {
      this.field_12097 = new class_4929(this.field_12098, this.field_12095, true);
   }

   public class_3492 method_11091() {
      return this.field_12097;
   }

   public class_2578 method_11086() {
      return this.field_12097.method_13811();
   }
}
