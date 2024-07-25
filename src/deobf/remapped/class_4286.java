package remapped;

public class class_4286 implements Runnable {
   private static String[] field_20802;

   public class_4286(class_4993 var1, int var2, int var3, int var4, float[][] var5, float[][] var6) {
      this.field_20799 = var1;
      this.field_20798 = var2;
      this.field_20801 = var3;
      this.field_20803 = var4;
      this.field_20797 = var5;
      this.field_20800 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_20798; var3 < this.field_20801; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < this.field_20803; var5++) {
            int var6 = 2 * var5;
            this.field_20797[var3][var6] = this.field_20800[var5][var4];
            this.field_20797[var3][var6 + 1] = this.field_20800[var5][var4 + 1];
         }
      }
   }
}
