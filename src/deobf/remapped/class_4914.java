package remapped;

public final class class_4914 implements Runnable {
   private static String[] field_25428;

   public class_4914(long var1, long var3, class_7210 var5, long var6, byte[] var8, int var9) {
      this.field_25431 = var1;
      this.field_25425 = var3;
      this.field_25426 = var5;
      this.field_25429 = var6;
      this.field_25430 = var8;
      this.field_25427 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_25431; var3 < this.field_25425; var3++) {
         this.field_25426.method_36117(this.field_25429 + var3, this.field_25430[this.field_25427 + (int)var3]);
      }
   }
}
