// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Predicate;
import java.util.List;
import com.google.common.collect.ImmutableSet;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;

import java.util.Set;

public class Class6856 extends Class6851<LivingEntity>
{
    private static String[] field26885;
    
    @Override
    public Set<Class8233<?>> method20953() {
        return (Set<Class8233<?>>)ImmutableSet.of((Object)Class8233.field33806);
    }
    
    @Override
    public void method20955(final Class1849 class1849, final LivingEntity class1850) {
        class1850.method2618().method1196(Class8233.field33806, this.method20960(class1850));
    }
    
    private List<LivingEntity> method20960(final LivingEntity class511) {
        return this.method20962(class511).stream().filter((Predicate<? super Object>)this::method20961).collect((Collector<? super Object, ?, List<LivingEntity>>)Collectors.toList());
    }
    
    private boolean method20961(final LivingEntity class511) {
        return class511.getType() == EntityType.field29042 && class511.method2625();
    }
    
    private List<LivingEntity> method20962(final LivingEntity class511) {
        return class511.method2618().method1198((Class8233<ArrayList>)Class8233.field33805).orElse(Lists.newArrayList());
    }
}
