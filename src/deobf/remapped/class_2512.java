package remapped;

public class class_2512 implements Runnable {
   private static String[] field_12465;

   public class_2512(class_3381 var1, long var2, long var4, class_4330 var6, boolean var7) {
      this.field_12463 = var1;
      this.field_12467 = var2;
      this.field_12466 = var4;
      this.field_12464 = var6;
      this.field_12462 = var7;
   }

   @Override
   public void run() {
      class_4330 var3 = new class_4330(2L * class_3381.method_15624(this.field_12463), false);

      for (long var4 = this.field_12467; var4 < this.field_12466; var4++) {
         long var6 = var4 * class_3381.method_15598(this.field_12463);

         for (long var8 = 0L; var8 < class_3381.method_15582(this.field_12463); var8++) {
            long var10 = 2L * var8;

            for (long var12 = 0L; var12 < class_3381.method_15624(this.field_12463); var12++) {
               long var14 = var6 + var10 + var12 * class_3381.method_15638(this.field_12463);
               long var16 = 2L * var12;
               var3.method_36123(var16, this.field_12464.method_36133(var14));
               var3.method_36123(var16 + 1L, this.field_12464.method_36133(var14 + 1L));
            }

            class_3381.method_15639(this.field_12463).method_24214(var3, this.field_12462);

            for (long var18 = 0L; var18 < class_3381.method_15624(this.field_12463); var18++) {
               long var19 = var6 + var10 + var18 * class_3381.method_15638(this.field_12463);
               long var20 = 2L * var18;
               this.field_12464.method_36123(var19, var3.method_36133(var20));
               this.field_12464.method_36123(var19 + 1L, var3.method_36133(var20 + 1L));
            }
         }
      }
   }
}
