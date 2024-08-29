package mapped;

import com.mojang.datafixers.util.Either;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public interface Class9241 {
   CompletableFuture<Either<IChunk, Class7022>> method34754(
           ChunkStatus var1, ServerWorld var2, Class8761 var3, Class195 var4, Function<IChunk, CompletableFuture<Either<IChunk, Class7022>>> var5, IChunk var6
   );
}
