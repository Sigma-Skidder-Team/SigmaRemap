package remapped;

public class class_8324 implements Runnable {
   private static String[] field_42631;

   public class_8324(class_2817 var1, int var2, int var3, float[][] var4) {
      this.field_42630 = var1;
      this.field_42632 = var2;
      this.field_42633 = var3;
      this.field_42634 = var4;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_2817.method_12821(this.field_42630)];

      for (int var4 = this.field_42632; var4 < this.field_42633; var4++) {
         for (int var5 = 0; var5 < class_2817.method_12821(this.field_42630); var5++) {
            var3[var5] = this.field_42634[var5][var4];
         }

         class_2817.method_12837(this.field_42630).method_17785(var3);

         for (int var6 = 0; var6 < class_2817.method_12821(this.field_42630); var6++) {
            this.field_42634[var6][var4] = var3[var6];
         }
      }
   }
}
