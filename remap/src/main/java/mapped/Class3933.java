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

import java.util.Map;

public class Class3933 extends Class3932
{
    private static String[] field17813;
    public static final Class7115 field17814;
    private static final Map<Direction, VoxelShape> field17815;
    
    public Class3933(final Class299 class299, final Properties class300) {
        super(class299, class300);
        this.method11877(((StateHolder<O, Class7096>)this.field17406.method32903()).with((IProperty<Comparable>)Class3933.field17814, Direction.NORTH));
    }
    
    @Override
    public String getTranslationKey() {
        return this.method11704().getTranslationKey();
    }
    
    @Override
    public VoxelShape method11808(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3933.field17815.get(class7096.method21772((IProperty<Object>)Class3933.field17814));
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        Class7096 method11878 = this.getDefaultState();
        final World method11879 = class7074.method21654();
        final BlockPos method11880 = class7074.method21639();
        for (final Direction class7075 : class7074.method21643()) {
            if (class7075.getAxis().isHorizontal()) {
                method11878 = ((StateHolder<Object, Class7096>)method11878).with((IProperty<Comparable>)Class3933.field17814, class7075.getOpposite());
                if (!method11879.getBlockState(method11880.method1149(class7075)).method21750(class7074)) {
                    return method11878;
                }
            }
        }
        return null;
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return ((StateHolder<O, Class7096>)class7096).with((IProperty<Comparable>)Class3933.field17814, class7097.method8142(class7096.method21772((IProperty<Direction>)Class3933.field17814)));
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.method21772((IProperty<Direction>)Class3933.field17814)));
    }
    
    @Override
    public void method11875(final Class9500<Block, Class7096> class9500) {
        class9500.method35378(Class3933.field17814);
    }
    
    static {
        field17814 = Class3892.field17564;
        field17815 = Maps.newEnumMap((Map)ImmutableMap.of((Object) Direction.NORTH, (Object) Block.method11778(4.0, 4.0, 8.0, 12.0, 12.0, 16.0), (Object) Direction.SOUTH, (Object) Block.method11778(4.0, 4.0, 0.0, 12.0, 12.0, 8.0), (Object) Direction.EAST, (Object) Block.method11778(0.0, 4.0, 4.0, 8.0, 12.0, 12.0), (Object) Direction.WEST, (Object) Block.method11778(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)));
    }
}
