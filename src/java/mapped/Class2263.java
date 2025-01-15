// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;

public class Class2263<E> extends AbstractList<E>
{
    private final E[] field13823;
    private final E[] field13824;
    
    public Class2263(final E[] field13823, final E[] field13824) {
        this.field13823 = field13823;
        this.field13824 = field13824;
    }
    
    @Override
    public E get(final int i) {
        E e;
        if (i >= this.field13823.length) {
            if (i - this.field13823.length >= this.field13824.length) {
                throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.size());
            }
            e = this.field13824[i - this.field13823.length];
        }
        else {
            e = this.field13823[i];
        }
        return e;
    }
    
    @Override
    public int size() {
        return this.field13823.length + this.field13824.length;
    }
}
