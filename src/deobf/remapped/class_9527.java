package remapped;

public class class_9527 implements Runnable {
   private static String[] field_48492;

   public class_9527(class_1637 var1, int var2, int var3, int var4, double[][][] var5, double[] var6, int var7, int var8) {
      this.field_48485 = var1;
      this.field_48489 = var2;
      this.field_48491 = var3;
      this.field_48486 = var4;
      this.field_48488 = var5;
      this.field_48493 = var6;
      this.field_48490 = var7;
      this.field_48487 = var8;
   }

   @Override
   public void run() {
      for (int var3 = this.field_48489; var3 < this.field_48491; var3++) {
         int var4 = var3 * this.field_48486;

         for (int var5 = 0; var5 < class_1637.method_7321(this.field_48485); var5++) {
            System.arraycopy(this.field_48488[var3][var5], 0, this.field_48493, var4 + var5 * this.field_48490, this.field_48487);
         }
      }
   }
}
