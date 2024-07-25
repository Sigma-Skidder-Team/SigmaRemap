package remapped;

public class class_1246 implements Runnable {
   private static String[] field_6865;

   public class_1246(class_2841 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field_6863 = var1;
      this.field_6866 = var2;
      this.field_6867 = var3;
      this.field_6864 = var4;
      this.field_6862 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_2841.method_12928(this.field_6863)];

      for (int var4 = this.field_6866; var4 < this.field_6867; var4++) {
         for (int var5 = 0; var5 < class_2841.method_12908(this.field_6863); var5++) {
            for (int var6 = 0; var6 < class_2841.method_12928(this.field_6863); var6++) {
               var3[var6] = this.field_6864[var4][var6][var5];
            }

            class_2841.method_12921(this.field_6863).method_21132(var3, this.field_6862);

            for (int var7 = 0; var7 < class_2841.method_12928(this.field_6863); var7++) {
               this.field_6864[var4][var7][var5] = var3[var7];
            }
         }
      }
   }
}
