package remapped;

public class class_2675 implements Runnable {
   private static String[] field_13140;

   public class_2675(class_7380 var1, int var2, int var3, double[][] var4, boolean var5) {
      this.field_13138 = var1;
      this.field_13136 = var2;
      this.field_13139 = var3;
      this.field_13141 = var4;
      this.field_13137 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_13136; var3 < this.field_13139; var3++) {
         class_7380.method_33625(this.field_13138).method_31283(this.field_13141[var3], this.field_13137);
      }
   }
}
