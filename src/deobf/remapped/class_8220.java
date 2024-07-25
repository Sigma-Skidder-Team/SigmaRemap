package remapped;

public class class_8220 implements Runnable {
   private static String[] field_42059;

   public class_8220(class_5298 var1, int var2, int var3, float[] var4) {
      this.field_42055 = var1;
      this.field_42057 = var2;
      this.field_42058 = var3;
      this.field_42056 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field_42057; var3 < this.field_42058; var3++) {
         int var4 = 2 * var3;
         int var5 = var4 + 1;
         float var6 = -this.field_42056[var4] * class_5298.method_24208(this.field_42055)[var5]
            + this.field_42056[var5] * class_5298.method_24208(this.field_42055)[var4];
         this.field_42056[var4] = this.field_42056[var4] * class_5298.method_24208(this.field_42055)[var4]
            + this.field_42056[var5] * class_5298.method_24208(this.field_42055)[var5];
         this.field_42056[var5] = var6;
      }
   }
}
