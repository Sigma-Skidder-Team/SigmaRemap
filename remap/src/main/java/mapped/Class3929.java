// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class Class3929 extends Class3854
{
    private static String[] field17464;
    private final VoxelShape[] field17796;
    
    public Class3929(final Class9288 class9288) {
        super(2.0f, 2.0f, 16.0f, 16.0f, 24.0f, class9288);
        this.method11877(((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class3929.field17465, false)).with((IProperty<Comparable>)Class3929.field17466, false)).with((IProperty<Comparable>)Class3929.field17467, false)).with((IProperty<Comparable>)Class3929.field17468, false)).with((IProperty<Comparable>)Class3929.field17469, false));
        this.field17796 = this.method11914(2.0f, 1.0f, 16.0f, 6.0f, 15.0f);
    }
    
    @Override
    public VoxelShape method11810(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        return this.field17796[this.method11916(class7096)];
    }
    
    @Override
    public boolean method11796(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    public boolean method12039(final BlockState class7096, final boolean b, final Direction class7097) {
        final Block method21696 = class7096.getBlock();
        final boolean b2 = method21696.method11785(Class7188.field27911) && class7096.getMaterial() == this.field17401;
        final boolean b3 = method21696 instanceof Class3898 && Class3898.method11983(class7096, class7097);
        if (Block.method11792(method21696) || !b) {
            if (!b2) {
                if (!b3) {
                    return false;
                }
            }
        }
        return true;
    }
    
    @Override
    public Class2201 method11844(final BlockState class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final BlockRayTraceResult class7101) {
        if (!class7097.isRemote) {
            return Class4079.method12284(class7099, class7097, class7098);
        }
        return (class7099.method2715(class7100).getItem() != Items.field31551) ? Class2201.field13402 : Class2201.field13400;
    }
    
    @Override
    public BlockState method11846(final Class7074 class7074) {
        final World method21654 = class7074.method21654();
        final BlockPos method21655 = class7074.method21639();
        final IFluidState method21656 = class7074.method21654().getFluidState(class7074.method21639());
        final BlockPos method21657 = method21655.method1141();
        final BlockPos method21658 = method21655.method1147();
        final BlockPos method21659 = method21655.method1143();
        final BlockPos method21660 = method21655.method1145();
        final BlockState method21661 = method21654.getBlockState(method21657);
        final BlockState method21662 = method21654.getBlockState(method21658);
        final BlockState method21663 = method21654.getBlockState(method21659);
        final BlockState method21664 = method21654.getBlockState(method21660);
        return (BlockState)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)super.method11846(class7074)).with((IProperty<Comparable>)Class3929.field17465, this.method12039(method21661, method21661.isSolidSide(method21654, method21657, Direction.SOUTH), Direction.SOUTH))).with((IProperty<Comparable>)Class3929.field17466, this.method12039(method21662, method21662.isSolidSide(method21654, method21658, Direction.WEST), Direction.WEST))).with((IProperty<Comparable>)Class3929.field17467, this.method12039(method21663, method21663.isSolidSide(method21654, method21659, Direction.NORTH), Direction.NORTH))).with((IProperty<Comparable>)Class3929.field17468, this.method12039(method21664, method21664.isSolidSide(method21654, method21660, Direction.EAST), Direction.EAST))).with((IProperty<Comparable>)Class3929.field17469, method21656.getFluid() == Class7558.field29976);
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7096.get((IProperty<Boolean>)Class3929.field17469)) {
            class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        }
        return (class7097.getAxis().getPlane() != Plane.HORIZONTAL) ? super.method11789(class7096, class7097, class7098, class7099, class7100, class7101) : ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3929.field17470.get(class7097), this.method12039(class7098, class7098.isSolidSide(class7099, class7101, class7097.getOpposite()), class7097.getOpposite()));
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3929.field17465, Class3929.field17466, Class3929.field17468, Class3929.field17467, Class3929.field17469);
    }
}
