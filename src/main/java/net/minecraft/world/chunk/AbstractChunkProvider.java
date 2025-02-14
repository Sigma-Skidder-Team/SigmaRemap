package net.minecraft.world.chunk;

import mapped.Chunk;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.lighting.WorldLightManager;

import java.io.IOException;
import javax.annotation.Nullable;

public abstract class AbstractChunkProvider implements IChunkLightProvider, AutoCloseable {
   @Nullable
   public Chunk getChunk(int var1, int var2, boolean var3) {
      return (Chunk)this.getChunk(var1, var2, ChunkStatus.FULL, var3);
   }

   @Nullable
   public Chunk getChunkNow(int var1, int var2) {
      return this.getChunk(var1, var2, false);
   }

   @Nullable
   public IBlockReader getChunkForLight(int var1, int var2) {
      return this.getChunk(var1, var2, ChunkStatus.EMPTY, false);
   }

   public boolean chunkExists(int var1, int var2) {
      return this.getChunk(var1, var2, ChunkStatus.FULL, false) != null;
   }

   @Nullable
   public abstract IChunk getChunk(int chunkX, int chunkZ, ChunkStatus requiredStatus, boolean load);

   public abstract String makeString();

   public void close() throws IOException {
   }

   public abstract WorldLightManager getLightManager();

   public void setAllowedSpawnTypes(boolean var1, boolean var2) {
   }

   public void forceChunk(ChunkPos var1, boolean var2) {
   }

   public boolean isChunkLoaded(Entity var1) {
      return true;
   }

   public boolean isChunkLoaded(ChunkPos var1) {
      return true;
   }

   public boolean canTick(BlockPos var1) {
      return true;
   }
}
