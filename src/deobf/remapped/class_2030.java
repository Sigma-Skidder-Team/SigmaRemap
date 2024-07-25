package remapped;

public class class_2030 implements Runnable {
   private static String[] field_10308;

   public class_2030(class_3381 var1, long var2, long var4, long var6, long var8, class_4330 var10, boolean var11) {
      this.field_10312 = var1;
      this.field_10307 = var2;
      this.field_10309 = var4;
      this.field_10311 = var6;
      this.field_10310 = var8;
      this.field_10306 = var10;
      this.field_10313 = var11;
   }

   @Override
   public void run() {
      class_4330 var3 = new class_4330(2L * class_3381.method_15624(this.field_10312), false);

      for (long var4 = this.field_10307; var4 < this.field_10309; var4++) {
         long var6 = var4 * this.field_10311;

         for (long var8 = 0L; var8 < class_3381.method_15582(this.field_10312); var8++) {
            long var10 = 2L * var8;

            for (long var12 = 0L; var12 < class_3381.method_15624(this.field_10312); var12++) {
               long var14 = var6 + var12 * this.field_10310 + var10;
               long var16 = 2L * var12;
               var3.method_36123(var16, this.field_10306.method_36133(var14));
               var3.method_36123(var16 + 1L, this.field_10306.method_36133(var14 + 1L));
            }

            class_3381.method_15639(this.field_10312).method_24214(var3, this.field_10313);

            for (long var18 = 0L; var18 < class_3381.method_15624(this.field_10312); var18++) {
               long var19 = var6 + var18 * this.field_10310 + var10;
               long var20 = 2L * var18;
               this.field_10306.method_36123(var19, var3.method_36133(var20));
               this.field_10306.method_36123(var19 + 1L, var3.method_36133(var20 + 1L));
            }
         }
      }
   }
}
