package remapped;

import java.util.Comparator;

public class class_7631 implements Comparator<class_3357> {
   private static String[] field_38829;

   public class_7631(class_8734 var1) {
      this.field_38830 = var1;
   }

   public int compare(class_3357 var1, class_3357 var2) {
      Entity var5 = var1.method_15377();
      Entity var6 = var2.method_15377();
      Object var7 = class_2534.field_12556 != null && class_2534.field_12556.method_15377() != null
         ? class_2534.field_12556.method_15377()
         : this.field_38830.field_44744.field_9632;
      float var8 = ((Entity)var7).method_37175(var5);
      float var9 = ((Entity)var7).method_37175(var6);
      if (!(var8 - var9 < 0.0F)) {
         return var8 - var9 != 0.0F ? 1 : 0;
      } else {
         return -1;
      }
   }
}
