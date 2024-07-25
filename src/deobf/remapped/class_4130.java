package remapped;

public class class_4130 implements Runnable {
   private static String[] field_20114;

   public class_4130(class_6842 var1, int var2, int var3, double[][] var4, boolean var5) {
      this.field_20109 = var1;
      this.field_20112 = var2;
      this.field_20113 = var3;
      this.field_20110 = var4;
      this.field_20111 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_6842.method_31358(this.field_20109)];

      for (int var4 = this.field_20112; var4 < this.field_20113; var4++) {
         for (int var5 = 0; var5 < class_6842.method_31358(this.field_20109); var5++) {
            var3[var5] = this.field_20110[var5][var4];
         }

         class_6842.method_31368(this.field_20109).method_31295(var3, this.field_20111);

         for (int var6 = 0; var6 < class_6842.method_31358(this.field_20109); var6++) {
            this.field_20110[var6][var4] = var3[var6];
         }
      }
   }
}
