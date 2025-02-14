package mapped;

import com.mojang.datafixers.util.Either;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.template.TemplateManager;
import net.minecraft.world.server.ChunkHolder;
import net.minecraft.world.server.ServerWorldLightManager;
import net.minecraft.world.server.ServerWorld;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public interface Class6965 {
   CompletableFuture<Either<IChunk, ChunkHolder.IChunkLoadingError>> method21487(
      ChunkStatus var1,
      ServerWorld var2,
      ChunkGenerator var3,
      TemplateManager var4,
      ServerWorldLightManager var5,
      Function<IChunk, CompletableFuture<Either<IChunk, ChunkHolder.IChunkLoadingError>>> var6,
      List<IChunk> var7,
      IChunk var8
   );
}
