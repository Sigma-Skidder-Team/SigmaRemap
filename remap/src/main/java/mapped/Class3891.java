// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public class Class3891 extends Class3892 implements Class3872
{
    private static String[] field17558;
    public static final Class7112 field17559;
    public static final VoxelShape[] field17560;
    public static final VoxelShape[] field17561;
    public static final VoxelShape[] field17562;
    public static final VoxelShape[] field17563;
    
    public Class3891(final Properties class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class3891.field17564, Direction.NORTH)).with((IProperty<Comparable>)Class3891.field17559, 0));
    }
    
    @Override
    public void method11822(final BlockState class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (class7097.rand.nextInt(5) == 0) {
            final int intValue = class7096.get(Class3891.field17559);
            if (intValue < 2) {
                class7097.setBlockState(class7098, (BlockState)((StateHolder<Object, Object>)class7096).with((IProperty<Comparable>)Class3891.field17559, intValue + 1), 2);
            }
        }
    }
    
    @Override
    public boolean method11843(final BlockState class7096, final Class1852 class7097, final BlockPos class7098) {
        return class7097.getBlockState(class7098.method1149(class7096.get(Class3891.field17564))).getBlock().method11785(Class7188.field27898);
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        final int intValue = class7096.get(Class3891.field17559);
        switch (Class8486.field34829[class7096.get(Class3891.field17564).ordinal()]) {
            case 1: {
                return Class3891.field17563[intValue];
            }
            default: {
                return Class3891.field17562[intValue];
            }
            case 3: {
                return Class3891.field17561[intValue];
            }
            case 4: {
                return Class3891.field17560[intValue];
            }
        }
    }
    
    @Nullable
    @Override
    public BlockState method11846(final Class7074 class7074) {
        BlockState method11878 = this.getDefaultState();
        final World method11879 = class7074.method21654();
        final BlockPos method11880 = class7074.method21639();
        for (final Direction class7075 : class7074.method21643()) {
            if (class7075.getAxis().isHorizontal()) {
                method11878 = ((StateHolder<Object, BlockState>)method11878).with((IProperty<Comparable>)Class3891.field17564, class7075);
                if (method11878.method21752(method11879, method11880)) {
                    return method11878;
                }
            }
        }
        return null;
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        return (class7097 == class7096.get(Class3891.field17564) && !class7096.method21752(class7099, class7100)) ? Blocks.AIR.getDefaultState() : super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public boolean method11945(final IBlockReader class1855, final BlockPos class1856, final BlockState class1857, final boolean b) {
        return class1857.get(Class3891.field17559) < 2;
    }
    
    @Override
    public boolean method11946(final World class1847, final Random random, final BlockPos class1848, final BlockState class1849) {
        return true;
    }
    
    @Override
    public void method11947(final Class1849 class1849, final Random random, final BlockPos class1850, final BlockState class1851) {
        class1849.setBlockState(class1850, ((StateHolder<O, BlockState>)class1851).with((IProperty<Comparable>)Class3891.field17559, class1851.get(Class3891.field17559) + 1), 2);
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3891.field17564, Class3891.field17559);
    }
    
    static {
        field17559 = Class8970.field37770;
        field17560 = new VoxelShape[] { Block.method11778(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), Block.method11778(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), Block.method11778(7.0, 3.0, 4.0, 15.0, 12.0, 12.0) };
        field17561 = new VoxelShape[] { Block.method11778(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), Block.method11778(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), Block.method11778(1.0, 3.0, 4.0, 9.0, 12.0, 12.0) };
        field17562 = new VoxelShape[] { Block.method11778(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), Block.method11778(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), Block.method11778(4.0, 3.0, 1.0, 12.0, 12.0, 9.0) };
        field17563 = new VoxelShape[] { Block.method11778(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), Block.method11778(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), Block.method11778(4.0, 3.0, 7.0, 12.0, 12.0, 15.0) };
    }
}
