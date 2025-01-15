// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;
import java.util.List;
import com.google.common.collect.ImmutableSet;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;

import java.util.Set;

public class Class6857 extends Class6851<LivingEntity>
{
    private static String[] field26886;
    
    public Class6857() {
        this(200);
    }
    
    public Class6857(final int n) {
        super(n);
    }
    
    @Override
    public void method20955(final Class1849 class1849, final LivingEntity class1850) {
        method20963(class1849.method6754(), class1850);
    }
    
    @Override
    public Set<Class8233<?>> method20953() {
        return (Set<Class8233<?>>)ImmutableSet.of((Object)Class8233.field33804);
    }
    
    public static void method20963(final long l, final LivingEntity class511) {
        final Class365<?> method2618 = class511.method2618();
        final Optional<List<LivingEntity>> method2619 = method2618.method1198(Class8233.field33804);
        if (method2619.isPresent()) {
            if (method2619.get().stream().anyMatch(class512 -> class512.getType().equals(EntityType.field29043))) {
                method2618.method1196(Class8233.field33823, l);
            }
        }
    }
}
