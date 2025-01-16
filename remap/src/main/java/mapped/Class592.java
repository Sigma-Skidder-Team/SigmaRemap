// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;

public abstract class Class592<E extends Class592<E>> implements IGuiEventListener
{
    @Deprecated
    public Class604<E> field3496;
    
    public abstract void method3467(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6, final boolean p7, final float p8);
    
    @Override
    public boolean isMouseOver(final double n, final double n2) {
        return Objects.equals(this.field3496.method3539(n, n2), this);
    }
}
