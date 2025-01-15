// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class6625 extends Class6601
{
    private static String[] field26171;
    private final Class3429 field26208;
    
    public Class6625(final Class3429 field26208, final Class446 class446, final int n, final int n2, final int n3) {
        super(class446, n, n2, n3);
        this.field26208 = field26208;
    }
    
    @Override
    public boolean method20046(final ItemStack class8321) {
        return this.field26208.method10947(class8321) || method20071(class8321);
    }
    
    @Override
    public int method20058(final ItemStack class8321) {
        return method20071(class8321) ? 1 : super.method20058(class8321);
    }
    
    public static boolean method20071(final ItemStack class8321) {
        return class8321.getItem() == Items.field31349;
    }
}
