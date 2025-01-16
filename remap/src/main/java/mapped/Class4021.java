// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Iterator;
import java.util.Random;

public class Class4021 extends Block
{
    private static String[] field18104;
    public static final Class7112 field18105;
    public static final VoxelShape field18106;
    
    public Class4021(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class4021.field18105, 0));
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7097 == Direction.UP) {
            if (!class7096.method21752(class7099, class7100)) {
                class7099.method6833().method21345(class7100, this, 1);
            }
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public boolean method11843(final BlockState class7096, final Class1852 class7097, final BlockPos class7098) {
        final BlockState method6701 = class7097.getBlockState(class7098.method1137());
        if (method6701.getMaterial().method26439()) {
            if (!(method6701.getBlock() instanceof Class3898)) {
                if (!(method6701.getBlock() instanceof Class3960)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    @Override
    public BlockState method11846(final Class7074 class7074) {
        return this.getDefaultState().method21752(class7074.method21654(), class7074.method21639()) ? super.method11846(class7074) : Class7521.field29156.getDefaultState();
    }
    
    @Override
    public boolean isTransparent(final BlockState class7096) {
        return true;
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class4021.field18106;
    }
    
    @Override
    public void method11822(final BlockState class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (class7096.method21752(class7097, class7098)) {
            final int intValue = class7096.get((IProperty<Integer>)Class4021.field18105);
            if (!method12214(class7097, class7098) && !class7097.method6772(class7098.method1137())) {
                if (intValue <= 0) {
                    if (!method12213(class7097, class7098)) {
                        method12212(class7096, class7097, class7098);
                    }
                }
                else {
                    class7097.setBlockState(class7098, (BlockState)((StateHolder<Object, Object>)class7096).with((IProperty<Comparable>)Class4021.field18105, intValue - 1), 2);
                }
            }
            else if (intValue < 7) {
                class7097.setBlockState(class7098, ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class4021.field18105, 7), 2);
            }
        }
        else {
            method12212(class7096, class7097, class7098);
        }
    }
    
    @Override
    public void method11860(final World class1847, final BlockPos class1848, final Entity class1849, final float n) {
        if (!class1847.isRemote) {
            if (class1847.rand.nextFloat() < n - 0.5f) {
                if (class1849 instanceof LivingEntity) {
                    if (class1849 instanceof PlayerEntity || class1847.method6765().method31216(Class8878.field37316)) {
                        if (class1849.method1930() * class1849.method1930() * class1849.method1931() > 0.512f) {
                            method12212(class1847.getBlockState(class1848), class1847, class1848);
                        }
                    }
                }
            }
        }
        super.method11860(class1847, class1848, class1849, n);
    }
    
    public static void method12212(final BlockState class7096, final World class7097, final BlockPos class7098) {
        class7097.method6692(class7098, Block.method11777(class7096, Class7521.field29156.getDefaultState(), class7097, class7098));
    }
    
    private static boolean method12213(final IBlockReader class1855, final BlockPos class1856) {
        final Block method21696 = class1855.getBlockState(class1856.method1137()).getBlock();
        if (!(method21696 instanceof Class3878)) {
            if (!(method21696 instanceof Class3873)) {
                if (!(method21696 instanceof Class3875)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private static boolean method12214(final Class1852 class1852, final BlockPos class1853) {
        final Iterator<BlockPos> iterator = BlockPos.getAllInBoxMutable(class1853.add(-4, 0, -4), class1853.add(4, 1, 4)).iterator();
        while (iterator.hasNext()) {
            if (!class1852.getFluidState(iterator.next()).isTagged(Class7324.field28319)) {
                continue;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class4021.field18105);
    }
    
    @Override
    public boolean method11796(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    @Override
    public boolean method11795(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        return true;
    }
    
    static {
        field18105 = Class8970.field37787;
        field18106 = Block.method11778(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
    }
}
