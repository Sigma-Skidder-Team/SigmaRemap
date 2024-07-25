package remapped;

public class class_6101 implements Runnable {
   private static String[] field_31223;

   public class_6101(class_8751 var1, int var2, int var3, float[][] var4, boolean var5) {
      this.field_31221 = var1;
      this.field_31225 = var2;
      this.field_31226 = var3;
      this.field_31224 = var4;
      this.field_31222 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_8751.method_40170(this.field_31221)];

      for (int var4 = this.field_31225; var4 < this.field_31226; var4++) {
         for (int var5 = 0; var5 < class_8751.method_40170(this.field_31221); var5++) {
            var3[var5] = this.field_31224[var5][var4];
         }

         class_8751.method_40180(this.field_31221).method_21132(var3, this.field_31222);

         for (int var6 = 0; var6 < class_8751.method_40170(this.field_31221); var6++) {
            this.field_31224[var6][var4] = var3[var6];
         }
      }
   }
}
