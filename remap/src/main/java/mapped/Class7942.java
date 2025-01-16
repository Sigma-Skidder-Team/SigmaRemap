// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import com.mojang.datafixers.util.Either;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.chunk.IChunk;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public interface Class7942 extends ChunkStatus.IGenerationWorker
{
    default CompletableFuture<Either<IChunk, IChunkLoadingError>> method25764(final ChunkStatus class9312, final Class1849 class9313, final Class6346<?> class9314, final Class1795 class9315, final Class1885 class9316, final Function<IChunk, CompletableFuture<Either<IChunk, IChunkLoadingError>>> function, final List<IChunk> list, final IChunk class9317) {
        if (!class9317.method7027().isAtLeast(class9312)) {
            this.method25765(class9313, class9314, list, class9317);
            if (class9317 instanceof Class1865) {
                ((Class1865)class9317).method7098(class9312);
            }
        }
        return CompletableFuture.completedFuture(Either.left((Object)class9317));
    }
    
    void method25765(final Class1849 p0, final Class6346<?> p1, final List<IChunk> p2, final IChunk p3);
}
