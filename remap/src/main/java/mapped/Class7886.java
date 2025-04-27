// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class Class7886 implements Class7885
{
    private static String[] field32386;
    public final /* synthetic */ Executor field32387;
    public final /* synthetic */ Class1662 field32388;
    public final /* synthetic */ CompletableFuture field32389;
    public final /* synthetic */ Class8206 field32390;
    
    public Class7886(final Class8206 field32390, final Executor field32391, final Class1662 field32392, final CompletableFuture field32393) {
        this.field32390 = field32390;
        this.field32387 = field32391;
        this.field32388 = field32392;
        this.field32389 = field32393;
    }
    
    @Override
    public <T> CompletableFuture<T> method25538(final T t) {
        this.field32387.execute(() -> {
            final Object field32388 = this.field32388;
            Class8206.method27199(this.field32390).remove(class1662);
            if (Class8206.method27199(this.field32390).isEmpty()) {
                this.field32390.field33736.complete(Class315.field1875);
            }
        });
        return this.field32390.field33736.thenCombine((CompletionStage<?>)this.field32389, (p1, p2) -> o);
    }
}
