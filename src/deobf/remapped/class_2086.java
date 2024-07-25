package remapped;

public class class_2086 implements Runnable {
   private static String[] field_10490;

   public class_2086(class_3381 var1, int var2, int var3, int var4, int var5, float[] var6, boolean var7, int var8) {
      this.field_10491 = var1;
      this.field_10492 = var2;
      this.field_10486 = var3;
      this.field_10488 = var4;
      this.field_10494 = var5;
      this.field_10489 = var6;
      this.field_10487 = var7;
      this.field_10493 = var8;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field_10492];

      for (int var4 = this.field_10486; var4 >= this.field_10488; var4--) {
         int var5 = var4 * class_3381.method_15637(this.field_10491);
         int var6 = var4 * this.field_10494;

         for (int var7 = class_3381.method_15581(this.field_10491) - 1; var7 >= 0; var7--) {
            System.arraycopy(this.field_10489, var5 + var7 * class_3381.method_15616(this.field_10491), var3, 0, class_3381.method_15629(this.field_10491));
            class_3381.method_15625(this.field_10491).method_24171(var3, this.field_10487);
            System.arraycopy(var3, 0, this.field_10489, var6 + var7 * this.field_10493, this.field_10492);
         }
      }
   }
}
