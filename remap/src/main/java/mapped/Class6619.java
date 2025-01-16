// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class6619 extends Class6601
{
    private static String[] field26171;
    public final /* synthetic */ Class3417 field26197;
    
    public Class6619(final Class3417 field26197, final IInventory class446, final int n, final int n2, final int n3) {
        this.field26197 = field26197;
        super(class446, n, n2, n3);
    }
    
    @Override
    public boolean method20046(final ItemStack class8321) {
        final Item method27622 = class8321.getItem();
        if (method27622 != Items.field31369) {
            if (method27622 != Items.field31521) {
                if (method27622 != Items.field30967) {
                    return false;
                }
            }
        }
        return true;
    }
}
