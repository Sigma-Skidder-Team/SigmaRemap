// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.NoSuchElementException;
import java.io.IOException;
import java.util.Iterator;

public class Class7251 implements Iterator<String>
{
    public final Iterator<Class1668> field28114;
    public String field28115;
    public boolean field28116;
    public final /* synthetic */ Class1726 field28117;
    
    public Class7251(final Class1726 field28117) throws IOException {
        this.field28117 = field28117;
        this.field28114 = this.field28117.field9653.method5919();
    }
    
    @Override
    public boolean hasNext() {
        if (this.field28115 != null) {
            return true;
        }
        this.field28116 = false;
        while (this.field28114.hasNext()) {
            final Class1668 class1668 = this.field28114.next();
            try {
                this.field28115 = Class8753.method30275(class1668.method5883(0)).method5985();
                return true;
            }
            catch (final IOException ex) {}
            finally {
                class1668.close();
            }
        }
        return false;
    }
    
    @Override
    public String next() {
        if (this.hasNext()) {
            final String field28115 = this.field28115;
            this.field28115 = null;
            this.field28116 = true;
            return field28115;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public void remove() {
        if (this.field28116) {
            this.field28114.remove();
            return;
        }
        throw new IllegalStateException("remove() before next()");
    }
}
