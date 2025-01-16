// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Class3677 extends Class3666
{
    private static String[] field16963;
    
    public Class3677(final ResourceLocation class1932) {
        super(class1932);
    }
    
    public boolean method11301(final Class473 class473, final World class474) {
        if (class473.method2418() == 3 && class473.method2417() == 3) {
            for (int i = 0; i < class473.method2418(); ++i) {
                for (int j = 0; j < class473.method2417(); ++j) {
                    final ItemStack method2157 = class473.method2157(i + j * class473.method2418());
                    if (method2157.method27620()) {
                        return false;
                    }
                    final Item method2158 = method2157.getItem();
                    if (i == 1 && j == 1) {
                        if (method2158 != Items.field31582) {
                            return false;
                        }
                    }
                    else if (method2158 != Items.field31280) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public ItemStack method11303(final Class473 class473) {
        final ItemStack method2157 = class473.method2157(1 + class473.method2418());
        if (method2157.getItem() == Items.field31582) {
            final ItemStack class474 = new ItemStack(Items.field31581, 8);
            Class5333.method16476(class474, Class5333.method16474(method2157));
            Class5333.method16477(class474, Class5333.method16468(method2157));
            return class474;
        }
        return ItemStack.field34174;
    }
    
    @Override
    public boolean method11291(final int n, final int n2) {
        return n >= 2 && n2 >= 2;
    }
    
    @Override
    public Class6096<?> method11299() {
        return Class6096.field24742;
    }
}
