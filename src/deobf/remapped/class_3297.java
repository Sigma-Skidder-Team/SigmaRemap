package remapped;

public class class_3297 extends RuntimeException {
   private static String[] field_16313;
   private final class_159 field_16314;

   public class_3297(class_159 var1) {
      this.field_16314 = var1;
   }

   public class_159 method_15119() {
      return this.field_16314;
   }

   @Override
   public Throwable getCause() {
      return this.field_16314.method_631();
   }

   @Override
   public String getMessage() {
      return this.field_16314.method_630();
   }
}
