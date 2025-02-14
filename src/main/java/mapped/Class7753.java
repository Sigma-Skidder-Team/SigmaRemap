package mapped;

import java.util.Objects;
import org.jetbrains.annotations.Nullable;

public class Class7753<A, B, C> {
   private final A field33291;
   private final B field33292;
   private final C field33293;

   public Class7753(A var1, B var2, C var3) {
      this.field33291 = (A)var1;
      this.field33292 = (B)var2;
      this.field33293 = (C)var3;
   }

   @Nullable
   public A method25698() {
      return this.field33291;
   }

   @Nullable
   public B method25699() {
      return this.field33292;
   }

   @Nullable
   public C method25700() {
      return this.field33293;
   }

   @Override
   public String toString() {
      return "Triple{" + this.field33291 + ", " + this.field33292 + ", " + this.field33293 + '}';
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            Class7753 var4 = (Class7753)var1;
            if (!Objects.equals(this.field33291, var4.field33291)) {
               return false;
            } else {
               return Objects.equals(this.field33292, var4.field33292) ? Objects.equals(this.field33293, var4.field33293) : false;
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
      int var3 = this.field33291 == null ? 0 : this.field33291.hashCode();
      var3 = 31 * var3 + (this.field33292 == null ? 0 : this.field33292.hashCode());
      return 31 * var3 + (this.field33293 == null ? 0 : this.field33293.hashCode());
   }
}
