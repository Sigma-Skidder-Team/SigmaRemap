// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;

import java.util.Random;

public class Class3954 extends Class3841
{
    private static String[] field17855;
    public static final Class7113[] field17856;
    public static final VoxelShape field17857;
    
    public Class3954(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, Class7096>)((StateHolder<O, Class7096>)((StateHolder<O, Class7096>)this.field17406.method32903()).with((IProperty<Comparable>)Class3954.field17856[0], false)).with((IProperty<Comparable>)Class3954.field17856[1], false)).with((IProperty<Comparable>)Class3954.field17856[2], false));
    }
    
    @Override
    public Class2115 method11797(final Class7096 class7096) {
        return Class2115.field12307;
    }
    
    @Override
    public TileEntity method11898(final Class1855 class1855) {
        return new Class461();
    }
    
    @Override
    public VoxelShape method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3954.field17857;
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class512 class7099, final Class316 class7100, final Class7005 class7101) {
        if (!class7097.isRemote) {
            final TileEntity method6727 = class7097.method6727(class7098);
            if (method6727 instanceof Class461) {
                class7099.method2833((Class434)method6727);
                class7099.method2857(Class8276.field34029);
            }
            return Class2201.field13400;
        }
        return Class2201.field13400;
    }
    
    @Override
    public void method11853(final World class1847, final BlockPos class1848, final Class7096 class1849, final LivingEntity class1850, final ItemStack class1851) {
        if (class1851.method27667()) {
            final TileEntity method6727 = class1847.method6727(class1848);
            if (method6727 instanceof Class461) {
                ((Class461)method6727).method2335(class1851.method27664());
            }
        }
    }
    
    @Override
    public void method11823(final Class7096 class7096, final World class7097, final BlockPos class7098, final Random random) {
        class7097.method6709(Class8432.field34639, class7098.getX() + 0.4 + random.nextFloat() * 0.2, class7098.getY() + 0.7 + random.nextFloat() * 0.3, class7098.getZ() + 0.4 + random.nextFloat() * 0.2, 0.0, 0.0, 0.0);
    }
    
    @Override
    public void method11829(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class7096 class7099, final boolean b) {
        if (class7096.method21696() != class7099.method21696()) {
            final TileEntity method6727 = class7097.method6727(class7098);
            if (method6727 instanceof Class461) {
                Class9193.method33638(class7097, class7098, (Class446)method6727);
            }
            super.method11829(class7096, class7097, class7098, class7099, b);
        }
    }
    
    @Override
    public boolean method11873(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public int method11874(final Class7096 class7096, final World class7097, final BlockPos class7098) {
        return Class3418.method10897(class7097.method6727(class7098));
    }
    
    @Override
    public void method11875(final Class9500<Block, Class7096> class9500) {
        class9500.method35378(Class3954.field17856[0], Class3954.field17856[1], Class3954.field17856[2]);
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field17856 = new Class7113[] { Class8970.field37729, Class8970.field37730, Class8970.field37731 };
        field17857 = VoxelShapes.method24492(Block.method11778(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), Block.method11778(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));
    }
}
