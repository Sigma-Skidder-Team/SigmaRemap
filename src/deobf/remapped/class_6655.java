package remapped;

public class class_6655 implements Runnable {
   private static String[] field_34438;

   public class_6655(class_3381 var1, long var2, long var4, long var6, long var8, class_4330 var10) {
      this.field_34437 = var1;
      this.field_34436 = var2;
      this.field_34435 = var4;
      this.field_34434 = var6;
      this.field_34439 = var8;
      this.field_34433 = var10;
   }

   @Override
   public void run() {
      class_4330 var3 = new class_4330(2L * class_3381.method_15636(this.field_34437), false);

      for (long var4 = this.field_34436; var4 < this.field_34435; var4++) {
         long var6 = var4 * this.field_34434;

         for (long var8 = 0L; var8 < class_3381.method_15582(this.field_34437); var8++) {
            long var10 = 2L * var8;

            for (long var12 = 0L; var12 < class_3381.method_15636(this.field_34437); var12++) {
               long var14 = 2L * var12;
               long var16 = var12 * this.field_34439 + var6 + var10;
               var3.method_36123(var14, this.field_34433.method_36133(var16));
               var3.method_36123(var14 + 1L, this.field_34433.method_36133(var16 + 1L));
            }

            class_3381.method_15603(this.field_34437).method_24183(var3);

            for (long var18 = 0L; var18 < class_3381.method_15636(this.field_34437); var18++) {
               long var19 = 2L * var18;
               long var20 = var18 * this.field_34439 + var6 + var10;
               this.field_34433.method_36123(var20, var3.method_36133(var19));
               this.field_34433.method_36123(var20 + 1L, var3.method_36133(var19 + 1L));
            }
         }
      }
   }
}
