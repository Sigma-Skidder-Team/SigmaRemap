package remapped;

public final class class_639 implements Runnable {
   private static String[] field_3592;

   public class_639(long var1, long var3, class_7210 var5, long var6, class_7210 var8, long var9) {
      this.field_3588 = var1;
      this.field_3591 = var3;
      this.field_3590 = var5;
      this.field_3589 = var6;
      this.field_3593 = var8;
      this.field_3587 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_3588; var3 < this.field_3591; var3++) {
         this.field_3590.method_36117(this.field_3589 + var3, this.field_3593.method_36121(this.field_3587 + var3));
      }
   }
}
