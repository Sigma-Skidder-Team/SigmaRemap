// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util2.Direction;
import net.minecraft.world.World;

public class Class3956 extends Class3955
{
    private static String[] field17858;
    private static final Class6423 field17862;
    
    public Class3956(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public Class6423 method12071(final ItemStack class8321) {
        return Class3956.field17862;
    }
    
    @Override
    public TileEntity method11898(final IBlockReader class1855) {
        return new Class459();
    }
    
    @Override
    public void method12070(final World class1847, final BlockPos class1848) {
        final Class5492 class1849 = new Class5492(class1847, class1848);
        final Class458 class1850 = class1849.method16766();
        final int method2333 = class1850.method2333();
        if (method2333 >= 0) {
            final ItemStack method2334 = class1850.method2157(method2333);
            if (!method2334.method27620()) {
                final Direction class1851 = class1847.getBlockState(class1848).method21772((IProperty<Direction>)Class3956.field17859);
                final Class446 method2335 = Class455.method2310(class1847, class1848.method1149(class1851));
                ItemStack class1852;
                if (method2335 != null) {
                    if (!Class455.method2303(class1850, method2335, method2334.method27641().method27621(1), class1851.getOpposite()).method27620()) {
                        class1852 = method2334.method27641();
                    }
                    else {
                        class1852 = method2334.method27641();
                        class1852.method27693(1);
                    }
                }
                else {
                    class1852 = Class3956.field17862.method19090(class1849, method2334);
                }
                class1850.method2160(method2333, class1852);
            }
        }
        else {
            class1847.method6955(1001, class1848, 0);
        }
    }
    
    static {
        field17862 = new Class6404();
    }
}
