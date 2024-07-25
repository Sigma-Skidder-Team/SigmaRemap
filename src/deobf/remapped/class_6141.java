package remapped;

public class class_6141 implements Runnable {
   private static String[] field_31501;

   public class_6141(class_8751 var1, int var2, int var3, float[][] var4, boolean var5) {
      this.field_31497 = var1;
      this.field_31498 = var2;
      this.field_31499 = var3;
      this.field_31500 = var4;
      this.field_31502 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_8751.method_40170(this.field_31497)];

      for (int var4 = this.field_31498; var4 < this.field_31499; var4++) {
         for (int var5 = 0; var5 < class_8751.method_40170(this.field_31497); var5++) {
            var3[var5] = this.field_31500[var5][var4];
         }

         class_8751.method_40180(this.field_31497).method_21140(var3, this.field_31502);

         for (int var6 = 0; var6 < class_8751.method_40170(this.field_31497); var6++) {
            this.field_31500[var6][var4] = var3[var6];
         }
      }
   }
}
