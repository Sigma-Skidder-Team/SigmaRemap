package mapped;

import net.minecraft.resources.IAsyncReloader;
import net.minecraft.util.Unit;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface IReloadableResourceManager extends IResourceManager, AutoCloseable {
   default CompletableFuture<Unit> method585(Executor var1, Executor var2, List<IResourcePack> var3, CompletableFuture<Unit> var4) {
      return this.reloadResources(var1, var2, var4, var3).onceDone();
   }

   IAsyncReloader reloadResources(Executor var1, Executor var2, CompletableFuture<Unit> var3, List<IResourcePack> var4);

   void addReloadListener(Class268 var1);

   @Override
   void close();
}
