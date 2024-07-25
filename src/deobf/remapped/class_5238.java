package remapped;

public class class_5238 implements Runnable {
   private static String[] field_26848;

   public class_5238(class_9035 var1, int var2, int var3, int var4, double[][] var5) {
      this.field_26846 = var1;
      this.field_26851 = var2;
      this.field_26849 = var3;
      this.field_26850 = var4;
      this.field_26847 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_26851; var3 < this.field_26849; var3++) {
         int var4 = class_9035.method_41470(this.field_26846) - var3;

         for (int var5 = this.field_26850; var5 < class_9035.method_41431(this.field_26846); var5++) {
            int var6 = 2 * var5;
            int var7 = 2 * (class_9035.method_41431(this.field_26846) - var5);
            this.field_26847[0][var6] = this.field_26847[0][var7];
            this.field_26847[0][var6 + 1] = -this.field_26847[0][var7 + 1];
            this.field_26847[var3][var6] = this.field_26847[var4][var7];
            this.field_26847[var3][var6 + 1] = -this.field_26847[var4][var7 + 1];
         }
      }
   }
}
