package remapped;

public class class_4060 implements Runnable {
   private static String[] field_19777;

   public class_4060(class_7963 var1, int var2, int var3, double[][] var4, boolean var5) {
      this.field_19779 = var1;
      this.field_19778 = var2;
      this.field_19775 = var3;
      this.field_19774 = var4;
      this.field_19776 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_19778; var3 < this.field_19775; var3++) {
         class_7963.method_36036(this.field_19779).method_44816(this.field_19774[var3], this.field_19776);
      }
   }
}
