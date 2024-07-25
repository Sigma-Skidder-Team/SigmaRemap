package remapped;

public class class_771 implements Runnable {
   private static String[] field_4168;

   public class_771(class_4993 var1, int var2, int var3, int var4, int var5, float[] var6, float[][] var7) {
      this.field_4164 = var1;
      this.field_4166 = var2;
      this.field_4167 = var3;
      this.field_4170 = var4;
      this.field_4165 = var5;
      this.field_4171 = var6;
      this.field_4169 = var7;
   }

   @Override
   public void run() {
      for (int var3 = this.field_4166; var3 < this.field_4167; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < this.field_4170; var5++) {
            int var6 = 2 * var5;
            int var7 = var3 * this.field_4165 + var6;
            this.field_4171[var7] = this.field_4169[var5][var4];
            this.field_4171[var7 + 1] = this.field_4169[var5][var4 + 1];
         }
      }
   }
}
