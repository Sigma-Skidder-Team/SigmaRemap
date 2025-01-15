// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.function.Consumer;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import net.minecraft.item.ItemStack;

import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.Random;

public class Class7529
{
    private static String[] field29894;
    private final Random field29895;
    private final float field29896;
    private final Class1849 field29897;
    private final Function<Class1932, Class9317> field29898;
    private final Set<Class9317> field29899;
    private final Function<Class1932, Class122> field29900;
    private final Set<Class122> field29901;
    private final Map<Class7915<?>, Object> field29902;
    private final Map<Class1932, Class8798> field29903;
    
    private Class7529(final Random field29895, final float field29896, final Class1849 field29897, final Function<Class1932, Class9317> field29898, final Function<Class1932, Class122> field29899, final Map<Class7915<?>, Object> map, final Map<Class1932, Class8798> map2) {
        this.field29899 = Sets.newLinkedHashSet();
        this.field29901 = Sets.newLinkedHashSet();
        this.field29895 = field29895;
        this.field29896 = field29896;
        this.field29897 = field29897;
        this.field29898 = field29898;
        this.field29900 = field29899;
        this.field29902 = (Map<Class7915<?>, Object>)ImmutableMap.copyOf((Map)map);
        this.field29903 = (Map<Class1932, Class8798>)ImmutableMap.copyOf((Map)map2);
    }
    
    public boolean method23577(final Class7915<?> class7915) {
        return this.field29902.containsKey(class7915);
    }
    
    public void method23578(final Class1932 class1932, final Consumer<ItemStack> consumer) {
        final Class8798 class1933 = this.field29903.get(class1932);
        if (class1933 != null) {
            class1933.method30701(this, consumer);
        }
    }
    
    @Nullable
    public <T> T method23579(final Class7915<T> class7915) {
        return (T)this.field29902.get(class7915);
    }
    
    public boolean method23580(final Class9317 class9317) {
        return this.field29899.add(class9317);
    }
    
    public void method23581(final Class9317 class9317) {
        this.field29899.remove(class9317);
    }
    
    public boolean method23582(final Class122 class122) {
        return this.field29901.add(class122);
    }
    
    public void method23583(final Class122 class122) {
        this.field29901.remove(class122);
    }
    
    public Class9317 method23584(final Class1932 class1932) {
        return this.field29898.apply(class1932);
    }
    
    public Class122 method23585(final Class1932 class1932) {
        return this.field29900.apply(class1932);
    }
    
    public Random method23586() {
        return this.field29895;
    }
    
    public float method23587() {
        return this.field29896;
    }
    
    public Class1849 method23588() {
        return this.field29897;
    }
}
