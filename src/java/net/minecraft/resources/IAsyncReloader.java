package net.minecraft.resources;

import net.minecraft.util.Unit;

import java.util.concurrent.CompletableFuture;

public interface IAsyncReloader {
   CompletableFuture<Unit> onceDone();

   float estimateExecutionSpeed();

   boolean asyncPartDone();

   boolean fullyDone();

   void join();
}
