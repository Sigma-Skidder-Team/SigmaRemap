// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.world.World;

import java.util.Iterator;

public class Class3827 extends Item
{
    private static String[] field17378;
    
    public Class3827(final Properties properties) {
        super(properties);
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        final PlayerEntity method21652 = class7075.method21652();
        final World method21653 = class7075.method21654();
        final BlockPos method21654 = class7075.method21639();
        final BlockState method21655 = method21653.getBlockState(method21654);
        if (method11759(method21655)) {
            method21653.method6705(method21652, method21654, Class8520.field35201, Class286.field1582, 1.0f, Class3827.field17363.nextFloat() * 0.4f + 0.8f);
            method21653.setBlockState(method21654, ((StateHolder<Object, BlockState>)method21655).with((IProperty<Comparable>)Class8970.field37736, true), 11);
            if (method21652 != null) {
                class7075.method21651().method27636(1, (Class513)method21652, class7077 -> class7077.method2795(class7076.method21653()));
            }
            return Class2201.field13400;
        }
        final BlockPos method21656 = method21654.method1149(class7075.method21648());
        if (!method11760(method21653.getBlockState(method21656), method21653, method21656)) {
            return Class2201.field13403;
        }
        method21653.method6705(method21652, method21656, Class8520.field35201, Class286.field1582, 1.0f, Class3827.field17363.nextFloat() * 0.4f + 0.8f);
        method21653.setBlockState(method21656, ((Class4011) Blocks.FIRE).method12184(method21653, method21656), 11);
        final ItemStack method21657 = class7075.method21651();
        if (method21652 instanceof Class513) {
            Class7770.field31799.method13836((Class513)method21652, method21656, method21657);
            method21657.method27636(1, (Class513)method21652, class7079 -> class7079.method2795(class7078.method21653()));
        }
        return Class2201.field13400;
    }
    
    public static boolean method11759(final BlockState class7096) {
        if (class7096.getBlock() == Blocks.CAMPFIRE) {
            if (!class7096.get(Class8970.field37747)) {
                return !class7096.get(Class8970.field37736);
            }
        }
        return false;
    }
    
    public static boolean method11760(final BlockState class7096, final Class1851 class7097, final BlockPos class7098) {
        final BlockState method12184 = ((Class4011) Blocks.FIRE).method12184(class7097, class7098);
        boolean b = false;
        final Iterator<Direction> iterator = Plane.HORIZONTAL.iterator();
        while (iterator.hasNext()) {
            if (class7097.getBlockState(class7098.method1149(iterator.next())).getBlock() != Blocks.OBSIDIAN) {
                continue;
            }
            if (((Class3998) Blocks.field29341).method12148(class7097, class7098) == null) {
                continue;
            }
            b = true;
        }
        return class7096.method21706() && (method12184.method21752(class7097, class7098) || b);
    }
}
