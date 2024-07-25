package remapped;

public class class_4432 extends IllegalArgumentException implements class_838 {
   private static String[] field_21639;
   private static final long field_21641 = -6024911025449780478L;
   private final class_4635 field_21640 = new class_4635(this);

   public class_4432(class_5500 var1, Object... var2) {
      this.field_21640.method_21445(var1, var2);
   }

   @Override
   public class_4635 method_3675() {
      return this.field_21640;
   }

   @Override
   public String getMessage() {
      return this.field_21640.method_21432();
   }

   @Override
   public String getLocalizedMessage() {
      return this.field_21640.method_21443();
   }
}
