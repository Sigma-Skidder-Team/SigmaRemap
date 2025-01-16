// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;

public class Class3977 extends Block
{
    private static String[] field17966;
    public static final Class7112 field17967;
    public static final VoxelShape field17968;
    public static final VoxelShape field17969;
    
    public Class3977(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class3977.field17967, 0));
    }
    
    @Override
    public void method11822(final BlockState class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (class7096.method21752(class7097, class7098)) {
            final BlockPos method1137 = class7098.method1137();
            if (class7097.method6961(method1137)) {
                int n;
                for (n = 1; class7097.getBlockState(class7098.method1140(n)).method21696() == this; ++n) {}
                if (n < 3) {
                    final int intValue = class7096.get((IProperty<Integer>)Class3977.field17967);
                    if (intValue != 15) {
                        class7097.setBlockState(class7098, (BlockState)((StateHolder<Object, Object>)class7096).with((IProperty<Comparable>)Class3977.field17967, intValue + 1), 4);
                    }
                    else {
                        class7097.method6692(method1137, this.getDefaultState());
                        final BlockState class7099 = ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3977.field17967, 0);
                        class7097.setBlockState(class7098, class7099, 4);
                        class7099.method21734(class7097, method1137, this, class7098, false);
                    }
                }
            }
        }
        else {
            class7097.method7149(class7098, true);
        }
    }
    
    @Override
    public VoxelShape method11809(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3977.field17968;
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3977.field17969;
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (!class7096.method21752(class7099, class7100)) {
            class7099.method6833().method21345(class7100, this, 1);
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public boolean method11843(final BlockState class7096, final Class1852 class7097, final BlockPos class7098) {
        for (final Direction class7099 : Plane.HORIZONTAL) {
            if (!class7097.getBlockState(class7098.method1149(class7099)).getMaterial().method26439() && !class7097.getFluidState(class7098.method1149(class7099)).isTagged(Class7324.field28320)) {
                continue;
            }
            return false;
        }
        final Block method21696 = class7097.getBlockState(class7098.method1139()).getBlock();
        if (method21696 != Blocks.field29332) {
            if (method21696 != Blocks.field29175) {
                if (method21696 != Blocks.field29176) {
                    return false;
                }
            }
        }
        if (!class7097.getBlockState(class7098.method1137()).getMaterial().method26438()) {
            return true;
        }
        return false;
    }
    
    @Override
    public void method11850(final BlockState class7096, final World class7097, final BlockPos class7098, final Entity class7099) {
        class7099.attackEntityFrom(DamageSource.field32571, 1.0f);
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3977.field17967);
    }
    
    @Override
    public boolean method11796(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field17967 = Class8970.field37774;
        field17968 = Block.method11778(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
        field17969 = Block.method11778(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
    }
}
