package remapped;

public class class_2466 implements Runnable {
   private static String[] field_12335;

   public class_2466(class_3381 var1, int var2, int var3, float[] var4) {
      this.field_12334 = var1;
      this.field_12337 = var2;
      this.field_12333 = var3;
      this.field_12336 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field_12337; var3 < this.field_12333; var3++) {
         int var4 = var3 * class_3381.method_15637(this.field_12334);

         for (int var5 = 0; var5 < class_3381.method_15581(this.field_12334); var5++) {
            class_3381.method_15625(this.field_12334).method_24186(this.field_12336, var4 + var5 * class_3381.method_15616(this.field_12334));
         }
      }
   }
}
