package remapped;

public class class_951 implements Runnable {
   private static String[] field_4903;

   public class_951(class_3101 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field_4899 = var1;
      this.field_4898 = var2;
      this.field_4901 = var3;
      this.field_4900 = var4;
      this.field_4902 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_3101.method_14192(this.field_4899)];

      for (int var4 = this.field_4898; var4 < this.field_4901; var4++) {
         int var5 = var4 * class_3101.method_14196(this.field_4899);

         for (int var6 = 0; var6 < class_3101.method_14191(this.field_4899); var6++) {
            for (int var7 = 0; var7 < class_3101.method_14192(this.field_4899); var7++) {
               int var8 = var7 * class_3101.method_14211(this.field_4899) + var5 + var6;
               var3[var7] = this.field_4900[var8];
            }

            class_3101.method_14200(this.field_4899).method_19204(var3, this.field_4902);

            for (int var9 = 0; var9 < class_3101.method_14192(this.field_4899); var9++) {
               int var10 = var9 * class_3101.method_14211(this.field_4899) + var5 + var6;
               this.field_4900[var10] = var3[var9];
            }
         }
      }
   }
}
