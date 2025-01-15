// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.List;

public class Class7059
{
    private final Class9083 field27465;
    private final List<Class8944> field27466;
    private long field27467;
    
    private Class7059(final Class9083 field27465, final List<Class8944> field27466) {
        this.field27465 = field27465;
        this.field27466 = field27466;
    }
    
    public void method21537(final long n) {
        try {
            this.method21539(n);
        }
        catch (final Exception ex) {}
    }
    
    public void method21538(final long n) {
        try {
            this.method21539(n);
        }
        catch (final Exception ex) {
            this.field27465.method32764(ex);
        }
    }
    
    private void method21539(final long n) {
        final Iterator<Class8944> iterator = this.field27466.iterator();
        while (iterator.hasNext()) {
            final Class8944 class8944 = iterator.next();
            class8944.field37635.run();
            iterator.remove();
            final long n2 = n - this.field27467;
            final long field27467 = this.field27467;
            this.field27467 = n;
            if (class8944.field37634 != null && class8944.field37634 != n2) {
                this.field27465.method32764(new Class2359("Succeeded in invalid tick: expected " + (field27467 + class8944.field37634) + ", but current tick is " + n));
                break;
            }
        }
    }
}
