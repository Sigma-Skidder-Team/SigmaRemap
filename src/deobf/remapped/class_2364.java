package remapped;

public class class_2364 implements Runnable {
   private static String[] field_11853;

   public class_2364(class_3281 var1, int var2, int var3, int var4, int var5, double[] var6) {
      this.field_11849 = var1;
      this.field_11852 = var2;
      this.field_11848 = var3;
      this.field_11854 = var4;
      this.field_11851 = var5;
      this.field_11850 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_11852; var3 < this.field_11848; var3++) {
         int var4 = 2 * var3;
         int var5 = this.field_11854 + (this.field_11851 - var4) % this.field_11851;
         this.field_11850[var5] = this.field_11850[this.field_11854 + var4];
         this.field_11850[var5 + 1] = -this.field_11850[this.field_11854 + var4 + 1];
      }
   }
}
