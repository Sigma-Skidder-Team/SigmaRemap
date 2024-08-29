package mapped;

import java.util.function.Predicate;

public class Class9350 {
   private final Class7562 field43401;
   private final Class7497 field43402;

   public Class9350(Class7562 var1, Class7497 var2) {
      if (var1 != null) {
         if (var2 != null) {
            this.field43401 = var1;
            this.field43402 = var2;
         } else {
            throw new IllegalArgumentException("Missing variant for selector");
         }
      } else {
         throw new IllegalArgumentException("Missing condition for selector");
      }
   }

   public Class7497 method35407() {
      return this.field43402;
   }

   public Predicate<BlockState> method35408(Class9348<Block, BlockState> var1) {
      return this.field43401.method24750(var1);
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
