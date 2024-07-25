package remapped;

import java.util.Comparator;

public class class_7327 implements Comparator<class_9128> {
   private static String[] field_37449;

   public class_7327(class_8438 var1) {
      this.field_37450 = var1;
   }

   public int compare(class_9128 var1, class_9128 var2) {
      int var5 = class_5320.field_27152.method_18547(var1.method_41992());
      int var6 = class_5320.field_27152.method_18547(var2.method_41992());
      if (var5 <= var6) {
         return var5 != var6 ? 1 : 0;
      } else {
         return -1;
      }
   }
}
