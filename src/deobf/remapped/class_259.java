package remapped;

import java.util.Comparator;

public class class_259 implements Comparator<VideoMode> {
   private static String[] field_908;

   public int compare(VideoMode var1, VideoMode var2) {
      if (var1.getWidth() == var2.getWidth()) {
         if (var1.getHeight() == var2.getHeight()) {
            if (var1.getRefreshRate() == var2.getRefreshRate()) {
               int var5 = var1.method_25886() + var1.method_25884() + var1.method_25890();
               int var6 = var2.method_25886() + var2.method_25884() + var2.method_25890();
               return var5 == var6 ? 0 : var5 - var6;
            } else {
               return var1.getRefreshRate() - var2.getRefreshRate();
            }
         } else {
            return var1.getHeight() - var2.getHeight();
         }
      } else {
         return var1.getWidth() - var2.getWidth();
      }
   }
}
