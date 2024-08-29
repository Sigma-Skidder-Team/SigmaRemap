package mapped;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface IReloadableResourceManager extends IResourceManager, AutoCloseable {
   default CompletableFuture<Class2341> method585(Executor var1, Executor var2, List<IResourcePack> var3, CompletableFuture<Class2341> var4) {
      return this.reloadResources(var1, var2, var4, var3).method29223();
   }

   Class8335 reloadResources(Executor var1, Executor var2, CompletableFuture<Class2341> var3, List<IResourcePack> var4);

   void addReloadListener(Class268 var1);

   @Override
   void close();
}
