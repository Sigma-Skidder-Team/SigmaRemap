// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.world.World;

public class Class4040 extends Class4036
{
    private static String[] field18134;
    
    public Class4040(final Block class3833, final Class8959 class3834) {
        super(class3833, class3834);
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        return Class2201.field13402;
    }
    
    @Override
    public Class9355<ItemStack> method11695(final World class1847, final PlayerEntity class1848, final Class316 class1849) {
        final ItemStack method2715 = class1848.method2715(class1849);
        final Class7006 method2716 = Item.method11733(class1847, class1848, Class2191.field13326);
        if (method2716.method21449() != Class2165.field12880) {
            if (method2716.method21449() == Class2165.field12881) {
                final Class7005 class1850 = (Class7005)method2716;
                final BlockPos method2717 = class1850.method21447();
                final Direction method2718 = class1850.method21448();
                if (!class1847.method6760(class1848, method2717) || !class1848.method2881(method2717.method1149(method2718), method2718, method2715)) {
                    return Class9355.method34677(method2715);
                }
                final BlockPos method2719 = method2717.method1137();
                final Material method2720 = class1847.getBlockState(method2717).method21697();
                if (class1847.method6702(method2717).method21779() == Class7558.field29976 || method2720 == Material.ICE) {
                    if (class1847.method6961(method2719)) {
                        class1847.setBlockState(method2719, Class7521.field29393.getDefaultState(), 11);
                        if (class1848 instanceof Class513) {
                            Class7770.field31799.method13836((Class513)class1848, method2719, method2715);
                        }
                        if (!class1848.field3025.field27304) {
                            method2715.method27693(1);
                        }
                        class1848.method2859(Class8276.field33981.method8449(this));
                        class1847.method6705(class1848, method2717, Class8520.field35699, Class286.field1582, 1.0f, 1.0f);
                        return Class9355.method34674(method2715);
                    }
                }
            }
            return Class9355.method34677(method2715);
        }
        return Class9355.method34676(method2715);
    }
}