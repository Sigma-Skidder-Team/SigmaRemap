// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class3819 extends Item
{
    public Class3819(final Class8959 class8959) {
        super(class8959);
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        final World method21654 = class7075.method21654();
        final BlockPos method21655 = class7075.method21639();
        final BlockState method21656 = method21654.getBlockState(method21655);
        if (method21656.getBlock() != Class7521.field29402 || ((StateHolder<Object, BlockState>)method21656).get((IProperty<Boolean>)Class3964.field17909)) {
            return Class2201.field13402;
        }
        if (!method21654.isRemote) {
            final BlockState class7076 = ((StateHolder<Object, BlockState>)method21656).with((IProperty<Comparable>)Class3964.field17909, true);
            Block.method11777(method21656, class7076, method21654, method21655);
            method21654.setBlockState(method21655, class7076, 2);
            method21654.method6783(method21655, Class7521.field29402);
            class7075.method21651().method27693(1);
            method21654.method6955(1503, method21655, 0);
            final Class7820 method21657 = Class3964.method12093().method29796(method21654, method21655);
            if (method21657 != null) {
                final BlockPos method21658 = method21657.method25265().add(-3, 0, -3);
                for (int i = 0; i < 3; ++i) {
                    for (int j = 0; j < 3; ++j) {
                        method21654.setBlockState(method21658.add(i, 0, j), Class7521.field29401.getDefaultState(), 2);
                    }
                }
                method21654.method6777(1038, method21658.add(1, 0, 1), 0);
            }
            return Class2201.field13400;
        }
        return Class2201.field13400;
    }
    
    @Override
    public Class9355<ItemStack> method11695(final World class1847, final PlayerEntity class1848, final Class316 class1849) {
        final ItemStack method2715 = class1848.method2715(class1849);
        final RayTraceResult method2716 = Item.method11733(class1847, class1848, RayTraceContext.FluidMode.NONE);
        if (method2716.getType() == RayTraceResult.Type.BLOCK && class1847.getBlockState(((BlockRayTraceResult)method2716).getPos()).method21696() == Class7521.field29402) {
            return Class9355.method34676(method2715);
        }
        class1848.method2762(class1849);
        if (class1847 instanceof Class1849) {
            final BlockPos method2717 = ((Class1849)class1847).method6904().method7438().method18874(class1847, "Stronghold", new BlockPos(class1848), 100, false);
            if (method2717 != null) {
                final Class408 class1850 = new Class408(class1847, class1848.getPosX(), class1848.method1942(0.5), class1848.getPosZ());
                class1850.method2008(method2715);
                class1850.method2010(method2717);
                class1847.method6886(class1850);
                if (class1848 instanceof Class513) {
                    Class7770.field31787.method13742((Class513)class1848, method2717);
                }
                class1847.method6706(null, class1848.getPosX(), class1848.getPosY(), class1848.getPosZ(), Class8520.field35161, Class286.field1584, 0.5f, 0.4f / (Class3819.field17363.nextFloat() * 0.4f + 0.8f));
                class1847.method6839(null, 1003, new BlockPos(class1848), 0);
                if (!class1848.field3025.field27304) {
                    method2715.method27693(1);
                }
                class1848.method2859(Class8276.field33981.method8449(this));
                class1848.method2708(class1849, true);
                return Class9355.method34674(method2715);
            }
        }
        return Class9355.method34675(method2715);
    }
}
