package remapped;

public class class_1618 implements Runnable {
   private static String[] field_8410;

   public class_1618(class_4133 var1, int var2, int var3, int var4, float[] var5) {
      this.field_8412 = var1;
      this.field_8411 = var2;
      this.field_8413 = var3;
      this.field_8409 = var4;
      this.field_8408 = var5;
   }

   @Override
   public void run() {
      int var3 = this.field_8411 + class_4133.method_19199(this.field_8412) - 1;

      for (int var4 = this.field_8413; var4 < this.field_8409; var4++) {
         int var5 = this.field_8411 + var4;
         float var6 = this.field_8408[var5];
         int var7 = var3 - var4;
         this.field_8408[var5] = this.field_8408[var7];
         this.field_8408[var7] = var6;
      }
   }
}
