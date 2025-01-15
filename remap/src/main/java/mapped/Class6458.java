// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.Executor;

public class Class6458 implements Class6459
{
    private final Class6459 field25665;
    private final Class877<Runnable> field25666;
    
    public Class6458(final Class6459 field25665, final Executor executor) {
        this.field25665 = field25665;
        this.field25666 = Class877.method5393(executor, "progressListener");
    }
    
    @Override
    public void method19317(final Class7859 class7859) {
        this.field25666.method5386(() -> this.field25665.method19317(class7860));
    }
    
    @Override
    public void method19318(final Class7859 class7859, final Class9312 class7860) {
        this.field25666.method5386(() -> this.field25665.method19318(class7861, class7862));
    }
    
    @Override
    public void method19319() {
        this.field25666.method5386(this.field25665::method19319);
    }
}
