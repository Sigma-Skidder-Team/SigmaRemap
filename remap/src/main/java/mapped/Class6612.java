// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class6612 extends Class6601
{
    private static String[] field26171;
    public final /* synthetic */ Class3439 field26191;
    
    public Class6612(final Class3439 field26191, final Class446 class446, final int n, final int n2, final int n3) {
        this.field26191 = field26191;
        super(class446, n, n2, n3);
    }
    
    @Override
    public boolean method20046(final ItemStack class8321) {
        return class8321.getItem() instanceof Class3829;
    }
}
