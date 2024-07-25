package remapped;

public class class_3477 implements Runnable {
   private static String[] field_17049;

   public class_3477(class_2817 var1, int var2, int var3, float[] var4) {
      this.field_17046 = var1;
      this.field_17050 = var2;
      this.field_17048 = var3;
      this.field_17047 = var4;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_2817.method_12821(this.field_17046)];

      for (int var4 = this.field_17050; var4 < this.field_17048; var4++) {
         for (int var5 = 0; var5 < class_2817.method_12821(this.field_17046); var5++) {
            var3[var5] = this.field_17047[var5 * class_2817.method_12836(this.field_17046) + var4];
         }

         class_2817.method_12837(this.field_17046).method_17785(var3);

         for (int var6 = 0; var6 < class_2817.method_12821(this.field_17046); var6++) {
            this.field_17047[var6 * class_2817.method_12836(this.field_17046) + var4] = var3[var6];
         }
      }
   }
}
