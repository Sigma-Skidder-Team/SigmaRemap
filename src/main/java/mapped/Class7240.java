// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.NoSuchElementException;
import java.util.ListIterator;

public class Class7240 extends Class56$Itr implements ListIterator<Object>
{
    private static String[] field28055;
    public final /* synthetic */ Class56 field28059;
    
    public Class7240(final Class56 field28059, final int field28060) {
        this.field28059 = field28059;
        super(field28059);
        this.field28056 = field28060;
    }
    
    public boolean hasPrevious() {
        return this.field28056 > 0;
    }
    
    public int nextIndex() {
        return this.field28056;
    }
    
    public int previousIndex() {
        return this.field28056 - 1;
    }
    
    public Object previous() {
        final int field28056 = this.field28056 - 1;
        if (field28056 >= 0) {
            this.field28056 = field28056;
            final Class56 field28057 = this.field28058;
            final int field28058 = field28056;
            this.field28057 = field28058;
            return field28057.get(field28058);
        }
        throw new NoSuchElementException();
    }
    
    public void set(final Object o) {
        if (this.field28057 >= 0) {
            this.field28058.set(this.field28057, o);
            this.field28059.set(this.field28057, o);
            return;
        }
        throw new IllegalStateException();
    }
    
    public void add(final Object o) {
        final int field28056 = this.field28056;
        this.field28058.add(field28056, o);
        this.field28059.add(field28056, o);
        this.field28056 = field28056 + 1;
        this.field28057 = -1;
    }
}
