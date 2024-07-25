package remapped;

import java.util.Comparator;

public class class_259 implements Comparator<class_5722> {
   private static String[] field_908;

   public int compare(class_5722 var1, class_5722 var2) {
      if (var1.method_25883() == var2.method_25883()) {
         if (var1.method_25885() == var2.method_25885()) {
            if (var1.method_25887() == var2.method_25887()) {
               int var5 = var1.method_25886() + var1.method_25884() + var1.method_25890();
               int var6 = var2.method_25886() + var2.method_25884() + var2.method_25890();
               return var5 == var6 ? 0 : var5 - var6;
            } else {
               return var1.method_25887() - var2.method_25887();
            }
         } else {
            return var1.method_25885() - var2.method_25885();
         }
      } else {
         return var1.method_25883() - var2.method_25883();
      }
   }
}
