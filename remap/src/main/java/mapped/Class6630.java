// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class6630 extends Class6601
{
    private static String[] field26171;
    public final /* synthetic */ Class3417 field26215;
    
    public Class6630(final Class3417 field26215, final Class446 class446, final int n, final int n2, final int n3) {
        this.field26215 = field26215;
        super(class446, n, n2, n3);
    }
    
    @Override
    public boolean method20046(final ItemStack class8321) {
        return class8321.getItem() == Items.field31425;
    }
}
