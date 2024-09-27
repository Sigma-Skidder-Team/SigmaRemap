package mapped;

import com.mojang.datafixers.util.Either;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.feature.template.TemplateManager;
import net.minecraft.world.server.ServerWorld;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public interface Class9241 {
   CompletableFuture<Either<IChunk, Class7022>> method34754(
           ChunkStatus var1, ServerWorld var2, TemplateManager var3, Class195 var4, Function<IChunk, CompletableFuture<Either<IChunk, Class7022>>> var5, IChunk var6
   );
}
