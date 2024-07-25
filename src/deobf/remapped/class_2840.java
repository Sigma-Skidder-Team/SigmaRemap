package remapped;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class class_2840<T> implements class_2231 {
   @Override
   public final CompletableFuture<Void> method_10277(class_6895 var1, class_7832 var2, class_3492 var3, class_3492 var4, Executor var5, Executor var6) {
      return CompletableFuture.<T>supplyAsync(() -> this.method_12905(var2, var3), var5)
         .<T>thenCompose(var1::method_31587)
         .thenAcceptAsync(var3x -> this.method_12904((T)var3x, var2, var4), var6);
   }

   public abstract T method_12905(class_7832 var1, class_3492 var2);

   public abstract void method_12904(T var1, class_7832 var2, class_3492 var3);
}
