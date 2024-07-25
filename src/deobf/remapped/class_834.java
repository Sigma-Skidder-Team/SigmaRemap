package remapped;

public final class class_834 implements Runnable {
   private static String[] field_4386;

   public class_834(long var1, long var3, class_2384 var5, long var6, class_2384 var8, long var9) {
      this.field_4383 = var1;
      this.field_4388 = var3;
      this.field_4384 = var5;
      this.field_4387 = var6;
      this.field_4385 = var8;
      this.field_4389 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_4383; var3 < this.field_4388; var3++) {
         this.field_4384.method_10884(this.field_4387 + var3, this.field_4385.method_10878(this.field_4389 + var3));
      }
   }
}
