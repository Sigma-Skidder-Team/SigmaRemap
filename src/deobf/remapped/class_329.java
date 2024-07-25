package remapped;

public class class_329 implements Runnable {
   private static String[] field_1239;

   public class_329(class_3381 var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
      this.field_1236 = var1;
      this.field_1233 = var2;
      this.field_1235 = var3;
      this.field_1237 = var4;
      this.field_1234 = var5;
      this.field_1232 = var6;
      this.field_1238 = var7;
   }

   @Override
   public void run() {
      for (int var3 = this.field_1233; var3 < this.field_1235; var3++) {
         int var4 = (class_3381.method_15623(this.field_1236) - var3) % class_3381.method_15623(this.field_1236) * this.field_1237;
         int var5 = var3 * this.field_1237;

         for (int var6 = 0; var6 < class_3381.method_15581(this.field_1236); var6++) {
            int var7 = (class_3381.method_15581(this.field_1236) - var6) % class_3381.method_15581(this.field_1236) * this.field_1234;
            int var8 = var6 * this.field_1234;

            for (byte var9 = 1; var9 < class_3381.method_15629(this.field_1236); var9 += 2) {
               int var10 = var4 + var7 + this.field_1232 - var9;
               int var11 = var5 + var8 + var9;
               this.field_1238[var10] = -this.field_1238[var11 + 2];
               this.field_1238[var10 - 1] = this.field_1238[var11 + 1];
            }
         }
      }
   }
}
