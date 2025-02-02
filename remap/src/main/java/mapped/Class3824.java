// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Class3824 extends Item
{
    private static String[] field17376;
    
    public Class3824(final Properties properties) {
        super(properties);
    }
    
    public Class402 method11758(final World class1847, final ItemStack class1848, final LivingEntity class1849) {
        final Class405 class1850 = new Class405(class1847, class1849);
        class1850.method1992(class1848);
        return class1850;
    }
}
