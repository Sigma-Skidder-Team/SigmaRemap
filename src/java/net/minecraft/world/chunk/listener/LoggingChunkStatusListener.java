package net.minecraft.world.chunk.listener;

import net.minecraft.client.util.Util;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.chunk.ChunkStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingChunkStatusListener implements IChunkStatusListener {
   private static final Logger LOGGER = LogManager.getLogger();
   private final int totalChunks;
   private int loadedChunks;
   private long startTime;
   private long nextLogTime = Long.MAX_VALUE;

   public LoggingChunkStatusListener(int var1) {
      int i = var1 * 2 + 1;
      this.totalChunks = i * i;
   }

   public void start(ChunkPos var1) {
      this.nextLogTime = Util.milliTime();
      this.startTime = this.nextLogTime;
   }

   public void statusChanged(ChunkPos chunkPos, ChunkStatus status) {
      if (status == ChunkStatus.FULL) {
         ++this.loadedChunks;
      }

      int i = this.getPercentDone();
      if (Util.milliTime() > this.nextLogTime) {
         this.nextLogTime += 500L;
         LOGGER.info("Loaded chunks: {}", this.loadedChunks);
         LOGGER.info("Total chunks: {}", this.totalChunks);
         LOGGER.info(new TranslationTextComponent("menu.preparingSpawn", MathHelper.clamp(i, 0, 100)).getString());
      }
   }

   public void stop() {
      LOGGER.info("Time elapsed: {} ms", Util.milliTime() - this.startTime);
      this.nextLogTime = Long.MAX_VALUE;
   }

   public int getPercentDone() {
      return MathHelper.floor((float)this.loadedChunks * 100.0F / (float)this.totalChunks);
   }
}
