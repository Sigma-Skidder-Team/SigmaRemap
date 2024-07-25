package remapped;

public class class_9288 implements Runnable {
   private static String[] field_47374;

   public class_9288(class_7380 var1, int var2, int var3, double[][] var4) {
      this.field_47372 = var1;
      this.field_47371 = var2;
      this.field_47375 = var3;
      this.field_47373 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field_47371; var3 < this.field_47375; var3++) {
         class_7380.method_33625(this.field_47372).method_31275(this.field_47373[var3]);
      }
   }
}
