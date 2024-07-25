package remapped;

public class class_1265 implements Runnable {
   private static String[] field_6963;

   public class_1265(class_2841 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field_6960 = var1;
      this.field_6962 = var2;
      this.field_6959 = var3;
      this.field_6961 = var4;
      this.field_6964 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_2841.method_12914(this.field_6960)];

      for (int var4 = this.field_6962; var4 < this.field_6959; var4++) {
         int var5 = var4 * class_2841.method_12922(this.field_6960);

         for (int var6 = 0; var6 < class_2841.method_12908(this.field_6960); var6++) {
            for (int var7 = 0; var7 < class_2841.method_12914(this.field_6960); var7++) {
               int var8 = var7 * class_2841.method_12913(this.field_6960) + var5 + var6;
               var3[var7] = this.field_6961[var8];
            }

            class_2841.method_12933(this.field_6960).method_21132(var3, this.field_6964);

            for (int var9 = 0; var9 < class_2841.method_12914(this.field_6960); var9++) {
               int var10 = var9 * class_2841.method_12913(this.field_6960) + var5 + var6;
               this.field_6961[var10] = var3[var9];
            }
         }
      }
   }
}
