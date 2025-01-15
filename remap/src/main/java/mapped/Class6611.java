// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class6611 extends Class6601
{
    private static String[] field26171;
    public final /* synthetic */ Class3440 field26190;
    
    public Class6611(final Class3440 field26190, final Class446 class446, final int n, final int n2, final int n3) {
        this.field26190 = field26190;
        super(class446, n, n2, n3);
    }
    
    @Override
    public boolean method20046(final ItemStack class8321) {
        if (!class8321.method27630()) {
            if (class8321.getItem() != Items.field31534) {
                if (!class8321.method27675()) {
                    return false;
                }
            }
        }
        return true;
    }
}
