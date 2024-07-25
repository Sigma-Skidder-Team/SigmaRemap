package remapped;

import java.util.Objects;
import org.jetbrains.annotations.Nullable;

public class class_2635<A, B, C> {
   private final A field_12974;
   private final B field_12975;
   private final C field_12973;

   public class_2635(A var1, B var2, C var3) {
      this.field_12974 = (A)var1;
      this.field_12975 = (B)var2;
      this.field_12973 = (C)var3;
   }

   @Nullable
   public A method_11914() {
      return this.field_12974;
   }

   @Nullable
   public B method_11917() {
      return this.field_12975;
   }

   @Nullable
   public C method_11915() {
      return this.field_12973;
   }

   @Override
   public String toString() {
      return "Triple{" + this.field_12974 + ", " + this.field_12975 + ", " + this.field_12973 + '}';
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            class_2635 var4 = (class_2635)var1;
            if (!Objects.equals(this.field_12974, var4.field_12974)) {
               return false;
            } else {
               return Objects.equals(this.field_12975, var4.field_12975) ? Objects.equals(this.field_12973, var4.field_12973) : false;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field_12974 == null ? 0 : this.field_12974.hashCode();
      var3 = 31 * var3 + (this.field_12975 == null ? 0 : this.field_12975.hashCode());
      return 31 * var3 + (this.field_12973 == null ? 0 : this.field_12973.hashCode());
   }
}
