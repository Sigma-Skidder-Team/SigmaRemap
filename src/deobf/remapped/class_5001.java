package remapped;

public class class_5001 implements Runnable {
   private static String[] field_25877;

   public class_5001(class_3281 var1, int var2, int var3, int var4, int var5, double[] var6) {
      this.field_25878 = var1;
      this.field_25881 = var2;
      this.field_25880 = var3;
      this.field_25875 = var4;
      this.field_25879 = var5;
      this.field_25876 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_25881; var3 < this.field_25880; var3++) {
         int var4 = 2 * var3;
         int var5 = this.field_25875 + (this.field_25879 - var4) % this.field_25879;
         this.field_25876[var5] = this.field_25876[this.field_25875 + var4];
         this.field_25876[var5 + 1] = -this.field_25876[this.field_25875 + var4 + 1];
      }
   }
}
