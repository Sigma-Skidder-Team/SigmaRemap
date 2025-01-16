// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.Executor;
import java.util.concurrent.CompletableFuture;

public class Class1770 extends Class1767
{
    private static String[] field9828;
    private CompletableFuture<Class1674> field9844;
    
    public Class1770(final Class6582 class6582, final ResourceLocation class6583, final Executor executor) {
        super(class6583);
        this.field9844 = CompletableFuture.supplyAsync(() -> Class1674.method5891(class6584, class6585), executor);
    }
    
    @Override
    public Class1674 method6297(final Class6582 class6582) {
        if (this.field9844 == null) {
            return Class1674.method5891(class6582, this.field9830);
        }
        final Class1674 class6583 = this.field9844.join();
        this.field9844 = null;
        return class6583;
    }
    
    public CompletableFuture<Void> method6316() {
        return (this.field9844 != null) ? this.field9844.thenApply(p0 -> null) : CompletableFuture.completedFuture((Void)null);
    }
    
    @Override
    public void method5873(final Class1663 class1663, final Class6582 class1664, final ResourceLocation class1665, final Executor executor) {
        (this.field9844 = CompletableFuture.supplyAsync(() -> Class1674.method5891(class1666, this.field9830), Util.method27841())).thenRunAsync(() -> class1667.method5851(this.field9830, this), method6317(executor));
    }
    
    private static Executor method6317(final Executor executor) {
        return p1 -> executor2.execute(() -> RenderSystem.method29991(runnable2::run));
    }
}
