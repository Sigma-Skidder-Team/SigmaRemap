package remapped;

import java.util.Comparator;

public class class_4878 implements Comparator<class_8145> {
   private static String[] field_24269;

   public class_4878(class_2941 var1) {
      this.field_24270 = var1;
   }

   public int compare(class_8145 var1, class_8145 var2) {
      float var5 = class_7211.method_32998(class_7211.method_32999(var1).field_10069, class_2941.method_13454().field_9632.field_41701);
      float var6 = class_7211.method_32998(class_7211.method_32999(var2).field_10069, class_2941.method_13450().field_9632.field_41701);
      if (!(var5 - var6 < 0.0F)) {
         if (var5 - var6 != 0.0F) {
            return 1;
         } else {
            float var7 = class_2941.method_13453().field_9632.method_37175(var1);
            float var8 = class_2941.method_13448().field_9632.method_37175(var2);
            if (!(var7 - var8 < 0.0F)) {
               return var7 - var8 != 0.0F ? 1 : 0;
            } else {
               return -1;
            }
         }
      } else {
         return -1;
      }
   }
}
