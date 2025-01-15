// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class6283 extends Class6257
{
    private static String[] field25150;
    
    public Class6283(final Class2233 class2233, final Class2215... array) {
        super(class2233, Class242.field1197, array);
    }
    
    @Override
    public int method18586(final int n) {
        return 1 + 10 * (n - 1);
    }
    
    @Override
    public int method18587(final int n) {
        return super.method18586(n) + 50;
    }
    
    @Override
    public int method18588() {
        return 5;
    }
    
    @Override
    public boolean method18600(final ItemStack class8321) {
        return class8321.getItem() == Items.field31426 || super.method18600(class8321);
    }
}
