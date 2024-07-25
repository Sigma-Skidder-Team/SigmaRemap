package remapped;

public class class_8643 implements Runnable {
   private static String[] field_44298;

   public class_8643(class_8751 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field_44294 = var1;
      this.field_44296 = var2;
      this.field_44295 = var3;
      this.field_44293 = var4;
      this.field_44297 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_8751.method_40170(this.field_44294)];

      for (int var4 = this.field_44296; var4 < this.field_44295; var4++) {
         for (int var5 = 0; var5 < class_8751.method_40170(this.field_44294); var5++) {
            var3[var5] = this.field_44293[var5 * class_8751.method_40179(this.field_44294) + var4];
         }

         class_8751.method_40180(this.field_44294).method_21132(var3, this.field_44297);

         for (int var6 = 0; var6 < class_8751.method_40170(this.field_44294); var6++) {
            this.field_44293[var6 * class_8751.method_40179(this.field_44294) + var4] = var3[var6];
         }
      }
   }
}
