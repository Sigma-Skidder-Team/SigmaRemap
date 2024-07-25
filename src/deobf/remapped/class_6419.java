package remapped;

public class class_6419 implements Runnable {
   private static String[] field_32778;

   public class_6419(class_1637 var1, int var2, int var3, int var4, double[][][] var5) {
      this.field_32776 = var1;
      this.field_32780 = var2;
      this.field_32775 = var3;
      this.field_32777 = var4;
      this.field_32779 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_32780; var3 < this.field_32775; var3++) {
         int var4 = (class_1637.method_7338(this.field_32776) - var3) % class_1637.method_7338(this.field_32776);

         for (int var5 = 0; var5 < class_1637.method_7321(this.field_32776); var5++) {
            int var6 = (class_1637.method_7321(this.field_32776) - var5) % class_1637.method_7321(this.field_32776);

            for (byte var7 = 1; var7 < class_1637.method_7344(this.field_32776); var7 += 2) {
               int var8 = this.field_32777 - var7;
               this.field_32779[var4][var6][var8] = -this.field_32779[var3][var5][var7 + 2];
               this.field_32779[var4][var6][var8 - 1] = this.field_32779[var3][var5][var7 + 1];
            }
         }
      }
   }
}
