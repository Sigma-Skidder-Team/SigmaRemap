// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Objects;
import com.google.common.collect.Sets;
import java.util.Set;
import java.util.Map;

public class Class7808 implements Class7807
{
    private static String[] field31976;
    public final Class4148 field31977;
    public final Map<Class6332, Class4148> field31978;
    public Class6332 field31979;
    public final Set<Class4148> field31980;
    
    public Class7808(final Class4148 field31977, final Map<Class6332, Class4148> field31978) {
        this.field31979 = null;
        this.field31980 = Sets.newHashSet();
        this.field31977 = field31977;
        this.field31978 = field31978;
    }
    
    @Override
    public Class4150 method25214(final Class6332 class6332) {
        final Class4148 method25215 = this.method25215(class6332);
        if (!Objects.equals(this.field31979, class6332)) {
            if (this.field31979 != null) {
                final Class6332 field31979 = this.field31979;
                if (!this.field31978.containsKey(field31979)) {
                    this.method25217(field31979);
                }
            }
            if (this.field31980.add(method25215)) {
                method25215.method12390(class6332.method18798(), class6332.method18797());
            }
            this.field31979 = class6332;
        }
        return method25215;
    }
    
    private Class4148 method25215(final Class6332 key) {
        return this.field31978.getOrDefault(key, this.field31977);
    }
    
    public void method25216() {
        if (this.field31979 != null) {
            if (this.method25214(this.field31979) == this.field31977) {
                this.method25217(this.field31979);
            }
        }
        final Iterator<Class6332> iterator = this.field31978.keySet().iterator();
        while (iterator.hasNext()) {
            this.method25217(iterator.next());
        }
    }
    
    public void method25217(final Class6332 b) {
        final Class4148 method25215 = this.method25215(b);
        final boolean equals = Objects.equals(this.field31979, b);
        if (equals || method25215 != this.field31977) {
            if (this.field31980.remove(method25215)) {
                b.method18794(method25215, 0, 0, 0);
                if (equals) {
                    this.field31979 = null;
                }
            }
        }
    }
}
