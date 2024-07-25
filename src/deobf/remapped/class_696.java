package remapped;

public class class_696 implements Runnable {
   private static String[] field_3808;

   public class_696(class_5519 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field_3807 = var1;
      this.field_3810 = var2;
      this.field_3811 = var3;
      this.field_3812 = var4;
      this.field_3809 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_5519.method_24995(this.field_3807)];

      for (int var4 = this.field_3810; var4 < this.field_3811; var4++) {
         for (int var5 = 0; var5 < class_5519.method_24995(this.field_3807); var5++) {
            var3[var5] = this.field_3812[var5 * class_5519.method_24997(this.field_3807) + var4];
         }

         class_5519.method_24990(this.field_3807).method_19204(var3, this.field_3809);

         for (int var6 = 0; var6 < class_5519.method_24995(this.field_3807); var6++) {
            this.field_3812[var6 * class_5519.method_24997(this.field_3807) + var4] = var3[var6];
         }
      }
   }
}
