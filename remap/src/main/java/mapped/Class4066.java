// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Class4066 extends Item
{
    private static String[] field18159;
    
    public Class4066(final Class8959 class8959) {
        super(class8959);
    }
    
    @Override
    public ItemStack method11707(final ItemStack class8321, final World class8322, final LivingEntity class8323) {
        final ItemStack method11707 = super.method11707(class8321, class8322, class8323);
        return (class8323 instanceof Class512 && ((Class512)class8323).field3025.field27304) ? method11707 : new ItemStack(Items.field31300);
    }
}
