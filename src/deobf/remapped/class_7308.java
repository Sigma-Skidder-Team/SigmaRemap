package remapped;

public class class_7308 implements Runnable {
   private static String[] field_37367;

   public class_7308(class_3803 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field_37363 = var1;
      this.field_37364 = var2;
      this.field_37365 = var3;
      this.field_37366 = var4;
      this.field_37368 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_3803.method_17681(this.field_37363)];

      for (int var4 = this.field_37364; var4 < this.field_37365; var4++) {
         int var5 = var4 * class_3803.method_17689(this.field_37363);

         for (int var6 = 0; var6 < class_3803.method_17715(this.field_37363); var6++) {
            for (int var7 = 0; var7 < class_3803.method_17681(this.field_37363); var7++) {
               int var8 = var5 + var7 * class_3803.method_17685(this.field_37363) + var6;
               var3[var7] = this.field_37366[var8];
            }

            class_3803.method_17714(this.field_37363).method_17790(var3, this.field_37368);

            for (int var9 = 0; var9 < class_3803.method_17681(this.field_37363); var9++) {
               int var10 = var5 + var9 * class_3803.method_17685(this.field_37363) + var6;
               this.field_37366[var10] = var3[var9];
            }
         }
      }
   }
}
