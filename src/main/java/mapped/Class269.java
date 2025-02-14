package mapped;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class Class269<T> implements IFutureReloadListener {
   @Override
   public final CompletableFuture<Void> reload(IStage var1, IResourceManager var2, IProfiler var3, IProfiler var4, Executor var5, Executor var6) {
      return CompletableFuture.<T>supplyAsync(() -> this.method970(var2, var3), var5)
         .<T>thenCompose(var1::markCompleteAwaitingOthers)
         .thenAcceptAsync(var3x -> this.method971((T)var3x, var2, var4), var6);
   }

   public abstract T method970(IResourceManager var1, IProfiler var2);

   public abstract void method971(T var1, IResourceManager var2, IProfiler var3);
}
