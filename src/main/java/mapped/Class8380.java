package mapped;

import java.util.ArrayList;

public class Class8380 {
   private static String[] field35953;

   private Class8380() {
   }

   public static Object[] method29374(Object[] var0) {
      ArrayList var3 = new ArrayList();
      if (var0 != null) {
         for (Object var7 : var0) {
            if (!(var7 instanceof Object[])) {
               var3.add(var7);
            } else {
               for (Object var11 : method29374((Object[])var7)) {
                  var3.add(var11);
               }
            }
         }
      }

      return var3.toArray();
   }
}
