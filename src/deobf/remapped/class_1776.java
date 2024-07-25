package remapped;

public class class_1776 implements Runnable {
   private static String[] field_9098;

   public class_1776(class_3381 var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
      this.field_9097 = var1;
      this.field_9095 = var2;
      this.field_9101 = var3;
      this.field_9102 = var4;
      this.field_9096 = var5;
      this.field_9099 = var6;
      this.field_9100 = var7;
   }

   @Override
   public void run() {
      for (int var3 = this.field_9095; var3 < this.field_9101; var3++) {
         int var4 = (class_3381.method_15623(this.field_9097) - var3) % class_3381.method_15623(this.field_9097) * this.field_9102;
         int var5 = var3 * this.field_9102;

         for (int var6 = 1; var6 < this.field_9096; var6++) {
            int var7 = var5 + (class_3381.method_15581(this.field_9097) - var6) * this.field_9099;
            int var8 = var4 + var6 * this.field_9099 + class_3381.method_15629(this.field_9097);
            int var9 = var7 + class_3381.method_15629(this.field_9097);
            int var10 = var7 + 1;
            this.field_9100[var8] = this.field_9100[var10];
            this.field_9100[var9] = this.field_9100[var10];
            this.field_9100[var8 + 1] = -this.field_9100[var7];
            this.field_9100[var9 + 1] = this.field_9100[var7];
         }
      }
   }
}
