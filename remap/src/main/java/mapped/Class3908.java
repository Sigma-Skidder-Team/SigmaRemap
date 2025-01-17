// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;

public class Class3908 extends Block implements Class3872
{
    private static String[] field17713;
    public static final VoxelShape field17714;
    
    public Class3908(final Properties class9288) {
        super(class9288);
    }
    
    @Override
    public Class2180 method11879() {
        return Class2180.field12914;
    }
    
    @Override
    public VoxelShape method11808(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        final Vec3d method21732 = class7096.method21732(class7097, class7098);
        return Class3908.field17714.withOffset(method21732.x, method21732.y, method21732.z);
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (random.nextInt(3) == 0) {
            if (class7097.method6961(class7098.method1137())) {
                if (class7097.method6993(class7098.method1137(), 0) >= 9) {
                    this.method12014(class7097, class7098);
                }
            }
        }
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final BlockPos class7098) {
        return class7097.getBlockState(class7098.method1139()).method21755(Class7188.field27925);
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7096.method21752(class7099, class7100)) {
            if (class7097 == Direction.UP) {
                if (class7098.method21696() == Blocks.BAMBOO) {
                    class7099.setBlockState(class7100, Blocks.BAMBOO.getDefaultState(), 2);
                }
            }
            return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
        }
        return Blocks.AIR.getDefaultState();
    }
    
    @Override
    public ItemStack method11862(final IBlockReader class1855, final BlockPos class1856, final Class7096 class1857) {
        return new ItemStack(Items.field31368);
    }
    
    @Override
    public boolean method11945(final IBlockReader class1855, final BlockPos class1856, final Class7096 class1857, final boolean b) {
        return class1855.getBlockState(class1856.method1137()).method21706();
    }
    
    @Override
    public boolean method11946(final World class1847, final Random random, final BlockPos class1848, final Class7096 class1849) {
        return true;
    }
    
    @Override
    public void method11947(final Class1849 class1849, final Random random, final BlockPos class1850, final Class7096 class1851) {
        this.method12014(class1849, class1850);
    }
    
    @Override
    public float method11830(final Class7096 class7096, final PlayerEntity class7097, final IBlockReader class7098, final BlockPos class7099) {
        return (class7097.getHeldItemMainhand().getItem() instanceof Class4077) ? 1.0f : super.method11830(class7096, class7097, class7098, class7099);
    }
    
    public void method12014(final World class1847, final BlockPos class1848) {
        class1847.setBlockState(class1848.method1137(), ((StateHolder<O, Class7096>) Blocks.BAMBOO.getDefaultState()).with(Class3913.field17724, Class184.field575), 3);
    }
    
    static {
        field17714 = Block.method11778(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);
    }
}
