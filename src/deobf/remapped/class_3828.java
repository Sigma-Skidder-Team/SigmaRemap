package remapped;

public class class_3828 implements Runnable {
   private static String[] field_18704;

   public class_3828(class_4993 var1, int var2, int var3, float[][] var4, float[] var5) {
      this.field_18705 = var1;
      this.field_18702 = var2;
      this.field_18701 = var3;
      this.field_18703 = var4;
      this.field_18700 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_18702; var3 < this.field_18701; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < class_4993.method_22973(this.field_18705); var5++) {
            int var6 = 2 * var5;
            int var7 = var5 * class_4993.method_22972(this.field_18705) + var4;
            this.field_18703[var3][var6] = this.field_18700[var7];
            this.field_18703[var3][var6 + 1] = this.field_18700[var7 + 1];
         }

         class_4993.method_22985(this.field_18705).method_24185(this.field_18703[var3]);
      }
   }
}
