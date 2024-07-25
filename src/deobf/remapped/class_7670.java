package remapped;

public final class class_7670 {
   private boolean field_38993;
   private boolean field_38992;

   public class_7670(boolean var1, boolean var2) {
      this.field_38993 = var1;
      this.field_38992 = var2;
   }

   public class_7670 method_34755() {
      return new class_7670(this.field_38993, this.field_38992);
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof class_7670)) {
            return false;
         } else {
            class_7670 var4 = (class_7670)var1;
            return this.field_38993 == var4.field_38993 && this.field_38992 == var4.field_38992;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = !this.field_38993 ? 0 : 1;
      return 31 * var3 + (!this.field_38992 ? 0 : 1);
   }

   @Override
   public String toString() {
      return "[open=" + this.field_38993 + ", filtering=" + this.field_38992 + ']';
   }
}
