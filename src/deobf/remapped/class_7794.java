package remapped;

import java.util.Objects;

public class class_7794<X, Y> {
   private final X field_39475;
   private Y field_39477;

   public class_7794(X var1, Y var2) {
      this.field_39475 = (X)var1;
      this.field_39477 = (Y)var2;
   }

   public X method_35355() {
      return this.field_39475;
   }

   public Y method_35352() {
      return this.field_39477;
   }

   public void method_35354(Y var1) {
      this.field_39477 = (Y)var1;
   }

   @Override
   public String toString() {
      return "Pair{" + this.field_39475 + ", " + this.field_39477 + '}';
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            class_7794 var4 = (class_7794)var1;
            return Objects.equals(this.field_39475, var4.field_39475) ? Objects.equals(this.field_39477, var4.field_39477) : false;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field_39475 == null ? 0 : this.field_39475.hashCode();
      return 31 * var3 + (this.field_39477 == null ? 0 : this.field_39477.hashCode());
   }
}
