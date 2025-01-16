// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Map;

public class Class3975 extends Block
{
    private static String[] field17952;
    public static final Class7113 field17953;
    public static final Class7113 field17954;
    public static final Class7113 field17955;
    public static final Class7113 field17956;
    public static final Class7113 field17957;
    public static final Class7113 field17958;
    public static final Class7113 field17959;
    private static final Map<Direction, Class7113> field17960;
    public static final VoxelShape field17961;
    public static final VoxelShape field17962;
    private final Class3983 field17963;
    
    public Class3975(final Class3983 field17963, final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class3975.field17953, false)).with((IProperty<Comparable>)Class3975.field17954, false)).with((IProperty<Comparable>)Class3975.field17955, false)).with((IProperty<Comparable>)Class3975.field17956, false)).with((IProperty<Comparable>)Class3975.field17957, false)).with((IProperty<Comparable>)Class3975.field17958, false)).with((IProperty<Comparable>)Class3975.field17959, false));
        this.field17963 = field17963;
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return class7096.get((IProperty<Boolean>)Class3975.field17954) ? Class3975.field17961 : Class3975.field17962;
    }
    
    @Override
    public BlockState method11846(final Class7074 class7074) {
        final World method21654 = class7074.method21654();
        final BlockPos method21655 = class7074.method21639();
        return (BlockState)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)this.getDefaultState()).with((IProperty<Comparable>)Class3975.field17956, this.method12117(method21654.getBlockState(method21655.method1141()), Direction.NORTH))).with((IProperty<Comparable>)Class3975.field17957, this.method12117(method21654.getBlockState(method21655.method1147()), Direction.EAST))).with((IProperty<Comparable>)Class3975.field17958, this.method12117(method21654.getBlockState(method21655.method1143()), Direction.SOUTH))).with((IProperty<Comparable>)Class3975.field17959, this.method12117(method21654.getBlockState(method21655.method1145()), Direction.WEST));
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        return class7097.getAxis().isHorizontal() ? ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3975.field17960.get(class7097), this.method12117(class7098, class7097)) : super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public void method11828(final BlockState class7096, final World class7097, final BlockPos class7098, final BlockState class7099, final boolean b) {
        if (class7099.getBlock() != class7096.getBlock()) {
            this.method12115(class7097, class7098, class7096);
        }
    }
    
    @Override
    public void method11829(final BlockState class7096, final World class7097, final BlockPos class7098, final BlockState class7099, final boolean b) {
        if (!b) {
            if (class7096.getBlock() != class7099.getBlock()) {
                this.method12115(class7097, class7098, ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3975.field17953, true));
            }
        }
    }
    
    @Override
    public void method11870(final World class1847, final BlockPos class1848, final BlockState class1849, final PlayerEntity class1850) {
        if (!class1847.isRemote) {
            if (!class1850.getHeldItemMainhand().method27620()) {
                if (class1850.getHeldItemMainhand().getItem() == Items.field31426) {
                    class1847.setBlockState(class1848, ((StateHolder<O, BlockState>)class1849).with((IProperty<Comparable>)Class3975.field17955, true), 4);
                }
            }
        }
        super.method11870(class1847, class1848, class1849, class1850);
    }
    
    private void method12115(final World class1847, final BlockPos class1848, final BlockState class1849) {
        for (final Direction class1850 : new Direction[] { Direction.SOUTH, Direction.WEST}) {
            int j = 1;
            while (j < 42) {
                final BlockPos method1150 = class1848.method1150(class1850, j);
                final BlockState method1151 = class1847.getBlockState(method1150);
                if (method1151.getBlock() != this.field17963) {
                    if (method1151.getBlock() != this) {
                        break;
                    }
                    ++j;
                }
                else {
                    if (((StateHolder<Object, Object>)method1151).get((IProperty<Comparable>)Class3983.field17983) != class1850.getOpposite()) {
                        break;
                    }
                    this.field17963.method12126(class1847, method1150, method1151, false, true, j, class1849);
                    break;
                }
            }
        }
    }
    
    @Override
    public void method11850(final BlockState class7096, final World class7097, final BlockPos class7098, final Entity class7099) {
        if (!class7097.isRemote) {
            if (!class7096.get((IProperty<Boolean>)Class3975.field17953)) {
                this.method12116(class7097, class7098);
            }
        }
    }
    
    @Override
    public void method11822(final BlockState class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (class7097.getBlockState(class7098).method21772((IProperty<Boolean>)Class3975.field17953)) {
            this.method12116(class7097, class7098);
        }
    }
    
    private void method12116(final World class1847, final BlockPos class1848) {
        final BlockState method6701 = class1847.getBlockState(class1848);
        final boolean booleanValue = ((StateHolder<Object, BlockState>)method6701).get((IProperty<Boolean>)Class3975.field17953);
        boolean b = false;
        final List<Entity> method6702 = class1847.method7127(null, method6701.getShape(class1847, class1848).getBoundingBox().offset(class1848));
        if (!method6702.isEmpty()) {
            final Iterator iterator = method6702.iterator();
            while (iterator.hasNext()) {
                if (((Entity)iterator.next()).method1861()) {
                    continue;
                }
                b = true;
                break;
            }
        }
        if (b != booleanValue) {
            final BlockState class1849 = ((StateHolder<Object, BlockState>)method6701).with((IProperty<Comparable>)Class3975.field17953, b);
            class1847.setBlockState(class1848, class1849, 3);
            this.method12115(class1847, class1848, class1849);
        }
        if (b) {
            class1847.method6833().method21345(new BlockPos(class1848), this, this.method11826(class1847));
        }
    }
    
    public boolean method12117(final BlockState class7096, final Direction class7097) {
        final Block method21696 = class7096.getBlock();
        if (method21696 != this.field17963) {
            return method21696 == this;
        }
        return class7096.get((IProperty<Comparable>)Class3983.field17983) == class7097.getOpposite();
    }
    
    @Override
    public BlockState method11790(final BlockState class7096, final Class2052 class7097) {
        switch (Class6849.field26872[class7097.ordinal()]) {
            case 1: {
                return ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3975.field17956, (Comparable)class7096.get((IProperty<V>)Class3975.field17958))).with((IProperty<Comparable>)Class3975.field17957, (Comparable)class7096.get((IProperty<V>)Class3975.field17959))).with((IProperty<Comparable>)Class3975.field17958, (Comparable)class7096.get((IProperty<V>)Class3975.field17956))).with((IProperty<Comparable>)Class3975.field17959, (Comparable)class7096.get((IProperty<V>)Class3975.field17957));
            }
            case 2: {
                return ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3975.field17956, (Comparable)class7096.get((IProperty<V>)Class3975.field17957))).with((IProperty<Comparable>)Class3975.field17957, (Comparable)class7096.get((IProperty<V>)Class3975.field17958))).with((IProperty<Comparable>)Class3975.field17958, (Comparable)class7096.get((IProperty<V>)Class3975.field17959))).with((IProperty<Comparable>)Class3975.field17959, (Comparable)class7096.get((IProperty<V>)Class3975.field17956));
            }
            case 3: {
                return ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3975.field17956, (Comparable)class7096.get((IProperty<V>)Class3975.field17959))).with((IProperty<Comparable>)Class3975.field17957, (Comparable)class7096.get((IProperty<V>)Class3975.field17956))).with((IProperty<Comparable>)Class3975.field17958, (Comparable)class7096.get((IProperty<V>)Class3975.field17957))).with((IProperty<Comparable>)Class3975.field17959, (Comparable)class7096.get((IProperty<V>)Class3975.field17958));
            }
            default: {
                return class7096;
            }
        }
    }
    
    @Override
    public BlockState method11791(final BlockState class7096, final Class2181 class7097) {
        switch (Class6849.field26873[class7097.ordinal()]) {
            case 1: {
                return ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3975.field17956, (Comparable)class7096.get((IProperty<V>)Class3975.field17958))).with((IProperty<Comparable>)Class3975.field17958, (Comparable)class7096.get((IProperty<V>)Class3975.field17956));
            }
            case 2: {
                return ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3975.field17957, (Comparable)class7096.get((IProperty<V>)Class3975.field17959))).with((IProperty<Comparable>)Class3975.field17959, (Comparable)class7096.get((IProperty<V>)Class3975.field17957));
            }
            default: {
                return super.method11791(class7096, class7097);
            }
        }
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3975.field17953, Class3975.field17954, Class3975.field17955, Class3975.field17956, Class3975.field17957, Class3975.field17959, Class3975.field17958);
    }
    
    static {
        field17953 = Class8970.field37741;
        field17954 = Class8970.field37719;
        field17955 = Class8970.field37722;
        field17956 = Class3967.field17921;
        field17957 = Class3967.field17922;
        field17958 = Class3967.field17923;
        field17959 = Class3967.field17924;
        field17960 = Class3854.field17470;
        field17961 = Block.method11778(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
        field17962 = Block.method11778(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
    }
}
