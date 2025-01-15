// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;
import java.util.Objects;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;

public class Class5437 extends Class5419<LivingEntity>
{
    private static String[] field22644;
    
    public Class5437() {
        super((Map)ImmutableMap.of((Object)Class8233.field33809, (Object)Class1952.field10630, (Object)Class8233.field33810, (Object)Class1952.field10630, (Object)Class8233.field33802, (Object)Class1952.field10628, (Object)Class8233.field33805, (Object)Class1952.field10628, (Object)Class8233.field33811, (Object)Class1952.field10629));
    }
    
    @Override
    public boolean method16538(final Class1849 class1849, final LivingEntity class1850) {
        final Class365<?> method2618 = class1850.method2618();
        final Optional<Class363> method2619 = method2618.method1198(Class8233.field33802);
        if (class1849.method6790().nextInt(100) == 0) {
            if (method2619.isPresent()) {
                if (Objects.equals(class1849.method6789().getType(), method2619.get().method1169())) {
                    if (method2619.get().method1170().withinDistance(class1850.method1934(), 4.0)) {
                        if (method2618.method1198(Class8233.field33805).get().stream().anyMatch(class1851 -> EntityType.field29042.equals(class1851.getType()))) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public void method16539(final Class1849 class1849, final LivingEntity class1850, final long n) {
        class1850.method2618().method1198(Class8233.field33805).ifPresent(list -> list.stream().filter(class1851 -> EntityType.field29042.equals(class1851.getType())).filter(class1853 -> class1853.method1734(class1852) <= 32.0).findFirst().ifPresent(class1855 -> {
            class1854.method1196(Class8233.field33811, class1855);
            class1854.method1196(Class8233.field33810, new Class6440(class1855));
            final Class8233<Class6949> field33809 = Class8233.field33809;
            new Class6949(new Class6440(class1855), 0.3f, 1);
            final Class6949 class1856;
            class1854.method1196(field33809, class1856);
        }));
    }
}
