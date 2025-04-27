// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class3969 extends Block
{
    private static String[] field17930;
    public static final Class7115 field17931;
    public static final Class7113 field17932;
    public static final Class7114<Class187> field17933;
    public static final Class7113 field17934;
    public static final Class7114<Class182> field17935;
    public static final VoxelShape field17936;
    public static final VoxelShape field17937;
    public static final VoxelShape field17938;
    public static final VoxelShape field17939;
    
    public Class3969(final Properties class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>) ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class3969.field17931, Direction.NORTH)).with((IProperty<Comparable>)Class3969.field17932, false).with(Class3969.field17933, Class187.field603)).with((IProperty<Comparable>)Class3969.field17934, false).with(Class3969.field17935, Class182.field565));
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        final Direction class7100 = class7096.get(Class3969.field17931);
        final boolean b = !class7096.get(Class3969.field17932);
        final boolean b2 = class7096.get(Class3969.field17933) == Class187.field604;
        switch (Class8905.field37442[class7100.ordinal()]) {
            default: {
                return b ? Class3969.field17939 : (b2 ? Class3969.field17937 : Class3969.field17936);
            }
            case 2: {
                return b ? Class3969.field17936 : (b2 ? Class3969.field17939 : Class3969.field17938);
            }
            case 3: {
                return b ? Class3969.field17938 : (b2 ? Class3969.field17936 : Class3969.field17937);
            }
            case 4: {
                return b ? Class3969.field17937 : (b2 ? Class3969.field17938 : Class3969.field17939);
            }
        }
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        final Class182 class7102 = class7096.get(Class3969.field17935);
        if (class7097.getAxis() == Direction.Axis.Y && class7102 == Class182.field565 == (class7097 == Direction.UP)) {
            return (class7098.getBlock() == this && class7098.get(Class3969.field17935) != class7102) ? class7096.with((IProperty<Comparable>)Class3969.field17931, (Comparable)class7098.get((IProperty<V>)Class3969.field17931)).with((IProperty<Comparable>)Class3969.field17932, (Comparable)class7098.get((IProperty<V>)Class3969.field17932)).with(Class3969.field17933, (Comparable)class7098.get((IProperty<V>)Class3969.field17933)).with((IProperty<Comparable>)Class3969.field17934, (Comparable)class7098.get((IProperty<V>)Class3969.field17934)) : Blocks.AIR.getDefaultState();
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
    
    @Override
    public void method11852(final World class1847, final PlayerEntity class1848, final BlockPos class1849, final BlockState class1850, final TileEntity class1851, final ItemStack class1852) {
        super.method11852(class1847, class1848, class1849, Blocks.AIR.getDefaultState(), class1851, class1852);
    }
    
    @Override
    public void method11870(final World class1847, final BlockPos class1848, final BlockState class1849, final PlayerEntity class1850) {
        final Class182 class1851 = class1849.get(Class3969.field17935);
        final BlockPos class1852 = (class1851 != Class182.field565) ? class1848.method1139() : class1848.method1137();
        final BlockState method6701 = class1847.getBlockState(class1852);
        if (method6701.getBlock() == this) {
            if (method6701.get(Class3969.field17935) != class1851) {
                class1847.setBlockState(class1852, Blocks.AIR.getDefaultState(), 35);
                class1847.playEvent(class1850, 2001, class1852, Block.method11774(method6701));
                final ItemStack method6702 = class1850.getHeldItemMainhand();
                if (!class1847.isRemote) {
                    if (!class1850.method2889()) {
                        if (class1850.method2825(method6701)) {
                            Block.spawnAsEntity(class1849, class1847, class1848, null, class1850, method6702);
                            Block.spawnAsEntity(method6701, class1847, class1852, null, class1850, method6702);
                        }
                    }
                }
            }
        }
        super.method11870(class1847, class1848, class1849, class1850);
    }
    
    @Override
    public boolean method11796(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final Class2084 class7099) {
        switch (Class8905.field37443[class7099.ordinal()]) {
            case 1: {
                return class7096.get(Class3969.field17932);
            }
            case 2: {
                return false;
            }
            case 3: {
                return class7096.get(Class3969.field17932);
            }
            default: {
                return false;
            }
        }
    }
    
    private int method12107() {
        return (this.field17401 != Material.IRON) ? 1012 : 1011;
    }
    
    private int method12108() {
        return (this.field17401 != Material.IRON) ? 1006 : 1005;
    }
    
    @Nullable
    @Override
    public BlockState method11846(final Class7074 class7074) {
        final BlockPos method21639 = class7074.method21639();
        if (method21639.getY() < 255 && class7074.method21654().getBlockState(method21639.method1137()).method21750(class7074)) {
            final World method21640 = class7074.method21654();
            final boolean b = method21640.method6749(method21639) || method21640.method6749(method21639.method1137());
            return (BlockState)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>) ((StateHolder<O, BlockState>)this.getDefaultState()).with((IProperty<Comparable>)Class3969.field17931, class7074.method21644()).with(Class3969.field17933, this.method12109(class7074))).with((IProperty<Comparable>)Class3969.field17934, b)).with((IProperty<Comparable>)Class3969.field17932, b)).with(Class3969.field17935, Class182.field565);
        }
        return null;
    }
    
    @Override
    public void method11853(final World class1847, final BlockPos class1848, final BlockState class1849, final LivingEntity class1850, final ItemStack class1851) {
        class1847.setBlockState(class1848.method1137(), class1849.with(Class3969.field17935, Class182.field564), 3);
    }
    
    private Class187 method12109(final Class7074 class7074) {
        final World method21654 = class7074.method21654();
        final BlockPos method21655 = class7074.method21639();
        final Direction method21656 = class7074.method21644();
        final BlockPos method21657 = method21655.method1137();
        final Direction method21658 = method21656.method784();
        final BlockPos method21659 = method21655.method1149(method21658);
        final BlockState method21660 = method21654.getBlockState(method21659);
        final BlockPos method21661 = method21657.method1149(method21658);
        final BlockState method21662 = method21654.getBlockState(method21661);
        final Direction method21663 = method21656.rotateY();
        final BlockPos method21664 = method21655.method1149(method21663);
        final BlockState method21665 = method21654.getBlockState(method21664);
        final BlockPos method21666 = method21657.method1149(method21663);
        final int n = (method21660.isCollisionShapeOpaque(method21654, method21659) ? -1 : 0) + (method21662.isCollisionShapeOpaque(method21654, method21661) ? -1 : 0) + (method21665.isCollisionShapeOpaque(method21654, method21664) ? 1 : 0) + (method21654.getBlockState(method21666).method21762(method21654, method21666) ? 1 : 0);
        final boolean b = method21660.getBlock() == this && method21660.get(Class3969.field17935) == Class182.field565;
        final boolean b2 = method21665.getBlock() == this && method21665.get(Class3969.field17935) == Class182.field565;
        if (!b || b2) {
            if (n <= 0) {
                if (!b2 || b) {
                    if (n >= 0) {
                        final int method21667 = method21656.getXOffset();
                        final int method21668 = method21656.getZOffset();
                        final Vec3d method21669 = class7074.method21649();
                        final double n2 = method21669.x - method21655.getX();
                        final double n3 = method21669.z - method21655.getZ();
                        if (method21667 >= 0 || n3 >= 0.5) {
                            if (method21667 <= 0 || n3 <= 0.5) {
                                if (method21668 >= 0 || n2 <= 0.5) {
                                    if (method21668 <= 0 || n2 >= 0.5) {
                                        return Class187.field603;
                                    }
                                }
                            }
                        }
                        return Class187.field604;
                    }
                }
                return Class187.field603;
            }
        }
        return Class187.field604;
    }
    
    @Override
    public Class2201 method11844(BlockState class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final BlockRayTraceResult class7101) {
        if (this.field17401 != Material.IRON) {
            class7096 = class7096.method21768((IProperty<Comparable>)Class3969.field17932);
            class7097.setBlockState(class7098, class7096, 10);
            class7097.playEvent(class7099, class7096.get(Class3969.field17932) ? this.method12108() : this.method12107(), class7098, 0);
            return Class2201.field13400;
        }
        return Class2201.field13402;
    }
    
    public void method12110(final World class1847, final BlockPos class1848, final boolean b) {
        final BlockState method6701 = class1847.getBlockState(class1848);
        if (method6701.getBlock() == this) {
            if (method6701.get(Class3969.field17932) != b) {
                class1847.setBlockState(class1848, ((StateHolder<Object, BlockState>)method6701).with((IProperty<Comparable>)Class3969.field17932, b), 10);
                this.method12111(class1847, class1848, b);
            }
        }
    }
    
    @Override
    public void method11825(final BlockState class7096, final World class7097, final BlockPos class7098, final Block class7099, final BlockPos class7100, final boolean b) {
        final boolean b2 = class7097.method6749(class7098) || class7097.method6749(class7098.method1149((class7096.get(Class3969.field17935) != Class182.field565) ? Direction.DOWN : Direction.UP));
        if (class7099 != this) {
            if (b2 != class7096.get(Class3969.field17934)) {
                if (b2 != class7096.get(Class3969.field17932)) {
                    this.method12111(class7097, class7098, b2);
                }
                class7097.setBlockState(class7098, (BlockState)((StateHolder<Object, Object>)((StateHolder<Object, Object>)class7096).with((IProperty<Comparable>)Class3969.field17934, b2)).with((IProperty<Comparable>)Class3969.field17932, b2), 2);
            }
        }
    }
    
    @Override
    public boolean method11843(final BlockState class7096, final Class1852 class7097, final BlockPos class7098) {
        final BlockPos method1139 = class7098.method1139();
        final BlockState method1140 = class7097.getBlockState(method1139);
        if (class7096.get(Class3969.field17935) != Class182.field565) {
            return method1140.getBlock() == this;
        }
        return method1140.isSolidSide(class7097, method1139, Direction.UP);
    }
    
    private void method12111(final World class1847, final BlockPos class1848, final boolean b) {
        class1847.playEvent(null, b ? this.method12108() : this.method12107(), class1848, 0);
    }
    
    @Override
    public PushReaction method11858(final BlockState class7096) {
        return PushReaction.DESTROY;
    }
    
    @Override
    public BlockState method11790(final BlockState class7096, final Class2052 class7097) {
        return ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3969.field17931, class7097.method8142(class7096.get(Class3969.field17931)));
    }
    
    @Override
    public BlockState method11791(final BlockState class7096, final Class2181 class7097) {
        return (class7097 != Class2181.field12917) ? class7096.method21708(class7097.method8344(class7096.get(Class3969.field17931))).method21768(Class3969.field17933) : class7096;
    }
    
    @Override
    public long method11868(final BlockState class7096, final BlockPos class7097) {
        return MathHelper.method35689(class7097.getX(), class7097.method1140((class7096.get(Class3969.field17935) != Class182.field565) ? 1 : 0).getY(), class7097.getZ());
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3969.field17935, Class3969.field17931, Class3969.field17932, Class3969.field17933, Class3969.field17934);
    }
    
    static {
        field17931 = Class3892.field17564;
        field17932 = Class8970.field37739;
        field17933 = Class8970.field37797;
        field17934 = Class8970.field37741;
        field17935 = Class8970.field37765;
        field17936 = Block.method11778(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
        field17937 = Block.method11778(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
        field17938 = Block.method11778(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
        field17939 = Block.method11778(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
    }
}
