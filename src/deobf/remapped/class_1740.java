package remapped;

public final class class_1740 implements Runnable {
   private static String[] field_8960;

   public class_1740(long var1, long var3, class_5260 var5, long var6, class_5260 var8, long var9) {
      this.field_8959 = var1;
      this.field_8963 = var3;
      this.field_8958 = var5;
      this.field_8962 = var6;
      this.field_8964 = var8;
      this.field_8961 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_8959; var3 < this.field_8963; var3++) {
         this.field_8958.method_36092(this.field_8962 + var3, this.field_8964.method_36079(this.field_8961 + var3));
      }
   }
}
