package remapped;

public class class_638 implements Runnable {
   private static String[] field_3583;

   public class_638(class_5298 var1, int var2, int var3, int var4, int var5, float[] var6, float[] var7) {
      this.field_3586 = var1;
      this.field_3585 = var2;
      this.field_3580 = var3;
      this.field_3579 = var4;
      this.field_3581 = var5;
      this.field_3584 = var6;
      this.field_3582 = var7;
   }

   @Override
   public void run() {
      if (this.field_3585 <= 0) {
         for (int var3 = this.field_3580; var3 < this.field_3579; var3++) {
            int var4 = 2 * var3;
            int var5 = var4 + 1;
            int var6 = this.field_3581 + var3;
            this.field_3584[var4] = this.field_3582[var6] * class_5298.method_24225(this.field_3586)[var4];
            this.field_3584[var5] = -this.field_3582[var6] * class_5298.method_24225(this.field_3586)[var5];
         }
      } else {
         for (int var7 = this.field_3580; var7 < this.field_3579; var7++) {
            int var8 = 2 * var7;
            int var9 = var8 + 1;
            int var10 = this.field_3581 + var7;
            this.field_3584[var8] = this.field_3582[var10] * class_5298.method_24225(this.field_3586)[var8];
            this.field_3584[var9] = this.field_3582[var10] * class_5298.method_24225(this.field_3586)[var9];
         }
      }
   }
}
