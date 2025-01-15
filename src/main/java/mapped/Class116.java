// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;

public class Class116 implements Predicate<Class7990>
{
    private static String[] field360;
    private final Class7096 field361;
    private final Set<Class7111<?>> field362;
    private final Class51 field363;
    
    public Class116(final Class7096 field361, final Set<Class7111<?>> field362, final Class51 field363) {
        this.field361 = field361;
        this.field362 = field362;
        this.field363 = field363;
    }
    
    @Override
    public boolean test(final Class7990 class7990) {
        final Class7096 method26065 = class7990.method26065();
        if (method26065.method21696() != this.field361.method21696()) {
            return false;
        }
        for (final Class7111 class7991 : this.field362) {
            if (((Class7097<Object, Object>)method26065).method21772((Class7111<Comparable>)class7991) == this.field361.method21772((Class7111<Comparable>)class7991)) {
                continue;
            }
            return false;
        }
        if (this.field363 != null) {
            final Class436 method26066 = class7990.method26066();
            return method26066 != null && Class9346.method34642(this.field363, method26066.method2180(new Class51()), true);
        }
        return true;
    }
}
