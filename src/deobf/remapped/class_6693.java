package remapped;

public class class_6693 implements Runnable {
   private static String[] field_34579;

   public class_6693(class_5298 var1, int var2, int var3, int var4, float[] var5, int var6, float[] var7) {
      this.field_34576 = var1;
      this.field_34580 = var2;
      this.field_34574 = var3;
      this.field_34581 = var4;
      this.field_34575 = var5;
      this.field_34578 = var6;
      this.field_34577 = var7;
   }

   @Override
   public void run() {
      if (this.field_34580 <= 0) {
         for (int var3 = this.field_34574; var3 < this.field_34581; var3++) {
            int var4 = 2 * var3;
            int var5 = var4 + 1;
            this.field_34575[this.field_34578 + var4] = class_5298.method_24225(this.field_34576)[var4] * this.field_34577[var4]
               + class_5298.method_24225(this.field_34576)[var5] * this.field_34577[var5];
            this.field_34575[this.field_34578 + var5] = -class_5298.method_24225(this.field_34576)[var5] * this.field_34577[var4]
               + class_5298.method_24225(this.field_34576)[var4] * this.field_34577[var5];
         }
      } else {
         for (int var6 = this.field_34574; var6 < this.field_34581; var6++) {
            int var7 = 2 * var6;
            int var8 = var7 + 1;
            this.field_34575[this.field_34578 + var7] = class_5298.method_24225(this.field_34576)[var7] * this.field_34577[var7]
               - class_5298.method_24225(this.field_34576)[var8] * this.field_34577[var8];
            this.field_34575[this.field_34578 + var8] = class_5298.method_24225(this.field_34576)[var8] * this.field_34577[var7]
               + class_5298.method_24225(this.field_34576)[var7] * this.field_34577[var8];
         }
      }
   }
}
