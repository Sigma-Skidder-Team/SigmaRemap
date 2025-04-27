// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public class Class4005 extends Block
{
    private static String[] field18049;
    private static final VoxelShape field18050;
    private static final VoxelShape field18051;
    public static final Class7112 field18052;
    public static final Class7112 field18053;
    
    public Class4005(final Properties class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class4005.field18052, 0)).with((IProperty<Comparable>)Class4005.field18053, 1));
    }
    
    @Override
    public void method11845(final World class1847, final BlockPos class1848, final Entity class1849) {
        this.method12168(class1847, class1848, class1849, 100);
        super.method11845(class1847, class1848, class1849);
    }
    
    @Override
    public void method11860(final World class1847, final BlockPos class1848, final Entity class1849, final float n) {
        if (!(class1849 instanceof Class827)) {
            this.method12168(class1847, class1848, class1849, 3);
        }
        super.method11860(class1847, class1848, class1849, n);
    }
    
    private void method12168(final World class1847, final BlockPos class1848, final Entity class1849, final int bound) {
        if (this.method12172(class1847, class1849)) {
            if (!class1847.isRemote) {
                if (class1847.rand.nextInt(bound) == 0) {
                    this.method12169(class1847, class1848, class1847.getBlockState(class1848));
                }
            }
        }
        else {
            super.method11845(class1847, class1848, class1849);
        }
    }
    
    private void method12169(final World class1847, final BlockPos class1848, final BlockState class1849) {
        class1847.method6705(null, class1848, Class8520.field35653, Class286.field1582, 0.7f, 0.9f + class1847.rand.nextFloat() * 0.2f);
        final int intValue = class1849.get(Class4005.field18053);
        if (intValue > 1) {
            class1847.setBlockState(class1848, (BlockState)((StateHolder<Object, Object>)class1849).with((IProperty<Comparable>)Class4005.field18053, intValue - 1), 2);
            class1847.method6955(2001, class1848, Block.method11774(class1849));
        }
        else {
            class1847.method7149(class1848, false);
        }
    }
    
    @Override
    public void method11822(final BlockState class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (this.method12171(class7097)) {
            if (this.method12170(class7097, class7098)) {
                final int intValue = class7096.get(Class4005.field18052);
                if (intValue >= 2) {
                    class7097.method6705(null, class7098, Class8520.field35655, Class286.field1582, 0.7f, 0.9f + random.nextFloat() * 0.2f);
                    class7097.method6690(class7098, false);
                    for (int i = 0; i < class7096.get(Class4005.field18053); ++i) {
                        class7097.method6955(2001, class7098, Block.method11774(class7096));
                        final Class793 class7099 = EntityType.field29035.method23371(class7097);
                        class7099.method4354(-24000);
                        class7099.method4452(class7098);
                        class7099.method1730(class7098.getX() + 0.3 + i * 0.2, class7098.getY(), class7098.getZ() + 0.3, 0.0f, 0.0f);
                        class7097.method6886(class7099);
                    }
                }
                else {
                    class7097.method6705(null, class7098, Class8520.field35654, Class286.field1582, 0.7f, 0.9f + random.nextFloat() * 0.2f);
                    class7097.setBlockState(class7098, (BlockState)((StateHolder<Object, Object>)class7096).with((IProperty<Comparable>)Class4005.field18052, intValue + 1), 2);
                }
            }
        }
    }
    
    private boolean method12170(final IBlockReader class1855, final BlockPos class1856) {
        return class1855.getBlockState(class1856.method1139()).getBlock() == Blocks.field29175;
    }
    
    @Override
    public void onBlockAdded(final BlockState class7096, final World class7097, final BlockPos class7098, final BlockState class7099, final boolean b) {
        if (this.method12170(class7097, class7098)) {
            if (!class7097.isRemote) {
                class7097.method6955(2005, class7098, 0);
            }
        }
    }
    
    private boolean method12171(final World class1847) {
        final float method6952 = class1847.method6952(1.0f);
        return (method6952 < 0.69 && method6952 > 0.65) || class1847.rand.nextInt(500) == 0;
    }
    
    @Override
    public void method11852(final World class1847, final PlayerEntity class1848, final BlockPos class1849, final BlockState class1850, final TileEntity class1851, final ItemStack class1852) {
        super.method11852(class1847, class1848, class1849, class1850, class1851, class1852);
        this.method12169(class1847, class1849, class1850);
    }
    
    @Override
    public boolean method11798(final BlockState class7096, final Class7074 class7097) {
        return (class7097.method21651().getItem() == this.method11704() && class7096.get(Class4005.field18053) < 4) || super.method11798(class7096, class7097);
    }
    
    @Nullable
    @Override
    public BlockState method11846(final Class7074 class7074) {
        final BlockState method6701 = class7074.method21654().getBlockState(class7074.method21639());
        return (method6701.getBlock() != this) ? super.method11846(class7074) : ((StateHolder<Object, BlockState>)method6701).with((IProperty<Comparable>)Class4005.field18053, Math.min(4, method6701.get(Class4005.field18053) + 1));
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return (class7096.get(Class4005.field18053) <= 1) ? Class4005.field18050 : Class4005.field18051;
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class4005.field18052, Class4005.field18053);
    }
    
    private boolean method12172(final World class1847, final Entity class1848) {
        return !(class1848 instanceof Class793) && (!(class1848 instanceof LivingEntity) || class1848 instanceof PlayerEntity || class1847.method6765().method31216(Class8878.field37316));
    }
    
    static {
        field18050 = Block.method11778(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
        field18051 = Block.method11778(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
        field18052 = Class8970.field37780;
        field18053 = Class8970.field37779;
    }
}
