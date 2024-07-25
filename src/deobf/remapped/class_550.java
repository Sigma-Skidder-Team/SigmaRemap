package remapped;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface class_550 extends class_7832, AutoCloseable {
   default CompletableFuture<class_3256> method_2648(Executor var1, Executor var2, List<class_8169> var3, CompletableFuture<class_3256> var4) {
      return this.method_2650(var1, var2, var4, var3).method_19967();
   }

   class_4302 method_2650(Executor var1, Executor var2, CompletableFuture<class_3256> var3, List<class_8169> var4);

   void method_2649(class_2231 var1);

   @Override
   void close();
}
