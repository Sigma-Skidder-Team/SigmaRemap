package remapped;

public class class_2585 implements Runnable {
   private static String[] field_12801;

   public class_2585(class_3381 var1, long var2, long var4, long var6, long var8, long var10, long var12, class_4330 var14) {
      this.field_12797 = var1;
      this.field_12802 = var2;
      this.field_12796 = var4;
      this.field_12798 = var6;
      this.field_12795 = var8;
      this.field_12799 = var10;
      this.field_12800 = var12;
      this.field_12803 = var14;
   }

   @Override
   public void run() {
      for (long var3 = this.field_12802; var3 < this.field_12796; var3++) {
         long var5 = (class_3381.method_15636(this.field_12797) - var3) % class_3381.method_15636(this.field_12797);
         long var7 = var5 * this.field_12798;
         long var9 = var3 * this.field_12798;

         for (long var11 = 1L; var11 < this.field_12795; var11++) {
            long var13 = class_3381.method_15624(this.field_12797) - var11;
            long var15 = var13 * this.field_12799;
            long var17 = var11 * this.field_12799;
            long var19 = var7 + var15;

            for (long var21 = 0L; var21 < class_3381.method_15582(this.field_12797); var21++) {
               long var23 = 2L * var21;
               long var25 = this.field_12800 - var23;
               long var27 = var9 + var17 + var23;
               this.field_12803.method_36123(var19 + var25 % this.field_12800, this.field_12803.method_36133(var27));
               this.field_12803.method_36123(var19 + (var25 + 1L) % this.field_12800, -this.field_12803.method_36133(var27 + 1L));
            }
         }
      }
   }
}
