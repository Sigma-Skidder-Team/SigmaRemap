// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;

public class Class4104 extends Item
{
    private static String[] field18204;
    
    public Class4104(final Properties properties) {
        super(properties);
    }
    
    @Override
    public boolean method11714(final ItemStack class8321, final PlayerEntity class8322, final LivingEntity class8323, final Class316 class8324) {
        if (class8323 instanceof Class801) {
            final Class801 class8325 = (Class801)class8323;
            if (class8325.isAlive()) {
                if (!class8325.method4625()) {
                    if (!class8325.method2625()) {
                        class8325.method4626(true);
                        class8325.world.method6706(class8322, class8325.getPosX(), class8325.getPosY(), class8325.getPosZ(), Class8520.field35463, Class286.field1584, 0.5f, 1.0f);
                        class8321.method27693(1);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
