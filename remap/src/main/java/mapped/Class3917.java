// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class3917 extends Block implements Class3856
{
    private static String[] field17751;
    public static final Class7115 field17752;
    public static final Class7113 field17753;
    public static final VoxelShape field17754;
    public static final VoxelShape field17755;
    public static final VoxelShape field17756;
    public static final VoxelShape field17757;
    
    public Class3917(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class3917.field17752, Direction.NORTH)).with((IProperty<Comparable>)Class3917.field17753, false));
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        switch (Class9074.field38422[class7096.get((IProperty<Direction>)Class3917.field17752).ordinal()]) {
            case 1: {
                return Class3917.field17757;
            }
            case 2: {
                return Class3917.field17756;
            }
            case 3: {
                return Class3917.field17755;
            }
            default: {
                return Class3917.field17754;
            }
        }
    }
    
    private boolean method12029(final IBlockReader class1855, final BlockPos class1856, final Direction class1857) {
        final BlockState method6701 = class1855.getBlockState(class1856);
        return !method6701.method21714() && method6701.isSolidSide(class1855, class1856, class1857);
    }
    
    @Override
    public boolean method11843(final BlockState class7096, final Class1852 class7097, final BlockPos class7098) {
        final Direction class7099 = class7096.get((IProperty<Direction>)Class3917.field17752);
        return this.method12029(class7097, class7098.method1149(class7099.getOpposite()), class7099);
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7097.getOpposite() == class7096.get((IProperty<Direction>)Class3917.field17752) && !class7096.method21752(class7099, class7100)) {
            return Class7521.field29147.getDefaultState();
        }
        if (class7096.get((IProperty<Boolean>)Class3917.field17753)) {
            class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Nullable
    @Override
    public BlockState method11846(final Class7074 class7074) {
        if (!class7074.method21641()) {
            final BlockState method6701 = class7074.method21654().getBlockState(class7074.method21639().method1149(class7074.method21648().getOpposite()));
            if (method6701.getBlock() == this) {
                if (((StateHolder<Object, Object>)method6701).get((IProperty<Comparable>)Class3917.field17752) == class7074.method21648()) {
                    return null;
                }
            }
        }
        BlockState method6702 = this.getDefaultState();
        final World method6703 = class7074.method21654();
        final BlockPos method6704 = class7074.method21639();
        final IFluidState method6705 = class7074.method21654().getFluidState(class7074.method21639());
        for (final Direction class7075 : class7074.method21643()) {
            if (class7075.getAxis().isHorizontal()) {
                method6702 = ((StateHolder<Object, BlockState>)method6702).with((IProperty<Comparable>)Class3917.field17752, class7075.getOpposite());
                if (method6702.method21752(method6703, method6704)) {
                    return ((StateHolder<Object, BlockState>)method6702).with((IProperty<Comparable>)Class3917.field17753, method6705.getFluid() == Class7558.field29976);
                }
            }
        }
        return null;
    }
    
    @Override
    public BlockState method11790(final BlockState class7096, final Class2052 class7097) {
        return ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3917.field17752, class7097.method8142(class7096.get((IProperty<Direction>)Class3917.field17752)));
    }
    
    @Override
    public BlockState method11791(final BlockState class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.get((IProperty<Direction>)Class3917.field17752)));
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3917.field17752, Class3917.field17753);
    }
    
    @Override
    public IFluidState method11864(final BlockState class7096) {
        return class7096.get((IProperty<Boolean>)Class3917.field17753) ? Class7558.field29976.method22177(false) : super.method11864(class7096);
    }
    
    static {
        field17752 = Class3892.field17564;
        field17753 = Class8970.field37747;
        field17754 = Block.method11778(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
        field17755 = Block.method11778(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
        field17756 = Block.method11778(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
        field17757 = Block.method11778(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
    }
}
