package remapped;

public class class_7155 implements Runnable {
   private static String[] field_36848;

   public class_7155(class_6819 var1, int var2, int var3, int var4, double[] var5) {
      this.field_36851 = var1;
      this.field_36850 = var2;
      this.field_36849 = var3;
      this.field_36853 = var4;
      this.field_36852 = var5;
   }

   @Override
   public void run() {
      int var3 = this.field_36850 + class_6819.method_31285(this.field_36851) - 1;

      for (int var4 = this.field_36849; var4 < this.field_36853; var4++) {
         int var5 = this.field_36850 + var4;
         double var6 = this.field_36852[var5];
         int var8 = var3 - var4;
         this.field_36852[var5] = this.field_36852[var8];
         this.field_36852[var8] = var6;
      }
   }
}
