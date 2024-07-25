package remapped;

public class class_6309 implements Runnable {
   private static String[] field_32250;

   public class_6309(class_3381 var1, int var2, int var3, int var4, int var5, int var6, int var7, float[] var8) {
      this.field_32244 = var1;
      this.field_32243 = var2;
      this.field_32248 = var3;
      this.field_32249 = var4;
      this.field_32246 = var5;
      this.field_32245 = var6;
      this.field_32251 = var7;
      this.field_32247 = var8;
   }

   @Override
   public void run() {
      for (int var3 = this.field_32243; var3 < this.field_32248; var3++) {
         int var4 = (class_3381.method_15623(this.field_32244) - var3) % class_3381.method_15623(this.field_32244);
         int var5 = var4 * this.field_32249;
         int var6 = var3 * this.field_32249;

         for (int var7 = 1; var7 < this.field_32246; var7++) {
            int var8 = class_3381.method_15581(this.field_32244) - var7;
            int var9 = var8 * this.field_32245;
            int var10 = var7 * this.field_32245;
            int var11 = var5 + var9;

            for (int var12 = 0; var12 < class_3381.method_15629(this.field_32244); var12++) {
               int var13 = 2 * var12;
               int var14 = this.field_32251 - var13;
               int var15 = var6 + var10 + var13;
               this.field_32247[var11 + var14 % this.field_32251] = this.field_32247[var15];
               this.field_32247[var11 + (var14 + 1) % this.field_32251] = -this.field_32247[var15 + 1];
            }
         }
      }
   }
}
