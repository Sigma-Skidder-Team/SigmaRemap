package remapped;

public class class_925 implements Runnable {
   private static String[] field_4750;

   public class_925(class_9035 var1, int var2, int var3, int var4, int var5, double[] var6) {
      this.field_4754 = var1;
      this.field_4753 = var2;
      this.field_4751 = var3;
      this.field_4756 = var4;
      this.field_4755 = var5;
      this.field_4752 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_4753; var3 < this.field_4751; var3++) {
         int var4 = var3 * this.field_4756;
         int var5 = (class_9035.method_41470(this.field_4754) - var3 + 1) * this.field_4756;

         for (int var6 = this.field_4755; var6 < class_9035.method_41431(this.field_4754); var6++) {
            int var7 = 2 * var6;
            int var8 = 2 * (class_9035.method_41431(this.field_4754) - var6);
            this.field_4752[var7] = this.field_4752[var8];
            this.field_4752[var7 + 1] = -this.field_4752[var8 + 1];
            int var9 = var4 + var7;
            int var10 = var5 - var7;
            this.field_4752[var9] = this.field_4752[var10];
            this.field_4752[var9 + 1] = -this.field_4752[var10 + 1];
         }
      }
   }
}
