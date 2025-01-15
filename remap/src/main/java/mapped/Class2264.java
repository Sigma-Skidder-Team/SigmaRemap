// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;

public class Class2264<E> extends AbstractList<E>
{
    private final E[] field13825;
    
    public Class2264(final E[] field13825) {
        this.field13825 = field13825;
    }
    
    @Override
    public E get(final int i) {
        if (i < this.field13825.length) {
            return this.field13825[i];
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.size());
    }
    
    @Override
    public int size() {
        return this.field13825.length;
    }
}
