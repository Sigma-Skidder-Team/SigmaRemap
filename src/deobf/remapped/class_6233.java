package remapped;

public class class_6233 implements Runnable {
   private static String[] field_31821;

   public class_6233(class_4993 var1, int var2, int var3, float[] var4, int var5, boolean var6) {
      this.field_31825 = var1;
      this.field_31822 = var2;
      this.field_31823 = var3;
      this.field_31824 = var4;
      this.field_31826 = var5;
      this.field_31820 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_31822; var3 < this.field_31823; var3++) {
         class_4993.method_22998(this.field_31825).method_24215(this.field_31824, var3 * this.field_31826, this.field_31820);
      }
   }
}
