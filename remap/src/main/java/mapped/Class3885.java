// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

import java.util.Random;

public class Class3885 extends Class3874
{
    private static String[] field17544;
    public static final Class7112 field17545;
    private static final VoxelShape[] field17546;
    
    public Class3885(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class3885.field17545, 0));
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3885.field17546[class7096.get((IProperty<Integer>)Class3885.field17545)];
    }
    
    @Override
    public boolean method11943(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        return class7096.getBlock() == Blocks.field29339;
    }
    
    @Override
    public void method11822(BlockState class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        final int intValue = class7096.get((IProperty<Integer>)Class3885.field17545);
        if (intValue < 3) {
            if (random.nextInt(10) == 0) {
                class7096 = (BlockState)((StateHolder<Object, Object>)class7096).with((IProperty<Comparable>)Class3885.field17545, intValue + 1);
                class7097.setBlockState(class7098, class7096, 2);
            }
        }
        super.method11822(class7096, class7097, class7098, random);
    }
    
    @Override
    public ItemStack method11862(final IBlockReader class1855, final BlockPos class1856, final BlockState class1857) {
        return new ItemStack(Items.field31440);
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3885.field17545);
    }
    
    static {
        field17545 = Class8970.field37771;
        field17546 = new VoxelShape[] { Block.method11778(0.0, 0.0, 0.0, 16.0, 5.0, 16.0), Block.method11778(0.0, 0.0, 0.0, 16.0, 8.0, 16.0), Block.method11778(0.0, 0.0, 0.0, 16.0, 11.0, 16.0), Block.method11778(0.0, 0.0, 0.0, 16.0, 14.0, 16.0) };
    }
}
