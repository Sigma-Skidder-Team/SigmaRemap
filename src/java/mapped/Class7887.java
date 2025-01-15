// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.CompletableFuture;

public class Class7887 implements Class7885
{
    private static String[] field32391;
    public final /* synthetic */ Class1903 field32392;
    
    public Class7887(final Class1903 field32392) {
        this.field32392 = field32392;
    }
    
    @Override
    public <T> CompletableFuture<T> method25538(final T value) {
        return CompletableFuture.completedFuture(value);
    }
}
