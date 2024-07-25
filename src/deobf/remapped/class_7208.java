package remapped;

public class class_7208 implements Runnable {
   private static String[] field_37027;

   public class_7208(class_4993 var1, long var2, long var4, class_4330 var6) {
      this.field_37028 = var1;
      this.field_37029 = var2;
      this.field_37026 = var4;
      this.field_37030 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field_37029; var3 < this.field_37026; var3++) {
         class_4993.method_22998(this.field_37028).method_24203(this.field_37030, var3 * class_4993.method_23002(this.field_37028));
      }
   }
}
