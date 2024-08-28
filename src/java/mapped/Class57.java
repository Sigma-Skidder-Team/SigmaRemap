package mapped;

import it.unimi.dsi.fastutil.doubles.DoubleList;

public class Class57 implements Class56 {
   private static String[] field121;
   private final DoubleList field122;

   public Class57(DoubleList var1) {
      this.field122 = var1;
   }

   @Override
   public boolean method192(Class7775 var1) {
      for (int var4 = 0; var4 <= this.field122.size(); var4++) {
         if (!var1.method25758(var4, var4, var4)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public DoubleList method194() {
      return this.field122;
   }
}
