// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.function.Predicate;

public abstract class Class126 implements Class125
{
    public final Class122[] field383;
    private final Predicate<Class7529> field384;
    
    public Class126(final Class122[] field383) {
        this.field383 = field383;
        this.field384 = Class7454.method22943((Predicate<Class7529>[])field383);
    }
    
    @Override
    public final Class8321 apply(final Class8321 class8321, final Class7529 class8322) {
        return this.field384.test(class8322) ? this.method639(class8321, class8322) : class8321;
    }
    
    public abstract Class8321 method639(final Class8321 p0, final Class7529 p1);
    
    @Override
    public void method636(final Class7790 class7790) {
        super.method636(class7790);
        for (int i = 0; i < this.field383.length; ++i) {
            this.field383[i].method636(class7790.method25015(".conditions[" + i + "]"));
        }
    }
    
    public static Class4943<?> method640(final Function<Class122[], Class125> function) {
        return new Class4955(function);
    }
}
