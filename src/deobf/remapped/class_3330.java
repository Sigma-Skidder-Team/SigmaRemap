package remapped;

import java.util.Comparator;

public class class_3330 implements Comparator<class_3357> {
   private static String[] field_16434;

   public class_3330(class_8734 var1) {
      this.field_16433 = var1;
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
