// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum TooltipFlags implements ITooltipFlag
{
    NORMAL(false),
    ADVANCED(true);
    
    private final boolean field10974;
    
    TooltipFlags(final boolean field10974) {
        this.field10974 = field10974;
    }
    
    @Override
    public boolean method7991() {
        return this.field10974;
    }
}
