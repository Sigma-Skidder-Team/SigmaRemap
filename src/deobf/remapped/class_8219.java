package remapped;

import java.util.Comparator;

public class class_8219 implements Comparator<class_3357> {
   private static String[] field_42053;

   public class_8219(class_8734 var1) {
      this.field_42054 = var1;
   }

   public int compare(class_3357 var1, class_3357 var2) {
      Entity var5 = var1.method_15377();
      Entity var6 = var2.method_15377();
      boolean var7 = SigmaMainClass.getInstance().method_3307().method_14469(var5);
      boolean var8 = SigmaMainClass.getInstance().method_3307().method_14469(var6);
      if (var7 && !var8) {
         return -1;
      } else {
         return var7 && var8 ? 0 : 1;
      }
   }
}