package remapped;

public class class_6252 implements Runnable {
   private static String[] field_31970;

   public class_6252(class_2841 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field_31973 = var1;
      this.field_31968 = var2;
      this.field_31972 = var3;
      this.field_31971 = var4;
      this.field_31969 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_2841.method_12928(this.field_31973)];

      for (int var4 = this.field_31968; var4 < this.field_31972; var4++) {
         int var5 = var4 * class_2841.method_12913(this.field_31973);

         for (int var6 = 0; var6 < class_2841.method_12908(this.field_31973); var6++) {
            for (int var7 = 0; var7 < class_2841.method_12928(this.field_31973); var7++) {
               int var8 = var5 + var7 * class_2841.method_12922(this.field_31973) + var6;
               var3[var7] = this.field_31971[var8];
            }

            class_2841.method_12921(this.field_31973).method_21140(var3, this.field_31969);

            for (int var9 = 0; var9 < class_2841.method_12928(this.field_31973); var9++) {
               int var10 = var5 + var9 * class_2841.method_12922(this.field_31973) + var6;
               this.field_31971[var10] = var3[var9];
            }
         }
      }
   }
}
