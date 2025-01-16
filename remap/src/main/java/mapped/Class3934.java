// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class Class3934 extends Class3933
{
    private static String[] field17816;
    
    public Class3934(final Class9288 class9288) {
        super(Class298.field1713, class9288);
    }
    
    @Override
    public void method11853(final World class1847, final BlockPos class1848, final Class7096 class1849, final LivingEntity class1850, final ItemStack class1851) {
        Blocks.field29459.method11853(class1847, class1848, class1849, class1850, class1851);
    }
    
    @Override
    public List<ItemStack> method11833(final Class7096 class7096, final Class9098 class7097) {
        return Blocks.field29459.method11833(class7096, class7097);
    }
}
