// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface Class1657 extends Class1662
{
    default CompletableFuture<Void> method5785(final Class7885 class7885, final Class6582 class7886, final Class5028 class7887, final Class5028 class7888, final Executor executor, final Executor executor2) {
        return class7885.method25538(Class315.field1875).thenRunAsync(() -> this.method5691(class7889), executor2);
    }
    
    void method5691(final Class6582 p0);
}
