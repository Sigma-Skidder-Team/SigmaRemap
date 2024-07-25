package remapped;

public class class_8673 implements Runnable {
   private static String[] field_44526;

   public class_8673(class_7963 var1, int var2, int var3, double[][] var4, boolean var5) {
      this.field_44522 = var1;
      this.field_44523 = var2;
      this.field_44521 = var3;
      this.field_44525 = var4;
      this.field_44524 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_7963.method_36040(this.field_44522)];

      for (int var4 = this.field_44523; var4 < this.field_44521; var4++) {
         for (int var5 = 0; var5 < class_7963.method_36040(this.field_44522); var5++) {
            var3[var5] = this.field_44525[var5][var4];
         }

         class_7963.method_36041(this.field_44522).method_44821(var3, this.field_44524);

         for (int var6 = 0; var6 < class_7963.method_36040(this.field_44522); var6++) {
            this.field_44525[var6][var4] = var3[var6];
         }
      }
   }
}
