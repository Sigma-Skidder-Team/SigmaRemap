package remapped;

public class class_2472 implements Runnable {
   private static String[] field_12345;

   public class_2472(class_1637 var1, long var2, long var4, class_1702 var6) {
      this.field_12348 = var1;
      this.field_12346 = var2;
      this.field_12347 = var4;
      this.field_12344 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field_12346; var3 < this.field_12347; var3++) {
         long var5 = var3 * class_1637.method_7342(this.field_12348);

         for (long var7 = 0L; var7 < class_1637.method_7327(this.field_12348); var7++) {
            class_1637.method_7310(this.field_12348).method_15027(this.field_12344, var5 + var7 * class_1637.method_7303(this.field_12348));
         }
      }
   }
}
