package remapped;

public class class_2665 implements Runnable {
   private static String[] field_13112;

   public class_2665(class_3381 var1, int var2, int var3, int var4, float[][][] var5, float[] var6, int var7, int var8) {
      this.field_13111 = var1;
      this.field_13114 = var2;
      this.field_13109 = var3;
      this.field_13113 = var4;
      this.field_13116 = var5;
      this.field_13110 = var6;
      this.field_13108 = var7;
      this.field_13115 = var8;
   }

   @Override
   public void run() {
      for (int var3 = this.field_13114; var3 < this.field_13109; var3++) {
         int var4 = var3 * this.field_13113;

         for (int var5 = 0; var5 < class_3381.method_15581(this.field_13111); var5++) {
            System.arraycopy(this.field_13116[var3][var5], 0, this.field_13110, var4 + var5 * this.field_13108, this.field_13115);
         }
      }
   }
}
