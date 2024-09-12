package mapped;

import com.mentalfrostbyte.jello.unmapped.IconPanel;

public class Class6665 implements Class6664 {
   private static String[] field29235;

   @Override
   public void method20320(IconPanel var1, IconPanel var2) {
      int var5 = 0;
      int var6 = 0;

      for (IconPanel var8 : var1.method13241()) {
         if (var8.method13263() + var8.method13267() > var5) {
            var5 = var8.method13263() + var8.method13267();
         }

         if (var8.method13265() + var8.method13269() > var6) {
            var6 = var8.method13265() + var8.method13269();
         }
      }

      var1.setWidth(var5);
      var1.setHeight(var6);
   }
}
