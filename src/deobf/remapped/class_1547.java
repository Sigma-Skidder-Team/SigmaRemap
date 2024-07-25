package remapped;

public class class_1547 implements Runnable {
   private static String[] field_8172;

   public class_1547(class_1637 var1, long var2, long var4, long var6, long var8, class_1702 var10) {
      this.field_8174 = var1;
      this.field_8173 = var2;
      this.field_8170 = var4;
      this.field_8176 = var6;
      this.field_8175 = var8;
      this.field_8171 = var10;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(2L * class_1637.method_7293(this.field_8174), false);

      for (long var4 = this.field_8173; var4 < this.field_8170; var4++) {
         long var6 = var4 * this.field_8176;

         for (long var8 = 0L; var8 < class_1637.method_7343(this.field_8174); var8++) {
            long var10 = 2L * var8;

            for (long var12 = 0L; var12 < class_1637.method_7293(this.field_8174); var12++) {
               long var14 = 2L * var12;
               long var16 = var12 * this.field_8175 + var6 + var10;
               var3.method_36114(var14, this.field_8171.method_36107(var16));
               var3.method_36114(var14 + 1L, this.field_8171.method_36107(var16 + 1L));
            }

            class_1637.method_7322(this.field_8174).method_15026(var3);

            for (long var18 = 0L; var18 < class_1637.method_7293(this.field_8174); var18++) {
               long var19 = 2L * var18;
               long var20 = var18 * this.field_8175 + var6 + var10;
               this.field_8171.method_36114(var20, var3.method_36107(var19));
               this.field_8171.method_36114(var20 + 1L, var3.method_36107(var19 + 1L));
            }
         }
      }
   }
}
