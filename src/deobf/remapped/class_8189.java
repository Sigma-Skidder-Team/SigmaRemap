package remapped;

public class class_8189 implements Runnable {
   private static String[] field_41902;

   public class_8189(class_7380 var1, int var2, int var3, int var4, double[][] var5, boolean var6) {
      this.field_41907 = var1;
      this.field_41906 = var2;
      this.field_41908 = var3;
      this.field_41905 = var4;
      this.field_41903 = var5;
      this.field_41904 = var6;
   }

   @Override
   public void run() {
      if (this.field_41906 != -1) {
         for (int var3 = this.field_41908; var3 < class_7380.method_33612(this.field_41907); var3 += this.field_41905) {
            class_7380.method_33625(this.field_41907).method_31283(this.field_41903[var3], this.field_41904);
         }
      } else {
         for (int var4 = this.field_41908; var4 < class_7380.method_33612(this.field_41907); var4 += this.field_41905) {
            class_7380.method_33625(this.field_41907).method_31275(this.field_41903[var4]);
         }
      }
   }
}
