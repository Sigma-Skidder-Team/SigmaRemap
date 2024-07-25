package remapped;

import java.util.Comparator;

public class class_1159 implements Comparator {
   private static String[] field_6583;

   @Override
   public int compare(Object var1, Object var2) {
      class_5722 var5 = (class_5722)var1;
      class_5722 var6 = (class_5722)var2;
      if (var5.method_25883() == var6.method_25883()) {
         if (var5.method_25885() == var6.method_25885()) {
            int var7 = var5.method_25886() + var5.method_25884() + var5.method_25890();
            int var8 = var6.method_25886() + var6.method_25884() + var6.method_25890();
            if (var7 == var8) {
               return var5.method_25887() == var6.method_25887() ? 0 : var5.method_25887() - var6.method_25887();
            } else {
               return var7 - var8;
            }
         } else {
            return var5.method_25885() - var6.method_25885();
         }
      } else {
         return var5.method_25883() - var6.method_25883();
      }
   }
}
