// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;
import javax.annotation.Nullable;
import java.util.Optional;

public class Class3918 extends Class3841 implements Class3856
{
    private static String[] field17758;
    public static final VoxelShape field17759;
    public static final Class7113 field17760;
    public static final Class7113 field17761;
    public static final Class7113 field17762;
    public static final Class7115 field17763;
    private static final VoxelShape field17764;
    
    public Class3918(final Properties class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class3918.field17760, true)).with((IProperty<Comparable>)Class3918.field17761, false)).with((IProperty<Comparable>)Class3918.field17762, false)).with((IProperty<Comparable>)Class3918.field17763, Direction.NORTH));
    }
    
    @Override
    public Class2201 method11844(final BlockState class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final BlockRayTraceResult class7101) {
        if (class7096.get(Class3918.field17760)) {
            final TileEntity method6727 = class7097.getTileEntity(class7098);
            if (method6727 instanceof Class448) {
                final Class448 class7102 = (Class448)method6727;
                final ItemStack method6728 = class7099.method2715(class7100);
                final Optional<Class3682> method6729 = class7102.method2272(method6728);
                if (method6729.isPresent()) {
                    if (!class7097.isRemote && class7102.method2273(class7099.field3025.field27304 ? method6728.method27641() : method6728, method6729.get().method11329())) {
                        class7099.method2857(Class8276.field34050);
                        return Class2201.field13400;
                    }
                    return Class2201.field13401;
                }
            }
        }
        return Class2201.field13402;
    }
    
    @Override
    public void method11850(final BlockState class7096, final World class7097, final BlockPos class7098, final Entity class7099) {
        if (!class7099.method1704()) {
            if (class7096.get(Class3918.field17760)) {
                if (class7099 instanceof LivingEntity) {
                    if (!Class8742.method30216((LivingEntity)class7099)) {
                        class7099.attackEntityFrom(DamageSource.field32562, 1.0f);
                    }
                }
            }
        }
        super.method11850(class7096, class7097, class7098, class7099);
    }
    
    @Override
    public void onReplaced(final BlockState class7096, final World class7097, final BlockPos class7098, final BlockState class7099, final boolean b) {
        if (class7096.getBlock() != class7099.getBlock()) {
            final TileEntity method6727 = class7097.getTileEntity(class7098);
            if (method6727 instanceof Class448) {
                Class9193.method33641(class7097, class7098, ((Class448)method6727).method2270());
            }
            super.onReplaced(class7096, class7097, class7098, class7099, b);
        }
    }
    
    @Nullable
    @Override
    public BlockState method11846(final Class7074 class7074) {
        final World method21654 = class7074.method21654();
        final BlockPos method21655 = class7074.method21639();
        final boolean b = method21654.getFluidState(method21655).getFluid() == Class7558.field29976;
        return (BlockState)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)this.getDefaultState()).with((IProperty<Comparable>)Class3918.field17762, b)).with((IProperty<Comparable>)Class3918.field17761, this.method12030(method21654.getBlockState(method21655.method1139())))).with((IProperty<Comparable>)Class3918.field17760, !b)).with((IProperty<Comparable>)Class3918.field17763, class7074.method21644());
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7096.get(Class3918.field17762)) {
            class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        }
        return (class7097 != Direction.DOWN) ? super.method11789(class7096, class7097, class7098, class7099, class7100, class7101) : ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3918.field17761, this.method12030(class7098));
    }
    
    private boolean method12030(final BlockState class7096) {
        return class7096.getBlock() == Blocks.field29529;
    }
    
    @Override
    public int getLightValue(final BlockState class7096) {
        return class7096.get(Class3918.field17760) ? super.getLightValue(class7096) : 0;
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3918.field17759;
    }
    
    @Override
    public Class2115 method11797(final BlockState class7096) {
        return Class2115.field12307;
    }
    
    @Override
    public void method11823(final BlockState class7096, final World class7097, final BlockPos class7098, final Random random) {
        if (class7096.get(Class3918.field17760)) {
            if (random.nextInt(10) == 0) {
                class7097.method6708(class7098.getX() + 0.5f, class7098.getY() + 0.5f, class7098.getZ() + 0.5f, Class8520.field35055, Class286.field1582, 0.5f + random.nextFloat(), random.nextFloat() * 0.7f + 0.6f, false);
            }
            if (random.nextInt(5) == 0) {
                for (int i = 0; i < random.nextInt(1) + 1; ++i) {
                    class7097.method6709(Class8432.field34633, class7098.getX() + 0.5f, class7098.getY() + 0.5f, class7098.getZ() + 0.5f, random.nextFloat() / 2.0f, 5.0E-5, random.nextFloat() / 2.0f);
                }
            }
        }
    }
    
    @Override
    public boolean method11921(final Class1851 class1851, final BlockPos class1852, final BlockState class1853, final IFluidState class1854) {
        if (!class1853.get(Class8970.field37747) && class1854.getFluid() == Class7558.field29976) {
            if (class1853.get(Class3918.field17760)) {
                if (!class1851.isRemote()) {
                    class1851.method6705(null, class1852, Class8520.field35219, Class286.field1582, 1.0f, 1.0f);
                }
                else {
                    for (int i = 0; i < 20; ++i) {
                        method12032(class1851.method6744(), class1852, class1853.get(Class3918.field17761), true);
                    }
                }
                final TileEntity method6727 = class1851.getTileEntity(class1852);
                if (method6727 instanceof Class448) {
                    ((Class448)method6727).method2275();
                }
            }
            class1851.setBlockState(class1852, ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)class1853).with((IProperty<Comparable>)Class3918.field17762, true)).with((IProperty<Comparable>)Class3918.field17760, false), 3);
            class1851.method6834().method21345(class1852, class1854.getFluid(), class1854.getFluid().method22156(class1851));
            return true;
        }
        return false;
    }
    
    @Nullable
    private Entity method12031(final Entity class399) {
        if (!(class399 instanceof Class416)) {
            return (class399 instanceof Class402) ? ((Class402)class399).method1973() : null;
        }
        return ((Class416)class399).field2527;
    }
    
    @Override
    public void onProjectileCollision(final World class1847, final BlockState class1848, final BlockRayTraceResult class1849, final Entity class1850) {
        if (!class1847.isRemote) {
            if (class1850 instanceof Class416 || (class1850 instanceof Class402 && class1850.method1804())) {
                final Entity method12031 = this.method12031(class1850);
                boolean b = false;
                Label_0114: {
                    if (method12031 != null) {
                        if (!(method12031 instanceof PlayerEntity)) {
                            if (!class1847.method6765().method31216(Class8878.field37316)) {
                                b = false;
                                break Label_0114;
                            }
                        }
                    }
                    b = true;
                }
                if (b) {
                    if (!class1848.get(Class3918.field17760)) {
                        if (!class1848.get(Class3918.field17762)) {
                            class1847.setBlockState(class1849.getPos(), ((StateHolder<O, BlockState>)class1848).with((IProperty<Comparable>)Class8970.field37736, true), 11);
                        }
                    }
                }
            }
        }
    }
    
    public static void method12032(final World class1847, final BlockPos class1848, final boolean b, final boolean b2) {
        final Random method6790 = class1847.method6790();
        class1847.method6712(b ? Class8432.field34654 : Class8432.field34653, true, class1848.getX() + 0.5 + method6790.nextDouble() / 3.0 * (method6790.nextBoolean() ? 1 : -1), class1848.getY() + method6790.nextDouble() + method6790.nextDouble(), class1848.getZ() + 0.5 + method6790.nextDouble() / 3.0 * (method6790.nextBoolean() ? 1 : -1), 0.0, 0.07, 0.0);
        if (b2) {
            class1847.method6709(Class8432.field34639, class1848.getX() + 0.25 + method6790.nextDouble() / 2.0 * (method6790.nextBoolean() ? 1 : -1), class1848.getY() + 0.4, class1848.getZ() + 0.25 + method6790.nextDouble() / 2.0 * (method6790.nextBoolean() ? 1 : -1), 0.0, 0.005, 0.0);
        }
    }
    
    public static boolean method12033(final World class1847, final BlockPos class1848, final int n) {
        for (int i = 1; i <= n; ++i) {
            final BlockPos method1140 = class1848.method1140(i);
            final BlockState method1141 = class1847.getBlockState(method1140);
            if (method12034(method1141)) {
                return true;
            }
            if (VoxelShapes.method24496(Class3918.field17764, method1141.getCollisionShape(class1847, class1848, ISelectionContext.dummy()), IBooleanFunction.AND)) {
                return method12034(class1847.getBlockState(method1140.method1139()));
            }
        }
        return false;
    }
    
    private static boolean method12034(final BlockState class7096) {
        return class7096.getBlock() == Blocks.CAMPFIRE && class7096.get(Class3918.field17760);
    }
    
    @Override
    public IFluidState method11864(final BlockState class7096) {
        return class7096.get(Class3918.field17762) ? Class7558.field29976.method22177(false) : super.method11864(class7096);
    }
    
    @Override
    public BlockState method11790(final BlockState class7096, final Class2052 class7097) {
        return ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3918.field17763, class7097.method8142(class7096.get(Class3918.field17763)));
    }
    
    @Override
    public BlockState method11791(final BlockState class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.get(Class3918.field17763)));
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3918.field17760, Class3918.field17761, Class3918.field17762, Class3918.field17763);
    }
    
    @Override
    public TileEntity method11898(final IBlockReader class1855) {
        return new Class448();
    }
    
    @Override
    public boolean method11796(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field17759 = Block.method11778(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
        field17760 = Class8970.field37736;
        field17761 = Class8970.field37743;
        field17762 = Class8970.field37747;
        field17763 = Class8970.field37758;
        field17764 = Block.method11778(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
    }
}
