package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.chunk.IChunk;

import java.io.IOException;
import javax.annotation.Nullable;

public abstract class Class1702 implements Class1704, AutoCloseable {
   @Nullable
   public Chunk method7342(int var1, int var2, boolean var3) {
      return (Chunk)this.method7346(var1, var2, ChunkStatus.FULL, var3);
   }

   @Nullable
   public Chunk method7343(int var1, int var2) {
      return this.method7342(var1, var2, false);
   }

   @Nullable
   @Override
   public IBlockReader method7344(int var1, int var2) {
      return this.method7346(var1, var2, ChunkStatus.field42133, false);
   }

   public boolean method7345(int var1, int var2) {
      return this.method7346(var1, var2, ChunkStatus.FULL, false) != null;
   }

   @Nullable
   public abstract IChunk method7346(int var1, int var2, ChunkStatus var3, boolean var4);

   public abstract String method7347();

   @Override
   public void close() throws IOException {
   }

   public abstract WorldLightManager getLightManager();

   public void method7349(boolean var1, boolean var2) {
   }

   public void method7350(ChunkPos var1, boolean var2) {
   }

   public boolean method7351(Entity var1) {
      return true;
   }

   public boolean method7352(ChunkPos var1) {
      return true;
   }

   public boolean method7353(BlockPos var1) {
      return true;
   }
}
