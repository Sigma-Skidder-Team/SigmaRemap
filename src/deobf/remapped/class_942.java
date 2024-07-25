package remapped;

public class class_942 implements Runnable {
   private static String[] field_4805;

   public class_942(class_3803 var1, int var2, int var3, float[][][] var4) {
      this.field_4809 = var1;
      this.field_4808 = var2;
      this.field_4807 = var3;
      this.field_4806 = var4;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_3803.method_17688(this.field_4809)];

      for (int var4 = this.field_4808; var4 < this.field_4807; var4++) {
         for (int var5 = 0; var5 < class_3803.method_17715(this.field_4809); var5++) {
            for (int var6 = 0; var6 < class_3803.method_17688(this.field_4809); var6++) {
               var3[var6] = this.field_4806[var6][var4][var5];
            }

            class_3803.method_17699(this.field_4809).method_17785(var3);

            for (int var7 = 0; var7 < class_3803.method_17688(this.field_4809); var7++) {
               this.field_4806[var7][var4][var5] = var3[var7];
            }
         }
      }
   }
}
