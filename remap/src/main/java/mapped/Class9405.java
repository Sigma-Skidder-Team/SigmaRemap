// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.util.Either;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public interface Class9405
{
    CompletableFuture<Either<IChunk, Class6797>> method34981(final ChunkStatus p0, final Class1849 p1, final Class1795 p2, final Class1885 p3, final Function<IChunk, CompletableFuture<Either<IChunk, Class6797>>> p4, final IChunk p5);
}
