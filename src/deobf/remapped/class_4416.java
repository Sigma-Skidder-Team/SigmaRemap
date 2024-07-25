package remapped;

import java.util.ArrayList;

public class class_4416 {
   private static String[] field_21598;

   private class_4416() {
   }

   public static Object[] method_20546(Object[] var0) {
      ArrayList var3 = new ArrayList();
      if (var0 != null) {
         for (Object var7 : var0) {
            if (!(var7 instanceof Object[])) {
               var3.add(var7);
            } else {
               for (Object var11 : method_20546((Object[])var7)) {
                  var3.add(var11);
               }
            }
         }
      }

      return var3.toArray();
   }
}
