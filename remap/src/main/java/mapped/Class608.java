// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class608<E extends Class592<E>> extends Class604<E>
{
    private boolean field3561;
    
    public Class608(final Minecraft class869, final int n, final int n2, final int n3, final int n4, final int n5) {
        super(class869, n, n2, n3, n4, n5);
    }
    
    @Override
    public boolean changeFocus(final boolean b) {
        if (!this.field3561 && this.method3537() == 0) {
            return false;
        }
        if (this.field3561 = !this.field3561) {
            if (this.method3530() == null) {
                if (this.method3537() > 0) {
                    this.method3556(1);
                    return this.field3561;
                }
            }
        }
        if (this.field3561) {
            if (this.method3530() != null) {
                this.method3556(0);
            }
        }
        return this.field3561;
    }
}
