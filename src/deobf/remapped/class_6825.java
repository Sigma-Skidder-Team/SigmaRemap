package remapped;

public class class_6825 implements Runnable {
   private static String[] field_35180;

   public class_6825(class_4993 var1, int var2, int var3, float[][] var4, float[][] var5) {
      this.field_35183 = var1;
      this.field_35179 = var2;
      this.field_35178 = var3;
      this.field_35182 = var4;
      this.field_35181 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_35179; var3 < this.field_35178; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < class_4993.method_22973(this.field_35183); var5++) {
            int var6 = 2 * var5;
            this.field_35182[var3][var6] = this.field_35181[var5][var4];
            this.field_35182[var3][var6 + 1] = this.field_35181[var5][var4 + 1];
         }

         class_4993.method_22985(this.field_35183).method_24185(this.field_35182[var3]);
      }
   }
}
