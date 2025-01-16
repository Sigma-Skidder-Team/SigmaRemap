// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class Class3835 extends Class3834
{
    private static String[] field17416;
    public static final Class7114<Class178> field17417;
    public static final Class7113 field17418;
    public static final VoxelShape field17419;
    public static final VoxelShape field17420;
    public static final VoxelShape field17421;
    public static final VoxelShape field17422;
    public static final VoxelShape field17423;
    public static final VoxelShape field17424;
    public static final VoxelShape field17425;
    public static final VoxelShape field17426;
    public static final VoxelShape field17427;
    public static final VoxelShape field17428;
    public static final VoxelShape field17429;
    public static final VoxelShape field17430;
    public static final VoxelShape field17431;
    public static final VoxelShape field17432;
    public static final VoxelShape field17433;
    public static final VoxelShape field17434;
    public static final VoxelShape field17435;
    public static final VoxelShape field17436;
    
    public Class3835(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class3835.field17415, Direction.NORTH)).with(Class3835.field17417, Class178.field507)).with((IProperty<Comparable>)Class3835.field17418, false));
    }
    
    private VoxelShape method11890(final BlockState class7096) {
        switch (Class9565.field41155[class7096.get((IProperty<Direction>)Class3835.field17415).ordinal()]) {
            default: {
                return Class3835.field17424;
            }
            case 2: {
                return Class3835.field17423;
            }
            case 3: {
                return Class3835.field17422;
            }
            case 4: {
                return Class3835.field17421;
            }
            case 5: {
                return Class3835.field17420;
            }
            case 6: {
                return Class3835.field17419;
            }
        }
    }
    
    @Override
    public boolean isTransparent(final BlockState class7096) {
        return true;
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return VoxelShapes.method24492(this.method11890(class7096), this.method11891(class7096));
    }
    
    private VoxelShape method11891(final BlockState class7096) {
        final boolean booleanValue = class7096.get((IProperty<Boolean>)Class3835.field17418);
        switch (Class9565.field41155[class7096.get((IProperty<Direction>)Class3835.field17415).ordinal()]) {
            default: {
                return booleanValue ? Class3835.field17432 : Class3835.field17426;
            }
            case 2: {
                return booleanValue ? Class3835.field17431 : Class3835.field17425;
            }
            case 3: {
                return booleanValue ? Class3835.field17434 : Class3835.field17428;
            }
            case 4: {
                return booleanValue ? Class3835.field17433 : Class3835.field17427;
            }
            case 5: {
                return booleanValue ? Class3835.field17436 : Class3835.field17430;
            }
            case 6: {
                return booleanValue ? Class3835.field17435 : Class3835.field17429;
            }
        }
    }
    
    @Override
    public void method11870(final World class1847, final BlockPos class1848, final BlockState class1849, final PlayerEntity class1850) {
        if (!class1847.isRemote) {
            if (class1850.field3025.field27304) {
                final BlockPos method1149 = class1848.method1149(class1849.get((IProperty<Direction>)Class3835.field17415).getOpposite());
                final Block method1150 = class1847.getBlockState(method1149).method21696();
                if (method1150 == Class7521.field29246 || method1150 == Class7521.field29239) {
                    class1847.method6690(method1149, false);
                }
            }
        }
        super.method11870(class1847, class1848, class1849, class1850);
    }
    
    @Override
    public void method11829(final BlockState class7096, final World class7097, BlockPos method1149, final BlockState class7098, final boolean b) {
        if (class7096.getBlock() != class7098.getBlock()) {
            super.method11829(class7096, class7097, method1149, class7098, b);
            method1149 = method1149.method1149(class7096.get((IProperty<Direction>)Class3835.field17415).getOpposite());
            final BlockState method1150 = class7097.getBlockState(method1149);
            if (method1150.getBlock() == Class7521.field29246 || method1150.getBlock() == Class7521.field29239) {
                if (method1150.get((IProperty<Boolean>)Class3836.field17438)) {
                    Block.method11836(method1150, class7097, method1149);
                    class7097.method6690(method1149, false);
                }
            }
        }
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        return (class7097.getOpposite() == class7096.get((IProperty<Direction>)Class3835.field17415) && !class7096.method21752(class7099, class7100)) ? Class7521.field29147.getDefaultState() : super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public boolean method11843(final BlockState class7096, final Class1852 class7097, final BlockPos class7098) {
        final Block method21696 = class7097.getBlockState(class7098.method1149(class7096.get((IProperty<Direction>)Class3835.field17415).getOpposite())).getBlock();
        if (method21696 != Class7521.field29246) {
            if (method21696 != Class7521.field29239) {
                if (method21696 != Class7521.field29264) {
                    return false;
                }
            }
        }
        return true;
    }
    
    @Override
    public void method11825(final BlockState class7096, final World class7097, final BlockPos class7098, final Block class7099, final BlockPos class7100, final boolean b) {
        if (class7096.method21752(class7097, class7098)) {
            final BlockPos method1149 = class7098.method1149(class7096.get((IProperty<Direction>)Class3835.field17415).getOpposite());
            class7097.getBlockState(method1149).method21734(class7097, method1149, class7099, class7100, false);
        }
    }
    
    @Override
    public ItemStack method11862(final IBlockReader class1855, final BlockPos class1856, final BlockState class1857) {
        return new ItemStack((class1857.get(Class3835.field17417) != Class178.field508) ? Class7521.field29246 : Class7521.field29239);
    }
    
    @Override
    public BlockState method11790(final BlockState class7096, final Class2052 class7097) {
        return ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3835.field17415, class7097.method8142(class7096.get((IProperty<Direction>)Class3835.field17415)));
    }
    
    @Override
    public BlockState method11791(final BlockState class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.get((IProperty<Direction>)Class3835.field17415)));
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3835.field17415, Class3835.field17417, Class3835.field17418);
    }
    
    @Override
    public boolean method11796(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field17417 = Class8970.field37799;
        field17418 = Class8970.field37742;
        field17419 = Block.method11778(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
        field17420 = Block.method11778(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
        field17421 = Block.method11778(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
        field17422 = Block.method11778(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
        field17423 = Block.method11778(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
        field17424 = Block.method11778(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
        field17425 = Block.method11778(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
        field17426 = Block.method11778(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
        field17427 = Block.method11778(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
        field17428 = Block.method11778(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
        field17429 = Block.method11778(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
        field17430 = Block.method11778(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
        field17431 = Block.method11778(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
        field17432 = Block.method11778(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
        field17433 = Block.method11778(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
        field17434 = Block.method11778(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
        field17435 = Block.method11778(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
        field17436 = Block.method11778(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
    }
}
