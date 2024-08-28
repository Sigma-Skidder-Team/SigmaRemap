package mapped;

import java.util.Comparator;

public class Class3611 implements Comparator<Class8737> {
   private static String[] field19579;

   public int compare(Class8737 var1, Class8737 var2) {
      if (var1.method31529() == var2.method31529()) {
         if (var1.method31530() == var2.method31530()) {
            if (var1.method31534() == var2.method31534()) {
               int var5 = var1.method31531() + var1.method31532() + var1.method31533();
               int var6 = var2.method31531() + var2.method31532() + var2.method31533();
               return var5 == var6 ? 0 : var5 - var6;
            } else {
               return var1.method31534() - var2.method31534();
            }
         } else {
            return var1.method31530() - var2.method31530();
         }
      } else {
         return var1.method31529() - var2.method31529();
      }
   }
}
