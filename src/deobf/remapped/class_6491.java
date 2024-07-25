package remapped;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface class_6491 extends class_2231 {
   @Override
   default CompletableFuture<Void> method_10277(class_6895 var1, class_7832 var2, class_3492 var3, class_3492 var4, Executor var5, Executor var6) {
      return var1.<Unit>method_31587(Unit.INSTANCE).thenRunAsync(() -> {
         var4.method_16059();
         var4.startSection("listener");
         this.method_29609(var2);
         var4.endSection();
         var4.method_16052();
      }, var6);
   }

   void method_29609(class_7832 var1);
}
