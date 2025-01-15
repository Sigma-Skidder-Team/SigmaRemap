// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class4071 extends Class3820
{
    private static String[] field18165;
    private final Class2038 field18166;
    
    public Class4071(final Class2038 field18166, final Class8959 class8959) {
        super(class8959.method31783(field18166.method8109()));
        this.field18166 = field18166;
    }
    
    public Class2038 method12274() {
        return this.field18166;
    }
    
    @Override
    public int method11734() {
        return this.field18166.method8113();
    }
    
    @Override
    public boolean method11738(final ItemStack class8321, final ItemStack class8322) {
        return this.field18166.method8114().test(class8322) || super.method11738(class8321, class8322);
    }
}
