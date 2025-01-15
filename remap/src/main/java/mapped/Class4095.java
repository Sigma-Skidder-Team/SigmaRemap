// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class Class4095 extends Class4093
{
    private static String[] field18196;
    
    public Class4095(final Class8959 class8959) {
        super(class8959);
    }
    
    @Override
    public Class9355<ItemStack> method11695(final World class1847, final Class512 class1848, final Class316 class1849) {
        final ItemStack method12326 = Class4094.method12326(class1847, MathHelper.floor(class1848.getPosX()), MathHelper.floor(class1848.getPosZ()), (byte)0, true, false);
        final ItemStack method12327 = class1848.method2715(class1849);
        if (!class1848.field3025.field27304) {
            method12327.method27693(1);
        }
        if (!method12327.method27620()) {
            if (!class1848.field3006.method2362(method12326.method27641())) {
                class1848.method2822(method12326, false);
            }
            class1848.method2859(Class8276.field33981.method8449(this));
            return Class9355.method34674(method12327);
        }
        return Class9355.method34674(method12326);
    }
}
