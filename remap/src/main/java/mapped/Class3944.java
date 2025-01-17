// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public abstract class Class3944 extends Class3841
{
    private final Class181 field17837;
    
    public Class3944(final Class181 field17837, final Properties class9288) {
        super(class9288);
        this.field17837 = field17837;
    }
    
    @Override
    public boolean method11854() {
        return true;
    }
    
    @Override
    public TileEntity method11898(final IBlockReader class1855) {
        return new Class465(this.field17837);
    }
    
    @Override
    public void method11853(final World class1847, final BlockPos class1848, final Class7096 class1849, final LivingEntity class1850, final ItemStack class1851) {
        if (class1851.method27667()) {
            final TileEntity method6727 = class1847.getTileEntity(class1848);
            if (method6727 instanceof Class465) {
                ((Class465)method6727).method2384(class1851.method27664());
            }
        }
    }
    
    @Override
    public ItemStack method11862(final IBlockReader class1855, final BlockPos class1856, final Class7096 class1857) {
        final TileEntity method6727 = class1855.getTileEntity(class1856);
        return (method6727 instanceof Class465) ? ((Class465)method6727).method2389(class1857) : super.method11862(class1855, class1856, class1857);
    }
    
    public Class181 method12064() {
        return this.field17837;
    }
}
