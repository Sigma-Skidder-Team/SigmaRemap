package remapped;

public class class_9509 implements Runnable {
   private static String[] field_48413;

   public class_9509(class_6056 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field_48416 = var1;
      this.field_48412 = var2;
      this.field_48411 = var3;
      this.field_48414 = var4;
      this.field_48415 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[class_6056.method_27671(this.field_48416)];

      for (int var4 = this.field_48412; var4 < this.field_48411; var4++) {
         int var5 = var4 * class_6056.method_27661(this.field_48416);

         for (int var6 = 0; var6 < class_6056.method_27666(this.field_48416); var6++) {
            for (int var7 = 0; var7 < class_6056.method_27671(this.field_48416); var7++) {
               int var8 = var7 * class_6056.method_27649(this.field_48416) + var5 + var6;
               var3[var7] = this.field_48414[var8];
            }

            class_6056.method_27659(this.field_48416).method_31283(var3, this.field_48415);

            for (int var9 = 0; var9 < class_6056.method_27671(this.field_48416); var9++) {
               int var10 = var9 * class_6056.method_27649(this.field_48416) + var5 + var6;
               this.field_48414[var10] = var3[var9];
            }
         }
      }
   }
}
