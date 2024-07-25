package remapped;

public class class_3703 implements Runnable {
   private static String[] field_18168;

   public class_3703(class_2841 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field_18170 = var1;
      this.field_18169 = var2;
      this.field_18171 = var3;
      this.field_18173 = var4;
      this.field_18172 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_2841.method_12914(this.field_18170)];

      for (int var4 = this.field_18169; var4 < this.field_18171; var4++) {
         for (int var5 = 0; var5 < class_2841.method_12908(this.field_18170); var5++) {
            for (int var6 = 0; var6 < class_2841.method_12914(this.field_18170); var6++) {
               var3[var6] = this.field_18173[var6][var4][var5];
            }

            class_2841.method_12933(this.field_18170).method_21132(var3, this.field_18172);

            for (int var7 = 0; var7 < class_2841.method_12914(this.field_18170); var7++) {
               this.field_18173[var7][var4][var5] = var3[var7];
            }
         }
      }
   }
}
