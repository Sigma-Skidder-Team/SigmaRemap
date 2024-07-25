package remapped;

public class class_5394 implements Runnable {
   private static String[] field_27532;

   public class_5394(class_573 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field_27530 = var1;
      this.field_27534 = var2;
      this.field_27533 = var3;
      this.field_27529 = var4;
      this.field_27531 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_573.method_2721(this.field_27530)];

      for (int var4 = this.field_27534; var4 < this.field_27533; var4++) {
         int var5 = var4 * class_573.method_2737(this.field_27530);

         for (int var6 = 0; var6 < class_573.method_2730(this.field_27530); var6++) {
            for (int var7 = 0; var7 < class_573.method_2721(this.field_27530); var7++) {
               int var8 = var5 + var7 * class_573.method_2717(this.field_27530) + var6;
               var3[var7] = this.field_27529[var8];
            }

            class_573.method_2711(this.field_27530).method_44816(var3, this.field_27531);

            for (int var9 = 0; var9 < class_573.method_2721(this.field_27530); var9++) {
               int var10 = var5 + var9 * class_573.method_2717(this.field_27530) + var6;
               this.field_27529[var10] = var3[var9];
            }
         }
      }
   }
}
