// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class6627 extends Class6601
{
    private static String[] field26171;
    public final /* synthetic */ Class806 field26210;
    public final /* synthetic */ Class3425 field26211;
    
    public Class6627(final Class3425 field26211, final Class446 class446, final int n, final int n2, final int n3, final Class806 field26212) {
        this.field26211 = field26211;
        this.field26210 = field26212;
        super(class446, n, n2, n3);
    }
    
    @Override
    public boolean method20046(final ItemStack class8321) {
        if (class8321.method27622() == Class7739.field31353) {
            if (!this.method20054()) {
                if (this.field26210.method4735()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean method20062() {
        return this.field26210.method4735();
    }
}
