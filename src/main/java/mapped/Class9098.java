// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Sets$SetView;
import java.util.function.Function;
import java.util.Set;
import com.google.common.collect.Sets;
import javax.annotation.Nullable;
import com.google.common.collect.Maps;
import java.util.Random;
import java.util.Map;

public class Class9098
{
    private final Class1849 field38530;
    private final Map<Class7915<?>, Object> field38531;
    private final Map<Class1932, Class8798> field38532;
    private Random field38533;
    private float field38534;
    
    public Class9098(final Class1849 field38530) {
        this.field38531 = Maps.newIdentityHashMap();
        this.field38532 = Maps.newHashMap();
        this.field38530 = field38530;
    }
    
    public Class9098 method32873(final Random field38533) {
        this.field38533 = field38533;
        return this;
    }
    
    public Class9098 method32874(final long seed) {
        if (seed != 0L) {
            this.field38533 = new Random(seed);
        }
        return this;
    }
    
    public Class9098 method32875(final long seed, final Random field38533) {
        if (seed != 0L) {
            this.field38533 = new Random(seed);
        }
        else {
            this.field38533 = field38533;
        }
        return this;
    }
    
    public Class9098 method32876(final float field38534) {
        this.field38534 = field38534;
        return this;
    }
    
    public <T> Class9098 method32877(final Class7915<T> class7915, final T t) {
        this.field38531.put(class7915, t);
        return this;
    }
    
    public <T> Class9098 method32878(final Class7915<T> class7915, final T t) {
        if (t != null) {
            this.field38531.put(class7915, t);
        }
        else {
            this.field38531.remove(class7915);
        }
        return this;
    }
    
    public Class9098 method32879(final Class1932 class1932, final Class8798 class1933) {
        if (this.field38532.put(class1932, class1933) == null) {
            return this;
        }
        throw new IllegalStateException("Duplicated dynamic drop '" + this.field38532 + "'");
    }
    
    public Class1849 method32880() {
        return this.field38530;
    }
    
    public <T> T method32881(final Class7915<T> obj) {
        final Object value = this.field38531.get(obj);
        if (value != null) {
            return (T)value;
        }
        throw new IllegalArgumentException("No parameter " + obj);
    }
    
    @Nullable
    public <T> T method32882(final Class7915<T> class7915) {
        return (T)this.field38531.get(class7915);
    }
    
    public Class7529 method32883(final Class8212 class8212) {
        final Sets$SetView difference = Sets.difference((Set)this.field38531.keySet(), (Set)class8212.method27204());
        if (!((Set)difference).isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + difference);
        }
        final Sets$SetView difference2 = Sets.difference((Set)class8212.method27203(), (Set)this.field38531.keySet());
        if (((Set)difference2).isEmpty()) {
            Random field38533 = this.field38533;
            if (field38533 == null) {
                field38533 = new Random();
            }
            final Class394 method6679 = this.field38530.method6679();
            return new Class7529(field38533, this.field38534, this.field38530, method6679.method1581()::method6402, method6679.method1582()::method6409, this.field38531, this.field38532, null);
        }
        throw new IllegalArgumentException("Missing required parameters: " + difference2);
    }
}
