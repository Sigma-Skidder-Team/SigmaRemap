package remapped;

public class class_7629 implements Runnable {
   private static String[] field_38823;

   public class_7629(class_6842 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field_38821 = var1;
      this.field_38824 = var2;
      this.field_38822 = var3;
      this.field_38825 = var4;
      this.field_38826 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_6842.method_31358(this.field_38821)];

      for (int var4 = this.field_38824; var4 < this.field_38822; var4++) {
         for (int var5 = 0; var5 < class_6842.method_31358(this.field_38821); var5++) {
            var3[var5] = this.field_38825[var5 * class_6842.method_31373(this.field_38821) + var4];
         }

         class_6842.method_31368(this.field_38821).method_31289(var3, this.field_38826);

         for (int var6 = 0; var6 < class_6842.method_31358(this.field_38821); var6++) {
            this.field_38825[var6 * class_6842.method_31373(this.field_38821) + var4] = var3[var6];
         }
      }
   }
}
