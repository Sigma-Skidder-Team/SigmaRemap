package remapped;

public class class_8893 implements Runnable {
   private static String[] field_45617;

   public class_8893(class_2841 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field_45619 = var1;
      this.field_45616 = var2;
      this.field_45618 = var3;
      this.field_45620 = var4;
      this.field_45621 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_2841.method_12914(this.field_45619)];

      for (int var4 = this.field_45616; var4 < this.field_45618; var4++) {
         for (int var5 = 0; var5 < class_2841.method_12908(this.field_45619); var5++) {
            for (int var6 = 0; var6 < class_2841.method_12914(this.field_45619); var6++) {
               var3[var6] = this.field_45620[var6][var4][var5];
            }

            class_2841.method_12933(this.field_45619).method_21140(var3, this.field_45621);

            for (int var7 = 0; var7 < class_2841.method_12914(this.field_45619); var7++) {
               this.field_45620[var7][var4][var5] = var3[var7];
            }
         }
      }
   }
}
