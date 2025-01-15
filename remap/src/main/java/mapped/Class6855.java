// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.ArrayList;

import com.google.common.collect.Lists;
import net.minecraft.world.dimension.DimensionType;

public class Class6855 extends Class6851<Class824>
{
    private static String[] field26884;
    
    public Class6855() {
        super(40);
    }
    
    public void method20959(final Class1849 class1849, final Class824 class1850) {
        final DimensionType method20487 = class1849.method6789().getType();
        final BlockPos class1851 = new BlockPos(class1850);
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = -4; i <= 4; ++i) {
            for (int j = -2; j <= 2; ++j) {
                for (int k = -4; k <= 4; ++k) {
                    final BlockPos method20488 = class1851.add(i, j, k);
                    if (class1850.method4870().method28781().method34577().contains((Object)class1849.method6701(method20488).method21696())) {
                        arrayList.add(Class363.method1167(method20487, method20488));
                    }
                }
            }
        }
        final Class365<Class824> method20489 = class1850.method2618();
        if (arrayList.isEmpty()) {
            method20489.method1195(Class8233.field33803);
        }
        else {
            method20489.method1196(Class8233.field33803, arrayList);
        }
    }
    
    @Override
    public Set<Class8233<?>> method20953() {
        return (Set<Class8233<?>>)ImmutableSet.of((Object)Class8233.field33803);
    }
}
