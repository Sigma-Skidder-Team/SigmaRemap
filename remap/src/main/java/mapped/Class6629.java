// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class6629 extends Class6601
{
    private static String[] field26171;
    public final /* synthetic */ Class3436 field26214;
    
    public Class6629(final Class3436 field26214, final Class446 class446, final int n, final int n2, final int n3) {
        this.field26214 = field26214;
        super(class446, n, n2, n3);
    }
    
    @Override
    public boolean method20046(final ItemStack class8321) {
        final Class3820 method27622 = class8321.method27622();
        if (method27622 != Class7739.field31514) {
            if (method27622 != Class7739.field31283) {
                if (method27622 != Class7739.field31285) {
                    if (method27622 != Class7739.field31284) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    @Override
    public int method20057() {
        return 1;
    }
}
