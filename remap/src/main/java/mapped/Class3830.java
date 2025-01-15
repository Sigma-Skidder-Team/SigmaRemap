// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Class3830 extends Item
{
    private static String[] field17385;
    
    public Class3830(final Class8959 class8959) {
        super(class8959);
    }
    
    @Override
    public boolean method11730(final ItemStack class8321) {
        return true;
    }
    
    @Override
    public Class9355<ItemStack> method11695(final World class1847, final Class512 class1848, final Class316 class1849) {
        final ItemStack method2715 = class1848.method2715(class1849);
        class1847.method6706(null, class1848.getPosX(), class1848.getPosY(), class1848.getPosZ(), Class8520.field35185, Class286.field1584, 0.5f, 0.4f / (Class3830.field17363.nextFloat() * 0.4f + 0.8f));
        if (!class1847.isRemote) {
            final Class413 class1850 = new Class413(class1847, class1848);
            class1850.method2012(method2715);
            class1850.method1963(class1848, class1848.rotationPitch, class1848.rotationYaw, -20.0f, 0.7f, 1.0f);
            class1847.method6886(class1850);
        }
        class1848.method2859(Class8276.field33981.method8449(this));
        if (!class1848.field3025.field27304) {
            method2715.method27693(1);
        }
        return Class9355.method34674(method2715);
    }
}
