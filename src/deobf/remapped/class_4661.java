package remapped;

public class class_4661 implements Runnable {
   private static String[] field_22737;

   public class_4661(class_9035 var1, int var2, int var3, int var4, double[][] var5, double[][] var6) {
      this.field_22734 = var1;
      this.field_22731 = var2;
      this.field_22733 = var3;
      this.field_22736 = var4;
      this.field_22732 = var5;
      this.field_22735 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_22731; var3 < this.field_22733; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < this.field_22736; var5++) {
            int var6 = 2 * var5;
            this.field_22732[var3][var6] = this.field_22735[var5][var4];
            this.field_22732[var3][var6 + 1] = this.field_22735[var5][var4 + 1];
         }
      }
   }
}
