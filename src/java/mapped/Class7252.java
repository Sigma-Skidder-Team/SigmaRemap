// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ListIterator;
import java.util.Iterator;

public class Class7252 implements Iterator
{
    private static String[] field28118;
    public final /* synthetic */ ListIterator field28119;
    public final /* synthetic */ Class9498 field28120;
    
    public Class7252(final Class9498 field28120, final ListIterator field28121) {
        this.field28120 = field28120;
        this.field28119 = field28121;
    }
    
    @Override
    public boolean hasNext() {
        return this.field28119.hasPrevious();
    }
    
    @Override
    public Object next() {
        return this.field28119.previous();
    }
    
    @Override
    public void remove() {
        this.field28119.remove();
    }
}
