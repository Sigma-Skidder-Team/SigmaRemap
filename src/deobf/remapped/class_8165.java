package remapped;

public class class_8165 implements Runnable {
   private static String[] field_41828;

   public class_8165(class_3101 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field_41825 = var1;
      this.field_41827 = var2;
      this.field_41829 = var3;
      this.field_41824 = var4;
      this.field_41826 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_3101.method_14204(this.field_41825)];

      for (int var4 = this.field_41827; var4 < this.field_41829; var4++) {
         int var5 = var4 * class_3101.method_14211(this.field_41825);

         for (int var6 = 0; var6 < class_3101.method_14191(this.field_41825); var6++) {
            for (int var7 = 0; var7 < class_3101.method_14204(this.field_41825); var7++) {
               int var8 = var5 + var7 * class_3101.method_14196(this.field_41825) + var6;
               var3[var7] = this.field_41824[var8];
            }

            class_3101.method_14199(this.field_41825).method_19197(var3, this.field_41826);

            for (int var9 = 0; var9 < class_3101.method_14204(this.field_41825); var9++) {
               int var10 = var5 + var9 * class_3101.method_14196(this.field_41825) + var6;
               this.field_41824[var10] = var3[var9];
            }
         }
      }
   }
}
