package remapped;

import java.util.function.Predicate;

public class class_8389 implements Predicate<class_8145> {
   private static String[] field_42913;
   private final class_6098 field_42912;

   public class_8389(class_6098 var1) {
      this.field_42912 = var1;
   }

   public boolean test(class_8145 var1) {
      if (var1.method_37330()) {
         if (var1 instanceof class_5834) {
            class_5834 var4 = (class_5834)var1;
            return var4.method_26612(this.field_42912);
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
