package remapped;

public class class_8738 implements Runnable {
   private static String[] field_44765;

   public class_8738(class_9035 var1, int var2, int var3, int var4, double[] var5, boolean var6) {
      this.field_44762 = var1;
      this.field_44766 = var2;
      this.field_44761 = var3;
      this.field_44763 = var4;
      this.field_44767 = var5;
      this.field_44764 = var6;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * class_9035.method_41470(this.field_44762)];

      for (int var4 = this.field_44766; var4 < this.field_44761; var4++) {
         int var5 = 2 * var4;

         for (int var6 = 0; var6 < class_9035.method_41470(this.field_44762); var6++) {
            int var7 = 2 * var6;
            int var8 = var6 * this.field_44763 + var5;
            var3[var7] = this.field_44767[var8];
            var3[var7 + 1] = this.field_44767[var8 + 1];
         }

         class_9035.method_41455(this.field_44762).method_15036(var3, this.field_44764);

         for (int var9 = 0; var9 < class_9035.method_41470(this.field_44762); var9++) {
            int var10 = 2 * var9;
            int var11 = var9 * this.field_44763 + var5;
            this.field_44767[var11] = var3[var10];
            this.field_44767[var11 + 1] = var3[var10 + 1];
         }
      }
   }
}
