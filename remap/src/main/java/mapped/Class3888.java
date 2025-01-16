// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Iterator;
import java.util.Random;

public class Class3888 extends Class3874 implements Class3872
{
    private static String[] field17519;
    public static final VoxelShape field17550;
    
    public Class3888(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3888.field17550;
    }
    
    @Override
    public void method11822(final BlockState class7096, final Class1849 class7097, BlockPos class7098, final Random random) {
        if (random.nextInt(25) == 0) {
            int n = 5;
            final Iterator<BlockPos> iterator = BlockPos.getAllInBoxMutable(class7098.add(-4, -1, -4), class7098.add(4, 1, 4)).iterator();
            while (iterator.hasNext()) {
                if (class7097.getBlockState(iterator.next()).method21696() == this && --n <= 0) {
                    return;
                }
            }
            BlockPos class7099 = class7098.add(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
            for (int i = 0; i < 4; ++i) {
                if (class7097.method6961(class7099)) {
                    if (class7096.method21752(class7097, class7099)) {
                        class7098 = class7099;
                    }
                }
                class7099 = class7098.add(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
            }
            if (class7097.method6961(class7099)) {
                if (class7096.method21752(class7097, class7099)) {
                    class7097.setBlockState(class7099, class7096, 2);
                }
            }
        }
    }
    
    @Override
    public boolean method11943(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        return class7096.isOpaqueCube(class7097, class7098);
    }
    
    @Override
    public boolean method11843(final BlockState class7096, final Class1852 class7097, final BlockPos class7098) {
        final BlockPos method1139 = class7098.method1139();
        final BlockState method1140 = class7097.getBlockState(method1139);
        final Block method1141 = method1140.getBlock();
        return method1141 == Blocks.field29392 || method1141 == Blocks.PODZOL || (class7097.method6993(class7098, 0) < 13 && this.method11943(method1140, class7097, method1139));
    }
    
    public boolean method11963(final Class1849 class1849, final BlockPos class1850, final BlockState class1851, final Random random) {
        class1849.method6690(class1850, false);
        Class8530<Class5137, ?> class1852;
        if (this != Blocks.BROWN_MUSHROOM) {
            if (this != Blocks.RED_MUSHROOM) {
                class1849.setBlockState(class1850, class1851, 3);
                return false;
            }
            class1852 = Class4535.field19990.method13527(Class9218.field39551);
        }
        else {
            class1852 = Class4535.field19991.method13527(Class9218.field39552);
        }
        if (!class1852.method28613(class1849, (Class6346)class1849.method6904().method7438(), random, class1850)) {
            class1849.setBlockState(class1850, class1851, 3);
            return false;
        }
        return true;
    }
    
    @Override
    public boolean method11945(final IBlockReader class1855, final BlockPos class1856, final BlockState class1857, final boolean b) {
        return true;
    }
    
    @Override
    public boolean method11946(final World class1847, final Random random, final BlockPos class1848, final BlockState class1849) {
        return random.nextFloat() < 0.4;
    }
    
    @Override
    public void method11947(final Class1849 class1849, final Random random, final BlockPos class1850, final BlockState class1851) {
        this.method11963(class1849, class1850, class1851, random);
    }
    
    @Override
    public boolean method11803(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        return true;
    }
    
    static {
        field17550 = Block.method11778(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
    }
}
