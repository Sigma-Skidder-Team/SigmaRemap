// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Map;

public class Class6559
{
    private static String[] field26050;
    private final Class1932 field26051;
    private final Map<Class1932, Float> field26052;
    
    public Class6559(final Class1932 field26051, final Map<Class1932, Float> field26052) {
        this.field26051 = field26051;
        this.field26052 = field26052;
    }
    
    public Class1932 method19882() {
        return this.field26051;
    }
    
    public boolean method19883(final ItemStack class8321, final World class8322, final LivingEntity class8323) {
        final Class3820 method27622 = class8321.method27622();
        for (final Map.Entry<Class1932, V> entry : this.field26052.entrySet()) {
            final Class8967 method27623 = method27622.method11700(entry.getKey());
            if (method27623 != null && method27623.method31812(class8321, class8322, class8323) >= (float)entry.getValue()) {
                continue;
            }
            return false;
        }
        return true;
    }
}
