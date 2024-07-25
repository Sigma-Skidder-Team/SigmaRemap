package remapped;

public class class_9204 implements Runnable {
   private static String[] field_47087;

   public class_9204(class_3101 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field_47084 = var1;
      this.field_47086 = var2;
      this.field_47085 = var3;
      this.field_47088 = var4;
      this.field_47089 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_3101.method_14204(this.field_47084)];

      for (int var4 = this.field_47086; var4 < this.field_47085; var4++) {
         int var5 = var4 * class_3101.method_14211(this.field_47084);

         for (int var6 = 0; var6 < class_3101.method_14191(this.field_47084); var6++) {
            for (int var7 = 0; var7 < class_3101.method_14204(this.field_47084); var7++) {
               int var8 = var5 + var7 * class_3101.method_14196(this.field_47084) + var6;
               var3[var7] = this.field_47088[var8];
            }

            class_3101.method_14199(this.field_47084).method_19204(var3, this.field_47089);

            for (int var9 = 0; var9 < class_3101.method_14204(this.field_47084); var9++) {
               int var10 = var5 + var9 * class_3101.method_14196(this.field_47084) + var6;
               this.field_47088[var10] = var3[var9];
            }
         }
      }
   }
}
