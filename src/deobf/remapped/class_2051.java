package remapped;

public class class_2051 implements Runnable {
   private static String[] field_10374;

   public class_2051(class_3381 var1, long var2, long var4, class_4330 var6) {
      this.field_10375 = var1;
      this.field_10377 = var2;
      this.field_10378 = var4;
      this.field_10376 = var6;
   }

   @Override
   public void run() {
      class_4330 var3 = new class_4330(2L * class_3381.method_15636(this.field_10375), false);

      for (long var4 = this.field_10377; var4 < this.field_10378; var4++) {
         long var6 = var4 * class_3381.method_15638(this.field_10375);

         for (long var8 = 0L; var8 < class_3381.method_15582(this.field_10375); var8++) {
            long var10 = 2L * var8;

            for (long var12 = 0L; var12 < class_3381.method_15636(this.field_10375); var12++) {
               long var14 = var12 * class_3381.method_15598(this.field_10375) + var6 + var10;
               long var16 = 2L * var12;
               var3.method_36123(var16, this.field_10376.method_36133(var14));
               var3.method_36123(var16 + 1L, this.field_10376.method_36133(var14 + 1L));
            }

            class_3381.method_15603(this.field_10375).method_24183(var3);

            for (long var18 = 0L; var18 < class_3381.method_15636(this.field_10375); var18++) {
               long var19 = var18 * class_3381.method_15598(this.field_10375) + var6 + var10;
               long var20 = 2L * var18;
               this.field_10376.method_36123(var19, var3.method_36133(var20));
               this.field_10376.method_36123(var19 + 1L, var3.method_36133(var20 + 1L));
            }
         }
      }
   }
}
