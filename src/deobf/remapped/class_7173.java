package remapped;

public class class_7173 implements Runnable {
   private static String[] field_36902;

   public class_7173(class_9035 var1, int var2, int var3, int var4, double[] var5) {
      this.field_36905 = var1;
      this.field_36903 = var2;
      this.field_36901 = var3;
      this.field_36900 = var4;
      this.field_36904 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * class_9035.method_41470(this.field_36905)];

      for (int var4 = this.field_36903; var4 < this.field_36901; var4++) {
         int var5 = 2 * var4;

         for (int var6 = 0; var6 < class_9035.method_41470(this.field_36905); var6++) {
            int var7 = 2 * var6;
            int var8 = var6 * this.field_36900 + var5;
            var3[var7] = this.field_36904[var8];
            var3[var7 + 1] = this.field_36904[var8 + 1];
         }

         class_9035.method_41455(this.field_36905).method_15028(var3);

         for (int var9 = 0; var9 < class_9035.method_41470(this.field_36905); var9++) {
            int var10 = 2 * var9;
            int var11 = var9 * this.field_36900 + var5;
            this.field_36904[var11] = var3[var10];
            this.field_36904[var11 + 1] = var3[var10 + 1];
         }
      }
   }
}
