// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Predicate;
import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.Comparator;

public class Class6859 extends Class6851<LivingEntity>
{
    private static String[] field26888;
    private static final Class7843 field26889;
    
    @Override
    public void method20955(final Class1849 class1849, final LivingEntity class1850) {
        final List<Entity> method6739 = class1849.method6739((Class<? extends Entity>) LivingEntity.class, class1850.method1886().method18495(16.0, 16.0, 16.0), class1852 -> class1852 != class1851 && class1852.method1768());
        method6739.sort(Comparator.comparingDouble((ToDoubleFunction<? super Entity>)class1850::method1734));
        final Class365<?> method6740 = class1850.method2618();
        method6740.method1196(Class8233.field33804, (List<LivingEntity>)method6739);
        method6740.method1196(Class8233.field33805, (List<LivingEntity>)method6739.stream().filter(class1854 -> Class6859.field26889.method25344(class1853, class1854)).filter((Predicate<? super Object>)class1850::method2747).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList()));
    }
    
    @Override
    public Set<Class8233<?>> method20953() {
        return (Set<Class8233<?>>)ImmutableSet.of((Object)Class8233.field33804, (Object)Class8233.field33805);
    }
    
    static {
        field26889 = new Class7843().method25337(16.0).method25339().method25341().method25340();
    }
}
