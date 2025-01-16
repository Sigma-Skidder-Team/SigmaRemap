// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public abstract class Class593<E extends Class593<E>> extends Class592<E> implements INestedGuiEventHandler
{
    private IGuiEventListener field3497;
    private boolean field3498;
    
    @Override
    public boolean isDragging() {
        return this.field3498;
    }
    
    @Override
    public void setDragging(final boolean field3498) {
        this.field3498 = field3498;
    }
    
    @Override
    public void setFocused(final IGuiEventListener field3497) {
        this.field3497 = field3497;
    }
    
    @Nullable
    @Override
    public IGuiEventListener getFocused() {
        return this.field3497;
    }
}
