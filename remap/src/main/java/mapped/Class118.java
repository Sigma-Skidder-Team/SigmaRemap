// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;

public class Class118 implements Predicate<Class7990>
{
    private final Class7096 field366;
    private final Set<Class7111<?>> field367;
    private final Class51 field368;
    
    public Class118(final Class7096 field366, final Set<Class7111<?>> field367, final Class51 field368) {
        this.field366 = field366;
        this.field367 = field367;
        this.field368 = field368;
    }
    
    public Class7096 method609() {
        return this.field366;
    }
    
    @Override
    public boolean test(final Class7990 class7990) {
        final Class7096 method26065 = class7990.method26065();
        if (method26065.method21696() != this.field366.method21696()) {
            return false;
        }
        for (final Class7111 class7991 : this.field367) {
            if (((Class7097<Object, Object>)method26065).method21772((Class7111<Comparable>)class7991) == this.field366.method21772((Class7111<Comparable>)class7991)) {
                continue;
            }
            return false;
        }
        if (this.field368 != null) {
            final Class436 method26066 = class7990.method26066();
            return method26066 != null && Class9346.method34642(this.field368, method26066.method2180(new Class51()), true);
        }
        return true;
    }
    
    public boolean method610(final Class1849 class1849, final Class354 class1850, final int n) {
        if (class1849.method6688(class1850, this.field366, n)) {
            if (this.field368 != null) {
                final Class436 method6727 = class1849.method6727(class1850);
                if (method6727 != null) {
                    final Class51 method6728 = this.field368.method333();
                    method6728.method298("x", class1850.method1074());
                    method6728.method298("y", class1850.method1075());
                    method6728.method298("z", class1850.method1076());
                    method6727.method2179(method6728);
                }
            }
            return true;
        }
        return false;
    }
}
