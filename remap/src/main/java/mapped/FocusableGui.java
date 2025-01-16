// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public abstract class FocusableGui extends AbstractGui implements INestedGuiEventHandler
{
    private IGuiEventListener focused;
    private boolean isDragging;
    
    @Override
    public final boolean isDragging() {
        return this.isDragging;
    }
    
    @Override
    public final void setDragging(final boolean field3509) {
        this.isDragging = field3509;
    }
    
    @Nullable
    @Override
    public IGuiEventListener getFocused() {
        return this.focused;
    }
    
    @Override
    public void setFocused(final IGuiEventListener field3508) {
        this.focused = field3508;
    }
}
