package mapped;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface Class192 extends Class191, AutoCloseable {
   default CompletableFuture<Class2341> method585(Executor var1, Executor var2, List<Class303> var3, CompletableFuture<Class2341> var4) {
      return this.method586(var1, var2, var4, var3).method29223();
   }

   Class8335 method586(Executor var1, Executor var2, CompletableFuture<Class2341> var3, List<Class303> var4);

   void method587(Class268 var1);

   @Override
   void close();
}
