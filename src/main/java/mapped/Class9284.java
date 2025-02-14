package mapped;

import java.util.Objects;

public class Class9284<X, Y> {
   private final X field42707;
   private Y field42708;

   public Class9284(X var1, Y var2) {
      this.field42707 = (X)var1;
      this.field42708 = (Y)var2;
   }

   public X method35008() {
      return this.field42707;
   }

   public Y method35009() {
      return this.field42708;
   }

   public void method35010(Y var1) {
      this.field42708 = (Y)var1;
   }

   @Override
   public String toString() {
      return "Pair{" + this.field42707 + ", " + this.field42708 + '}';
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            Class9284 var4 = (Class9284)var1;
            return Objects.equals(this.field42707, var4.field42707) ? Objects.equals(this.field42708, var4.field42708) : false;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field42707 == null ? 0 : this.field42707.hashCode();
      return 31 * var3 + (this.field42708 == null ? 0 : this.field42708.hashCode());
   }
}
