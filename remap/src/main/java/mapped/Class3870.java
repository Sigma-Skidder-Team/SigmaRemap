// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class3870 extends Class3874
{
    private static String[] field17512;
    public static final Class7114<Class182> field17513;
    
    public Class3870(final Properties class9288) {
        super(class9288);
        this.method11877(this.field17406.method32903().with(Class3870.field17513, Class182.field565));
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        final Class182 class7102 = class7096.get(Class3870.field17513);
        if (class7097.getAxis() == Direction.Axis.Y) {
            if (class7102 == Class182.field565 == (class7097 == Direction.UP)) {
                if (class7098.getBlock() != this || class7098.get(Class3870.field17513) == class7102) {
                    return Blocks.AIR.getDefaultState();
                }
            }
        }
        if (class7102 == Class182.field565) {
            if (class7097 == Direction.DOWN) {
                if (!class7096.method21752(class7099, class7100)) {
                    return Blocks.AIR.getDefaultState();
                }
            }
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Nullable
    @Override
    public BlockState method11846(final Class7074 class7074) {
        final BlockPos method21639 = class7074.method21639();
        return (method21639.getY() < 255 && class7074.method21654().getBlockState(method21639.method1137()).method21750(class7074)) ? super.method11846(class7074) : null;
    }
    
    @Override
    public void method11853(final World class1847, final BlockPos class1848, final BlockState class1849, final LivingEntity class1850, final ItemStack class1851) {
        class1847.setBlockState(class1848.method1137(), this.getDefaultState().with(Class3870.field17513, Class182.field564), 3);
    }
    
    @Override
    public boolean method11843(final BlockState class7096, final Class1852 class7097, final BlockPos class7098) {
        if (class7096.get(Class3870.field17513) == Class182.field564) {
            final BlockState method6701 = class7097.getBlockState(class7098.method1139());
            return method6701.getBlock() == this && method6701.get(Class3870.field17513) == Class182.field565;
        }
        return super.method11843(class7096, class7097, class7098);
    }
    
    public void method11944(final Class1851 class1851, final BlockPos class1852, final int n) {
        class1851.setBlockState(class1852, this.getDefaultState().with(Class3870.field17513, Class182.field565), n);
        class1851.setBlockState(class1852.method1137(), this.getDefaultState().with(Class3870.field17513, Class182.field564), n);
    }
    
    @Override
    public void method11852(final World class1847, final PlayerEntity class1848, final BlockPos class1849, final BlockState class1850, final TileEntity class1851, final ItemStack class1852) {
        super.method11852(class1847, class1848, class1849, Blocks.AIR.getDefaultState(), class1851, class1852);
    }
    
    @Override
    public void method11870(final World class1847, final BlockPos class1848, final BlockState class1849, final PlayerEntity class1850) {
        final Class182 class1851 = class1849.get(Class3870.field17513);
        final BlockPos class1852 = (class1851 != Class182.field565) ? class1848.method1139() : class1848.method1137();
        final BlockState method6701 = class1847.getBlockState(class1852);
        if (method6701.getBlock() == this) {
            if (method6701.get(Class3870.field17513) != class1851) {
                class1847.setBlockState(class1852, Blocks.AIR.getDefaultState(), 35);
                class1847.playEvent(class1850, 2001, class1852, Block.method11774(method6701));
                if (!class1847.isRemote) {
                    if (!class1850.method2889()) {
                        Block.spawnAsEntity(class1849, class1847, class1848, null, class1850, class1850.getHeldItemMainhand());
                        Block.spawnAsEntity(method6701, class1847, class1852, null, class1850, class1850.getHeldItemMainhand());
                    }
                }
            }
        }
        super.method11870(class1847, class1848, class1849, class1850);
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3870.field17513);
    }
    
    @Override
    public Class2180 method11879() {
        return Class2180.field12914;
    }
    
    @Override
    public long method11868(final BlockState class7096, final BlockPos class7097) {
        return MathHelper.method35689(class7097.getX(), class7097.method1140((class7096.get(Class3870.field17513) != Class182.field565) ? 1 : 0).getY(), class7097.getZ());
    }
    
    static {
        field17513 = Class8970.field37765;
    }
}
