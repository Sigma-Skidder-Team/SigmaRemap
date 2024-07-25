package remapped;

public class class_177 extends class_4575 {
   public class_177(class_3229 var1) {
      this.field_591 = var1;
   }

   @Override
   public Object method_43611(class_1621 var1) {
      String var4 = this.field_591.method_42421((class_8437)var1).toString().replaceAll("_", "");
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
