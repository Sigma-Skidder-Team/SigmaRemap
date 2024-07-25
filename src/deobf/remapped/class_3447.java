package remapped;

public class class_3447 implements Runnable {
   private static String[] field_16920;

   public class_3447(class_5519 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field_16923 = var1;
      this.field_16922 = var2;
      this.field_16919 = var3;
      this.field_16921 = var4;
      this.field_16924 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_16922; var3 < this.field_16919; var3++) {
         class_5519.method_24991(this.field_16923).method_19196(this.field_16921, var3 * class_5519.method_24997(this.field_16923), this.field_16924);
      }
   }
}
