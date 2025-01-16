// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Class4084 extends Item
{
    private static String[] field18188;
    
    public Class4084(final Class8959 class8959) {
        super(class8959);
    }
    
    @Override
    public ItemStack method11707(final ItemStack class8321, final World class8322, final LivingEntity class8323) {
        super.method11707(class8321, class8322, class8323);
        if (class8323 instanceof Class513) {
            final Class513 class8324 = (Class513)class8323;
            Class7770.field31800.method13819(class8324, class8321);
            class8324.method2859(Class8276.field33981.method8449(this));
        }
        if (!class8322.isRemote) {
            class8323.method2659(Class9439.field40492);
        }
        if (!class8321.method27620()) {
            if (class8323 instanceof PlayerEntity) {
                if (!((PlayerEntity)class8323).field3025.field27304) {
                    final ItemStack class8325 = new ItemStack(Items.field31442);
                    final PlayerEntity class8326 = (PlayerEntity)class8323;
                    if (!class8326.field3006.method2362(class8325)) {
                        class8326.method2822(class8325, false);
                    }
                }
            }
            return class8321;
        }
        return new ItemStack(Items.field31442);
    }
    
    @Override
    public int method11726(final ItemStack class8321) {
        return 40;
    }
    
    @Override
    public Class1992 method11725(final ItemStack class8321) {
        return Class1992.field11156;
    }
    
    @Override
    public Class7795 method11745() {
        return Class8520.field35271;
    }
    
    @Override
    public Class7795 method11746() {
        return Class8520.field35271;
    }
    
    @Override
    public Class9355<ItemStack> method11695(final World class1847, final PlayerEntity class1848, final Class316 class1849) {
        class1848.method2762(class1849);
        return Class9355.method34674(class1848.method2715(class1849));
    }
}
