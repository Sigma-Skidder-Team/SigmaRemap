// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;

public class Class119 implements Predicate<Class7990>
{
    private static String[] field369;
    private final Class7909<Class3833> field370;
    private final Class51 field371;
    private final Map<String, String> field372;
    
    private Class119(final Class7909<Class3833> field370, final Map<String, String> field371, final Class51 field372) {
        this.field370 = field370;
        this.field372 = field371;
        this.field371 = field372;
    }
    
    @Override
    public boolean test(final Class7990 class7990) {
        final Class7096 method26065 = class7990.method26065();
        if (!method26065.method21755(this.field370)) {
            return false;
        }
        for (final Map.Entry<String, V> entry : this.field372.entrySet()) {
            final Class7111<?> method26066 = method26065.method21696().method11876().method32906(entry.getKey());
            if (method26066 == null) {
                return false;
            }
            final Comparable comparable = (Comparable)method26066.method21830((String)entry.getValue()).orElse((Object)null);
            if (comparable == null) {
                return false;
            }
            if (((Class7097<Object, Object>)method26065).method21772(method26066) == comparable) {
                continue;
            }
            return false;
        }
        if (this.field371 != null) {
            final Class436 method26067 = class7990.method26066();
            return method26067 != null && Class9346.method34642(this.field371, method26067.method2180(new Class51()), true);
        }
        return true;
    }
}
