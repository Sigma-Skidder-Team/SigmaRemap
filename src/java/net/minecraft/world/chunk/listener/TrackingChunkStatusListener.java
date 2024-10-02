package net.minecraft.world.chunk.listener;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.chunk.ChunkStatus;

import javax.annotation.Nullable;

public class TrackingChunkStatusListener implements IChunkStatusListener {
   private final LoggingChunkStatusListener loggingListener;
   private final Long2ObjectOpenHashMap<ChunkStatus> statuses;
   private ChunkPos center = new ChunkPos(0, 0);
   private final int diameter;
   private final int positionOffset;
   private final int field_219531_f;
   private boolean tracking;

   public TrackingChunkStatusListener(int totalChunks) {
      this.loggingListener = new LoggingChunkStatusListener(totalChunks);
      this.diameter = totalChunks * 2 + 1;
      this.positionOffset = totalChunks + ChunkStatus.maxDistance();
      this.field_219531_f = this.positionOffset * 2 + 1;
      this.statuses = new Long2ObjectOpenHashMap<>();
   }

   public void start(ChunkPos var1) {
      if (this.tracking) {
         this.loggingListener.start(var1);
         this.center = var1;
      }
   }

   public void statusChanged(ChunkPos var1, ChunkStatus var2) {
      if (this.tracking) {
         this.loggingListener.statusChanged(var1, var2);
         if (var2 != null) {
            this.statuses.put(var1.asLong(), var2);
         } else {
            this.statuses.remove(var1.asLong());
         }
      }
   }

   public void startTracking() {
      this.tracking = true;
      this.statuses.clear();
   }

   public void stop() {
      this.tracking = false;
      this.loggingListener.stop();
   }

   public int getDiameter() {
      return this.diameter;
   }

   public int func_219523_d() {
      return this.field_219531_f;
   }

   public int getPercentDone() {
      return this.loggingListener.getPercentDone();
   }

   @Nullable
   public ChunkStatus getStatus(int var1, int var2)
   {
      return this.statuses.get(ChunkPos.asLong(var1 + this.center.x - this.positionOffset, var2 + this.center.z - this.positionOffset));
   }
}
