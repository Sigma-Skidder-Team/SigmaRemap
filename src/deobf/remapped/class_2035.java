package remapped;

public class class_2035 implements Runnable {
   private static String[] field_10331;

   public class_2035(class_5298 var1, int var2, int var3, int var4, int var5, float[] var6) {
      this.field_10334 = var1;
      this.field_10329 = var2;
      this.field_10332 = var3;
      this.field_10335 = var4;
      this.field_10330 = var5;
      this.field_10333 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_10329; var3 < this.field_10332; var3++) {
         int var4 = 2 * var3;
         int var5 = this.field_10335 + (this.field_10330 - var4) % this.field_10330;
         this.field_10333[var5] = this.field_10333[this.field_10335 + var4];
         this.field_10333[var5 + 1] = -this.field_10333[this.field_10335 + var4 + 1];
      }
   }
}
