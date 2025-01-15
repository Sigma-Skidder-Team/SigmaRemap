// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class Class7891
{
    private static String[] field32398;
    private final Map<Class1932, Class8795> field32399;
    
    public Class7891() {
        this.field32399 = Maps.newHashMap();
        this.method25553(Class8795.field36977);
    }
    
    public void method25553(final Class8795 class8795) {
        this.field32399.put(class8795.method30675(), class8795);
    }
    
    public Class8795 method25554(final Class1932 class1932) {
        final Class8795 class1933 = this.field32399.get(class1932);
        return (class1933 == null) ? Class8795.field36978 : class1933;
    }
}
