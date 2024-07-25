package remapped;

public class class_2798 {
   private final boolean field_13741;
   private final boolean field_13739;

   public class_2798(boolean var1, boolean var2) {
      this.field_13741 = var1;
      this.field_13739 = var2;
   }

   public boolean method_12730() {
      return this.field_13741;
   }

   public boolean method_12727() {
      return this.field_13739;
   }

   public boolean method_12729() {
      return !this.field_13741 && !this.field_13739;
   }

   @Override
   public String toString() {
      return "implicit=[" + this.field_13741 + ", " + this.field_13739 + "]";
   }
}
