package mapped;

import java.util.Comparator;

public class Class3605 implements Comparator {
   private static String[] field19568;

   @Override
   public int compare(Object var1, Object var2) {
      Class8737 var5 = (Class8737)var1;
      Class8737 var6 = (Class8737)var2;
      if (var5.method31529() == var6.method31529()) {
         if (var5.method31530() == var6.method31530()) {
            int var7 = var5.method31531() + var5.method31532() + var5.method31533();
            int var8 = var6.method31531() + var6.method31532() + var6.method31533();
            if (var7 == var8) {
               return var5.method31534() == var6.method31534() ? 0 : var5.method31534() - var6.method31534();
            } else {
               return var7 - var8;
            }
         } else {
            return var5.method31530() - var6.method31530();
         }
      } else {
         return var5.method31529() - var6.method31529();
      }
   }
}
