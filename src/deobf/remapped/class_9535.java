package remapped;

public class class_9535 implements Runnable {
   private static String[] field_48528;

   public class_9535(class_5519 var1, int var2, int var3, float[][] var4, boolean var5) {
      this.field_48526 = var1;
      this.field_48527 = var2;
      this.field_48524 = var3;
      this.field_48523 = var4;
      this.field_48525 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_5519.method_24995(this.field_48526)];

      for (int var4 = this.field_48527; var4 < this.field_48524; var4++) {
         for (int var5 = 0; var5 < class_5519.method_24995(this.field_48526); var5++) {
            var3[var5] = this.field_48523[var5][var4];
         }

         class_5519.method_24990(this.field_48526).method_19197(var3, this.field_48525);

         for (int var6 = 0; var6 < class_5519.method_24995(this.field_48526); var6++) {
            this.field_48523[var6][var4] = var3[var6];
         }
      }
   }
}
