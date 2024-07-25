package remapped;

public class class_4280 implements Runnable {
   private static String[] field_20723;

   public class_4280(class_4993 var1, int var2, int var3, float[][] var4) {
      this.field_20724 = var1;
      this.field_20726 = var2;
      this.field_20725 = var3;
      this.field_20722 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field_20726; var3 < this.field_20725; var3++) {
         class_4993.method_22998(this.field_20724).method_24204(this.field_20722[var3]);
      }
   }
}
