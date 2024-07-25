package remapped;

public class class_1594 extends class_5348 {
   private final boolean field_8310;

   public class_1594(boolean var1) {
      super("shade_model", () -> class_3542.method_16486(!var1 ? 7424 : 7425), () -> class_3542.method_16486(7424));
      this.field_8310 = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            class_1594 var4 = (class_1594)var1;
            return this.field_8310 == var4.field_8310;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return Boolean.hashCode(this.field_8310);
   }

   @Override
   public String toString() {
      return this.field_27283 + '[' + (!this.field_8310 ? "flat" : "smooth") + ']';
   }
}
