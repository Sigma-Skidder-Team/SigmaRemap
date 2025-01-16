// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Iterator;
import java.util.Random;

public class Class3920 extends Block implements Class3856
{
    private static String[] field17768;
    private static final VoxelShape field17769;
    private static final VoxelShape field17770;
    private static final VoxelShape field17771;
    private static final VoxelShape field17772;
    public static final Class7112 field17773;
    public static final Class7113 field17774;
    public static final Class7113 field17775;
    
    public Class3920(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class3920.field17773, 7)).with((IProperty<Comparable>)Class3920.field17774, false)).with((IProperty<Comparable>)Class3920.field17775, false));
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3920.field17773, Class3920.field17774, Class3920.field17775);
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        if (class7099.hasItem(class7096.getBlock().method11704())) {
            return VoxelShapes.fullCube();
        }
        return class7096.get((IProperty<Boolean>)Class3920.field17775) ? Class3920.field17770 : Class3920.field17769;
    }
    
    @Override
    public VoxelShape method11811(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        return VoxelShapes.fullCube();
    }
    
    @Override
    public boolean method11798(final BlockState class7096, final Class7074 class7097) {
        return class7097.method21651().getItem() == this.method11704();
    }
    
    @Override
    public BlockState method11846(final Class7074 class7074) {
        final BlockPos method21639 = class7074.method21639();
        final World method21640 = class7074.method21654();
        final int method21641 = method12036(method21640, method21639);
        return (BlockState)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<O, BlockState>)this.getDefaultState()).with((IProperty<Comparable>)Class3920.field17774, method21640.getFluidState(method21639).getFluid() == Class7558.field29976)).with((IProperty<Comparable>)Class3920.field17773, method21641)).with((IProperty<Comparable>)Class3920.field17775, this.method12035(method21640, method21639, method21641));
    }
    
    @Override
    public void method11828(final BlockState class7096, final World class7097, final BlockPos class7098, final BlockState class7099, final boolean b) {
        if (!class7097.isRemote) {
            class7097.method6833().method21345(class7098, this, 1);
        }
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7096.get((IProperty<Boolean>)Class3920.field17774)) {
            class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        }
        if (!class7099.isRemote()) {
            class7099.method6833().method21345(class7100, this, 1);
        }
        return class7096;
    }
    
    @Override
    public void method11822(final BlockState class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        final int method12036 = method12036(class7097, class7098);
        final BlockState class7099 = ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3920.field17773, method12036)).with((IProperty<Comparable>)Class3920.field17775, this.method12035(class7097, class7098, method12036));
        if (((StateHolder<Object, BlockState>)class7099).get((IProperty<Integer>)Class3920.field17773) != 7) {
            if (class7096 != class7099) {
                class7097.setBlockState(class7098, class7099, 3);
            }
        }
        else if (class7096.get((IProperty<Integer>)Class3920.field17773) != 7) {
            class7097.method7149(class7098, true);
        }
        else {
            class7097.method6886(new Class424(class7097, class7098.getX() + 0.5, class7098.getY(), class7098.getZ() + 0.5, ((StateHolder<Object, BlockState>)class7099).with((IProperty<Comparable>)Class3920.field17774, false)));
        }
    }
    
    @Override
    public boolean method11843(final BlockState class7096, final Class1852 class7097, final BlockPos class7098) {
        return method12036(class7097, class7098) < 7;
    }
    
    @Override
    public VoxelShape method11809(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        if (class7099.func_216378_a(VoxelShapes.fullCube(), class7098, true) && !class7099.func_225581_b_()) {
            return Class3920.field17769;
        }
        if (class7096.get((IProperty<Integer>)Class3920.field17773) != 0) {
            if (class7096.get((IProperty<Boolean>)Class3920.field17775)) {
                if (class7099.func_216378_a(Class3920.field17772, class7098, true)) {
                    return Class3920.field17771;
                }
            }
        }
        return VoxelShapes.empty();
    }
    
    @Override
    public IFluidState method11864(final BlockState class7096) {
        return class7096.get((IProperty<Boolean>)Class3920.field17774) ? Class7558.field29976.method22177(false) : super.method11864(class7096);
    }
    
    private boolean method12035(final IBlockReader class1855, final BlockPos class1856, final int n) {
        return n > 0 && class1855.getBlockState(class1856.method1139()).getBlock() != this;
    }
    
    public static int method12036(final IBlockReader class1855, final BlockPos class1856) {
        final Mutable method1290 = new Mutable(class1856).method1290(Direction.DOWN);
        final BlockState method1291 = class1855.getBlockState(method1290);
        int a = 7;
        if (method1291.getBlock() != Class7521.field29805) {
            if (method1291.isSolidSide(class1855, method1290, Direction.UP)) {
                return 0;
            }
        }
        else {
            a = method1291.get((IProperty<Integer>)Class3920.field17773);
        }
        final Iterator<Direction> iterator = Plane.HORIZONTAL.iterator();
        while (iterator.hasNext()) {
            final BlockState method1292 = class1855.getBlockState(method1290.method1287(class1856).method1290(iterator.next()));
            if (method1292.getBlock() != Class7521.field29805) {
                continue;
            }
            a = Math.min(a, method1292.get((IProperty<Integer>)Class3920.field17773) + 1);
            if (a != 1) {
                continue;
            }
            break;
        }
        return a;
    }
    
    static {
        field17771 = Block.method11778(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
        field17772 = VoxelShapes.fullCube().withOffset(0.0, -1.0, 0.0);
        field17773 = Class8970.field37792;
        field17774 = Class8970.field37747;
        field17775 = Class8970.field37720;
        field17769 = VoxelShapes.method24493(Block.method11778(0.0, 14.0, 0.0, 16.0, 16.0, 16.0), Block.method11778(0.0, 0.0, 0.0, 2.0, 16.0, 2.0), Block.method11778(14.0, 0.0, 0.0, 16.0, 16.0, 2.0), Block.method11778(0.0, 0.0, 14.0, 2.0, 16.0, 16.0), Block.method11778(14.0, 0.0, 14.0, 16.0, 16.0, 16.0));
        field17770 = VoxelShapes.method24493(Class3920.field17771, Class3920.field17769, Block.method11778(14.0, 0.0, 0.0, 16.0, 2.0, 16.0), Block.method11778(0.0, 0.0, 0.0, 2.0, 2.0, 16.0), Block.method11778(0.0, 0.0, 0.0, 16.0, 2.0, 2.0), Block.method11778(0.0, 0.0, 14.0, 16.0, 2.0, 16.0));
    }
}
