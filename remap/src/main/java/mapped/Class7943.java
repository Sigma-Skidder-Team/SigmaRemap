// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import com.mojang.datafixers.util.Either;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public interface Class7943
{
    CompletableFuture<Either<IChunk, Class6797>> method25764(final ChunkStatus p0, final Class1849 p1, final Class6346<?> p2, final Class1795 p3, final Class1885 p4, final Function<IChunk, CompletableFuture<Either<IChunk, Class6797>>> p5, final List<IChunk> p6, final IChunk p7);
}
