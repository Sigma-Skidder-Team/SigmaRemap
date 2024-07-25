package remapped;

public class class_2673 implements Runnable {
   private static String[] field_13127;

   public class_2673(class_3381 var1, long var2, long var4, class_4330 var6, class_4330 var7, long var8, boolean var10) {
      this.field_13133 = var1;
      this.field_13131 = var2;
      this.field_13132 = var4;
      this.field_13128 = var6;
      this.field_13129 = var7;
      this.field_13134 = var8;
      this.field_13130 = var10;
   }

   @Override
   public void run() {
      for (long var3 = this.field_13131; var3 < this.field_13132; var3++) {
         long var5 = var3 * class_3381.method_15598(this.field_13133);

         for (long var7 = 0L; var7 < class_3381.method_15624(this.field_13133); var7++) {
            class_3685.method_17117(
               this.field_13128,
               var5 + var7 * class_3381.method_15638(this.field_13133),
               this.field_13129,
               var3 * class_3381.method_15624(this.field_13133) * this.field_13134 + var7 * this.field_13134,
               class_3381.method_15582(this.field_13133)
            );
            class_3381.method_15625(this.field_13133)
               .method_24168(this.field_13129, var3 * class_3381.method_15624(this.field_13133) * this.field_13134 + var7 * this.field_13134, this.field_13130);
         }
      }
   }
}
