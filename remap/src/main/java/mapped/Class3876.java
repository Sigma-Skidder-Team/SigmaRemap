// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;

public class Class3876 extends Class3874 implements Class3872
{
    private static String[] field17524;
    public static final Class7112 field17525;
    public static final VoxelShape field17526;
    private final Class5827 field17527;
    
    public Class3876(final Class5827 field17527, final Properties class9288) {
        super(class9288);
        this.field17527 = field17527;
        this.method11877(((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class3876.field17525, 0));
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3876.field17526;
    }
    
    @Override
    public void method11822(final BlockState class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        super.method11822(class7096, class7097, class7098, random);
        if (class7097.method6969(class7098.method1137()) >= 9) {
            if (random.nextInt(7) == 0) {
                this.method11951(class7097, class7098, class7096, random);
            }
        }
    }
    
    public void method11951(final Class1849 class1849, final BlockPos class1850, final BlockState class1851, final Random random) {
        if (class1851.get(Class3876.field17525) != 0) {
            this.field17527.method17514(class1849, class1849.method6904().method7438(), class1850, class1851, random);
        }
        else {
            class1849.setBlockState(class1850, class1851.method21768((IProperty<Comparable>)Class3876.field17525), 4);
        }
    }
    
    @Override
    public boolean method11945(final IBlockReader class1855, final BlockPos class1856, final BlockState class1857, final boolean b) {
        return true;
    }
    
    @Override
    public boolean method11946(final World class1847, final Random random, final BlockPos class1848, final BlockState class1849) {
        return class1847.rand.nextFloat() < 0.45;
    }
    
    @Override
    public void method11947(final Class1849 class1849, final Random random, final BlockPos class1850, final BlockState class1851) {
        this.method11951(class1849, class1850, class1851, random);
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3876.field17525);
    }
    
    static {
        field17525 = Class8970.field37791;
        field17526 = Block.method11778(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
    }
}
