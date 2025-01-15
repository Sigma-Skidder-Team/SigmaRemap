// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Predicate;

public class Class161 implements Class122
{
    private final Class122[] field469;
    private final Predicate<Class7529> field470;
    
    private Class161(final Class122[] field469) {
        this.field469 = field469;
        this.field470 = Class7454.method22944((Predicate<Class7529>[])field469);
    }
    
    @Override
    public final boolean test(final Class7529 class7529) {
        return this.field470.test(class7529);
    }
    
    @Override
    public void method636(final Class7790 class7790) {
        super.method636(class7790);
        for (int i = 0; i < this.field469.length; ++i) {
            this.field469[i].method636(class7790.method25015(".term[" + i + "]"));
        }
    }
    
    public static Class8776 method761(final Class8775... array) {
        return new Class8776(array);
    }
}
