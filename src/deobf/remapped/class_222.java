package remapped;

import java.util.Optional;

public class class_222<L, R> {
   private Optional<L> field_729;
   private Optional<R> field_727;

   private class_222(Optional<L> var1, Optional<R> var2) {
      this.field_729 = var1;
      this.field_727 = var2;
      if (!this.field_729.isPresent() && !this.field_727.isPresent()) {
         throw new IllegalArgumentException("Both left and right are not present");
      } else if (this.field_729.isPresent() && this.field_727.isPresent()) {
         throw new IllegalArgumentException("Both left and right are present");
      }
   }

   public Optional<L> method_940() {
      return this.field_729;
   }

   public Optional<R> method_942() {
      return this.field_727;
   }

   public static <L, R> class_222<L, R> method_939(L var0) {
      return new class_222<L, R>(Optional.<L>of((L)var0), Optional.<R>empty());
   }

   public static <L, R> class_222 method_941(R var0) {
      return new class_222(Optional.<L>empty(), Optional.<Object>of(var0));
   }
}
