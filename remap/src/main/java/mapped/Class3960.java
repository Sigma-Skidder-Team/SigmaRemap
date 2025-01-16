// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class Class3960 extends Class3841
{
    private static String[] field17897;
    public static final Class7115 field17898;
    public static final Class7114<Class178> field17899;
    
    public Class3960(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class3960.field17898, Direction.NORTH)).with(Class3960.field17899, Class178.field507));
    }
    
    @Nullable
    @Override
    public TileEntity method11898(final IBlockReader class1855) {
        return null;
    }
    
    public static TileEntity method12080(final BlockState class7096, final Direction class7097, final boolean b, final boolean b2) {
        return new Class491(class7096, class7097, b, b2);
    }
    
    @Override
    public void method11829(final BlockState class7096, final World class7097, final BlockPos class7098, final BlockState class7099, final boolean b) {
        if (class7096.getBlock() != class7099.getBlock()) {
            final TileEntity method6727 = class7097.getTileEntity(class7098);
            if (method6727 instanceof Class491) {
                ((Class491)method6727).method2482();
            }
        }
    }
    
    @Override
    public void method11824(final Class1851 class1851, final BlockPos class1852, final BlockState class1853) {
        final BlockPos method1149 = class1852.method1149(class1853.get((IProperty<Direction>)Class3960.field17898).getOpposite());
        final BlockState method1150 = class1851.getBlockState(method1149);
        if (method1150.getBlock() instanceof Class3836) {
            if (method1150.get((IProperty<Boolean>)Class3836.field17438)) {
                class1851.method6690(method1149, false);
            }
        }
    }
    
    @Override
    public boolean method11793(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        return false;
    }
    
    @Override
    public boolean method11794(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        return false;
    }
    
    @Override
    public Class2201 method11844(final BlockState class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final BlockRayTraceResult class7101) {
        if (!class7097.isRemote && class7097.getTileEntity(class7098) == null) {
            class7097.method6690(class7098, false);
            return Class2201.field13401;
        }
        return Class2201.field13402;
    }
    
    @Override
    public List<ItemStack> method11833(final BlockState class7096, final Class9098 class7097) {
        final Class491 method12081 = this.method12081(class7097.method32880(), class7097.method32881(Class6683.field26367));
        return (method12081 != null) ? method12081.method2481().method21743(class7097) : Collections.emptyList();
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return VoxelShapes.empty();
    }
    
    @Override
    public VoxelShape method11809(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        final Class491 method12081 = this.method12081(class7097, class7098);
        return (method12081 == null) ? VoxelShapes.empty() : method12081.method2483(class7097, class7098);
    }
    
    @Nullable
    private Class491 method12081(final IBlockReader class1855, final BlockPos class1856) {
        final TileEntity method6727 = class1855.getTileEntity(class1856);
        return (method6727 instanceof Class491) ? ((Class491)method6727) : null;
    }
    
    @Override
    public ItemStack method11862(final IBlockReader class1855, final BlockPos class1856, final BlockState class1857) {
        return ItemStack.EMPTY;
    }
    
    @Override
    public BlockState method11790(final BlockState class7096, final Class2052 class7097) {
        return ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3960.field17898, class7097.method8142(class7096.get((IProperty<Direction>)Class3960.field17898)));
    }
    
    @Override
    public BlockState method11791(final BlockState class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.get((IProperty<Direction>)Class3960.field17898)));
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3960.field17898, Class3960.field17899);
    }
    
    @Override
    public boolean method11796(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field17898 = Class3835.field17415;
        field17899 = Class3835.field17417;
    }
}
