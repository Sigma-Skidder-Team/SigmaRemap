package remapped;

public class class_3012 implements Runnable {
   private static String[] field_14788;

   public class_3012(class_4993 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field_14785 = var1;
      this.field_14787 = var2;
      this.field_14786 = var3;
      this.field_14790 = var4;
      this.field_14789 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_14787; var3 < this.field_14786; var3++) {
         class_4993.method_22998(this.field_14785).method_24207(this.field_14790, var3 * class_4993.method_22972(this.field_14785), this.field_14789);
      }
   }
}
