package mapped;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface IFutureReloadListener {
   CompletableFuture<Void> reload(IStage var1, IResourceManager var2, IProfiler var3, IProfiler var4, Executor var5, Executor var6);

   default String method969() {
      return this.getClass().getSimpleName();
   }
}
