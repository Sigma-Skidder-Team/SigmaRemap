package remapped;

public class class_5164 implements Runnable {
   private static String[] field_26592;

   public class_5164(class_6842 var1, int var2, int var3, double[][] var4, boolean var5) {
      this.field_26597 = var1;
      this.field_26596 = var2;
      this.field_26594 = var3;
      this.field_26593 = var4;
      this.field_26595 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_6842.method_31358(this.field_26597)];

      for (int var4 = this.field_26596; var4 < this.field_26594; var4++) {
         for (int var5 = 0; var5 < class_6842.method_31358(this.field_26597); var5++) {
            var3[var5] = this.field_26593[var5][var4];
         }

         class_6842.method_31368(this.field_26597).method_31289(var3, this.field_26595);

         for (int var6 = 0; var6 < class_6842.method_31358(this.field_26597); var6++) {
            this.field_26593[var6][var4] = var3[var6];
         }
      }
   }
}
