// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.CompletionStage;
import java.util.function.Function;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class Class1776<T> implements Class1662
{
    @Override
    public final CompletableFuture<Void> method5785(final Class7885 class7885, final Class6582 class7886, final IProfiler class7887, final IProfiler class7888, final Executor executor, final Executor executor2) {
        return CompletableFuture.supplyAsync(() -> this.method6369(class7889, class7890), executor).thenCompose((Function<? super Object, ? extends CompletionStage<Object>>)class7885::method25538).thenAcceptAsync(o -> this.method6370(o, class7891, class7892), executor2);
    }
    
    public abstract T method6369(final Class6582 p0, final IProfiler p1);
    
    public abstract void method6370(final T p0, final Class6582 p1, final IProfiler p2);
}
