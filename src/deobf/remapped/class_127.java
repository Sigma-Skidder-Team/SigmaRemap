package remapped;

public class class_127 implements Runnable {
   private static String[] field_308;

   public class_127(class_1637 var1, long var2, long var4, long var6, long var8, class_1702 var10, boolean var11) {
      this.field_313 = var1;
      this.field_314 = var2;
      this.field_310 = var4;
      this.field_312 = var6;
      this.field_309 = var8;
      this.field_315 = var10;
      this.field_311 = var11;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(2L * class_1637.method_7327(this.field_313), false);

      for (long var4 = this.field_314; var4 < this.field_310; var4++) {
         long var6 = var4 * this.field_312;

         for (long var8 = 0L; var8 < class_1637.method_7343(this.field_313); var8++) {
            long var10 = 2L * var8;

            for (long var12 = 0L; var12 < class_1637.method_7327(this.field_313); var12++) {
               long var14 = var6 + var12 * this.field_309 + var10;
               long var16 = 2L * var12;
               var3.method_36114(var16, this.field_315.method_36107(var14));
               var3.method_36114(var16 + 1L, this.field_315.method_36107(var14 + 1L));
            }

            class_1637.method_7323(this.field_313).method_15034(var3, this.field_311);

            for (long var18 = 0L; var18 < class_1637.method_7327(this.field_313); var18++) {
               long var19 = var6 + var18 * this.field_309 + var10;
               long var20 = 2L * var18;
               this.field_315.method_36114(var19, var3.method_36107(var20));
               this.field_315.method_36114(var19 + 1L, var3.method_36107(var20 + 1L));
            }
         }
      }
   }
}
