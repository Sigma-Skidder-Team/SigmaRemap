// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.NoSuchElementException;
import java.util.Iterator;

public class Class7253 implements Iterator<Object>
{
    private static String[] field28121;
    private int field28122;
    private int field28123;
    public final /* synthetic */ Class79 field28124;
    
    private Class7253(final Class79 field28124) {
        this.field28124 = field28124;
        this.field28123 = -1;
    }
    
    @Override
    public boolean hasNext() {
        return this.field28122 < Class79.method440(this.field28124);
    }
    
    @Override
    public Object next() {
        if (this.field28122 < Class79.method440(this.field28124)) {
            this.field28123 = this.field28122++;
            return Class79.method441(this.field28124)[this.field28123];
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public void remove() {
        if (this.field28123 != -1) {
            Class79.method442(this.field28124, this.field28123);
            --this.field28122;
            this.field28123 = -1;
            return;
        }
        throw new IllegalStateException();
    }
}
