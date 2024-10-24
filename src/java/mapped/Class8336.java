package mapped;

import net.minecraft.resources.IAsyncReloader;
import net.minecraft.util.Unit;

import java.util.concurrent.CompletableFuture;

public class Class8336 implements IAsyncReloader {
   private static String[] field35840;
   private final SimpleReloadableResourceManager.FailedPackException field35841;
   private final CompletableFuture<Unit> field35842;

   public Class8336(SimpleReloadableResourceManager.FailedPackException var1) {
      this.field35841 = var1;
      this.field35842 = new CompletableFuture<Unit>();
      this.field35842.completeExceptionally(var1);
   }

   @Override
   public CompletableFuture<Unit> onceDone() {
      return this.field35842;
   }

   @Override
   public float estimateExecutionSpeed() {
      return 0.0F;
   }

   @Override
   public boolean asyncPartDone() {
      return false;
   }

   @Override
   public boolean fullyDone() {
      return true;
   }

   @Override
   public void join() {
      throw this.field35841;
   }
}
