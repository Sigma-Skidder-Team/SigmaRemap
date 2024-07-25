package remapped;

public class class_794 implements Runnable {
   private static String[] field_4267;

   public class_794(class_573 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field_4264 = var1;
      this.field_4265 = var2;
      this.field_4266 = var3;
      this.field_4268 = var4;
      this.field_4269 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_4265; var3 < this.field_4266; var3++) {
         for (int var4 = 0; var4 < class_573.method_2721(this.field_4264); var4++) {
            class_573.method_2736(this.field_4264).method_44816(this.field_4268[var3][var4], this.field_4269);
         }
      }
   }
}
