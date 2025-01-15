// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.Entity;

import java.util.Map;

public class Class152 implements Class122
{
    private static String[] field446;
    private final Map<String, Class5772> field447;
    private final Class2065 field448;
    
    private Class152(final Map<String, Class5772> map, final Class2065 field448) {
        this.field447 = (Map<String, Class5772>)ImmutableMap.copyOf((Map)map);
        this.field448 = field448;
    }
    
    @Override
    public Set<Class7915<?>> method635() {
        return (Set<Class7915<?>>)ImmutableSet.of((Object)this.field448.method8153());
    }
    
    @Override
    public boolean test(final Class7529 class7529) {
        final Entity class7530 = class7529.method23579(this.field448.method8153());
        if (class7530 != null) {
            final Class6516 method6782 = class7530.field2391.method6782();
            for (final Map.Entry entry : this.field447.entrySet()) {
                if (this.method733(class7530, method6782, (String)entry.getKey(), (Class5772)entry.getValue())) {
                    continue;
                }
                return false;
            }
            return true;
        }
        return false;
    }
    
    public boolean method733(final Entity class399, final Class6516 class400, final String s, final Class5772 class401) {
        final Class9290 method19632 = class400.method19632(s);
        if (method19632 != null) {
            final String method19633 = class399.method1867();
            return class400.method19635(method19633, method19632) && class401.method17170(class400.method19636(method19633, method19632).method23969());
        }
        return false;
    }
}
