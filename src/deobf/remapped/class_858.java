package remapped;

import java.util.Comparator;

public class class_858 implements Comparator<class_3357> {
   private static String[] field_4458;

   public class_858(class_8734 var1) {
      this.field_4459 = var1;
   }

   public int compare(class_3357 var1, class_3357 var2) {
      class_8145 var5 = var1.method_15377();
      class_8145 var6 = var2.method_15377();
      float var7 = class_7211.method_32998(class_7211.method_32999(var5).field_10069, this.field_4459.field_44744.field_9632.field_41701);
      float var8 = class_7211.method_32998(class_7211.method_32999(var6).field_10069, this.field_4459.field_44744.field_9632.field_41701);
      if (!(var7 - var8 < 0.0F)) {
         if (var7 - var8 != 0.0F) {
            return 1;
         } else {
            float var9 = this.field_4459.field_44744.field_9632.method_37175(var5);
            float var10 = this.field_4459.field_44744.field_9632.method_37175(var6);
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
