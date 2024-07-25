package remapped;

public class class_8084 implements Runnable {
   private static String[] field_41383;

   public class_8084(class_1637 var1, int var2, int var3, int var4, double[][][] var5) {
      this.field_41385 = var1;
      this.field_41382 = var2;
      this.field_41384 = var3;
      this.field_41387 = var4;
      this.field_41386 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_41382; var3 < this.field_41384; var3++) {
         int var4 = (class_1637.method_7338(this.field_41385) - var3) % class_1637.method_7338(this.field_41385);

         for (int var5 = 1; var5 < this.field_41387; var5++) {
            int var6 = class_1637.method_7321(this.field_41385) - var5;
            this.field_41386[var4][var6][0] = this.field_41386[var3][var5][0];
            this.field_41386[var4][var6][1] = -this.field_41386[var3][var5][1];
         }
      }
   }
}
