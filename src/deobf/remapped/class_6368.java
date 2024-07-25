package remapped;

public class class_6368 implements Runnable {
   private static String[] field_32552;

   public class_6368(class_573 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field_32551 = var1;
      this.field_32549 = var2;
      this.field_32548 = var3;
      this.field_32547 = var4;
      this.field_32550 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_573.method_2716(this.field_32551)];

      for (int var4 = this.field_32549; var4 < this.field_32548; var4++) {
         int var5 = var4 * class_573.method_2717(this.field_32551);

         for (int var6 = 0; var6 < class_573.method_2730(this.field_32551); var6++) {
            for (int var7 = 0; var7 < class_573.method_2716(this.field_32551); var7++) {
               int var8 = var7 * class_573.method_2737(this.field_32551) + var5 + var6;
               var3[var7] = this.field_32547[var8];
            }

            class_573.method_2710(this.field_32551).method_44821(var3, this.field_32550);

            for (int var9 = 0; var9 < class_573.method_2716(this.field_32551); var9++) {
               int var10 = var9 * class_573.method_2737(this.field_32551) + var5 + var6;
               this.field_32547[var10] = var3[var9];
            }
         }
      }
   }
}
