package remapped;

public class class_4596 implements Runnable {
   private static String[] field_22341;

   public class_4596(class_1637 var1, int var2, int var3, int var4, int var5, double[][][] var6) {
      this.field_22342 = var1;
      this.field_22344 = var2;
      this.field_22340 = var3;
      this.field_22343 = var4;
      this.field_22346 = var5;
      this.field_22345 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_22344; var3 < this.field_22340; var3++) {
         int var4 = (class_1637.method_7338(this.field_22342) - var3) % class_1637.method_7338(this.field_22342);

         for (int var5 = 1; var5 < this.field_22343; var5++) {
            int var6 = class_1637.method_7321(this.field_22342) - var5;

            for (int var7 = 0; var7 < class_1637.method_7344(this.field_22342); var7++) {
               int var8 = 2 * var7;
               int var9 = this.field_22346 - var8;
               this.field_22345[var4][var6][var9 % this.field_22346] = this.field_22345[var3][var5][var8];
               this.field_22345[var4][var6][(var9 + 1) % this.field_22346] = -this.field_22345[var3][var5][var8 + 1];
            }
         }
      }
   }
}
