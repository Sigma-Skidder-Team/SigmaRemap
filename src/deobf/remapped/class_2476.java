package remapped;

import java.util.Comparator;

public final class class_2476 implements Comparator<String> {
   private static String[] field_12357;

   public int compare(String var1, String var2) {
      int var5 = 4;

      for (int var6 = Math.min(var1.length(), var2.length()); var5 < var6; var5++) {
         char var7 = var1.charAt(var5);
         char var8 = var2.charAt(var5);
         if (var7 != var8) {
            return var7 >= var8 ? 1 : -1;
         }
      }

      var5 = var1.length();
      int var10 = var2.length();
      if (var5 == var10) {
         return 0;
      } else {
         return var5 >= var10 ? 1 : -1;
      }
   }
}
