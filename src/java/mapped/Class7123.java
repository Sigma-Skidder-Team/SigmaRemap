package mapped;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class Class7123 implements Class7121 {
   private static String[] field30644;
   public final Executor field30645;
   public final Class268 field30646;
   public final CompletableFuture field30647;
   public final Class8337 field30648;

   public Class7123(Class8337 var1, Executor var2, Class268 var3, CompletableFuture var4) {
      this.field30648 = var1;
      this.field30645 = var2;
      this.field30646 = var3;
      this.field30647 = var4;
   }

   @Override
   public <T> CompletableFuture<T> method22225(T var1) {
      this.field30645.execute(() -> {
         Class8337.method29235(this.field30648).remove(this.field30646);
         if (Class8337.method29235(this.field30648).isEmpty()) {
            this.field30648.field35845.complete(Class2341.field16010);
         }
      });
      return this.field30648.field35845.<T, T>thenCombine(this.field30647, (var1x, var2) -> (T)var1);
   }
}
