package remapped;

public class class_6682 implements Runnable {
   private static String[] field_34535;

   public class_6682(class_573 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field_34537 = var1;
      this.field_34536 = var2;
      this.field_34538 = var3;
      this.field_34534 = var4;
      this.field_34539 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_34536; var3 < this.field_34538; var3++) {
         int var4 = var3 * class_573.method_2737(this.field_34537);

         for (int var5 = 0; var5 < class_573.method_2721(this.field_34537); var5++) {
            class_573.method_2736(this.field_34537).method_44820(this.field_34534, var4 + var5 * class_573.method_2717(this.field_34537), this.field_34539);
         }
      }
   }
}
