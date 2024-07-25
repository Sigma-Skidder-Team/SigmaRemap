package remapped;

import java.util.Comparator;

public class class_1159 implements Comparator {
   private static String[] field_6583;

   @Override
   public int compare(Object var1, Object var2) {
      VideoMode var5 = (VideoMode)var1;
      VideoMode var6 = (VideoMode)var2;
      if (var5.getWidth() == var6.getWidth()) {
         if (var5.getHeight() == var6.getHeight()) {
            int var7 = var5.method_25886() + var5.method_25884() + var5.method_25890();
            int var8 = var6.method_25886() + var6.method_25884() + var6.method_25890();
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
