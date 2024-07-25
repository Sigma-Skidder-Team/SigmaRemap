package remapped;

public class class_7132 implements Runnable {
   private static String[] field_36745;

   public class_7132(class_3101 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field_36747 = var1;
      this.field_36746 = var2;
      this.field_36744 = var3;
      this.field_36748 = var4;
      this.field_36743 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_3101.method_14192(this.field_36747)];

      for (int var4 = this.field_36746; var4 < this.field_36744; var4++) {
         int var5 = var4 * class_3101.method_14196(this.field_36747);

         for (int var6 = 0; var6 < class_3101.method_14191(this.field_36747); var6++) {
            for (int var7 = 0; var7 < class_3101.method_14192(this.field_36747); var7++) {
               int var8 = var7 * class_3101.method_14211(this.field_36747) + var5 + var6;
               var3[var7] = this.field_36748[var8];
            }

            class_3101.method_14200(this.field_36747).method_19197(var3, this.field_36743);

            for (int var9 = 0; var9 < class_3101.method_14192(this.field_36747); var9++) {
               int var10 = var9 * class_3101.method_14211(this.field_36747) + var5 + var6;
               this.field_36748[var10] = var3[var9];
            }
         }
      }
   }
}
