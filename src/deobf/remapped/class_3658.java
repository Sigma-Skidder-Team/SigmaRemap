package remapped;

import java.util.Comparator;

public class class_3658 implements Comparator<class_3357> {
   private static String[] field_17817;

   public class_3658(class_7401 var1) {
      this.field_17818 = var1;
   }

   public int compare(class_3357 var1, class_3357 var2) {
      Entity var5 = var1.method_15377();
      Entity var6 = var2.method_15377();
      float var7 = class_7401.method_33700().field_9632.method_37175(var5);
      float var8 = class_7401.method_33697().field_9632.method_37175(var6);
      if (!(var7 - var8 < 0.0F)) {
         return var7 - var8 != 0.0F ? 1 : 0;
      } else {
         return -1;
      }
   }
}
