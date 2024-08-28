package mapped;

import java.util.Arrays;
import java.util.HashSet;

public class Class9831 {
   private static String[] field45922;

   public static void method38795(KeyBinding[] var0, KeyBinding[] var1) {
      HashSet var4 = new HashSet();

      for (int var5 = 0; var5 < var1.length; var5++) {
         KeyBinding var6 = var1[var5];
         var4.add(var6.method8523());
      }

      HashSet<KeyBinding> var9 = new HashSet<KeyBinding>(Arrays.asList(var0));
      var9.removeAll(Arrays.<KeyBinding>asList(var1));

      for (KeyBinding var7 : var9) {
         String var8 = var7.method8523();
         if (var4.contains(var8)) {
            var7.method8515(Class9798.field45819);
         }
      }
   }
}
