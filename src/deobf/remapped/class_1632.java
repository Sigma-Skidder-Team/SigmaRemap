package remapped;

public final class class_1632<T extends Comparable<T>> {
   private final class_5019<T> field_8488;
   private final T field_8486;

   private class_1632(class_5019<T> var1, T var2) {
      if (var1.method_23105().contains(var2)) {
         this.field_8488 = var1;
         this.field_8486 = (T)var2;
      } else {
         throw new IllegalArgumentException("Value " + var2 + " does not belong to property " + var1);
      }
   }

   public class_5019<T> method_7264() {
      return this.field_8488;
   }

   public T method_7263() {
      return this.field_8486;
   }

   @Override
   public String toString() {
      return this.field_8488.method_23109() + "=" + this.field_8488.method_23110(this.field_8486);
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof class_1632)) {
            return false;
         } else {
            class_1632 var4 = (class_1632)var1;
            return this.field_8488 == var4.field_8488 && this.field_8486.equals(var4.field_8486);
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field_8488.hashCode();
      return 31 * var3 + this.field_8486.hashCode();
   }
}
