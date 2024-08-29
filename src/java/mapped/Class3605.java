package mapped;

import java.util.Comparator;

public class Class3605 implements Comparator {
   private static String[] field19568;

   @Override
   public int compare(Object var1, Object var2) {
      VideoMode var5 = (VideoMode)var1;
      VideoMode var6 = (VideoMode)var2;
      if (var5.getWidth() == var6.getWidth()) {
         if (var5.getHeight() == var6.getHeight()) {
            int var7 = var5.method31531() + var5.method31532() + var5.method31533();
            int var8 = var6.method31531() + var6.method31532() + var6.method31533();
            if (var7 == var8) {
               return var5.getRefreshRate() == var6.getRefreshRate() ? 0 : var5.getRefreshRate() - var6.getRefreshRate();
            } else {
               return var7 - var8;
            }
         } else {
            return var5.getHeight() - var6.getHeight();
         }
      } else {
         return var5.getWidth() - var6.getWidth();
      }
   }
}
