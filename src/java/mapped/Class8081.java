package mapped;

import java.util.List;
import java.util.Objects;

public class Class8081 {
   public final List<Class6102> field34733;

   public Class8081(List<Class6102> var1) {
      this.field34733 = var1;
   }

   @Override
   public String toString() {
      return "Line{segments=" + this.field34733 + '}';
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            Class8081 var4 = (Class8081)var1;
            return Objects.equals(this.field34733, var4.field34733);
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field34733);
   }
}
