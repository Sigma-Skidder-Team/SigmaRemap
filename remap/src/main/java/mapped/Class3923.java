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

import java.util.Random;

public class Class3923 extends Class3922
{
    private static String[] field17784;
    private final Block field17785;
    public static final VoxelShape field17786;
    
    public Class3923(final Block field17785, final Properties class9288) {
        super(class9288);
        this.field17785 = field17785;
    }
    
    @Override
    public void onBlockAdded(final BlockState class7096, final World class7097, final BlockPos class7098, final BlockState class7099, final boolean b) {
        this.method12037(class7096, class7097, class7098);
    }
    
    @Override
    public void method11822(final BlockState class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (!Class3922.method12038(class7096, class7097, class7098)) {
            class7097.setBlockState(class7098, ((StateHolder<O, BlockState>)this.field17785.getDefaultState()).with((IProperty<Comparable>)Class3923.field17782, false), 2);
        }
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7097 == Direction.DOWN && !class7096.method21752(class7099, class7100)) {
            return Blocks.AIR.getDefaultState();
        }
        this.method12037(class7096, class7099, class7100);
        if (class7096.get((IProperty<Boolean>)Class3923.field17782)) {
            class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3923.field17786;
    }
    
    static {
        field17786 = Block.method11778(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);
    }
}
