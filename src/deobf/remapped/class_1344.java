package remapped;

public class class_1344 implements Runnable {
   private static String[] field_7342;

   public class_1344(class_573 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field_7337 = var1;
      this.field_7338 = var2;
      this.field_7339 = var3;
      this.field_7341 = var4;
      this.field_7340 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_573.method_2721(this.field_7337)];

      for (int var4 = this.field_7338; var4 < this.field_7339; var4++) {
         for (int var5 = 0; var5 < class_573.method_2730(this.field_7337); var5++) {
            for (int var6 = 0; var6 < class_573.method_2721(this.field_7337); var6++) {
               var3[var6] = this.field_7341[var4][var6][var5];
            }

            class_573.method_2711(this.field_7337).method_44821(var3, this.field_7340);

            for (int var7 = 0; var7 < class_573.method_2721(this.field_7337); var7++) {
               this.field_7341[var4][var7][var5] = var3[var7];
            }
         }
      }
   }
}
