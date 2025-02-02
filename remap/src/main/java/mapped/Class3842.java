// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class Class3842 extends Class3841 implements Class3843
{
    private static String[] field17452;
    
    public Class3842(final Properties class9288) {
        super(class9288);
    }
    
    @Override
    public Class181 method11900() {
        return Class181.field537;
    }
    
    @Override
    public TileEntity method11898(final IBlockReader class1855) {
        return new Class490();
    }
    
    @Override
    public Class2201 method11844(final BlockState class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final BlockRayTraceResult class7101) {
        if (!class7097.isRemote) {
            final TileEntity method6727 = class7097.getTileEntity(class7098);
            if (method6727 instanceof Class490) {
                class7099.method2833((INamedContainerProvider)method6727);
                class7099.method2857(Class8276.field34030);
            }
            return Class2201.field13400;
        }
        return Class2201.field13400;
    }
    
    @Override
    public boolean method11793(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        return false;
    }
    
    @Override
    public Class2115 method11797(final BlockState class7096) {
        return Class2115.field12307;
    }
    
    @Override
    public void method11853(final World class1847, final BlockPos class1848, final BlockState class1849, final LivingEntity class1850, final ItemStack class1851) {
        if (class1851.method27667()) {
            final TileEntity method6727 = class1847.getTileEntity(class1848);
            if (method6727 instanceof Class490) {
                ((Class490)method6727).method2453(class1851.method27664());
            }
        }
    }
}
