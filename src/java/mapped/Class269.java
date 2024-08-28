package mapped;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class Class269<T> implements Class268 {
   @Override
   public final CompletableFuture<Void> method777(Class7121 var1, Class191 var2, Class7165 var3, Class7165 var4, Executor var5, Executor var6) {
      return CompletableFuture.<T>supplyAsync(() -> this.method970(var2, var3), var5)
         .<T>thenCompose(var1::method22225)
         .thenAcceptAsync(var3x -> this.method971((T)var3x, var2, var4), var6);
   }

   public abstract T method970(Class191 var1, Class7165 var2);

   public abstract void method971(T var1, Class191 var2, Class7165 var3);
}
