package remapped;

public class class_7528 implements Runnable {
   private static String[] field_38442;

   public class_7528(class_5519 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field_38440 = var1;
      this.field_38441 = var2;
      this.field_38438 = var3;
      this.field_38439 = var4;
      this.field_38443 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_5519.method_24995(this.field_38440)];

      for (int var4 = this.field_38441; var4 < this.field_38438; var4++) {
         for (int var5 = 0; var5 < class_5519.method_24995(this.field_38440); var5++) {
            var3[var5] = this.field_38439[var5 * class_5519.method_24997(this.field_38440) + var4];
         }

         class_5519.method_24990(this.field_38440).method_19197(var3, this.field_38443);

         for (int var6 = 0; var6 < class_5519.method_24995(this.field_38440); var6++) {
            this.field_38439[var6 * class_5519.method_24997(this.field_38440) + var4] = var3[var6];
         }
      }
   }
}
