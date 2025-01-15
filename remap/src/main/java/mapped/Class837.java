// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Class837 extends Class834
{
    private static String[] field4454;
    
    public Class837(final EntityType<? extends Class837> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public int method4959() {
        return 5;
    }
    
    @Override
    public ItemStack method4956() {
        return new ItemStack(Items.field31360);
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35526;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35527;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35529;
    }
    
    @Override
    public Class7795 method4958() {
        return Class8520.field35528;
    }
}
