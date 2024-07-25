package remapped;

public class class_6527 implements Runnable {
   private static String[] field_33218;

   public class_6527(class_4560 var1, int var2, int var3, float[] var4, int var5, float[] var6) {
      this.field_33213 = var1;
      this.field_33216 = var2;
      this.field_33212 = var3;
      this.field_33215 = var4;
      this.field_33217 = var5;
      this.field_33214 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_33216; var3 < this.field_33212; var3++) {
         int var4 = 2 * var3;
         float var5 = this.field_33215[this.field_33217 + var3];
         this.field_33214[var4] = class_4560.method_21141(this.field_33213)[var4] * var5;
         this.field_33214[var4 + 1] = -class_4560.method_21141(this.field_33213)[var4 + 1] * var5;
      }
   }
}
