// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class6605 extends Class6601
{
    private static String[] field26171;
    
    public Class6605(final IInventory class446, final int n, final int n2, final int n3) {
        super(class446, n, n2, n3);
    }
    
    @Override
    public boolean method20046(final ItemStack class8321) {
        return method20064(class8321);
    }
    
    public static boolean method20064(final ItemStack class8321) {
        return class8321.getItem() == Items.field31445;
    }
    
    @Override
    public int method20057() {
        return 64;
    }
}
