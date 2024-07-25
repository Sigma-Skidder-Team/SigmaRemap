package remapped;

import java.util.function.Predicate;

public class class_335 implements Predicate<class_5834> {
   private static String[] field_1244;

   public class_335(class_5542 var1) {
      this.field_1245 = var1;
   }

   public boolean test(class_5834 var1) {
      if (var1 instanceof class_5542) {
         return false;
      } else if (var1 instanceof class_3024 || var1 instanceof class_7272 || var1 instanceof class_1173) {
         return true;
      } else if (var1 instanceof class_8990) {
         return !((class_8990)var1).method_41215();
      } else if (!(var1 instanceof class_704) || !var1.method_37221() && !((class_704)var1).method_3186()) {
         return class_5542.method_25192(this.field_1245, var1.method_37328()) ? false : !var1.method_26507() && !var1.method_37073();
      } else {
         return false;
      }
   }
}
