// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class6614 extends Class6601
{
    private static String[] field26171;
    
    public Class6614(final Class446 class446, final int n, final int n2, final int n3) {
        super(class446, n, n2, n3);
    }
    
    @Override
    public boolean method20046(final ItemStack class8321) {
        return method20066(class8321);
    }
    
    @Override
    public int method20057() {
        return 1;
    }
    
    @Override
    public ItemStack method20047(final Class512 class512, final ItemStack class513) {
        final Class8061 method16474 = Class5333.method16474(class513);
        if (class512 instanceof Class513) {
            Class7770.field31785.method13750((Class513)class512, method16474);
        }
        super.method20047(class512, class513);
        return class513;
    }
    
    public static boolean method20066(final ItemStack class8321) {
        final Class3820 method27622 = class8321.method27622();
        if (method27622 != Class7739.field31441) {
            if (method27622 != Class7739.field31579) {
                if (method27622 != Class7739.field31582) {
                    if (method27622 != Class7739.field31442) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
