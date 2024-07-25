package remapped;

public class class_294 implements Runnable {
   private static String[] field_1069;

   public class_294(class_3381 var1, int var2, int var3, int var4, float[][][] var5, float[] var6, int var7, int var8) {
      this.field_1075 = var1;
      this.field_1074 = var2;
      this.field_1070 = var3;
      this.field_1072 = var4;
      this.field_1071 = var5;
      this.field_1068 = var6;
      this.field_1067 = var7;
      this.field_1073 = var8;
   }

   @Override
   public void run() {
      for (int var3 = this.field_1074; var3 < this.field_1070; var3++) {
         int var4 = var3 * this.field_1072;

         for (int var5 = 0; var5 < class_3381.method_15581(this.field_1075); var5++) {
            System.arraycopy(this.field_1071[var3][var5], 0, this.field_1068, var4 + var5 * this.field_1067, this.field_1073);
         }
      }
   }
}
