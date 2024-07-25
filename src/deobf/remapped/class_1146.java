package remapped;

public class class_1146 implements Runnable {
   private static String[] field_6528;

   public class_1146(class_6819 var1, int var2, int var3, int var4, double[] var5) {
      this.field_6527 = var1;
      this.field_6526 = var2;
      this.field_6524 = var3;
      this.field_6529 = var4;
      this.field_6525 = var5;
   }

   @Override
   public void run() {
      int var3 = this.field_6526 + class_6819.method_31285(this.field_6527) - 1;

      for (int var4 = this.field_6524; var4 < this.field_6529; var4++) {
         int var5 = this.field_6526 + var4;
         double var6 = this.field_6525[var5];
         int var8 = var3 - var4;
         this.field_6525[var5] = this.field_6525[var8];
         this.field_6525[var8] = var6;
      }
   }
}
