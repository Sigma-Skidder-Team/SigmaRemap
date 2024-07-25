package remapped;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class class_6069 implements class_6895 {
   private static String[] field_31043;

   public class_6069(class_6535 var1, Executor var2, class_2231 var3, CompletableFuture var4) {
      this.field_31045 = var1;
      this.field_31044 = var2;
      this.field_31046 = var3;
      this.field_31047 = var4;
   }

   @Override
   public <T> CompletableFuture<T> method_31587(T var1) {
      this.field_31044.execute(() -> {
         class_6535.method_29757(this.field_31045).remove(var1x);
         if (class_6535.method_29757(this.field_31045).isEmpty()) {
            this.field_31045.field_33238.complete(Unit.INSTANCE);
         }
      });
      return this.field_31045.field_33238.<T, T>thenCombine(this.field_31047, (var1x, var2) -> (T)var1);
   }
}
