// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class Class7242 implements Iterator<Class1668>
{
    public final Iterator<Class9067> field28063;
    public Class1668 field28064;
    public Class1668 field28065;
    public final /* synthetic */ Class1675 field28066;
    
    public Class7242(final Class1675 field28066) {
        this.field28066 = field28066;
        this.field28063 = new ArrayList<Class9067>(this.field28066.field9491.values()).iterator();
    }
    
    @Override
    public boolean hasNext() {
        if (this.field28064 != null) {
            return true;
        }
        synchronized (this.field28066) {
            if (this.field28066.field9495) {
                return false;
            }
            while (this.field28063.hasNext()) {
                final Class1668 method32661 = this.field28063.next().method32661();
                if (method32661 == null) {
                    continue;
                }
                this.field28064 = method32661;
                return true;
            }
        }
        return false;
    }
    
    @Override
    public Class1668 next() {
        if (this.hasNext()) {
            this.field28065 = this.field28064;
            this.field28064 = null;
            return this.field28065;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public void remove() {
        if (this.field28065 == null) {
            throw new IllegalStateException("remove() before next()");
        }
        try {
            this.field28066.method5911(Class1668.method5885(this.field28065));
        }
        catch (final IOException ex) {}
        finally {
            this.field28065 = null;
        }
    }
}
