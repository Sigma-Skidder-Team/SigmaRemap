package remapped;

public class class_7783 implements Runnable {
   private static String[] field_39449;

   public class_7783(class_7963 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field_39446 = var1;
      this.field_39445 = var2;
      this.field_39448 = var3;
      this.field_39444 = var4;
      this.field_39447 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_39445; var3 < this.field_39448; var3++) {
         class_7963.method_36036(this.field_39446).method_44820(this.field_39444, var3 * class_7963.method_36038(this.field_39446), this.field_39447);
      }
   }
}
