package remapped;

public class class_3386 implements Runnable {
   private static String[] field_16687;

   public class_3386(class_4993 var1, int var2, int var3, float[][] var4, float[] var5, boolean var6) {
      this.field_16688 = var1;
      this.field_16686 = var2;
      this.field_16689 = var3;
      this.field_16685 = var4;
      this.field_16690 = var5;
      this.field_16691 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_16686; var3 < this.field_16689; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < class_4993.method_22973(this.field_16688); var5++) {
            int var6 = 2 * var5;
            int var7 = var5 * class_4993.method_22972(this.field_16688) + var4;
            this.field_16685[var3][var6] = this.field_16690[var7];
            this.field_16685[var3][var6 + 1] = this.field_16690[var7 + 1];
         }

         class_4993.method_22985(this.field_16688).method_24216(this.field_16685[var3], this.field_16691);
      }
   }
}
