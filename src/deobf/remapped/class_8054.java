package remapped;

public class class_8054 implements Runnable {
   private static String[] field_41229;

   public class_8054(class_3803 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field_41231 = var1;
      this.field_41232 = var2;
      this.field_41233 = var3;
      this.field_41230 = var4;
      this.field_41228 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_3803.method_17688(this.field_41231)];

      for (int var4 = this.field_41232; var4 < this.field_41233; var4++) {
         int var5 = var4 * class_3803.method_17685(this.field_41231);

         for (int var6 = 0; var6 < class_3803.method_17715(this.field_41231); var6++) {
            for (int var7 = 0; var7 < class_3803.method_17688(this.field_41231); var7++) {
               int var8 = var7 * class_3803.method_17689(this.field_41231) + var5 + var6;
               var3[var7] = this.field_41230[var8];
            }

            class_3803.method_17699(this.field_41231).method_17790(var3, this.field_41228);

            for (int var9 = 0; var9 < class_3803.method_17688(this.field_41231); var9++) {
               int var10 = var9 * class_3803.method_17689(this.field_41231) + var5 + var6;
               this.field_41230[var10] = var3[var9];
            }
         }
      }
   }
}
