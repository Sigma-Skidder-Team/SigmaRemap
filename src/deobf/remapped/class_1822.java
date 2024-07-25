package remapped;

public class class_1822 implements Runnable {
   private static String[] field_9251;

   public class_1822(class_5519 var1, int var2, int var3, float[][] var4, boolean var5) {
      this.field_9252 = var1;
      this.field_9248 = var2;
      this.field_9249 = var3;
      this.field_9247 = var4;
      this.field_9250 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_5519.method_24995(this.field_9252)];

      for (int var4 = this.field_9248; var4 < this.field_9249; var4++) {
         for (int var5 = 0; var5 < class_5519.method_24995(this.field_9252); var5++) {
            var3[var5] = this.field_9247[var5][var4];
         }

         class_5519.method_24990(this.field_9252).method_19204(var3, this.field_9250);

         for (int var6 = 0; var6 < class_5519.method_24995(this.field_9252); var6++) {
            this.field_9247[var6][var4] = var3[var6];
         }
      }
   }
}
