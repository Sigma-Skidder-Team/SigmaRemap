package remapped;

public class class_8546 implements Runnable {
   private static String[] field_43739;

   public class_8546(class_3381 var1, int var2, int var3, float[][][] var4) {
      this.field_43740 = var1;
      this.field_43737 = var2;
      this.field_43741 = var3;
      this.field_43738 = var4;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * class_3381.method_15581(this.field_43740)];

      for (int var4 = this.field_43737; var4 < this.field_43741; var4++) {
         for (int var5 = 0; var5 < class_3381.method_15629(this.field_43740); var5++) {
            int var6 = 2 * var5;

            for (int var7 = 0; var7 < class_3381.method_15581(this.field_43740); var7++) {
               int var8 = 2 * var7;
               var3[var8] = this.field_43738[var4][var7][var6];
               var3[var8 + 1] = this.field_43738[var4][var7][var6 + 1];
            }

            class_3381.method_15639(this.field_43740).method_24185(var3);

            for (int var9 = 0; var9 < class_3381.method_15581(this.field_43740); var9++) {
               int var10 = 2 * var9;
               this.field_43738[var4][var9][var6] = var3[var10];
               this.field_43738[var4][var9][var6 + 1] = var3[var10 + 1];
            }
         }
      }
   }
}
