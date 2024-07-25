package remapped;

public class class_8206 implements Runnable {
   private static String[] field_41979;

   public class_8206(class_9035 var1, int var2, int var3, double[][] var4) {
      this.field_41977 = var1;
      this.field_41981 = var2;
      this.field_41978 = var3;
      this.field_41980 = var4;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * class_9035.method_41470(this.field_41977)];

      for (int var4 = this.field_41981; var4 < this.field_41978; var4++) {
         int var5 = 2 * var4;

         for (int var6 = 0; var6 < class_9035.method_41470(this.field_41977); var6++) {
            int var7 = 2 * var6;
            var3[var7] = this.field_41980[var6][var5];
            var3[var7 + 1] = this.field_41980[var6][var5 + 1];
         }

         class_9035.method_41455(this.field_41977).method_15028(var3);

         for (int var8 = 0; var8 < class_9035.method_41470(this.field_41977); var8++) {
            int var9 = 2 * var8;
            this.field_41980[var8][var5] = var3[var9];
            this.field_41980[var8][var5 + 1] = var3[var9 + 1];
         }
      }
   }
}
