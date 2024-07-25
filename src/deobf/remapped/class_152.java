package remapped;

public class class_152 implements Runnable {
   private static String[] field_460;

   public class_152(class_2841 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field_457 = var1;
      this.field_459 = var2;
      this.field_462 = var3;
      this.field_458 = var4;
      this.field_461 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_2841.method_12928(this.field_457)];

      for (int var4 = this.field_459; var4 < this.field_462; var4++) {
         for (int var5 = 0; var5 < class_2841.method_12908(this.field_457); var5++) {
            for (int var6 = 0; var6 < class_2841.method_12928(this.field_457); var6++) {
               var3[var6] = this.field_458[var4][var6][var5];
            }

            class_2841.method_12921(this.field_457).method_21140(var3, this.field_461);

            for (int var7 = 0; var7 < class_2841.method_12928(this.field_457); var7++) {
               this.field_458[var4][var7][var5] = var3[var7];
            }
         }
      }
   }
}
