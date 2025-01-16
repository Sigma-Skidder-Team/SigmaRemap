// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.ArrayList;

import com.google.common.collect.Lists;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.dimension.DimensionType;

public class Class6854 extends Class6851<LivingEntity>
{
    private static String[] field26883;
    
    @Override
    public void method20955(final Class1849 class1849, final LivingEntity class1850) {
        final DimensionType method20487 = class1849.method6789().getType();
        final BlockPos class1851 = new BlockPos(class1850);
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                for (int k = -1; k <= 1; ++k) {
                    final BlockPos method20488 = class1851.add(i, j, k);
                    if (class1849.getBlockState(method20488).method21755(Class7188.field27885)) {
                        arrayList.add(Class363.method1167(method20487, method20488));
                    }
                }
            }
        }
        final Class365<?> method20489 = class1850.method2618();
        if (arrayList.isEmpty()) {
            method20489.method1195(Class8233.field33814);
        }
        else {
            method20489.method1196(Class8233.field33814, arrayList);
        }
    }
    
    @Override
    public Set<Class8233<?>> method20953() {
        return (Set<Class8233<?>>)ImmutableSet.of((Object)Class8233.field33814);
    }
}
