package remapped;

public class class_5423 implements Runnable {
   private static String[] field_27624;

   public class_5423(class_3381 var1, int var2, int var3, float[][][] var4) {
      this.field_27627 = var1;
      this.field_27623 = var2;
      this.field_27626 = var3;
      this.field_27625 = var4;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * class_3381.method_15623(this.field_27627)];

      for (int var4 = this.field_27623; var4 < this.field_27626; var4++) {
         for (int var5 = 0; var5 < class_3381.method_15629(this.field_27627); var5++) {
            int var6 = 2 * var5;

            for (int var7 = 0; var7 < class_3381.method_15623(this.field_27627); var7++) {
               int var8 = 2 * var7;
               var3[var8] = this.field_27625[var7][var4][var6];
               var3[var8 + 1] = this.field_27625[var7][var4][var6 + 1];
            }

            class_3381.method_15603(this.field_27627).method_24185(var3);

            for (int var9 = 0; var9 < class_3381.method_15623(this.field_27627); var9++) {
               int var10 = 2 * var9;
               this.field_27625[var9][var4][var6] = var3[var10];
               this.field_27625[var9][var4][var6 + 1] = var3[var10 + 1];
            }
         }
      }
   }
}
