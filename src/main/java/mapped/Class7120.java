package mapped;

import java.util.concurrent.CompletableFuture;

public class Class7120 implements IStage {
   public final FurnaceTracker field30642;

   public Class7120(FurnaceTracker var1) {
      this.field30642 = var1;
   }

   @Override
   public <T> CompletableFuture<T> markCompleteAwaitingOthers(T var1) {
      return CompletableFuture.<T>completedFuture((T)var1);
   }
}
