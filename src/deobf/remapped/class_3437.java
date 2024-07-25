package remapped;

public class class_3437 implements Runnable {
   private static String[] field_16904;

   public class_3437(class_2817 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field_16902 = var1;
      this.field_16903 = var2;
      this.field_16901 = var3;
      this.field_16905 = var4;
      this.field_16906 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_16903; var3 < this.field_16901; var3++) {
         class_2817.method_12831(this.field_16902).method_17789(this.field_16905, var3 * class_2817.method_12836(this.field_16902), this.field_16906);
      }
   }
}
