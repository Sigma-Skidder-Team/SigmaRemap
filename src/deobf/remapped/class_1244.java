package remapped;

import java.util.Comparator;

public class class_1244 implements Comparator<class_3357> {
   private static String[] field_6859;

   public class_1244(class_8734 var1) {
      this.field_6858 = var1;
   }

   public int compare(class_3357 var1, class_3357 var2) {
      Entity var5 = var1.method_15377();
      Entity var6 = var2.method_15377();
      float var7 = ((LivingEntity)var5).method_26551();
      float var8 = ((LivingEntity)var6).method_26551();
      if (!(var7 - var8 < 0.0F)) {
         if (var7 - var8 != 0.0F) {
            return 1;
         } else {
            float var9 = this.field_6858.field_44744.field_9632.method_37175(var5);
            float var10 = this.field_6858.field_44744.field_9632.method_37175(var6);
            if (!(var9 - var10 < 0.0F)) {
               return var9 - var10 != 0.0F ? 1 : 0;
            } else {
               return -1;
            }
         }
      } else {
         return -1;
      }
   }
}
