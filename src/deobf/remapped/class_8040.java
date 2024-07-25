package remapped;

public class class_8040 extends ArithmeticException implements class_838 {
   private static String[] field_41191;
   private static final long field_41190 = -6024911025449780478L;
   private final class_4635 field_41189 = new class_4635(this);

   public class_8040() {
      this.field_41189.method_21445(class_1023.field_5489);
   }

   public class_8040(class_5500 var1, Object... var2) {
      this.field_41189.method_21445(var1, var2);
   }

   @Override
   public class_4635 method_3675() {
      return this.field_41189;
   }

   @Override
   public String getMessage() {
      return this.field_41189.method_21432();
   }

   @Override
   public String getLocalizedMessage() {
      return this.field_41189.method_21443();
   }
}
