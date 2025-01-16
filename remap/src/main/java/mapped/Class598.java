// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public abstract class Class598 extends Class565 implements Class597
{
    private IGuiEventListener field3508;
    private boolean field3509;
    
    @Override
    public final boolean method3468() {
        return this.field3509;
    }
    
    @Override
    public final void method3469(final boolean field3509) {
        this.field3509 = field3509;
    }
    
    @Nullable
    @Override
    public IGuiEventListener method3471() {
        return this.field3508;
    }
    
    @Override
    public void setFocused(final IGuiEventListener field3508) {
        this.field3508 = field3508;
    }
}
