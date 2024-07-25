package remapped;

import java.util.List;
import java.util.Objects;

public class class_3557 {
   public final List<class_468> field_17435;

   public class_3557(List<class_468> var1) {
      this.field_17435 = var1;
   }

   @Override
   public String toString() {
      return "Line{segments=" + this.field_17435 + '}';
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            class_3557 var4 = (class_3557)var1;
            return Objects.equals(this.field_17435, var4.field_17435);
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field_17435);
   }
}
