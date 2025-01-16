// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Class4090 extends Class4089
{
    private static String[] field18194;
    
    public Class4090(final Class8959 class8959) {
        super(class8959);
    }
    
    @Override
    public Class9355<ItemStack> method11695(final World class1847, final PlayerEntity class1848, final Class316 class1849) {
        final ItemStack method2715 = class1848.method2715(class1849);
        if (!class1847.isRemote) {
            final Class415 class1850 = new Class415(class1847, class1848);
            class1850.method2022(method2715);
            class1850.method1963(class1848, class1848.rotationPitch, class1848.rotationYaw, -20.0f, 0.5f, 1.0f);
            class1847.method6886(class1850);
        }
        class1848.method2859(Class8276.field33981.method8449(this));
        if (!class1848.field3025.field27304) {
            method2715.method27693(1);
        }
        return Class9355.method34674(method2715);
    }
}
