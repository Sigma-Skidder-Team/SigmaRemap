package remapped;

public class class_4366 implements Runnable {
   private static String[] field_21398;

   public class_4366(class_3381 var1, int var2, int var3, float[][][] var4) {
      this.field_21400 = var1;
      this.field_21401 = var2;
      this.field_21399 = var3;
      this.field_21402 = var4;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * class_3381.method_15581(this.field_21400)];

      for (int var4 = this.field_21401; var4 < this.field_21399; var4++) {
         for (int var5 = 0; var5 < class_3381.method_15629(this.field_21400); var5++) {
            int var6 = 2 * var5;

            for (int var7 = 0; var7 < class_3381.method_15581(this.field_21400); var7++) {
               int var8 = 2 * var7;
               var3[var8] = this.field_21402[var4][var7][var6];
               var3[var8 + 1] = this.field_21402[var4][var7][var6 + 1];
            }

            class_3381.method_15639(this.field_21400).method_24185(var3);

            for (int var9 = 0; var9 < class_3381.method_15581(this.field_21400); var9++) {
               int var10 = 2 * var9;
               this.field_21402[var4][var9][var6] = var3[var10];
               this.field_21402[var4][var9][var6 + 1] = var3[var10 + 1];
            }
         }
      }
   }
}
