// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

import java.util.Map;

public class Class3946 extends Class3944
{
    private static String[] field17841;
    public static final Class7112 field17842;
    private static final Map<Class181, Block> field17843;
    private static final VoxelShape field17844;
    
    public Class3946(final Class181 class181, final Class9288 class182) {
        super(class181, class182);
        this.method11877(((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class3946.field17842, 0));
        Class3946.field17843.put(class181, this);
    }
    
    @Override
    public boolean method11843(final BlockState class7096, final Class1852 class7097, final BlockPos class7098) {
        return class7097.getBlockState(class7098.method1139()).getMaterial().method26439();
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3946.field17844;
    }
    
    @Override
    public BlockState method11846(final Class7074 class7074) {
        return ((StateHolder<O, BlockState>)this.getDefaultState()).with((IProperty<Comparable>)Class3946.field17842, MathHelper.floor((180.0f + class7074.method21646()) * 16.0f / 360.0f + 0.5) & 0xF);
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        return (class7097 == Direction.DOWN && !class7096.method21752(class7099, class7100)) ? Class7521.field29147.getDefaultState() : super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public BlockState method11790(final BlockState class7096, final Class2052 class7097) {
        return ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3946.field17842, class7097.method8143(class7096.get((IProperty<Integer>)Class3946.field17842), 16));
    }
    
    @Override
    public BlockState method11791(final BlockState class7096, final Class2181 class7097) {
        return ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3946.field17842, class7097.method8343(class7096.get((IProperty<Integer>)Class3946.field17842), 16));
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3946.field17842);
    }
    
    public static Block method12065(final Class181 key) {
        return Class3946.field17843.getOrDefault(key, Class7521.field29555);
    }
    
    static {
        field17842 = Class8970.field37793;
        field17843 = Maps.newHashMap();
        field17844 = Block.method11778(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
    }
}
