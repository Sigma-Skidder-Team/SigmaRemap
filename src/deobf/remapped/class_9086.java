package remapped;

public class class_9086 implements Runnable {
   private static String[] field_46541;

   public class_9086(class_9035 var1, int var2, int var3, double[][] var4, double[][] var5, boolean var6) {
      this.field_46537 = var1;
      this.field_46538 = var2;
      this.field_46540 = var3;
      this.field_46535 = var4;
      this.field_46539 = var5;
      this.field_46536 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_46538; var3 < this.field_46540; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < class_9035.method_41470(this.field_46537); var5++) {
            int var6 = 2 * var5;
            this.field_46535[var3][var6] = this.field_46539[var5][var4];
            this.field_46535[var3][var6 + 1] = this.field_46539[var5][var4 + 1];
         }

         class_9035.method_41455(this.field_46537).method_15036(this.field_46535[var3], this.field_46536);
      }
   }
}
