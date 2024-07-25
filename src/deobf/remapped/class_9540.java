package remapped;

public class class_9540 implements Runnable {
   private static String[] field_48539;

   public class_9540(class_3381 var1, int var2, int var3, float[] var4, float[][][] var5, boolean var6) {
      this.field_48540 = var1;
      this.field_48541 = var2;
      this.field_48538 = var3;
      this.field_48536 = var4;
      this.field_48537 = var5;
      this.field_48542 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_48541; var3 < this.field_48538; var3++) {
         int var4 = var3 * class_3381.method_15637(this.field_48540);

         for (int var5 = 0; var5 < class_3381.method_15581(this.field_48540); var5++) {
            System.arraycopy(
               this.field_48536,
               var4 + var5 * class_3381.method_15616(this.field_48540),
               this.field_48537[var3][var5],
               0,
               class_3381.method_15629(this.field_48540)
            );
            class_3381.method_15625(this.field_48540).method_24171(this.field_48537[var3][var5], this.field_48542);
         }
      }
   }
}
