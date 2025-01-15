// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Class3668 extends Class3666
{
    private static String[] field16953;
    
    public Class3668(final Class1932 class1932) {
        super(class1932);
    }
    
    public boolean method11301(final Class473 class473, final World class474) {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        for (int i = 0; i < class473.method2239(); ++i) {
            final ItemStack method2157 = class473.method2157(i);
            if (!method2157.method27620()) {
                if (method2157.method27622() == Class7521.field29278.method11704() && n3 == 0) {
                    n3 = 1;
                }
                else if (method2157.method27622() == Class7521.field29279.method11704() && n2 == 0) {
                    n2 = 1;
                }
                else if (method2157.method27622().method11742(Class7855.field32266) && n == 0) {
                    n = 1;
                }
                else {
                    if (method2157.method27622() != Class7739.field31300 || n4 != 0) {
                        return false;
                    }
                    n4 = 1;
                }
            }
        }
        if (n != 0) {
            if (n3 != 0) {
                if (n2 != 0) {
                    if (n4 != 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public ItemStack method11303(final Class473 class473) {
        ItemStack field34174 = ItemStack.field34174;
        for (int i = 0; i < class473.method2239(); ++i) {
            final ItemStack method2157 = class473.method2157(i);
            if (!method2157.method27620() && method2157.method27622().method11742(Class7855.field32266)) {
                field34174 = method2157;
                break;
            }
        }
        final ItemStack class474 = new ItemStack(Class7739.field31612, 1);
        if (field34174.method27622() instanceof Class4036) {
            if (((Class4036)field34174.method27622()).method12240() instanceof Class3882) {
                final Class3882 class475 = (Class3882)((Class4036)field34174.method27622()).method12240();
                Class4035.method12228(class474, class475.method11961(), class475.method11962());
            }
        }
        return class474;
    }
    
    @Override
    public boolean method11291(final int n, final int n2) {
        return n >= 2 && n2 >= 2;
    }
    
    @Override
    public Class6096<?> method11299() {
        return Class6096.field24746;
    }
}
