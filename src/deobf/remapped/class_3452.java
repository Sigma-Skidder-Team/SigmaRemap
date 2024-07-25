package remapped;

public class class_3452 implements Runnable {
   private static String[] field_16935;

   public class_3452(KeybindManagerMenu var1, KeybindManagerMenu var2) {
      this.field_16936 = var1;
      this.field_16934 = var2;
   }

   @Override
   public void run() {
      this.field_16936.field_43178.method_32162();
      this.field_16934.method_32107();
      this.field_16936.field_43179 = 0;
   }
}
