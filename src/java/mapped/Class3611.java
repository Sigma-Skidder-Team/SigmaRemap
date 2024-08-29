package mapped;

import java.util.Comparator;

public class Class3611 implements Comparator<VideoMode> {
   private static String[] field19579;

   public int compare(VideoMode var1, VideoMode var2) {
      if (var1.getWidth() == var2.getWidth()) {
         if (var1.getHeight() == var2.getHeight()) {
            if (var1.getRefreshRate() == var2.getRefreshRate()) {
               int var5 = var1.method31531() + var1.method31532() + var1.method31533();
               int var6 = var2.method31531() + var2.method31532() + var2.method31533();
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
