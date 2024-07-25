package remapped;

public class class_5223 implements Runnable {
   private static String[] field_26808;

   public class_5223(class_3381 var1, int var2, int var3, int var4, int var5, int var6, int var7, float[] var8) {
      this.field_26806 = var1;
      this.field_26807 = var2;
      this.field_26809 = var3;
      this.field_26810 = var4;
      this.field_26811 = var5;
      this.field_26805 = var6;
      this.field_26812 = var7;
      this.field_26804 = var8;
   }

   @Override
   public void run() {
      for (int var3 = this.field_26807; var3 < this.field_26809; var3++) {
         int var4 = (class_3381.method_15623(this.field_26806) - var3) % class_3381.method_15623(this.field_26806);
         int var5 = var4 * this.field_26810;
         int var6 = var3 * this.field_26810;

         for (int var7 = 1; var7 < this.field_26811; var7++) {
            int var8 = class_3381.method_15581(this.field_26806) - var7;
            int var9 = var8 * this.field_26805;
            int var10 = var7 * this.field_26805;
            int var11 = var5 + var9;

            for (int var12 = 0; var12 < class_3381.method_15629(this.field_26806); var12++) {
               int var13 = 2 * var12;
               int var14 = this.field_26812 - var13;
               int var15 = var6 + var10 + var13;
               this.field_26804[var11 + var14 % this.field_26812] = this.field_26804[var15];
               this.field_26804[var11 + (var14 + 1) % this.field_26812] = -this.field_26804[var15 + 1];
            }
         }
      }
   }
}
