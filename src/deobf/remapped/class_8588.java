package remapped;

public class class_8588 implements Runnable {
   private static String[] field_44003;

   public class_8588(class_6842 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field_44004 = var1;
      this.field_44007 = var2;
      this.field_44006 = var3;
      this.field_44008 = var4;
      this.field_44005 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_44007; var3 < this.field_44006; var3++) {
         class_6842.method_31356(this.field_44004).method_31294(this.field_44008, var3 * class_6842.method_31373(this.field_44004), this.field_44005);
      }
   }
}
