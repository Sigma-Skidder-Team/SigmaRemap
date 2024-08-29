package mapped;

import com.mojang.datafixers.util.Either;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public interface Class6964 extends Class6965 {
   @Override
   default CompletableFuture<Either<IChunk, Class7022>> method21487(
      ChunkStatus var1,
      ServerWorld var2,
      ChunkGenerator var3,
      Class8761 var4,
      Class195 var5,
      Function<IChunk, CompletableFuture<Either<IChunk, Class7022>>> var6,
      List<IChunk> var7,
      IChunk var8
   ) {
      if (!var8.method7080().method34306(var1)) {
         this.method21488(var2, var3, var7, var8);
         if (var8 instanceof Class1672) {
            ((Class1672)var8).method7111(var1);
         }
      }

      return CompletableFuture.<Either<IChunk, Class7022>>completedFuture(Either.left(var8));
   }

   void method21488(ServerWorld var1, ChunkGenerator var2, List<IChunk> var3, IChunk var4);
}
