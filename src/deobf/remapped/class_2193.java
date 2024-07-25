package remapped;

public class class_2193 implements Runnable {
   private static String[] field_10893;

   public class_2193(class_3381 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field_10892 = var1;
      this.field_10894 = var2;
      this.field_10895 = var3;
      this.field_10896 = var4;
      this.field_10897 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * class_3381.method_15623(this.field_10892)];

      for (int var4 = this.field_10894; var4 < this.field_10895; var4++) {
         for (int var5 = 0; var5 < class_3381.method_15629(this.field_10892); var5++) {
            int var6 = 2 * var5;

            for (int var7 = 0; var7 < class_3381.method_15623(this.field_10892); var7++) {
               int var8 = 2 * var7;
               var3[var8] = this.field_10896[var7][var4][var6];
               var3[var8 + 1] = this.field_10896[var7][var4][var6 + 1];
            }

            class_3381.method_15603(this.field_10892).method_24216(var3, this.field_10897);

            for (int var9 = 0; var9 < class_3381.method_15623(this.field_10892); var9++) {
               int var10 = 2 * var9;
               this.field_10896[var9][var4][var6] = var3[var10];
               this.field_10896[var9][var4][var6 + 1] = var3[var10 + 1];
            }
         }
      }
   }
}
