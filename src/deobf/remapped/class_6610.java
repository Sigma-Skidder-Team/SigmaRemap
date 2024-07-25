package remapped;

public class class_6610 implements Runnable {
   private static String[] field_34158;

   public class_6610(class_3101 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field_34161 = var1;
      this.field_34159 = var2;
      this.field_34156 = var3;
      this.field_34160 = var4;
      this.field_34157 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_3101.method_14204(this.field_34161)];

      for (int var4 = this.field_34159; var4 < this.field_34156; var4++) {
         for (int var5 = 0; var5 < class_3101.method_14191(this.field_34161); var5++) {
            for (int var6 = 0; var6 < class_3101.method_14204(this.field_34161); var6++) {
               var3[var6] = this.field_34160[var4][var6][var5];
            }

            class_3101.method_14199(this.field_34161).method_19197(var3, this.field_34157);

            for (int var7 = 0; var7 < class_3101.method_14204(this.field_34161); var7++) {
               this.field_34160[var4][var7][var5] = var3[var7];
            }
         }
      }
   }
}
