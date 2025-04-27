// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;
import javax.annotation.Nullable;
import java.util.Map;

public class Class4023 extends Class4022
{
    private static String[] field18109;
    public static final Class7115 field18110;
    private static final Map<Direction, VoxelShape> field18111;
    
    public Class4023(final Properties class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class4023.field18110, Direction.NORTH));
    }
    
    @Override
    public String getTranslationKey() {
        return this.method11704().getTranslationKey();
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return method12215(class7096);
    }
    
    public static VoxelShape method12215(final BlockState class7096) {
        return Class4023.field18111.get(class7096.get((IProperty<Object>)Class4023.field18110));
    }
    
    @Override
    public boolean method11843(final BlockState class7096, final Class1852 class7097, final BlockPos class7098) {
        final Direction class7099 = class7096.get(Class4023.field18110);
        final BlockPos method1149 = class7098.method1149(class7099.getOpposite());
        return class7097.getBlockState(method1149).isSolidSide(class7097, method1149, class7099);
    }
    
    @Nullable
    @Override
    public BlockState method11846(final Class7074 class7074) {
        BlockState method11878 = this.getDefaultState();
        final World method11879 = class7074.method21654();
        final BlockPos method11880 = class7074.method21639();
        for (final Direction class7075 : class7074.method21643()) {
            if (class7075.getAxis().isHorizontal()) {
                method11878 = ((StateHolder<Object, BlockState>)method11878).with((IProperty<Comparable>)Class4023.field18110, class7075.getOpposite());
                if (method11878.method21752(method11879, method11880)) {
                    return method11878;
                }
            }
        }
        return null;
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        return (class7097.getOpposite() == class7096.get(Class4023.field18110) && !class7096.method21752(class7099, class7100)) ? Blocks.AIR.getDefaultState() : class7096;
    }
    
    @Override
    public void method11823(final BlockState class7096, final World class7097, final BlockPos class7098, final Random random) {
        final Direction class7099 = class7096.get(Class4023.field18110);
        final double n = class7098.getX() + 0.5;
        final double n2 = class7098.getY() + 0.7;
        final double n3 = class7098.getZ() + 0.5;
        final Direction method782 = class7099.getOpposite();
        class7097.method6709(Class8432.field34639, n + 0.27 * method782.getXOffset(), n2 + 0.22, n3 + 0.27 * method782.getZOffset(), 0.0, 0.0, 0.0);
        class7097.method6709(Class8432.field34623, n + 0.27 * method782.getXOffset(), n2 + 0.22, n3 + 0.27 * method782.getZOffset(), 0.0, 0.0, 0.0);
    }
    
    @Override
    public BlockState method11790(final BlockState class7096, final Class2052 class7097) {
        return ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class4023.field18110, class7097.method8142(class7096.get(Class4023.field18110)));
    }
    
    @Override
    public BlockState method11791(final BlockState class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.get(Class4023.field18110)));
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class4023.field18110);
    }
    
    static {
        field18110 = Class3892.field17564;
        field18111 = Maps.newEnumMap((Map)ImmutableMap.of(Direction.NORTH, Block.method11778(5.5, 3.0, 11.0, 10.5, 13.0, 16.0), Direction.SOUTH, Block.method11778(5.5, 3.0, 0.0, 10.5, 13.0, 5.0), Direction.WEST, Block.method11778(11.0, 3.0, 5.5, 16.0, 13.0, 10.5), (Object) Direction.EAST, (Object) Block.method11778(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)));
    }
}
