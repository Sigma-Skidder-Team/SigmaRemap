package remapped;

public class class_2752 implements Runnable {
   private static String[] field_13470;

   public class_2752(class_6056 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field_13466 = var1;
      this.field_13469 = var2;
      this.field_13467 = var3;
      this.field_13468 = var4;
      this.field_13465 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_6056.method_27660(this.field_13466)];

      for (int var4 = this.field_13469; var4 < this.field_13467; var4++) {
         int var5 = var4 * class_6056.method_27649(this.field_13466);

         for (int var6 = 0; var6 < class_6056.method_27666(this.field_13466); var6++) {
            for (int var7 = 0; var7 < class_6056.method_27660(this.field_13466); var7++) {
               int var8 = var5 + var7 * class_6056.method_27661(this.field_13466) + var6;
               var3[var7] = this.field_13468[var8];
            }

            class_6056.method_27680(this.field_13466).method_31283(var3, this.field_13465);

            for (int var9 = 0; var9 < class_6056.method_27660(this.field_13466); var9++) {
               int var10 = var5 + var9 * class_6056.method_27661(this.field_13466) + var6;
               this.field_13468[var10] = var3[var9];
            }
         }
      }
   }
}
