package remapped;

public class class_3502 implements Runnable {
   private static String[] field_17175;

   public class_3502(class_9035 var1, int var2, int var3, int var4, double[][] var5, double[][] var6) {
      this.field_17170 = var1;
      this.field_17174 = var2;
      this.field_17172 = var3;
      this.field_17171 = var4;
      this.field_17169 = var5;
      this.field_17173 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_17174; var3 < this.field_17172; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < this.field_17171; var5++) {
            int var6 = 2 * var5;
            this.field_17169[var3][var6] = this.field_17173[var5][var4];
            this.field_17169[var3][var6 + 1] = this.field_17173[var5][var4 + 1];
         }
      }
   }
}
