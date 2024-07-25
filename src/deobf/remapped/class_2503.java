package remapped;

public final class class_2503 implements Runnable {
   private static String[] field_12438;

   public class_2503(long var1, long var3, class_878 var5, long var6, long[] var8, int var9) {
      this.field_12434 = var1;
      this.field_12436 = var3;
      this.field_12440 = var5;
      this.field_12439 = var6;
      this.field_12435 = var8;
      this.field_12437 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_12434; var3 < this.field_12436; var3++) {
         this.field_12440.method_36131(this.field_12439 + var3, this.field_12435[this.field_12437 + (int)var3]);
      }
   }
}
