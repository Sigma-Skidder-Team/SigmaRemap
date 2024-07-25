package remapped;

import it.unimi.dsi.fastutil.doubles.DoubleList;

public class class_3992 implements class_1205 {
   private static String[] field_19397;
   private final DoubleList field_19398;

   public class_3992(DoubleList var1) {
      this.field_19398 = var1;
   }

   @Override
   public boolean method_5337(class_2718 var1) {
      for (int var4 = 0; var4 <= this.field_19398.size(); var4++) {
         if (!var1.method_12240(var4, var4, var4)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public DoubleList method_5336() {
      return this.field_19398;
   }
}
