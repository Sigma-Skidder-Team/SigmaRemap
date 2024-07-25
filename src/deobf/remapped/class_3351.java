package remapped;

public class class_3351 implements Runnable {
   private static String[] field_16530;

   public class_3351(class_1637 var1, long var2, long var4, long var6, long var8, class_1702 var10, boolean var11) {
      this.field_16532 = var1;
      this.field_16529 = var2;
      this.field_16531 = var4;
      this.field_16526 = var6;
      this.field_16527 = var8;
      this.field_16528 = var10;
      this.field_16533 = var11;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(2L * class_1637.method_7293(this.field_16532), false);

      for (long var4 = this.field_16529; var4 < this.field_16531; var4++) {
         long var6 = var4 * this.field_16526;

         for (long var8 = 0L; var8 < class_1637.method_7343(this.field_16532); var8++) {
            long var10 = 2L * var8;

            for (long var12 = 0L; var12 < class_1637.method_7293(this.field_16532); var12++) {
               long var14 = 2L * var12;
               long var16 = var12 * this.field_16527 + var6 + var10;
               var3.method_36114(var14, this.field_16528.method_36107(var16));
               var3.method_36114(var14 + 1L, this.field_16528.method_36107(var16 + 1L));
            }

            class_1637.method_7322(this.field_16532).method_15034(var3, this.field_16533);

            for (long var18 = 0L; var18 < class_1637.method_7293(this.field_16532); var18++) {
               long var19 = 2L * var18;
               long var20 = var18 * this.field_16527 + var6 + var10;
               this.field_16528.method_36114(var20, var3.method_36107(var19));
               this.field_16528.method_36114(var20 + 1L, var3.method_36107(var19 + 1L));
            }
         }
      }
   }
}
