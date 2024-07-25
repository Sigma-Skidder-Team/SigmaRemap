package remapped;

public class class_7508 implements Runnable {
   private static String[] field_38344;

   public class_7508(class_1637 var1, long var2, long var4, class_1702 var6, boolean var7) {
      this.field_38341 = var1;
      this.field_38343 = var2;
      this.field_38345 = var4;
      this.field_38342 = var6;
      this.field_38346 = var7;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(2L * class_1637.method_7293(this.field_38341), false);

      for (long var4 = this.field_38343; var4 < this.field_38345; var4++) {
         long var6 = var4 * class_1637.method_7303(this.field_38341);

         for (long var8 = 0L; var8 < class_1637.method_7343(this.field_38341); var8++) {
            long var10 = 2L * var8;

            for (long var12 = 0L; var12 < class_1637.method_7293(this.field_38341); var12++) {
               long var14 = var12 * class_1637.method_7342(this.field_38341) + var6 + var10;
               long var16 = 2L * var12;
               var3.method_36114(var16, this.field_38342.method_36107(var14));
               var3.method_36114(var16 + 1L, this.field_38342.method_36107(var14 + 1L));
            }

            class_1637.method_7322(this.field_38341).method_15034(var3, this.field_38346);

            for (long var18 = 0L; var18 < class_1637.method_7293(this.field_38341); var18++) {
               long var19 = var18 * class_1637.method_7342(this.field_38341) + var6 + var10;
               long var20 = 2L * var18;
               this.field_38342.method_36114(var19, var3.method_36107(var20));
               this.field_38342.method_36114(var19 + 1L, var3.method_36107(var20 + 1L));
            }
         }
      }
   }
}
