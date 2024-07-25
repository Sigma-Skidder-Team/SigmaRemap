package remapped;

public class class_6305 implements Runnable {
   private static String[] field_32222;

   public class_6305(class_1637 var1, int var2, int var3, int var4, int var5, double[][][] var6) {
      this.field_32220 = var1;
      this.field_32221 = var2;
      this.field_32218 = var3;
      this.field_32219 = var4;
      this.field_32217 = var5;
      this.field_32223 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_32221; var3 < this.field_32218; var3++) {
         int var4 = (class_1637.method_7338(this.field_32220) - var3) % class_1637.method_7338(this.field_32220);

         for (int var5 = 1; var5 < this.field_32219; var5++) {
            int var6 = class_1637.method_7321(this.field_32220) - var5;

            for (int var7 = 0; var7 < class_1637.method_7344(this.field_32220); var7++) {
               int var8 = 2 * var7;
               int var9 = this.field_32217 - var8;
               this.field_32223[var4][var6][var9 % this.field_32217] = this.field_32223[var3][var5][var8];
               this.field_32223[var4][var6][(var9 + 1) % this.field_32217] = -this.field_32223[var3][var5][var8 + 1];
            }
         }
      }
   }
}
