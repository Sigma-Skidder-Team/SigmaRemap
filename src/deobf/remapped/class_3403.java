package remapped;

import java.awt.Rectangle;
import java.util.ArrayList;

public class class_3403 implements class_2168 {
   public Rectangle 酭浣属홵ぶ娍(class_266 var1, int var2, int var3) {
      int var6 = var1.field_941 / 2 - 150;
      int var7 = var1.field_940 / 6 - 7;
      if (var3 <= var7 + 98) {
         var7 += 105;
      }

      int var8 = var6 + 150 + 150;
      int var9 = var7 + 84 + 10;
      return new Rectangle(var6, var7, var8 - var6, var9 - var7);
   }

   public boolean 쥅聛罡䬹釒唟() {
      return false;
   }

   public String[] 郝뫤竬鼒좯蛊(class_7114 var1, int var2) {
      if (var1 instanceof class_8243) {
         class_8243 var5 = (class_8243)var1;
         class_1013 var6 = var5.method_9910();
         return method_15717(var6.method_4491());
      } else {
         return null;
      }
   }

   public static String[] method_15717(String var0) {
      ArrayList var3 = new ArrayList();

      for (int var4 = 0; var4 < 10; var4++) {
         String var5 = var0 + ".tooltip." + (var4 + 1);
         String var6 = class_3458.method_15913(var5, (String)null);
         if (var6 == null) {
            break;
         }

         var3.add(var6);
      }

      return var3.size() > 0 ? var3.<String>toArray(new String[var3.size()]) : null;
   }
}
