package remapped;

public class class_5623 implements Runnable {
   private static String[] field_28535;

   public class_5623(class_9035 var1, int var2, int var3, double[][] var4, double[] var5, boolean var6) {
      this.field_28539 = var1;
      this.field_28537 = var2;
      this.field_28541 = var3;
      this.field_28538 = var4;
      this.field_28540 = var5;
      this.field_28536 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_28537; var3 < this.field_28541; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < class_9035.method_41470(this.field_28539); var5++) {
            int var6 = 2 * var5;
            int var7 = var5 * class_9035.method_41431(this.field_28539) + var4;
            this.field_28538[var3][var6] = this.field_28540[var7];
            this.field_28538[var3][var6 + 1] = this.field_28540[var7 + 1];
         }

         class_9035.method_41455(this.field_28539).method_15036(this.field_28538[var3], this.field_28536);
      }
   }
}
