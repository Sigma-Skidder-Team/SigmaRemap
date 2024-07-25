package remapped;

public class class_6035 implements Runnable {
   private static String[] field_30816;

   public class_6035(class_6842 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field_30821 = var1;
      this.field_30819 = var2;
      this.field_30820 = var3;
      this.field_30817 = var4;
      this.field_30818 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_6842.method_31358(this.field_30821)];

      for (int var4 = this.field_30819; var4 < this.field_30820; var4++) {
         for (int var5 = 0; var5 < class_6842.method_31358(this.field_30821); var5++) {
            var3[var5] = this.field_30817[var5 * class_6842.method_31373(this.field_30821) + var4];
         }

         class_6842.method_31368(this.field_30821).method_31295(var3, this.field_30818);

         for (int var6 = 0; var6 < class_6842.method_31358(this.field_30821); var6++) {
            this.field_30817[var6 * class_6842.method_31373(this.field_30821) + var4] = var3[var6];
         }
      }
   }
}
