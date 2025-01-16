// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class3919 extends Class3841 implements Class3856
{
    private static String[] field17765;
    public static final Class7113 field17766;
    public static final VoxelShape field17767;
    
    public Class3919(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class3919.field17766, true));
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3919.field17766);
    }
    
    @Override
    public TileEntity method11898(final Class1855 class1855) {
        return new Class492();
    }
    
    @Override
    public Class2115 method11797(final BlockState class7096) {
        return Class2115.field12306;
    }
    
    @Override
    public IFluidState method11864(final BlockState class7096) {
        return class7096.get((IProperty<Boolean>)Class3919.field17766) ? Class7558.field29976.method22177(false) : super.method11864(class7096);
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7096.get((IProperty<Boolean>)Class3919.field17766)) {
            class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3919.field17767;
    }
    
    @Override
    public void method11853(final World class1847, final BlockPos class1848, final BlockState class1849, final LivingEntity class1850, final ItemStack class1851) {
        if (class1851.method27667()) {
            final TileEntity method6727 = class1847.method6727(class1848);
            if (method6727 instanceof Class490) {
                ((Class490)method6727).method2453(class1851.method27664());
            }
        }
    }
    
    @Nullable
    @Override
    public BlockState method11846(final Class7074 class7074) {
        final IFluidState method6702 = class7074.method21654().method6702(class7074.method21639());
        return (BlockState)((StateHolder<Object, Object>)this.getDefaultState()).with((IProperty<Comparable>)Class3919.field17766, method6702.method21793(Class7324.field28319) && method6702.method21784() == 8);
    }
    
    @Override
    public boolean method11796(final BlockState class7096, final Class1855 class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field17766 = Class8970.field37747;
        field17767 = Block.method11778(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);
    }
}
