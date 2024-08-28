package mapped;

import java.util.concurrent.CompletableFuture;

public class Class7120 implements Class7121 {
   private static String[] field30641;
   public final Class7070 field30642;

   public Class7120(Class7070 var1) {
      this.field30642 = var1;
   }

   @Override
   public <T> CompletableFuture<T> method22225(T var1) {
      return CompletableFuture.<T>completedFuture((T)var1);
   }
}
