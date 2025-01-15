// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.entity.Entity;

import java.util.Set;

public class Class6852 extends Class6851<Class511>
{
    private static String[] field26881;
    
    @Override
    public void method20955(final Class1849 class1849, final Class511 class1850) {
        final Class365<?> method2618 = class1850.method2618();
        if (class1850.method2669() == null) {
            method2618.method1195(Class8233.field33817);
        }
        else {
            method2618.method1196(Class8233.field33817, class1850.method2669());
            final Entity method2619 = method2618.method1198(Class8233.field33817).get().method25714();
            if (method2619 instanceof Class511) {
                method2618.method1196(Class8233.field33818, (Class511)method2619);
            }
        }
    }
    
    @Override
    public Set<Class8233<?>> method20953() {
        return (Set<Class8233<?>>)ImmutableSet.of((Object)Class8233.field33817, (Object)Class8233.field33818);
    }
}
