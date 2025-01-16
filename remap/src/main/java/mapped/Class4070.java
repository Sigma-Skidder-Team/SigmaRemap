// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class Class4070 extends Item
{
    private static String[] field18164;
    
    public Class4070(final Class8959 class8959) {
        super(class8959);
    }
    
    @Override
    public ItemStack method11707(final ItemStack class8321, final World class8322, final LivingEntity class8323) {
        final ItemStack method11707 = super.method11707(class8321, class8322, class8323);
        if (!class8322.isRemote) {
            final double method11708 = class8323.getPosX();
            final double method11709 = class8323.getPosY();
            final double method11710 = class8323.getPosZ();
            for (int i = 0; i < 16; ++i) {
                final double n = class8323.getPosX() + (class8323.method2633().nextDouble() - 0.5) * 16.0;
                final double method11711 = MathHelper.clamp(class8323.getPosY() + (class8323.method2633().nextInt(16) - 8), 0.0, class8322.method6778() - 1);
                final double n2 = class8323.getPosZ() + (class8323.method2633().nextDouble() - 0.5) * 16.0;
                if (class8323.isPassenger()) {
                    class8323.stopRiding();
                }
                if (class8323.method2775(n, method11711, n2, true)) {
                    class8322.method6706(null, method11708, method11709, method11710, Class8520.field35075, Class286.field1585, 1.0f, 1.0f);
                    class8323.method1695(Class8520.field35075, 1.0f, 1.0f);
                    break;
                }
            }
            if (class8323 instanceof PlayerEntity) {
                ((PlayerEntity)class8323).method2906().method25772(this, 20);
            }
        }
        return method11707;
    }
}
