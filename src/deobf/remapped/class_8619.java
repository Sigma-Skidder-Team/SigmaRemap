package remapped;

public class class_8619 implements Runnable {
   private static String[] field_44236;

   public class_8619(class_7963 var1, int var2, int var3, double[][] var4, boolean var5) {
      this.field_44231 = var1;
      this.field_44235 = var2;
      this.field_44234 = var3;
      this.field_44233 = var4;
      this.field_44232 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_7963.method_36040(this.field_44231)];

      for (int var4 = this.field_44235; var4 < this.field_44234; var4++) {
         for (int var5 = 0; var5 < class_7963.method_36040(this.field_44231); var5++) {
            var3[var5] = this.field_44233[var5][var4];
         }

         class_7963.method_36041(this.field_44231).method_44816(var3, this.field_44232);

         for (int var6 = 0; var6 < class_7963.method_36040(this.field_44231); var6++) {
            this.field_44233[var6][var4] = var3[var6];
         }
      }
   }
}
