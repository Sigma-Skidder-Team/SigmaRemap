// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface Class1662
{
    CompletableFuture<Void> method5785(final Class7885 p0, final Class6582 p1, final Class5028 p2, final Class5028 p3, final Executor p4, final Executor p5);
    
    default String method5848() {
        return this.getClass().getSimpleName();
    }
}
