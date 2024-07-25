package remapped;

public class class_7424 implements Runnable {
   private static String[] field_37887;

   public class_7424(class_8751 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field_37888 = var1;
      this.field_37886 = var2;
      this.field_37883 = var3;
      this.field_37884 = var4;
      this.field_37885 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_37886; var3 < this.field_37883; var3++) {
         class_8751.method_40165(this.field_37888).method_21131(this.field_37884, var3 * class_8751.method_40179(this.field_37888), this.field_37885);
      }
   }
}
