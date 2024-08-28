package mapped;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface Class215 extends Class268 {
   @Override
   default CompletableFuture<Void> method777(Class7121 var1, Class191 var2, Class7165 var3, Class7165 var4, Executor var5, Executor var6) {
      return var1.<Class2341>method22225(Class2341.field16010).thenRunAsync(() -> {
         var4.method22501();
         var4.startSection("listener");
         this.method737(var2);
         var4.endSection();
         var4.method22502();
      }, var6);
   }

   void method737(Class191 var1);
}
