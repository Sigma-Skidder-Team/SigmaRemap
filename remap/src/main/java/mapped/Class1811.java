// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class Class1811 extends Class1799
{
    private Class4711 field9982;
    
    public Class1811(final Class4711 field9982) {
        super(field9982);
        this.field9982 = null;
        this.field9982 = field9982;
    }
    
    @Override
    public void method6554(final Class7351 class7351, final Class7807 class7352, final int n, final Class399 class7353, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        this.method6571(class7353, class7351, class7352, n, Class1904.field10335);
    }
    
    public void method6571(final Class399 class399, final Class7351 class400, final Class7807 class401, final int n, final int n2) {
        if (Class8571.method28948()) {
            if (class399 instanceof Class754) {
                final Class754 class402 = (Class754)class399;
                Class8933.method31646(1.0f, 1.0f, 1.0f, 1.0f);
                Class8933.method31623();
                Class8933.method31592();
                Class7569.method23789(((Class4710<T, Class5853>)this.field9982).method13979(), class402, class400, class401, n, n2);
                Class8933.method31593();
            }
        }
    }
    
    public static void method6572(final Map map) {
        final Set keySet = map.keySet();
        int n = 0;
        final Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            final Object value = map.get(iterator.next());
            if (!(value instanceof Class4711)) {
                continue;
            }
            final Class4711 class4711 = (Class4711)value;
            class4711.method13978(new Class1811(class4711));
            n = 1;
        }
        if (n == 0) {
            Class8571.method28848("PlayerItemsLayer not registered");
        }
    }
}
