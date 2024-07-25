package remapped;

public class class_7821<T> {
   private final int field_39670;
   private final class_1720<T> field_39669;

   public class_7821(int var1, class_1720<T> var2) {
      this.field_39670 = var1;
      this.field_39669 = var2;
   }

   public int method_35423() {
      return this.field_39670;
   }

   public class_1720<T> method_35421() {
      return this.field_39669;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            class_7821 var4 = (class_7821)var1;
            return this.field_39670 == var4.field_39670;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return this.field_39670;
   }

   @Override
   public String toString() {
      return "<entity data: " + this.field_39670 + ">";
   }
}
