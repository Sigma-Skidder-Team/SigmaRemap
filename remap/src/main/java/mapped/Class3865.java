// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.List;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.function.BiPredicate;
import javax.annotation.Nullable;
import java.util.function.Supplier;
import java.util.Optional;

public class Class3865 extends Class3864<Class475> implements Class3856
{
    private static String[] field17496;
    public static final Class7115 field17497;
    public static final Class7114<Class180> field17498;
    public static final Class7113 field17499;
    public static final VoxelShape field17500;
    public static final VoxelShape field17501;
    public static final VoxelShape field17502;
    public static final VoxelShape field17503;
    public static final VoxelShape field17504;
    private static final Class6389<Class475, Optional<Class446>> field17505;
    private static final Class6389<Class475, Optional<Class434>> field17506;
    
    public Class3865(final Class9288 class9288, final Supplier<Class5412<? extends Class475>> supplier) {
        super(class9288, supplier);
        this.method11877(((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class3865.field17497, Direction.NORTH)).with(Class3865.field17498, Class180.field530)).with((IProperty<Comparable>)Class3865.field17499, false));
    }
    
    public static Class2083 method11932(final BlockState class7096) {
        final Class180 class7097 = class7096.get(Class3865.field17498);
        if (class7097 != Class180.field530) {
            return (class7097 != Class180.field532) ? Class2083.field12049 : Class2083.field12048;
        }
        return Class2083.field12047;
    }
    
    @Override
    public Class2115 method11797(final BlockState class7096) {
        return Class2115.field12306;
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7096.get((IProperty<Boolean>)Class3865.field17499)) {
            class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        }
        if (class7098.getBlock() == this && class7097.getAxis().isHorizontal()) {
            final Class180 class7102 = class7098.get(Class3865.field17498);
            if (class7096.get(Class3865.field17498) == Class180.field530) {
                if (class7102 != Class180.field530) {
                    if (class7096.get((IProperty<Comparable>)Class3865.field17497) == class7098.get((IProperty<Comparable>)Class3865.field17497)) {
                        if (method11933(class7098) == class7097.getOpposite()) {
                            return (BlockState)((StateHolder<Object, Object>)class7096).with(Class3865.field17498, class7102.method812());
                        }
                    }
                }
            }
        }
        else if (method11933(class7096) == class7097) {
            return ((StateHolder<O, BlockState>)class7096).with(Class3865.field17498, Class180.field530);
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        if (class7096.get(Class3865.field17498) == Class180.field530) {
            return Class3865.field17504;
        }
        switch (Class7851.field32153[method11933(class7096).ordinal()]) {
            default: {
                return Class3865.field17500;
            }
            case 2: {
                return Class3865.field17501;
            }
            case 3: {
                return Class3865.field17502;
            }
            case 4: {
                return Class3865.field17503;
            }
        }
    }
    
    public static Direction method11933(final BlockState class7096) {
        final Direction class7097 = class7096.get((IProperty<Direction>)Class3865.field17497);
        return (class7096.get(Class3865.field17498) != Class180.field531) ? class7097.method784() : class7097.rotateY();
    }
    
    @Override
    public BlockState method11846(final Class7074 class7074) {
        Class180 class7075 = Class180.field530;
        Direction method782 = class7074.method21644().getOpposite();
        final IFluidState method783 = class7074.method21654().getFluidState(class7074.method21639());
        final boolean method784 = class7074.method21645();
        final Direction method785 = class7074.method21648();
        if (method785.getAxis().isHorizontal()) {
            if (method784) {
                final Direction method786 = this.method11934(class7074, method785.getOpposite());
                if (method786 != null) {
                    if (method786.getAxis() != method785.getAxis()) {
                        method782 = method786;
                        class7075 = ((method786.method784() != method785.getOpposite()) ? Class180.field531 : Class180.field532);
                    }
                }
            }
        }
        if (class7075 == Class180.field530) {
            if (!method784) {
                if (method782 != this.method11934(class7074, method782.rotateY())) {
                    if (method782 == this.method11934(class7074, method782.method784())) {
                        class7075 = Class180.field532;
                    }
                }
                else {
                    class7075 = Class180.field531;
                }
            }
        }
        return (BlockState)((StateHolder<Object, Object>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.getDefaultState()).with((IProperty<Comparable>)Class3865.field17497, method782)).with(Class3865.field17498, class7075)).with((IProperty<Comparable>)Class3865.field17499, method783.getFluid() == Class7558.field29976);
    }
    
    @Override
    public IFluidState method11864(final BlockState class7096) {
        return class7096.get((IProperty<Boolean>)Class3865.field17499) ? Class7558.field29976.method22177(false) : super.method11864(class7096);
    }
    
    @Nullable
    private Direction method11934(final Class7074 class7074, final Direction class7075) {
        final BlockState method6701 = class7074.method21654().getBlockState(class7074.method21639().method1149(class7075));
        return (method6701.getBlock() == this && method6701.get(Class3865.field17498) == Class180.field530) ? method6701.get((IProperty<Direction>)Class3865.field17497) : null;
    }
    
    @Override
    public void method11853(final World class1847, final BlockPos class1848, final BlockState class1849, final LivingEntity class1850, final ItemStack class1851) {
        if (class1851.method27667()) {
            final TileEntity method6727 = class1847.getTileEntity(class1848);
            if (method6727 instanceof Class475) {
                ((Class475)method6727).method2335(class1851.method27664());
            }
        }
    }
    
    @Override
    public void method11829(final BlockState class7096, final World class7097, final BlockPos class7098, final BlockState class7099, final boolean b) {
        if (class7096.getBlock() != class7099.getBlock()) {
            final TileEntity method6727 = class7097.getTileEntity(class7098);
            if (method6727 instanceof Class446) {
                Class9193.method33638(class7097, class7098, (Class446)method6727);
                class7097.method6783(class7098, this);
            }
            super.method11829(class7096, class7097, class7098, class7099, b);
        }
    }
    
    @Override
    public Class2201 method11844(final BlockState class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final BlockRayTraceResult class7101) {
        if (!class7097.isRemote) {
            final Class434 method11827 = this.method11827(class7096, class7097, class7098);
            if (method11827 != null) {
                class7099.method2833(method11827);
                class7099.method2859(this.method11935());
            }
            return Class2201.field13400;
        }
        return Class2201.field13400;
    }
    
    public Class9455<ResourceLocation> method11935() {
        return Class8276.field33987.method8449(Class8276.field34043);
    }
    
    @Nullable
    public static Class446 method11936(final Class3865 class3865, final BlockState class3866, final World class3867, final BlockPos class3868, final boolean b) {
        return class3865.method11929(class3866, class3867, class3868, b).method22074(Class3865.field17505).orElse(null);
    }
    
    @Override
    public Class7191<? extends Class475> method11929(final BlockState class7096, final World class7097, final BlockPos class7098, final boolean b) {
        BiPredicate<Class1851, BlockPos> biPredicate;
        if (!b) {
            biPredicate = Class3865::method11938;
        }
        else {
            biPredicate = ((p0, p1) -> false);
        }
        return Class8565.method28798((Class5412<? extends Class475>)this.field17495.get(), Class3865::method11932, Class3865::method11933, Class3865.field17497, class7096, class7097, class7098, biPredicate);
    }
    
    @Nullable
    @Override
    public Class434 method11827(final BlockState class7096, final World class7097, final BlockPos class7098) {
        return this.method11929(class7096, class7097, class7098, false).method22074(Class3865.field17506).orElse(null);
    }
    
    public static Class6389<Class475, Float2FloatFunction> method11937(final Class476 class476) {
        return new Class6391(class476);
    }
    
    @Override
    public TileEntity method11898(final IBlockReader class1855) {
        return new Class475();
    }
    
    public static boolean method11938(final Class1851 class1851, final BlockPos class1852) {
        return method11939(class1851, class1852) || method11940(class1851, class1852);
    }
    
    private static boolean method11939(final IBlockReader class1855, final BlockPos class1856) {
        final BlockPos method1137 = class1856.method1137();
        return class1855.getBlockState(method1137).method21713(class1855, method1137);
    }
    
    private static boolean method11940(final Class1851 class1851, final BlockPos class1852) {
        final List<Entity> method7128 = class1851.method7128((Class<? extends Entity>)Class800.class, new AxisAlignedBB(class1852.getX(), class1852.getY() + 1, class1852.getZ(), class1852.getX() + 1, class1852.getY() + 2, class1852.getZ() + 1));
        if (!method7128.isEmpty()) {
            final Iterator iterator = method7128.iterator();
            while (iterator.hasNext()) {
                if (!((Class800)iterator.next()).method4483()) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean method11873(final BlockState class7096) {
        return true;
    }
    
    @Override
    public int method11874(final BlockState class7096, final World class7097, final BlockPos class7098) {
        return Class3418.method10898(method11936(this, class7096, class7097, class7098, false));
    }
    
    @Override
    public BlockState method11790(final BlockState class7096, final Class2052 class7097) {
        return ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3865.field17497, class7097.method8142(class7096.get((IProperty<Direction>)Class3865.field17497)));
    }
    
    @Override
    public BlockState method11791(final BlockState class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.get((IProperty<Direction>)Class3865.field17497)));
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3865.field17497, Class3865.field17498, Class3865.field17499);
    }
    
    @Override
    public boolean method11796(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field17497 = Class3892.field17564;
        field17498 = Class8970.field37795;
        field17499 = Class8970.field37747;
        field17500 = Block.method11778(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
        field17501 = Block.method11778(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
        field17502 = Block.method11778(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
        field17503 = Block.method11778(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
        field17504 = Block.method11778(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
        field17505 = new Class6390();
        field17506 = new Class6392();
    }
}
