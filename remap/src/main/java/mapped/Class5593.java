// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.List;
import com.google.common.collect.Maps;
import java.io.Reader;
import java.util.Map;

public class Class5593
{
    private static String[] field22825;
    private final Map<String, Class7683> field22826;
    private Class7686 field22827;
    
    public static Class5593 method16828(final Class9333 class9333, final Reader reader) {
        return Class9583.method35928(class9333.field40058, reader, Class5593.class);
    }
    
    public Class5593(final Map<String, Class7683> map, final Class7686 field22827) {
        this.field22826 = Maps.newLinkedHashMap();
        this.field22827 = field22827;
        this.field22826.putAll(map);
    }
    
    public Class5593(final List<Class5593> list) {
        this.field22826 = Maps.newLinkedHashMap();
        Class5593 class5593 = null;
        for (final Class5593 class5594 : list) {
            if (class5594.method16830()) {
                this.field22826.clear();
                class5593 = class5594;
            }
            this.field22826.putAll(class5594.field22826);
        }
        if (class5593 != null) {
            this.field22827 = class5593.field22827;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof Class5593) {
                final Class5593 class5593 = (Class5593)o;
                if (this.field22826.equals(class5593.field22826)) {
                    return this.method16830() ? this.field22827.equals(class5593.field22827) : (!class5593.method16830());
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return 31 * this.field22826.hashCode() + (this.method16830() ? this.field22827.hashCode() : 0);
    }
    
    public Map<String, Class7683> method16829() {
        return this.field22826;
    }
    
    public boolean method16830() {
        return this.field22827 != null;
    }
    
    public Class7686 method16831() {
        return this.field22827;
    }
}
