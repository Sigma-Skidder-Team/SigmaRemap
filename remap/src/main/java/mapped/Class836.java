// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Class836 extends Class834
{
    private static String[] field4453;
    
    public Class836(final EntityType<? extends Class836> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public ItemStack method4956() {
        return new ItemStack(Items.field31361);
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35081;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35082;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35084;
    }
    
    @Override
    public Class7795 method4958() {
        return Class8520.field35083;
    }
}
