// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.entity.LivingEntity;

import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.ToDoubleFunction;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.List;

public class Class6858 extends Class6851<LivingEntity>
{
    private static String[] field26887;
    
    @Override
    public void method20955(final Class1849 class1849, final LivingEntity class1850) {
        final List<? super Object> list = class1849.method6840().stream().filter((Predicate<? super Object>)Class9170.field38850).filter(class1852 -> class1851.method1734(class1852) < 256.0).sorted(Comparator.comparingDouble((ToDoubleFunction<? super Object>)class1850::method1734)).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList());
        final Class365<?> method2618 = class1850.method2618();
        method2618.method1196(Class8233.field33807, (List<Class512>)list);
        method2618.method1197(Class8233.field33808, list.stream().filter(class1850::method2747).findFirst());
    }
    
    @Override
    public Set<Class8233<?>> method20953() {
        return (Set<Class8233<?>>)ImmutableSet.of((Object)Class8233.field33807, (Object)Class8233.field33808);
    }
}
