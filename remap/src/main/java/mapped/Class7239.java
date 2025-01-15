// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.NoSuchElementException;
import java.util.Iterator;

public class Class7239 implements Iterator<Object>
{
    private static String[] field28055;
    public int field28056;
    public int field28057;
    public final Class56 field28058;
    public final /* synthetic */ Class56 field28059;
    
    public Class7239(final Class56 field28059) {
        this.field28059 = field28059;
        this.field28056 = 0;
        this.field28057 = -1;
        this.field28058 = (Class56)field28059.clone();
    }
    
    @Override
    public boolean hasNext() {
        return this.field28056 < this.field28058.size();
    }
    
    @Override
    public Object next() {
        final int field28056 = this.field28056;
        if (field28056 < this.field28058.size()) {
            this.field28056 = field28056 + 1;
            final Class56 field28057 = this.field28058;
            final int field28058 = field28056;
            this.field28057 = field28058;
            return field28057.get(field28058);
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public void remove() {
        if (this.field28057 >= 0) {
            this.field28058.remove(this.field28057);
            this.field28059.remove(this.field28057);
            this.field28056 = this.field28057;
            this.field28057 = -1;
            return;
        }
        throw new IllegalStateException();
    }
}
