package mapped;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.chunk.listener.IChunkStatusListener;

import javax.annotation.Nullable;

public class TrackingChunkStatusListener implements IChunkStatusListener {
   private static String[] field31101;
   private final Class7244 field31102;
   private final Long2ObjectOpenHashMap<ChunkStatus> field31103;
   private ChunkPos field31104 = new ChunkPos(0, 0);
   private final int field31105;
   private final int field31106;
   private final int field31107;
   private boolean field31108;

   public TrackingChunkStatusListener(int var1) {
      this.field31102 = new Class7244(var1);
      this.field31105 = var1 * 2 + 1;
      this.field31106 = var1 + ChunkStatus.method34295();
      this.field31107 = this.field31106 * 2 + 1;
      this.field31103 = new Long2ObjectOpenHashMap();
   }

   @Override
   public void method22736(ChunkPos var1) {
      if (this.field31108) {
         this.field31102.method22736(var1);
         this.field31104 = var1;
      }
   }

   @Override
   public void method22737(ChunkPos var1, ChunkStatus var2) {
      if (this.field31108) {
         this.field31102.method22737(var1, var2);
         if (var2 != null) {
            this.field31103.put(var1.method24352(), var2);
         } else {
            this.field31103.remove(var1.method24352());
         }
      }
   }

   public void startTracking() {
      this.field31108 = true;
      this.field31103.clear();
   }

   @Override
   public void stop() {
      this.field31108 = false;
      this.field31102.stop();
   }

   public int method22743() {
      return this.field31105;
   }

   public int method22744() {
      return this.field31107;
   }

   public int method22745() {
      return this.field31102.method22741();
   }

   @Nullable
   public ChunkStatus method22746(int var1, int var2) {
      return (ChunkStatus)this.field31103
         .get(ChunkPos.asLong(var1 + this.field31104.x - this.field31106, var2 + this.field31104.z - this.field31106));
   }
}
