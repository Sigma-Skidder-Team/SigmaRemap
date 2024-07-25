package remapped;

public final class class_363 implements Runnable {
   private static String[] field_1407;

   public class_363(long var1, long var3, class_8514 var5, long var6, byte[] var8, int var9) {
      this.field_1405 = var1;
      this.field_1403 = var3;
      this.field_1404 = var5;
      this.field_1408 = var6;
      this.field_1409 = var8;
      this.field_1406 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_1405; var3 < this.field_1403; var3++) {
         this.field_1404.method_36117(this.field_1408 + var3, this.field_1409[this.field_1406 + (int)var3]);
      }
   }
}
