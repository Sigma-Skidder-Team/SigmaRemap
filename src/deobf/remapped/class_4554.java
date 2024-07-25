package remapped;

public final class class_4554 implements Runnable {
   private static String[] field_22197;

   public class_4554(long var1, long var3, class_7210 var5, long var6, short[] var8, int var9) {
      this.field_22194 = var1;
      this.field_22199 = var3;
      this.field_22195 = var5;
      this.field_22200 = var6;
      this.field_22198 = var8;
      this.field_22196 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_22194; var3 < this.field_22199; var3++) {
         this.field_22195.method_36086(this.field_22200 + var3, this.field_22198[this.field_22196 + (int)var3]);
      }
   }
}
