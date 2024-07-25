package remapped;

public class class_5509 implements Runnable {
   private static String[] field_28061;

   public class_5509(class_3381 var1, int var2, int var3, int var4, float[][][] var5) {
      this.field_28058 = var1;
      this.field_28060 = var2;
      this.field_28056 = var3;
      this.field_28059 = var4;
      this.field_28057 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_28060; var3 < this.field_28056; var3++) {
         int var4 = (class_3381.method_15623(this.field_28058) - var3) % class_3381.method_15623(this.field_28058);

         for (int var5 = 1; var5 < this.field_28059; var5++) {
            int var6 = class_3381.method_15581(this.field_28058) - var5;
            this.field_28057[var4][var6][0] = this.field_28057[var3][var5][0];
            this.field_28057[var4][var6][1] = -this.field_28057[var3][var5][1];
         }
      }
   }
}
