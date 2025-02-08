package mapped;

import java.util.concurrent.CompletableFuture;

public interface IStage {
   <T> CompletableFuture<T> markCompleteAwaitingOthers(T var1);
}
