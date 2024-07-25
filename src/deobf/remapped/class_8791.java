package remapped;

public class class_8791 implements Runnable {
   private static String[] field_44979;

   public class_8791(class_3381 var1, long var2, long var4, long var6, long var8, class_4330 var10, long var11) {
      this.field_44980 = var1;
      this.field_44975 = var2;
      this.field_44976 = var4;
      this.field_44974 = var6;
      this.field_44977 = var8;
      this.field_44978 = var10;
      this.field_44973 = var11;
   }

   @Override
   public void run() {
      class_4330 var3 = new class_4330(this.field_44975);

      for (long var4 = this.field_44976; var4 >= this.field_44974; var4--) {
         long var6 = var4 * class_3381.method_15598(this.field_44980);
         long var8 = var4 * this.field_44977;

         for (long var10 = class_3381.method_15624(this.field_44980) - 1L; var10 >= 0L; var10--) {
            class_3685.method_17117(
               this.field_44978, var6 + var10 * class_3381.method_15638(this.field_44980), var3, 0L, class_3381.method_15582(this.field_44980)
            );
            class_3381.method_15625(this.field_44980).method_24158(var3);
            class_3685.method_17117(var3, 0L, this.field_44978, var8 + var10 * this.field_44973, this.field_44975);
         }
      }
   }
}
