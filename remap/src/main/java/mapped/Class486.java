// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class486 extends Class443
{
    private static String[] field2795;
    public final /* synthetic */ Class3436 field2796;
    
    public Class486(final Class3436 field2796, final int n) {
        this.field2796 = field2796;
        super(n);
    }
    
    @Override
    public boolean method2264(final int n, final ItemStack class8321) {
        if (class8321.getItem() != Items.field31514) {
            if (class8321.getItem() != Items.field31283) {
                if (class8321.getItem() != Items.field31285) {
                    return class8321.getItem() == Items.field31284;
                }
            }
        }
        return true;
    }
    
    @Override
    public int method2254() {
        return 1;
    }
}
