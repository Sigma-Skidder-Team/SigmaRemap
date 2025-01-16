// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util2.Direction;
import net.minecraft.world.World;

public class Class3994 extends Class3993
{
    private static String[] field18012;
    
    public Class3994(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public Class2201 method11844(final BlockState class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final BlockRayTraceResult class7101) {
        final ItemStack method2715 = class7099.method2715(class7100);
        if (method2715.getItem() != Items.field31426) {
            return super.method11844(class7096, class7097, class7098, class7099, class7100, class7101);
        }
        if (!class7097.isRemote) {
            final Direction method2716 = class7101.method21448();
            final Direction class7102 = (method2716.getAxis() != Axis.Y) ? method2716 : class7099.method1882().getOpposite();
            class7097.method6705(null, class7098, Class8520.field35506, Class286.field1582, 1.0f, 1.0f);
            class7097.setBlockState(class7098, (BlockState)((StateHolder<Object, Object>)Class7521.field29342.getDefaultState()).with((IProperty<Comparable>)Class3901.field17611, class7102), 11);
            final Class427 class7103 = new Class427(class7097, class7098.getX() + 0.5 + class7102.getXOffset() * 0.65, class7098.getY() + 0.1, class7098.getZ() + 0.5 + class7102.getZOffset() * 0.65, new ItemStack(Items.field31429, 4));
            class7103.setMotion(0.05 * class7102.getXOffset() + class7097.rand.nextDouble() * 0.02, 0.05, 0.05 * class7102.getZOffset() + class7097.rand.nextDouble() * 0.02);
            class7097.method6886(class7103);
            method2715.method27636(1, class7099, class7105 -> class7105.method2795(class7104));
        }
        return Class2201.field13400;
    }
    
    @Override
    public Class3873 method12142() {
        return (Class3873)Class7521.field29386;
    }
    
    @Override
    public Class3875 method12143() {
        return (Class3875)Class7521.field29384;
    }
}
