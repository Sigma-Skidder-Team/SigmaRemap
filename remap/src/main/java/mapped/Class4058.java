// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;

public class Class4058 extends Item
{
    private static String[] field18153;
    
    public Class4058(final Properties properties) {
        super(properties);
    }
    
    @Override
    public boolean method11714(final ItemStack class8321, final PlayerEntity class8322, final LivingEntity class8323, final Class316 class8324) {
        if (class8321.method27667() && !(class8323 instanceof PlayerEntity)) {
            if (class8323.method1768()) {
                class8323.method1872(class8321.method27664());
                if (class8323 instanceof Class759) {
                    ((Class759)class8323).method4190();
                }
                class8321.method27693(1);
            }
            return true;
        }
        return false;
    }
}
