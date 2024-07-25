package remapped;

public final class class_8523 implements Runnable {
   private static String[] field_43624;

   public class_8523(long var1, long var3, double[] var5, int var6, class_9245 var7, long var8) {
      this.field_43621 = var1;
      this.field_43620 = var3;
      this.field_43625 = var5;
      this.field_43622 = var6;
      this.field_43623 = var7;
      this.field_43626 = var8;
   }

   @Override
   public void run() {
      double[] var3 = new double[2];

      for (long var4 = this.field_43621; var4 < this.field_43620; var4++) {
         var3[0] = this.field_43625[2 * (this.field_43622 + (int)var4)];
         var3[1] = this.field_43625[2 * (this.field_43622 + (int)var4) + 1];
         this.field_43623.method_42612(this.field_43626 + var4, var3);
      }
   }
}
