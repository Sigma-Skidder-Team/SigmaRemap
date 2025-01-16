// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class6620 extends Class6601
{
    private static String[] field26171;
    public final /* synthetic */ Class806 field26198;
    public final /* synthetic */ Class3425 field26199;
    
    public Class6620(final Class3425 field26199, final IInventory class446, final int n, final int n2, final int n3, final Class806 field26200) {
        this.field26199 = field26199;
        this.field26198 = field26200;
        super(class446, n, n2, n3);
    }
    
    @Override
    public boolean method20046(final ItemStack class8321) {
        return this.field26198.method4767(class8321);
    }
    
    @Override
    public boolean method20062() {
        return this.field26198.method4766();
    }
    
    @Override
    public int method20057() {
        return 1;
    }
}
