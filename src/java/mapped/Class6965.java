package mapped;

import com.mojang.datafixers.util.Either;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.server.ServerWorld;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public interface Class6965 {
   CompletableFuture<Either<IChunk, Class7022>> method21487(
      ChunkStatus var1,
      ServerWorld var2,
      ChunkGenerator var3,
      TemplateManager var4,
      Class195 var5,
      Function<IChunk, CompletableFuture<Either<IChunk, Class7022>>> var6,
      List<IChunk> var7,
      IChunk var8
   );
}
