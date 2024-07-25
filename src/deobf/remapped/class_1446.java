package remapped;

import java.util.ArrayDeque;

public class class_1446 {
   private static String[] field_7774;
   private final class_1626 field_7777;
   private final class_9155 field_7776;
   private final class_3315 field_7775;

   public class_1446(class_1626 var1, class_9155 var2, class_3315 var3) {
      this.field_7777 = var1;
      this.field_7776 = var2;
      this.field_7775 = var3;
   }

   public void method_6626(ArrayDeque<class_1446> var1, int var2) {
      try {
         this.field_7775.method_15199(this.field_7777, this.field_7776, var1, var2);
      } catch (Throwable var6) {
      }
   }

   @Override
   public String toString() {
      return this.field_7775.toString();
   }
}
