package mapped;

import java.awt.Rectangle;
import java.util.ArrayList;

public class Class7548 implements Class7547 {
   @Override
   public Rectangle method24668(Screen var1, int var2, int var3) {
      int var6 = var1.field4564 / 2 - 150;
      int var7 = var1.field4565 / 6 - 7;
      if (var3 <= var7 + 98) {
         var7 += 105;
      }

      int var8 = var6 + 150 + 150;
      int var9 = var7 + 84 + 10;
      return new Rectangle(var6, var7, var8 - var6, var9 - var7);
   }

   @Override
   public boolean method24670() {
      return false;
   }

   @Override
   public String[] method24669(Class1197 var1, int var2) {
      if (var1 instanceof Class1230) {
         Class1230 var5 = (Class1230)var1;
         AbstractOption var6 = var5.method5811();
         return method24671(var6.method17957());
      } else {
         return null;
      }
   }

   public static String[] method24671(String var0) {
      ArrayList<String> var3 = new ArrayList();

      for (int var4 = 0; var4 < 10; var4++) {
         String var5 = var0 + ".tooltip." + (var4 + 1);
         String var6 = Class8043.method27621(var5, (String)null);
         if (var6 == null) {
            break;
         }

         var3.add(var6);
      }

      return var3.size() > 0 ? var3.toArray(new String[var3.size()]) : null;
   }
}
