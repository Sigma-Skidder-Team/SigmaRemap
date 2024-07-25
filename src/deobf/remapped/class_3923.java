package remapped;

public final class class_3923 implements Runnable {
   private static String[] field_19060;

   public class_3923(long var1, long var3, class_8720 var5, long var6, class_8720 var8, long var9) {
      this.field_19055 = var1;
      this.field_19057 = var3;
      this.field_19059 = var5;
      this.field_19054 = var6;
      this.field_19058 = var8;
      this.field_19056 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_19055; var3 < this.field_19057; var3++) {
         this.field_19059.method_36117(this.field_19054 + var3, this.field_19058.method_36121(this.field_19056 + var3));
      }
   }
}
