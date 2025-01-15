// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.CompletableFuture;

public class Class7884 implements Class7885
{
    private static String[] field32384;
    public final /* synthetic */ Class6312 field32385;
    
    public Class7884(final Class6312 field32385) {
        this.field32385 = field32385;
    }
    
    @Override
    public <T> CompletableFuture<T> method25538(final T value) {
        return CompletableFuture.completedFuture(value);
    }
}
