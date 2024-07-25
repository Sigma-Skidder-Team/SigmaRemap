package remapped;

public final class class_3345 implements Runnable {
   private static String[] field_16499;

   public class_3345(int var1, int var2, double[] var3, double var4) {
      this.field_16501 = var1;
      this.field_16497 = var2;
      this.field_16500 = var3;
      this.field_16498 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field_16501; var3 < this.field_16497; var3++) {
         this.field_16500[var3] = this.field_16500[var3] * this.field_16498;
      }
   }
}
