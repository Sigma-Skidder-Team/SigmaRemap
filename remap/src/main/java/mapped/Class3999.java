// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap;
import java.util.Random;
import java.util.EnumSet;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Iterator;
import com.google.common.collect.Sets;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Set;
import java.util.Map;

public class Class3999 extends Block
{
    private static String[] field18021;
    public static final Class7114<Class106> field18022;
    public static final Class7114<Class106> field18023;
    public static final Class7114<Class106> field18024;
    public static final Class7114<Class106> field18025;
    public static final Class7112 field18026;
    public static final Map<Direction, Class7114<Class106>> field18027;
    public static final VoxelShape[] field18028;
    private boolean field18029;
    private final Set<BlockPos> field18030;
    
    public Class3999(final Properties class9288) {
        super(class9288);
        this.field18029 = true;
        this.field18030 = Sets.newHashSet();
        this.method11877(((StateHolder<O, BlockState>) this.field17406.method32903().with(Class3999.field18022, Class106.field329).with(Class3999.field18023, Class106.field329).with(Class3999.field18024, Class106.field329).with(Class3999.field18025, Class106.field329)).with((IProperty<Comparable>)Class3999.field18026, 0));
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3999.field18028[method12150(class7096)];
    }
    
    private static int method12150(final BlockState class7096) {
        int n = 0;
        final boolean b = class7096.get(Class3999.field18022) != Class106.field329;
        final boolean b2 = class7096.get(Class3999.field18023) != Class106.field329;
        final boolean b3 = class7096.get(Class3999.field18024) != Class106.field329;
        final boolean b4 = class7096.get(Class3999.field18025) != Class106.field329;
        Label_0111: {
            if (!b) {
                if (!b3) {
                    break Label_0111;
                }
                if (b) {
                    break Label_0111;
                }
                if (b2) {
                    break Label_0111;
                }
                if (b4) {
                    break Label_0111;
                }
            }
            n |= 1 << Direction.NORTH.getHorizontalIndex();
        }
        Label_0167: {
            if (!b2) {
                if (!b4) {
                    break Label_0167;
                }
                if (b) {
                    break Label_0167;
                }
                if (b2) {
                    break Label_0167;
                }
                if (b3) {
                    break Label_0167;
                }
            }
            n |= 1 << Direction.EAST.getHorizontalIndex();
        }
        Label_0223: {
            if (!b3) {
                if (!b) {
                    break Label_0223;
                }
                if (b2) {
                    break Label_0223;
                }
                if (b3) {
                    break Label_0223;
                }
                if (b4) {
                    break Label_0223;
                }
            }
            n |= 1 << Direction.SOUTH.getHorizontalIndex();
        }
        if (!b4) {
            if (!b2) {
                return n;
            }
            if (b) {
                return n;
            }
            if (b3) {
                return n;
            }
            if (b4) {
                return n;
            }
        }
        n |= 1 << Direction.WEST.getHorizontalIndex();
        return n;
    }
    
    @Override
    public BlockState method11846(final Class7074 class7074) {
        final World method21654 = class7074.method21654();
        final BlockPos method21655 = class7074.method21639();
        return (BlockState)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)this.getDefaultState()).with(Class3999.field18025, this.method12151(method21654, method21655, Direction.WEST))).with(Class3999.field18023, this.method12151(method21654, method21655, Direction.EAST))).with(Class3999.field18022, this.method12151(method21654, method21655, Direction.NORTH))).with(Class3999.field18024, this.method12151(method21654, method21655, Direction.SOUTH));
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7097 != Direction.DOWN) {
            return (class7097 != Direction.UP) ? ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3999.field18027.get(class7097), this.method12151(class7099, class7100, class7097)) : class7096.with(Class3999.field18025, this.method12151(class7099, class7100, Direction.WEST)).with(Class3999.field18023, this.method12151(class7099, class7100, Direction.EAST)).with(Class3999.field18022, this.method12151(class7099, class7100, Direction.NORTH)).with(Class3999.field18024, this.method12151(class7099, class7100, Direction.SOUTH));
        }
        return class7096;
    }
    
    @Override
    public void method11788(final BlockState class7096, final Class1851 class7097, final BlockPos class7098, final int n) {
        try (final Class386 method1296 = Class386.method1296()) {
            for (final Direction class7099 : Plane.HORIZONTAL) {
                if (class7096.get(Class3999.field18027.get(class7099)) != Class106.field329 && class7097.getBlockState(method1296.method1303(class7098).method1304(class7099)).getBlock() != this) {
                    method1296.method1304(Direction.DOWN);
                    final BlockState method1297 = class7097.getBlockState(method1296);
                    if (method1297.getBlock() != Blocks.OBSERVER) {
                        final BlockPos method1298 = method1296.method1149(class7099.getOpposite());
                        Block.method11787(method1297, method1297.method21748(class7099.getOpposite(), class7097.getBlockState(method1298), class7097, method1296, method1298), class7097, method1296, n);
                    }
                    method1296.method1303(class7098).method1304(class7099).method1304(Direction.UP);
                    final BlockState method1299 = class7097.getBlockState(method1296);
                    if (method1299.getBlock() == Blocks.OBSERVER) {
                        continue;
                    }
                    final BlockPos method1300 = method1296.method1149(class7099.getOpposite());
                    Block.method11787(method1299, method1299.method21748(class7099.getOpposite(), class7097.getBlockState(method1300), class7097, method1296, method1300), class7097, method1296, n);
                }
            }
        }
    }
    
    private Class106 method12151(final IBlockReader class1855, final BlockPos class1856, final Direction class1857) {
        final BlockPos method1149 = class1856.method1149(class1857);
        final BlockState method1150 = class1855.getBlockState(method1149);
        final BlockPos method1151 = class1856.method1137();
        if (!class1855.getBlockState(method1151).method21713(class1855, method1151)) {
            if (method1150.isSolidSide(class1855, method1149, Direction.UP) || method1150.getBlock() == Blocks.field29475) {
                if (method12158(class1855.getBlockState(method1149.method1137()))) {
                    if (!method1150.isCollisionShapeOpaque(class1855, method1149)) {
                        return Class106.field328;
                    }
                    return Class106.field327;
                }
            }
        }
        return (!method12159(method1150, class1857) && (method1150.method21713(class1855, method1149) || !method12158(class1855.getBlockState(method1149.method1139())))) ? Class106.field329 : Class106.field328;
    }
    
    @Override
    public boolean method11843(final BlockState class7096, final Class1852 class7097, final BlockPos class7098) {
        final BlockPos method1139 = class7098.method1139();
        final BlockState method1140 = class7097.getBlockState(method1139);
        return method1140.isSolidSide(class7097, method1139, Direction.UP) || method1140.getBlock() == Blocks.field29475;
    }
    
    private BlockState method12152(final World class1847, final BlockPos class1848, BlockState method12153) {
        method12153 = this.method12153(class1847, class1848, method12153);
        final ArrayList arrayList = Lists.newArrayList((Iterable)this.field18030);
        this.field18030.clear();
        final Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            class1847.method6696((BlockPos)iterator.next(), this);
        }
        return method12153;
    }
    
    private BlockState method12153(final World class1847, final BlockPos class1848, BlockState class1849) {
        final BlockState class1850 = class1849;
        final int intValue = class1849.get(Class3999.field18026);
        this.field18029 = false;
        final int method6750 = class1847.method6750(class1848);
        this.field18029 = true;
        int n = 0;
        if (method6750 < 15) {
            final Iterator<Direction> iterator = Plane.HORIZONTAL.iterator();
            while (iterator.hasNext()) {
                final BlockPos method6751 = class1848.method1149(iterator.next());
                final BlockState method6752 = class1847.getBlockState(method6751);
                n = this.method12155(n, method6752);
                final BlockPos method6753 = class1848.method1137();
                if (method6752.method21713(class1847, method6751) && !class1847.getBlockState(method6753).method21713(class1847, method6753)) {
                    n = this.method12155(n, class1847.getBlockState(method6751.method1137()));
                }
                else {
                    if (method6752.method21713(class1847, method6751)) {
                        continue;
                    }
                    n = this.method12155(n, class1847.getBlockState(method6751.method1139()));
                }
            }
        }
        int i = n - 1;
        if (method6750 > i) {
            i = method6750;
        }
        if (intValue != i) {
            class1849 = (BlockState)((StateHolder<Object, Object>)class1849).with((IProperty<Comparable>)Class3999.field18026, i);
            if (class1847.getBlockState(class1848) == class1850) {
                class1847.setBlockState(class1848, class1849, 2);
            }
            this.field18030.add(class1848);
            final Direction[] values = Direction.values();
            for (int length = values.length, j = 0; j < length; ++j) {
                this.field18030.add(class1848.method1149(values[j]));
            }
        }
        return class1849;
    }
    
    private void method12154(final World class1847, final BlockPos class1848) {
        if (class1847.getBlockState(class1848).method21696() == this) {
            class1847.method6696(class1848, this);
            final Direction[] values = Direction.values();
            for (int length = values.length, i = 0; i < length; ++i) {
                class1847.method6696(class1848.method1149(values[i]), this);
            }
        }
    }
    
    @Override
    public void onBlockAdded(final BlockState class7096, final World class7097, final BlockPos class7098, final BlockState class7099, final boolean b) {
        if (class7099.getBlock() != class7096.getBlock()) {
            if (!class7097.isRemote) {
                this.method12152(class7097, class7098, class7096);
                final Iterator<Direction> iterator = Plane.VERTICAL.iterator();
                while (iterator.hasNext()) {
                    class7097.method6696(class7098.method1149(iterator.next()), this);
                }
                final Iterator<Direction> iterator2 = Plane.HORIZONTAL.iterator();
                while (iterator2.hasNext()) {
                    this.method12154(class7097, class7098.method1149(iterator2.next()));
                }
                final Iterator<Direction> iterator3 = Plane.HORIZONTAL.iterator();
                while (iterator3.hasNext()) {
                    final BlockPos method1149 = class7098.method1149(iterator3.next());
                    if (!class7097.getBlockState(method1149).method21713(class7097, method1149)) {
                        this.method12154(class7097, method1149.method1139());
                    }
                    else {
                        this.method12154(class7097, method1149.method1137());
                    }
                }
            }
        }
    }
    
    @Override
    public void onReplaced(final BlockState class7096, final World class7097, final BlockPos class7098, final BlockState class7099, final boolean b) {
        if (!b) {
            if (class7096.getBlock() != class7099.getBlock()) {
                super.onReplaced(class7096, class7097, class7098, class7099, b);
                if (!class7097.isRemote) {
                    final Direction[] values = Direction.values();
                    for (int length = values.length, i = 0; i < length; ++i) {
                        class7097.method6696(class7098.method1149(values[i]), this);
                    }
                    this.method12152(class7097, class7098, class7096);
                    final Iterator<Direction> iterator = Plane.HORIZONTAL.iterator();
                    while (iterator.hasNext()) {
                        this.method12154(class7097, class7098.method1149(iterator.next()));
                    }
                    final Iterator<Direction> iterator2 = Plane.HORIZONTAL.iterator();
                    while (iterator2.hasNext()) {
                        final BlockPos method1149 = class7098.method1149(iterator2.next());
                        if (!class7097.getBlockState(method1149).method21713(class7097, method1149)) {
                            this.method12154(class7097, method1149.method1139());
                        }
                        else {
                            this.method12154(class7097, method1149.method1137());
                        }
                    }
                }
            }
        }
    }
    
    private int method12155(final int n, final BlockState class7096) {
        if (class7096.getBlock() == this) {
            final int intValue = class7096.get(Class3999.field18026);
            return (intValue <= n) ? n : intValue;
        }
        return n;
    }
    
    @Override
    public void method11825(final BlockState class7096, final World class7097, final BlockPos class7098, final Block class7099, final BlockPos class7100, final boolean b) {
        if (!class7097.isRemote) {
            if (!class7096.method21752(class7097, class7098)) {
                Block.spawnDrops(class7096, class7097, class7098);
                class7097.method6690(class7098, false);
            }
            else {
                this.method12152(class7097, class7098, class7096);
            }
        }
    }
    
    @Override
    public int method11851(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final Direction class7099) {
        return this.field18029 ? class7096.method21715(class7097, class7098, class7099) : 0;
    }
    
    @Override
    public int method11848(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final Direction o) {
        if (!this.field18029) {
            return 0;
        }
        final int intValue = class7096.get(Class3999.field18026);
        if (intValue == 0) {
            return 0;
        }
        if (o == Direction.UP) {
            return intValue;
        }
        final EnumSet<Direction> none = EnumSet.noneOf(Direction.class);
        for (final Direction e : Plane.HORIZONTAL) {
            if (!this.method12156(class7097, class7098, e)) {
                continue;
            }
            none.add((Object)e);
        }
        if (o.getAxis().isHorizontal() && none.isEmpty()) {
            return intValue;
        }
        if (none.contains(o)) {
            if (!none.contains(o.method784())) {
                if (!none.contains(o.rotateY())) {
                    return intValue;
                }
            }
        }
        return 0;
    }
    
    private boolean method12156(final IBlockReader class1855, final BlockPos class1856, final Direction class1857) {
        final BlockPos method1149 = class1856.method1149(class1857);
        final BlockState method1150 = class1855.getBlockState(method1149);
        final boolean method1151 = method1150.method21713(class1855, method1149);
        final BlockPos method1152 = class1856.method1137();
        if (!class1855.getBlockState(method1152).method21713(class1855, method1152)) {
            if (method1151) {
                if (method12157(class1855, method1149.method1137())) {
                    return true;
                }
            }
        }
        if (!method12159(method1150, class1857)) {
            if (method1150.getBlock() == Blocks.field29345) {
                if (method1150.get(Class3895.field17578)) {
                    if (method1150.get((IProperty<Comparable>)Class3895.field17564) == class1857) {
                        return true;
                    }
                }
            }
            return !method1151 && method12157(class1855, method1149.method1139());
        }
        return true;
    }
    
    public static boolean method12157(final IBlockReader class1855, final BlockPos class1856) {
        return method12158(class1855.getBlockState(class1856));
    }
    
    public static boolean method12158(final BlockState class7096) {
        return method12159(class7096, null);
    }
    
    public static boolean method12159(final BlockState class7096, final Direction class7097) {
        if (class7096.getBlock() == Blocks.REDSTONE_WIRE) {
            return true;
        }
        if (class7096.getBlock() == Blocks.field29345) {
            final Direction class7098 = class7096.get(Class3897.field17564);
            return class7098 == class7097 || class7098.getOpposite() == class7097;
        }
        if (Blocks.OBSERVER != class7096.getBlock()) {
            return class7096.method21714() && class7097 != null;
        }
        return class7097 == class7096.get(Class3838.field17415);
    }
    
    @Override
    public boolean method11849(final BlockState class7096) {
        return this.field18029;
    }
    
    public static int method12160(final int n) {
        final float n2 = n / 15.0f;
        float n3 = n2 * 0.6f + 0.4f;
        if (n == 0) {
            n3 = 0.3f;
        }
        float n4 = n2 * n2 * 0.7f - 0.5f;
        float n5 = n2 * n2 * 0.6f - 0.7f;
        if (n4 < 0.0f) {
            n4 = 0.0f;
        }
        if (n5 < 0.0f) {
            n5 = 0.0f;
        }
        return 0xFF000000 | MathHelper.method35651((int)(n3 * 255.0f), 0, 255) << 16 | MathHelper.method35651((int)(n4 * 255.0f), 0, 255) << 8 | MathHelper.method35651((int)(n5 * 255.0f), 0, 255);
    }
    
    @Override
    public void method11823(final BlockState class7096, final World class7097, final BlockPos class7098, final Random random) {
        final int intValue = class7096.get(Class3999.field18026);
        if (intValue != 0) {
            final double n = class7098.getX() + 0.5 + (random.nextFloat() - 0.5) * 0.2;
            final double n2 = class7098.getY() + 0.0625f;
            final double n3 = class7098.getZ() + 0.5 + (random.nextFloat() - 0.5) * 0.2;
            final float n4 = intValue / 15.0f;
            class7097.method6709(new Class6912(n4 * 0.6f + 0.4f, Math.max(0.0f, n4 * n4 * 0.7f - 0.5f), Math.max(0.0f, n4 * n4 * 0.6f - 0.7f), 1.0f), n, n2, n3, 0.0, 0.0, 0.0);
        }
    }
    
    @Override
    public BlockState method11790(final BlockState class7096, final Class2052 class7097) {
        switch (Class5205.field22218[class7097.ordinal()]) {
            case 1: {
                return class7096.with(Class3999.field18022, (Comparable)class7096.get((IProperty<V>)Class3999.field18024)).with(Class3999.field18023, (Comparable)class7096.get((IProperty<V>)Class3999.field18025)).with(Class3999.field18024, (Comparable)class7096.get((IProperty<V>)Class3999.field18022)).with(Class3999.field18025, (Comparable)class7096.get((IProperty<V>)Class3999.field18023));
            }
            case 2: {
                return class7096.with(Class3999.field18022, (Comparable)class7096.get((IProperty<V>)Class3999.field18023)).with(Class3999.field18023, (Comparable)class7096.get((IProperty<V>)Class3999.field18024)).with(Class3999.field18024, (Comparable)class7096.get((IProperty<V>)Class3999.field18025)).with(Class3999.field18025, (Comparable)class7096.get((IProperty<V>)Class3999.field18022));
            }
            case 3: {
                return class7096.with(Class3999.field18022, (Comparable)class7096.get((IProperty<V>)Class3999.field18025)).with(Class3999.field18023, (Comparable)class7096.get((IProperty<V>)Class3999.field18022)).with(Class3999.field18024, (Comparable)class7096.get((IProperty<V>)Class3999.field18023)).with(Class3999.field18025, (Comparable)class7096.get((IProperty<V>)Class3999.field18024));
            }
            default: {
                return class7096;
            }
        }
    }
    
    @Override
    public BlockState method11791(final BlockState class7096, final Class2181 class7097) {
        switch (Class5205.field22219[class7097.ordinal()]) {
            case 1: {
                return class7096.with(Class3999.field18022, (Comparable)class7096.get((IProperty<V>)Class3999.field18024)).with(Class3999.field18024, (Comparable)class7096.get((IProperty<V>)Class3999.field18022));
            }
            case 2: {
                return class7096.with(Class3999.field18023, (Comparable)class7096.get((IProperty<V>)Class3999.field18025)).with(Class3999.field18025, (Comparable)class7096.get((IProperty<V>)Class3999.field18023));
            }
            default: {
                return super.method11791(class7096, class7097);
            }
        }
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3999.field18022, Class3999.field18023, Class3999.field18024, Class3999.field18025, Class3999.field18026);
    }
    
    static {
        field18022 = Class8970.field37762;
        field18023 = Class8970.field37761;
        field18024 = Class8970.field37763;
        field18025 = Class8970.field37764;
        field18026 = Class8970.field37790;
        field18027 = Maps.newEnumMap((Map)ImmutableMap.of(Direction.NORTH, Class3999.field18022, Direction.EAST, Class3999.field18023, Direction.SOUTH, Class3999.field18024, (Object) Direction.WEST, (Object)Class3999.field18025));
        field18028 = new VoxelShape[] { Block.method11778(3.0, 0.0, 3.0, 13.0, 1.0, 13.0), Block.method11778(3.0, 0.0, 3.0, 13.0, 1.0, 16.0), Block.method11778(0.0, 0.0, 3.0, 13.0, 1.0, 13.0), Block.method11778(0.0, 0.0, 3.0, 13.0, 1.0, 16.0), Block.method11778(3.0, 0.0, 0.0, 13.0, 1.0, 13.0), Block.method11778(3.0, 0.0, 0.0, 13.0, 1.0, 16.0), Block.method11778(0.0, 0.0, 0.0, 13.0, 1.0, 13.0), Block.method11778(0.0, 0.0, 0.0, 13.0, 1.0, 16.0), Block.method11778(3.0, 0.0, 3.0, 16.0, 1.0, 13.0), Block.method11778(3.0, 0.0, 3.0, 16.0, 1.0, 16.0), Block.method11778(0.0, 0.0, 3.0, 16.0, 1.0, 13.0), Block.method11778(0.0, 0.0, 3.0, 16.0, 1.0, 16.0), Block.method11778(3.0, 0.0, 0.0, 16.0, 1.0, 13.0), Block.method11778(3.0, 0.0, 0.0, 16.0, 1.0, 16.0), Block.method11778(0.0, 0.0, 0.0, 16.0, 1.0, 13.0), Block.method11778(0.0, 0.0, 0.0, 16.0, 1.0, 16.0) };
    }
}
