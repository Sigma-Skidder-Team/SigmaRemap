// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class Class4014 extends Block
{
    private static String[] field18085;
    public static final Class7113 field18086;
    public static final VoxelShape field18087;
    public static final VoxelShape field18088;
    
    public Class4014(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, Class7096>)this.field17406.method32903()).with((IProperty<Comparable>)Class4014.field18086, false));
    }
    
    @Nullable
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        for (final Direction class7075 : class7074.method21643()) {
            if (class7075.getAxis() == Direction.Axis.Y) {
                final Class7096 class7076 = ((StateHolder<O, Class7096>)this.getDefaultState()).with((IProperty<Comparable>)Class4014.field18086, class7075 == Direction.UP);
                if (class7076.method21752(class7074.method21654(), class7074.method21639())) {
                    return class7076;
                }
            }
        }
        return null;
    }
    
    @Override
    public VoxelShape method11808(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return class7096.method21772((IProperty<Boolean>)Class4014.field18086) ? Class4014.field18088 : Class4014.field18087;
    }
    
    @Override
    public void method11875(final Class9500<Block, Class7096> class9500) {
        class9500.method35378(Class4014.field18086);
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final BlockPos class7098) {
        final Direction method782 = method12196(class7096).getOpposite();
        return Block.method11813(class7097, class7098.method1149(method782), method782.getOpposite());
    }
    
    public static Direction method12196(final Class7096 class7096) {
        return class7096.method21772((IProperty<Boolean>)Class4014.field18086) ? Direction.DOWN : Direction.UP;
    }
    
    @Override
    public PushReaction method11858(final Class7096 class7096) {
        return PushReaction.DESTROY;
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        return (method12196(class7096).getOpposite() == class7097 && !class7096.method21752(class7099, class7100)) ? Class7521.field29147.getDefaultState() : super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field18086 = Class8970.field37728;
        field18087 = VoxelShapes.method24492(Block.method11778(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), Block.method11778(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
        field18088 = VoxelShapes.method24492(Block.method11778(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), Block.method11778(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));
    }
}
