package remapped;

public class class_7017 extends class_5348 {
   private final float field_35967;

   public class_7017(float var1) {
      super("alpha", () -> {
         if (!(var1 > 0.0F)) {
            class_3542.method_16458();
         } else {
            class_3542.method_16374();
            class_3542.method_16442(516, var1);
         }
      }, () -> {
         class_3542.method_16458();
         class_3542.method_16433();
      });
      this.field_35967 = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 == null || this.getClass() != var1.getClass()) {
            return false;
         } else {
            return super.equals(var1) ? this.field_35967 == ((class_7017)var1).field_35967 : false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return class_5129.method_23521(super.hashCode(), this.field_35967);
   }

   @Override
   public String toString() {
      return this.field_27283 + '[' + this.field_35967 + ']';
   }
}
