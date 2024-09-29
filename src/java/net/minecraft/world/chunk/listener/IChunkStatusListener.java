package net.minecraft.world.chunk.listener;

import net.minecraft.util.math.ChunkPos;
import mapped.ChunkStatus;

public interface IChunkStatusListener {
   void method22736(ChunkPos var1);

   void method22737(ChunkPos var1, ChunkStatus var2);

   void stop();
}
