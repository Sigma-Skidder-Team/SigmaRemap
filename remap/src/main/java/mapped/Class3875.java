// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

import java.util.Map;

public class Class3875 extends Class3874
{
    private static String[] field17520;
    public static final Class7115 field17521;
    private final Class3993 field17522;
    private static final Map<Direction, VoxelShape> field17523;
    
    public Class3875(final Class3993 field17522, final Properties class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, Class7096>)this.field17406.method32903()).with((IProperty<Comparable>)Class3875.field17521, Direction.NORTH));
        this.field17522 = field17522;
    }
    
    @Override
    public VoxelShape method11808(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3875.field17523.get(class7096.method21772((IProperty<Object>)Class3875.field17521));
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        return (class7098.method21696() != this.field17522 && class7097 == class7096.method21772((IProperty<Direction>)Class3875.field17521)) ? ((StateHolder<O, Class7096>)this.field17522.method12142().getDefaultState()).with((IProperty<Comparable>)Class3873.field17516, 7) : super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public boolean method11943(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098) {
        return class7096.method21696() == Blocks.field29298;
    }
    
    public Item method11950() {
        if (this.field17522 != Blocks.field29337) {
            return (this.field17522 != Blocks.field29383) ? Items.AIR : Items.field31430;
        }
        return Items.field31429;
    }
    
    @Override
    public ItemStack method11862(final IBlockReader class1855, final BlockPos class1856, final Class7096 class1857) {
        return new ItemStack(this.method11950());
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return ((StateHolder<O, Class7096>)class7096).with((IProperty<Comparable>)Class3875.field17521, class7097.method8142(class7096.method21772((IProperty<Direction>)Class3875.field17521)));
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.method21772((IProperty<Direction>)Class3875.field17521)));
    }
    
    @Override
    public void method11875(final Class9500<Block, Class7096> class9500) {
        class9500.method35378(Class3875.field17521);
    }
    
    static {
        field17521 = Class3892.field17564;
        field17523 = Maps.newEnumMap((Map)ImmutableMap.of((Object) Direction.SOUTH, (Object) Block.method11778(6.0, 0.0, 6.0, 10.0, 10.0, 16.0), (Object) Direction.WEST, (Object) Block.method11778(0.0, 0.0, 6.0, 10.0, 10.0, 10.0), (Object) Direction.NORTH, (Object) Block.method11778(6.0, 0.0, 0.0, 10.0, 10.0, 10.0), (Object) Direction.EAST, (Object) Block.method11778(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)));
    }
}
