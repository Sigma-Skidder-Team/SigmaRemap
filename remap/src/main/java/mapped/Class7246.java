// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.Iterator;

public class Class7246 implements Iterator<Class8974>
{
    private final Class9112 field28091;
    private final Class7244 field28092;
    private final Class384 field28093;
    
    public Class7246(final Class9112 field28091, final BlockPos class354, final BlockPos class355, final int n, final int n2) {
        this.field28093 = new Class384(0, 0, 0);
        this.field28091 = field28091;
        this.field28092 = new Class7244(class354, class355, n, n2);
    }
    
    @Override
    public boolean hasNext() {
        return this.field28092.hasNext();
    }
    
    @Override
    public Class8974 next() {
        final BlockPos next = this.field28092.next();
        this.field28093.method1279(next.getX() << 4, next.getY() << 4, next.getZ() << 4);
        return this.field28091.method32963(this.field28093);
    }
    
    @Override
    public void remove() {
        throw new RuntimeException("Not implemented");
    }
}
