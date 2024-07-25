package remapped;

public class class_689 implements Runnable {
   private static String[] field_3790;

   public class_689(class_4993 var1, int var2, int var3, int var4, int var5, float[] var6) {
      this.field_3792 = var1;
      this.field_3791 = var2;
      this.field_3794 = var3;
      this.field_3793 = var4;
      this.field_3789 = var5;
      this.field_3788 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_3791; var3 < this.field_3794; var3++) {
         int var4 = var3 * this.field_3793;
         int var5 = (class_4993.method_22973(this.field_3792) - var3 + 1) * this.field_3793;

         for (int var6 = this.field_3789; var6 < class_4993.method_22972(this.field_3792); var6++) {
            int var7 = 2 * var6;
            int var8 = 2 * (class_4993.method_22972(this.field_3792) - var6);
            this.field_3788[var7] = this.field_3788[var8];
            this.field_3788[var7 + 1] = -this.field_3788[var8 + 1];
            int var9 = var4 + var7;
            int var10 = var5 - var7;
            this.field_3788[var9] = this.field_3788[var10];
            this.field_3788[var9 + 1] = -this.field_3788[var10 + 1];
         }
      }
   }
}
