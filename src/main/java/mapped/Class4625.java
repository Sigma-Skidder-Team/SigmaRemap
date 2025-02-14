package mapped;

public class Class4625 extends Class4626 {
   public final Class6211 field22149;

   public Class4625(Class6211 var1) {
      this.field22149 = var1;
   }

   @Override
   public Object method14587(Class7255 var1) {
      String var4 = this.field22149.method19165((Class7256)var1).toString().replaceAll("_", "");
      byte var5 = 1;
      char var6 = var4.charAt(0);
      if (var6 != '-') {
         if (var6 == '+') {
            var4 = var4.substring(1);
         }
      } else {
         var5 = -1;
         var4 = var4.substring(1);
      }

      String var7 = var4.toLowerCase();
      if (".inf".equals(var7)) {
         return var5 != -1 ? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY;
      } else if (".nan".equals(var7)) {
         return Double.NaN;
      } else if (var4.indexOf(58) == -1) {
         Double var14 = Double.valueOf(var4);
         return var14 * (double)var5;
      } else {
         String[] var8 = var4.split(":");
         byte var9 = 1;
         double var10 = 0.0;
         int var12 = 0;

         for (int var13 = var8.length; var12 < var13; var12++) {
            var10 += Double.parseDouble(var8[var13 - var12 - 1]) * (double)var9;
            var9 *= 60;
         }

         return (double)var5 * var10;
      }
   }
}
