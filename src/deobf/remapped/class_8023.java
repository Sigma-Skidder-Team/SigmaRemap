package remapped;

import java.util.function.Predicate;

public class class_8023 {
   private final class_2218 field_41077;
   private final class_9798 field_41078;

   public class_8023(class_2218 var1, class_9798 var2) {
      if (var1 != null) {
         if (var2 != null) {
            this.field_41077 = var1;
            this.field_41078 = var2;
         } else {
            throw new IllegalArgumentException("Missing variant for selector");
         }
      } else {
         throw new IllegalArgumentException("Missing condition for selector");
      }
   }

   public class_9798 method_36452() {
      return this.field_41078;
   }

   public Predicate<class_2522> method_36451(class_8021<class_6414, class_2522> var1) {
      return this.field_41077.method_10251(var1);
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1;
   }

   @Override
   public int hashCode() {
      return System.identityHashCode(this);
   }
}
