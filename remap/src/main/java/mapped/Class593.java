// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public abstract class Class593<E extends Class593<E>> extends Class592<E> implements Class597
{
    private IGuiEventListener field3497;
    private boolean field3498;
    
    @Override
    public boolean method3468() {
        return this.field3498;
    }
    
    @Override
    public void method3469(final boolean field3498) {
        this.field3498 = field3498;
    }
    
    @Override
    public void setFocused(final IGuiEventListener field3497) {
        this.field3497 = field3497;
    }
    
    @Nullable
    @Override
    public IGuiEventListener method3471() {
        return this.field3497;
    }
}
