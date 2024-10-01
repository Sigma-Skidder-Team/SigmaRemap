package mapped;

import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.chunk.ChunkStatus;
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
   public void start(ChunkPos var1) {
      this.field31095.method1641(() -> this.field31094.start(var1));
   }

   @Override
   public void statusChanged(ChunkPos var1, ChunkStatus var2) {
      this.field31095.method1641(() -> this.field31094.statusChanged(var1, var2));
   }

   @Override
   public void stop() {
      this.field31095.method1641(this.field31094::stop);
   }
}
