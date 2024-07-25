package remapped;

public class class_2211 implements Runnable {
   private static String[] field_11072;

   public class_2211(class_7963 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field_11076 = var1;
      this.field_11073 = var2;
      this.field_11074 = var3;
      this.field_11075 = var4;
      this.field_11071 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_7963.method_36040(this.field_11076)];

      for (int var4 = this.field_11073; var4 < this.field_11074; var4++) {
         for (int var5 = 0; var5 < class_7963.method_36040(this.field_11076); var5++) {
            var3[var5] = this.field_11075[var5 * class_7963.method_36038(this.field_11076) + var4];
         }

         class_7963.method_36041(this.field_11076).method_44821(var3, this.field_11071);

         for (int var6 = 0; var6 < class_7963.method_36040(this.field_11076); var6++) {
            this.field_11075[var6 * class_7963.method_36038(this.field_11076) + var4] = var3[var6];
         }
      }
   }
}
