// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Class3669 extends Class3666
{
    private static String[] field16954;
    
    public Class3669(final ResourceLocation class1932) {
        super(class1932);
    }
    
    public boolean method11301(final Class473 class473, final World class474) {
        int n = 0;
        ItemStack field34174 = ItemStack.field34174;
        for (int i = 0; i < class473.method2239(); ++i) {
            final ItemStack method2157 = class473.method2157(i);
            if (!method2157.method27620()) {
                if (method2157.getItem() != Items.field31425) {
                    if (method2157.getItem() != Items.field31521) {
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
        return !field34174.method27620() && n > 0;
    }
    
    public ItemStack method11303(final Class473 class473) {
        int n = 0;
        ItemStack field34174 = ItemStack.field34174;
        for (int i = 0; i < class473.method2239(); ++i) {
            final ItemStack method2157 = class473.method2157(i);
            if (!method2157.method27620()) {
                if (method2157.getItem() != Items.field31425) {
                    if (method2157.getItem() != Items.field31521) {
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
        if (!field34174.method27620() && n >= 1) {
            final ItemStack method2158 = field34174.method27641();
            method2158.method27691(n + 1);
            return method2158;
        }
        return ItemStack.field34174;
    }
    
    @Override
    public boolean method11291(final int n, final int n2) {
        return n >= 3 && n2 >= 3;
    }
    
    @Override
    public Class6096<?> method11299() {
        return Class6096.field24737;
    }
}
