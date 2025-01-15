// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Predicate;

public class Class8997
{
    private final Class7410 field37956;
    private final Class7683 field37957;
    
    public Class8997(final Class7410 field37956, final Class7683 field37957) {
        if (field37956 == null) {
            throw new IllegalArgumentException("Missing condition for selector");
        }
        if (field37957 != null) {
            this.field37956 = field37956;
            this.field37957 = field37957;
            return;
        }
        throw new IllegalArgumentException("Missing variant for selector");
    }
    
    public Class7683 method32115() {
        return this.field37957;
    }
    
    public Predicate<Class7096> method32116(final Class9104<Class3833, Class7096> class9104) {
        return this.field37956.method22768(class9104);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o;
    }
    
    @Override
    public int hashCode() {
        return System.identityHashCode(this);
    }
}
