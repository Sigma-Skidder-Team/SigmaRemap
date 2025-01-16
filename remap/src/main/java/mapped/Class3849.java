// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Random;

public class Class3849 extends Class3846
{
    private static String[] field17455;
    
    public Class3849(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public void method11852(final World class1847, final Class512 class1848, final BlockPos class1849, final BlockState class1850, final TileEntity class1851, final ItemStack class1852) {
        super.method11852(class1847, class1848, class1849, class1850, class1851, class1852);
        if (Class8742.method30195(Class7882.field32366, class1852) == 0) {
            if (class1847.dimension.method20502()) {
                class1847.method6690(class1849, false);
                return;
            }
            final Material method21697 = class1847.getBlockState(class1849.method1139()).method21697();
            if (method21697.method26440() || method21697.method26438()) {
                class1847.method6692(class1849, Class7521.field29173.getDefaultState());
            }
        }
    }
    
    @Override
    public void method11822(final BlockState class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (class7097.method6992(Class237.field912, class7098) > 11 - class7096.getOpacity(class7097, class7098)) {
            this.method11910(class7096, class7097, class7098);
        }
    }
    
    public void method11910(final BlockState class7096, final World class7097, final BlockPos class7098) {
        if (!class7097.dimension.method20502()) {
            class7097.method6692(class7098, Class7521.field29173.getDefaultState());
            class7097.method6698(class7098, Class7521.field29173, class7098);
        }
        else {
            class7097.method6690(class7098, false);
        }
    }
    
    @Override
    public PushReaction method11858(final BlockState class7096) {
        return PushReaction.NORMAL;
    }
    
    @Override
    public boolean canEntitySpawn(final BlockState class7096, final Class1855 class7097, final BlockPos class7098, final EntityType<?> class7099) {
        return class7099 == EntityType.field29015;
    }
}
