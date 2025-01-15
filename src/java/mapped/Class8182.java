// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class8182 implements Class8183<Class394>
{
    private static String[] field33689;
    private final Class1932 field33690;
    
    public Class8182(final Class1932 field33690) {
        this.field33690 = field33690;
    }
    
    @Override
    public void run(final Class394 class394, final Class7858<Class394> class395, final long n) {
        final Class1794 method1567 = class394.method1567();
        final Iterator<Class8263> iterator = method1567.method6513().method18461(this.field33690).method25616().iterator();
        while (iterator.hasNext()) {
            method1567.method6508(iterator.next(), method1567.method6511());
        }
    }
}
