package remapped;

import java.util.Comparator;

public class class_4493 implements Comparator<class_3357> {
   private static String[] field_21966;

   public class_4493(class_8734 var1) {
      this.field_21967 = var1;
   }

   public int compare(class_3357 var1, class_3357 var2) {
      class_8145 var5 = var1.method_15377();
      class_8145 var6 = var2.method_15377();
      int var7 = !(var5 instanceof class_704) ? 0 : class_2740.method_12329((class_704)var5);
      int var8 = !(var6 instanceof class_704) ? 0 : class_2740.method_12329((class_704)var6);
      if (var7 - var8 >= 0) {
         if (var7 - var8 != 0) {
            return 1;
         } else {
            float var9 = this.field_21967.field_44744.field_9632.method_37175(var5);
            float var10 = this.field_21967.field_44744.field_9632.method_37175(var6);
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
