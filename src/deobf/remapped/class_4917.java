package remapped;

public class class_4917 implements Runnable {
   private static String[] field_25447;

   public class_4917(class_8751 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field_25443 = var1;
      this.field_25445 = var2;
      this.field_25448 = var3;
      this.field_25446 = var4;
      this.field_25444 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_8751.method_40170(this.field_25443)];

      for (int var4 = this.field_25445; var4 < this.field_25448; var4++) {
         for (int var5 = 0; var5 < class_8751.method_40170(this.field_25443); var5++) {
            var3[var5] = this.field_25446[var5 * class_8751.method_40179(this.field_25443) + var4];
         }

         class_8751.method_40180(this.field_25443).method_21140(var3, this.field_25444);

         for (int var6 = 0; var6 < class_8751.method_40170(this.field_25443); var6++) {
            this.field_25446[var6 * class_8751.method_40179(this.field_25443) + var4] = var3[var6];
         }
      }
   }
}
