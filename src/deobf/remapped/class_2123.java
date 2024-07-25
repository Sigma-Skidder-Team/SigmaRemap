package remapped;

public class class_2123 implements Runnable {
   private static String[] field_10641;

   public class_2123(class_7380 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field_10639 = var1;
      this.field_10636 = var2;
      this.field_10638 = var3;
      this.field_10640 = var4;
      this.field_10637 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_10636; var3 < this.field_10638; var3++) {
         class_7380.method_33625(this.field_10639).method_31282(this.field_10640, var3 * class_7380.method_33621(this.field_10639), this.field_10637);
      }
   }
}
