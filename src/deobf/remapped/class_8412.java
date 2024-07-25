package remapped;

public class class_8412 implements Runnable {
   private static String[] field_43019;

   public class_8412(class_3381 var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
      this.field_43022 = var1;
      this.field_43023 = var2;
      this.field_43021 = var3;
      this.field_43020 = var4;
      this.field_43024 = var5;
      this.field_43025 = var6;
      this.field_43026 = var7;
   }

   @Override
   public void run() {
      for (int var3 = this.field_43023; var3 < this.field_43021; var3++) {
         int var4 = (class_3381.method_15623(this.field_43022) - var3) % class_3381.method_15623(this.field_43022) * this.field_43020;
         int var5 = var3 * this.field_43020;

         for (int var6 = 1; var6 < this.field_43024; var6++) {
            int var7 = var4 + (class_3381.method_15581(this.field_43022) - var6) * this.field_43025;
            int var8 = var5 + var6 * this.field_43025;
            this.field_43026[var7] = this.field_43026[var8];
            this.field_43026[var7 + 1] = -this.field_43026[var8 + 1];
         }
      }
   }
}
