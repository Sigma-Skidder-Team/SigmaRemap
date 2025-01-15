// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Class3676 extends Class3666
{
    public Class3676(final Class1932 class1932) {
        super(class1932);
    }
    
    public boolean method11301(final Class473 class473, final World class474) {
        int n = 0;
        ItemStack field34174 = ItemStack.field34174;
        for (int i = 0; i < class473.method2239(); ++i) {
            final ItemStack method2157 = class473.method2157(i);
            if (!method2157.method27620()) {
                if (method2157.method27622() != Class7739.field31513) {
                    if (method2157.method27622() != Class7739.field31512) {
                        return false;
                    }
                    ++n;
                }
                else {
                    if (!field34174.method27620()) {
                        return false;
                    }
                    field34174 = method2157;
                }
            }
        }
        if (!field34174.method27620()) {
            if (field34174.method27656()) {
                if (n > 0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public ItemStack method11303(final Class473 class473) {
        int n = 0;
        ItemStack field34174 = ItemStack.field34174;
        for (int i = 0; i < class473.method2239(); ++i) {
            final ItemStack method2157 = class473.method2157(i);
            if (!method2157.method27620()) {
                if (method2157.method27622() != Class7739.field31513) {
                    if (method2157.method27622() != Class7739.field31512) {
                        return ItemStack.field34174;
                    }
                    ++n;
                }
                else {
                    if (!field34174.method27620()) {
                        return ItemStack.field34174;
                    }
                    field34174 = method2157;
                }
            }
        }
        if (!field34174.method27620()) {
            if (field34174.method27656()) {
                if (n >= 1) {
                    if (Class4096.method12340(field34174) < 2) {
                        final ItemStack class474 = new ItemStack(Class7739.field31513, n);
                        final Class51 method2158 = field34174.method27657().method333();
                        method2158.method298("generation", Class4096.method12340(field34174) + 1);
                        class474.method27663(method2158);
                        return class474;
                    }
                }
            }
        }
        return ItemStack.field34174;
    }
    
    public Class2265<ItemStack> method11323(final Class473 class473) {
        final Class2265<ItemStack> method8507 = Class2265.method8507(class473.method2239(), ItemStack.field34174);
        for (int i = 0; i < method8507.size(); ++i) {
            final ItemStack method8508 = class473.method2157(i);
            if (!method8508.method27622().method11721()) {
                if (method8508.method27622() instanceof Class4096) {
                    final ItemStack method8509 = method8508.method27641();
                    method8509.method27691(1);
                    method8507.set(i, method8509);
                    break;
                }
            }
            else {
                method8507.set(i, new ItemStack(method8508.method27622().method11720()));
            }
        }
        return method8507;
    }
    
    @Override
    public Class6096<?> method11299() {
        return Class6096.field24736;
    }
    
    @Override
    public boolean method11291(final int n, final int n2) {
        return n >= 3 && n2 >= 3;
    }
}
