package remapped;

public class class_2869 implements Runnable {
   private static String[] field_14058;

   public class_2869(class_573 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field_14062 = var1;
      this.field_14063 = var2;
      this.field_14059 = var3;
      this.field_14061 = var4;
      this.field_14060 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_573.method_2716(this.field_14062)];

      for (int var4 = this.field_14063; var4 < this.field_14059; var4++) {
         int var5 = var4 * class_573.method_2717(this.field_14062);

         for (int var6 = 0; var6 < class_573.method_2730(this.field_14062); var6++) {
            for (int var7 = 0; var7 < class_573.method_2716(this.field_14062); var7++) {
               int var8 = var7 * class_573.method_2737(this.field_14062) + var5 + var6;
               var3[var7] = this.field_14061[var8];
            }

            class_573.method_2710(this.field_14062).method_44816(var3, this.field_14060);

            for (int var9 = 0; var9 < class_573.method_2716(this.field_14062); var9++) {
               int var10 = var9 * class_573.method_2737(this.field_14062) + var5 + var6;
               this.field_14061[var10] = var3[var9];
            }
         }
      }
   }
}
