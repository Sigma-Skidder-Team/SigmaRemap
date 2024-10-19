package mapped;

import com.mojang.datafixers.util.Either;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.feature.template.TemplateManager;
import net.minecraft.world.server.ChunkHolder;
import net.minecraft.world.server.ServerWorldLightManager;
import net.minecraft.world.server.ServerWorld;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public interface Class9241 {
   CompletableFuture<Either<IChunk, ChunkHolder.IChunkLoadingError>> method34754(
           ChunkStatus var1, ServerWorld var2, TemplateManager var3, ServerWorldLightManager var4, Function<IChunk, CompletableFuture<Either<IChunk, ChunkHolder.IChunkLoadingError>>> var5, IChunk var6
   );
}
