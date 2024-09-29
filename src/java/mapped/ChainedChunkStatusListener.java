package mapped;

import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.chunk.listener.IChunkStatusListener;

import java.util.concurrent.Executor;

public class ChainedChunkStatusListener implements IChunkStatusListener {
   private final IChunkStatusListener field31094;
   private final Class322<Runnable> field31095;

   public ChainedChunkStatusListener(IChunkStatusListener var1, Executor var2) {
      this.field31094 = var1;
      this.field31095 = Class322.method1650(var2, "progressListener");
   }

   @Override
   public void method22736(ChunkPos var1) {
      this.field31095.method1641(() -> this.field31094.method22736(var1));
   }

   @Override
   public void method22737(ChunkPos var1, ChunkStatus var2) {
      this.field31095.method1641(() -> this.field31094.method22737(var1, var2));
   }

   @Override
   public void stop() {
      this.field31095.method1641(this.field31094::stop);
   }
}
