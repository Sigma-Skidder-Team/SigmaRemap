package net.minecraft.world.chunk.listener;

import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.chunk.ChunkStatus;

public interface IChunkStatusListener {
   void start(ChunkPos var1);

   void statusChanged(ChunkPos var1, ChunkStatus var2);

   void stop();
}
