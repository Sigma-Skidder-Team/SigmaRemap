package mapped;

import java.util.Optional;

public class Class4862<L, R> {
   private Optional<L> field22664;
   private Optional<R> field22665;

   private Class4862(Optional<L> var1, Optional<R> var2) {
      this.field22664 = var1;
      this.field22665 = var2;
      if (!this.field22664.isPresent() && !this.field22665.isPresent()) {
         throw new IllegalArgumentException("Both left and right are not present");
      } else if (this.field22664.isPresent() && this.field22665.isPresent()) {
         throw new IllegalArgumentException("Both left and right are present");
      }
   }

   public Optional<L> method15003() {
      return this.field22664;
   }

   public Optional<R> method15004() {
      return this.field22665;
   }

   public static <L, R> Class4862<L, R> method15005(L var0) {
      return new Class4862<L, R>(Optional.<L>of((L)var0), Optional.<R>empty());
   }

   public static <L, R> Class4862 method15006(R var0) {
      return new Class4862(Optional.<L>empty(), Optional.<Object>of(var0));
   }
}
