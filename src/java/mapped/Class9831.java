package mapped;

import java.util.Arrays;
import java.util.HashSet;

public class Class9831 {
   private static String[] field45922;

   public static void method38795(Class2007[] var0, Class2007[] var1) {
      HashSet var4 = new HashSet();

      for (int var5 = 0; var5 < var1.length; var5++) {
         Class2007 var6 = var1[var5];
         var4.add(var6.method8523());
      }

      HashSet<Class2007> var9 = new HashSet<Class2007>(Arrays.asList(var0));
      var9.removeAll(Arrays.<Class2007>asList(var1));

      for (Class2007 var7 : var9) {
         String var8 = var7.method8523();
         if (var4.contains(var8)) {
            var7.method8515(Class9798.field45819);
         }
      }
   }
}
