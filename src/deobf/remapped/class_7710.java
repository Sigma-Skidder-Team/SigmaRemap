package remapped;

public class class_7710 implements Runnable {
   private static String[] field_39115;

   public class_7710(class_3381 var1, int var2, int var3, float[] var4, float[][][] var5) {
      this.field_39113 = var1;
      this.field_39114 = var2;
      this.field_39111 = var3;
      this.field_39112 = var4;
      this.field_39110 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_39114; var3 < this.field_39111; var3++) {
         int var4 = var3 * class_3381.method_15637(this.field_39113);

         for (int var5 = 0; var5 < class_3381.method_15581(this.field_39113); var5++) {
            System.arraycopy(
               this.field_39112,
               var4 + var5 * class_3381.method_15616(this.field_39113),
               this.field_39110[var3][var5],
               0,
               class_3381.method_15629(this.field_39113)
            );
            class_3381.method_15625(this.field_39113).method_24160(this.field_39110[var3][var5]);
         }
      }
   }
}
