// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class6609 extends Class6601
{
    private static String[] field26171;
    public final /* synthetic */ Class3439 field26188;
    
    public Class6609(final Class3439 field26188, final Class446 class446, final int n, final int n2, final int n3) {
        this.field26188 = field26188;
        super(class446, n, n2, n3);
    }
    
    @Override
    public boolean method20046(final ItemStack class8321) {
        return class8321.getItem() instanceof Class4056;
    }
}
