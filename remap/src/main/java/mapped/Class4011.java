// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collector;
import java.util.Random;
import javax.annotation.Nullable;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

import java.util.Map;

public class Class4011 extends Block
{
    private static String[] field18070;
    public static final Class7112 field18071;
    public static final Class7113 field18072;
    public static final Class7113 field18073;
    public static final Class7113 field18074;
    public static final Class7113 field18075;
    public static final Class7113 field18076;
    private static final Map<Direction, Class7113> field18077;
    private final Object2IntMap<Block> field18078;
    private final Object2IntMap<Block> field18079;
    
    public Class4011(final Class9288 class9288) {
        super(class9288);
        this.field18078 = (Object2IntMap<Block>)new Object2IntOpenHashMap();
        this.field18079 = (Object2IntMap<Block>)new Object2IntOpenHashMap();
        this.method11877(((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class4011.field18071, 0)).with((IProperty<Comparable>)Class4011.field18072, false)).with((IProperty<Comparable>)Class4011.field18073, false)).with((IProperty<Comparable>)Class4011.field18074, false)).with((IProperty<Comparable>)Class4011.field18075, false)).with((IProperty<Comparable>)Class4011.field18076, false));
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return VoxelShapes.empty();
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        return this.method11843(class7096, class7099, class7100) ? ((StateHolder<O, BlockState>)this.method12184(class7099, class7100)).with((IProperty<Comparable>)Class4011.field18071, (Comparable)class7096.get((IProperty<V>)Class4011.field18071)) : Class7521.field29147.getDefaultState();
    }
    
    @Nullable
    @Override
    public BlockState method11846(final Class7074 class7074) {
        return this.method12184(class7074.method21654(), class7074.method21639());
    }
    
    public BlockState method12184(final IBlockReader class1855, final BlockPos class1856) {
        final BlockPos method1139 = class1856.method1139();
        final BlockState method1140 = class1855.getBlockState(method1139);
        if (!this.method12191(method1140) && !method1140.isSolidSide(class1855, method1139, Direction.UP)) {
            BlockState method1141 = this.getDefaultState();
            for (final Direction class1857 : Direction.values()) {
                final Class7113 class1858 = Class4011.field18077.get(class1857);
                if (class1858 != null) {
                    method1141 = ((StateHolder<Object, BlockState>)method1141).with((IProperty<Comparable>)class1858, this.method12191(class1855.getBlockState(class1856.method1149(class1857))));
                }
            }
            return method1141;
        }
        return this.getDefaultState();
    }
    
    @Override
    public boolean method11843(final BlockState class7096, final Class1852 class7097, final BlockPos class7098) {
        final BlockPos method1139 = class7098.method1139();
        return class7097.getBlockState(method1139).isSolidSide(class7097, method1139, Direction.UP) || this.method12189(class7097, class7098);
    }
    
    @Override
    public int method11826(final Class1852 class1852) {
        return 30;
    }
    
    @Override
    public void method11822(BlockState class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (class7097.method6765().method31216(Class8878.field37315)) {
            if (!class7096.method21752(class7097, class7098)) {
                class7097.method6690(class7098, false);
            }
            final Block method21696 = class7097.getBlockState(class7098.method1139()).method21696();
            boolean b = false;
            Label_0104: {
                if (!(class7097.dimension instanceof Class6738) || method21696 != Class7521.field29172) {
                    if (method21696 != Class7521.field29338) {
                        if (method21696 != Class7521.field29642) {
                            b = false;
                            break Label_0104;
                        }
                    }
                }
                b = true;
            }
            final boolean b2 = b;
            final int intValue = class7096.get((IProperty<Integer>)Class4011.field18071);
            if (!b2) {
                if (class7097.method6771()) {
                    if (this.method12185(class7097, class7098)) {
                        if (random.nextFloat() < 0.2f + intValue * 0.03f) {
                            class7097.method6690(class7098, false);
                            return;
                        }
                    }
                }
            }
            final int min = Math.min(15, intValue + random.nextInt(3) / 2);
            if (intValue != min) {
                class7096 = (BlockState)((StateHolder<Object, Object>)class7096).with((IProperty<Comparable>)Class4011.field18071, min);
                class7097.setBlockState(class7098, class7096, 4);
            }
            if (!b2) {
                class7097.method6907().method21345(class7098, this, this.method11826(class7097) + random.nextInt(10));
                if (!this.method12189(class7097, class7098)) {
                    final BlockPos method21697 = class7098.method1139();
                    if (!class7097.getBlockState(method21697).method21761(class7097, method21697, Direction.UP) || intValue > 3) {
                        class7097.method6690(class7098, false);
                    }
                    return;
                }
                if (intValue == 15) {
                    if (random.nextInt(4) == 0) {
                        if (!this.method12191(class7097.getBlockState(class7098.method1139()))) {
                            class7097.method6690(class7098, false);
                            return;
                        }
                    }
                }
            }
            final boolean method21698 = class7097.method6773(class7098);
            final int n = method21698 ? -50 : 0;
            this.method12188(class7097, class7098.method1147(), 300 + n, random, intValue);
            this.method12188(class7097, class7098.method1145(), 300 + n, random, intValue);
            this.method12188(class7097, class7098.method1139(), 250 + n, random, intValue);
            this.method12188(class7097, class7098.method1137(), 250 + n, random, intValue);
            this.method12188(class7097, class7098.method1141(), 300 + n, random, intValue);
            this.method12188(class7097, class7098.method1143(), 300 + n, random, intValue);
            final Mutable class7099 = new Mutable();
            for (int i = -1; i <= 1; ++i) {
                for (int j = -1; j <= 1; ++j) {
                    for (int k = -1; k <= 4; ++k) {
                        if (i == 0) {
                            if (k == 0) {
                                if (j == 0) {
                                    continue;
                                }
                            }
                        }
                        int bound = 100;
                        if (k > 1) {
                            bound += (k - 1) * 100;
                        }
                        class7099.method1287(class7098).method1292(i, k, j);
                        final int method21699 = this.method12190(class7097, class7099);
                        if (method21699 > 0) {
                            int n2 = (method21699 + 40 + class7097.method6954().method8235() * 7) / (intValue + 30);
                            if (method21698) {
                                n2 /= 2;
                            }
                            if (n2 > 0) {
                                if (random.nextInt(bound) <= n2) {
                                    if (!class7097.method6771() || !this.method12185(class7097, class7099)) {
                                        class7097.setBlockState(class7099, (BlockState)((StateHolder<Object, Object>)this.method12184(class7097, class7099)).with((IProperty<Comparable>)Class4011.field18071, Math.min(15, intValue + random.nextInt(5) / 4)), 3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public boolean method12185(final World class1847, final BlockPos class1848) {
        if (!class1847.method6772(class1848)) {
            if (!class1847.method6772(class1848.method1145())) {
                if (!class1847.method6772(class1848.method1147())) {
                    if (!class1847.method6772(class1848.method1141())) {
                        if (!class1847.method6772(class1848.method1143())) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    
    private int method12186(final BlockState class7096) {
        return (class7096.method21771((IProperty<Comparable>)Class8970.field37747) && class7096.get((IProperty<Boolean>)Class8970.field37747)) ? 0 : this.field18079.getInt((Object)class7096.getBlock());
    }
    
    private int method12187(final BlockState class7096) {
        return (class7096.method21771((IProperty<Comparable>)Class8970.field37747) && class7096.get((IProperty<Boolean>)Class8970.field37747)) ? 0 : this.field18078.getInt((Object)class7096.getBlock());
    }
    
    private void method12188(final World class1847, final BlockPos class1848, final int bound, final Random random, final int n) {
        if (random.nextInt(bound) < this.method12186(class1847.getBlockState(class1848))) {
            final BlockState method6701 = class1847.getBlockState(class1848);
            if (random.nextInt(n + 10) < 5 && !class1847.method6772(class1848)) {
                class1847.setBlockState(class1848, ((StateHolder<O, BlockState>)this.method12184(class1847, class1848)).with((IProperty<Comparable>)Class4011.field18071, Math.min(n + random.nextInt(5) / 4, 15)), 3);
            }
            else {
                class1847.method6690(class1848, false);
            }
            final Block method6702 = method6701.getBlock();
            if (method6702 instanceof Class3976) {
                final Class3976 class1849 = (Class3976)method6702;
                Class3976.method12118(class1847, class1848);
            }
        }
    }
    
    private boolean method12189(final IBlockReader class1855, final BlockPos class1856) {
        final Direction[] values = Direction.values();
        for (int length = values.length, i = 0; i < length; ++i) {
            if (this.method12191(class1855.getBlockState(class1856.method1149(values[i])))) {
                return true;
            }
        }
        return false;
    }
    
    private int method12190(final Class1852 class1852, final BlockPos class1853) {
        if (class1852.method6961(class1853)) {
            int max = 0;
            final Direction[] values = Direction.values();
            for (int length = values.length, i = 0; i < length; ++i) {
                max = Math.max(this.method12187(class1852.getBlockState(class1853.method1149(values[i]))), max);
            }
            return max;
        }
        return 0;
    }
    
    public boolean method12191(final BlockState class7096) {
        return this.method12187(class7096) > 0;
    }
    
    @Override
    public void method11828(final BlockState class7096, final World class7097, final BlockPos class7098, final BlockState class7099, final boolean b) {
        if (class7099.getBlock() != class7096.getBlock()) {
            if ((class7097.dimension.getType() != DimensionType.field2223 && class7097.dimension.getType() != DimensionType.field2224) || !((Class3998)Class7521.field29341).method12147(class7097, class7098)) {
                if (class7096.method21752(class7097, class7098)) {
                    class7097.method6833().method21345(class7098, this, this.method11826(class7097) + class7097.rand.nextInt(10));
                }
                else {
                    class7097.method6690(class7098, false);
                }
            }
        }
    }
    
    @Override
    public void method11823(final BlockState class7096, final World class7097, final BlockPos class7098, final Random random) {
        if (random.nextInt(24) == 0) {
            class7097.method6708(class7098.getX() + 0.5f, class7098.getY() + 0.5f, class7098.getZ() + 0.5f, Class8520.field35198, Class286.field1582, 1.0f + random.nextFloat(), random.nextFloat() * 0.7f + 0.3f, false);
        }
        final BlockPos method1139 = class7098.method1139();
        final BlockState method1140 = class7097.getBlockState(method1139);
        if (!this.method12191(method1140) && !method1140.isSolidSide(class7097, method1139, Direction.UP)) {
            if (this.method12191(class7097.getBlockState(class7098.method1145()))) {
                for (int i = 0; i < 2; ++i) {
                    class7097.method6709(Class8432.field34632, class7098.getX() + random.nextDouble() * 0.10000000149011612, class7098.getY() + random.nextDouble(), class7098.getZ() + random.nextDouble(), 0.0, 0.0, 0.0);
                }
            }
            if (this.method12191(class7097.getBlockState(class7098.method1147()))) {
                for (int j = 0; j < 2; ++j) {
                    class7097.method6709(Class8432.field34632, class7098.getX() + 1 - random.nextDouble() * 0.10000000149011612, class7098.getY() + random.nextDouble(), class7098.getZ() + random.nextDouble(), 0.0, 0.0, 0.0);
                }
            }
            if (this.method12191(class7097.getBlockState(class7098.method1141()))) {
                for (int k = 0; k < 2; ++k) {
                    class7097.method6709(Class8432.field34632, class7098.getX() + random.nextDouble(), class7098.getY() + random.nextDouble(), class7098.getZ() + random.nextDouble() * 0.10000000149011612, 0.0, 0.0, 0.0);
                }
            }
            if (this.method12191(class7097.getBlockState(class7098.method1143()))) {
                for (int l = 0; l < 2; ++l) {
                    class7097.method6709(Class8432.field34632, class7098.getX() + random.nextDouble(), class7098.getY() + random.nextDouble(), class7098.getZ() + 1 - random.nextDouble() * 0.10000000149011612, 0.0, 0.0, 0.0);
                }
            }
            if (this.method12191(class7097.getBlockState(class7098.method1137()))) {
                for (int n = 0; n < 2; ++n) {
                    class7097.method6709(Class8432.field34632, class7098.getX() + random.nextDouble(), class7098.getY() + 1 - random.nextDouble() * 0.10000000149011612, class7098.getZ() + random.nextDouble(), 0.0, 0.0, 0.0);
                }
            }
        }
        else {
            for (int n2 = 0; n2 < 3; ++n2) {
                class7097.method6709(Class8432.field34632, class7098.getX() + random.nextDouble(), class7098.getY() + random.nextDouble() * 0.5 + 0.5, class7098.getZ() + random.nextDouble(), 0.0, 0.0, 0.0);
            }
        }
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class4011.field18071, Class4011.field18072, Class4011.field18073, Class4011.field18074, Class4011.field18075, Class4011.field18076);
    }
    
    public void method12192(final Block class3833, final int n, final int n2) {
        this.field18078.put((Object)class3833, n);
        this.field18079.put((Object)class3833, n2);
    }
    
    public static void method12193() {
        final Class4011 class4011 = (Class4011)Class7521.field29289;
        class4011.method12192(Class7521.field29160, 5, 20);
        class4011.method12192(Class7521.field29161, 5, 20);
        class4011.method12192(Class7521.field29162, 5, 20);
        class4011.method12192(Class7521.field29163, 5, 20);
        class4011.method12192(Class7521.field29164, 5, 20);
        class4011.method12192(Class7521.field29165, 5, 20);
        class4011.method12192(Class7521.field29591, 5, 20);
        class4011.method12192(Class7521.field29592, 5, 20);
        class4011.method12192(Class7521.field29593, 5, 20);
        class4011.method12192(Class7521.field29594, 5, 20);
        class4011.method12192(Class7521.field29595, 5, 20);
        class4011.method12192(Class7521.field29596, 5, 20);
        class4011.method12192(Class7521.field29389, 5, 20);
        class4011.method12192(Class7521.field29614, 5, 20);
        class4011.method12192(Class7521.field29615, 5, 20);
        class4011.method12192(Class7521.field29616, 5, 20);
        class4011.method12192(Class7521.field29618, 5, 20);
        class4011.method12192(Class7521.field29617, 5, 20);
        class4011.method12192(Class7521.field29336, 5, 20);
        class4011.method12192(Class7521.field29619, 5, 20);
        class4011.method12192(Class7521.field29620, 5, 20);
        class4011.method12192(Class7521.field29621, 5, 20);
        class4011.method12192(Class7521.field29623, 5, 20);
        class4011.method12192(Class7521.field29622, 5, 20);
        class4011.method12192(Class7521.field29291, 5, 20);
        class4011.method12192(Class7521.field29414, 5, 20);
        class4011.method12192(Class7521.field29413, 5, 20);
        class4011.method12192(Class7521.field29415, 5, 20);
        class4011.method12192(Class7521.field29514, 5, 20);
        class4011.method12192(Class7521.field29515, 5, 20);
        class4011.method12192(Class7521.field29181, 5, 5);
        class4011.method12192(Class7521.field29182, 5, 5);
        class4011.method12192(Class7521.field29183, 5, 5);
        class4011.method12192(Class7521.field29184, 5, 5);
        class4011.method12192(Class7521.field29185, 5, 5);
        class4011.method12192(Class7521.field29186, 5, 5);
        class4011.method12192(Class7521.field29192, 5, 5);
        class4011.method12192(Class7521.field29187, 5, 5);
        class4011.method12192(Class7521.field29188, 5, 5);
        class4011.method12192(Class7521.field29189, 5, 5);
        class4011.method12192(Class7521.field29190, 5, 5);
        class4011.method12192(Class7521.field29191, 5, 5);
        class4011.method12192(Class7521.field29199, 5, 5);
        class4011.method12192(Class7521.field29200, 5, 5);
        class4011.method12192(Class7521.field29201, 5, 5);
        class4011.method12192(Class7521.field29202, 5, 5);
        class4011.method12192(Class7521.field29203, 5, 5);
        class4011.method12192(Class7521.field29204, 5, 5);
        class4011.method12192(Class7521.field29193, 5, 5);
        class4011.method12192(Class7521.field29194, 5, 5);
        class4011.method12192(Class7521.field29195, 5, 5);
        class4011.method12192(Class7521.field29196, 5, 5);
        class4011.method12192(Class7521.field29197, 5, 5);
        class4011.method12192(Class7521.field29198, 5, 5);
        class4011.method12192(Class7521.field29205, 30, 60);
        class4011.method12192(Class7521.field29206, 30, 60);
        class4011.method12192(Class7521.field29207, 30, 60);
        class4011.method12192(Class7521.field29208, 30, 60);
        class4011.method12192(Class7521.field29209, 30, 60);
        class4011.method12192(Class7521.field29210, 30, 60);
        class4011.method12192(Class7521.field29284, 30, 20);
        class4011.method12192(Class7521.field29283, 15, 100);
        class4011.method12192(Class7521.field29241, 60, 100);
        class4011.method12192(Class7521.field29242, 60, 100);
        class4011.method12192(Class7521.field29243, 60, 100);
        class4011.method12192(Class7521.field29549, 60, 100);
        class4011.method12192(Class7521.field29550, 60, 100);
        class4011.method12192(Class7521.field29551, 60, 100);
        class4011.method12192(Class7521.field29552, 60, 100);
        class4011.method12192(Class7521.field29553, 60, 100);
        class4011.method12192(Class7521.field29554, 60, 100);
        class4011.method12192(Class7521.field29265, 60, 100);
        class4011.method12192(Class7521.field29266, 60, 100);
        class4011.method12192(Class7521.field29267, 60, 100);
        class4011.method12192(Class7521.field29268, 60, 100);
        class4011.method12192(Class7521.field29269, 60, 100);
        class4011.method12192(Class7521.field29270, 60, 100);
        class4011.method12192(Class7521.field29271, 60, 100);
        class4011.method12192(Class7521.field29272, 60, 100);
        class4011.method12192(Class7521.field29273, 60, 100);
        class4011.method12192(Class7521.field29274, 60, 100);
        class4011.method12192(Class7521.field29275, 60, 100);
        class4011.method12192(Class7521.field29277, 60, 100);
        class4011.method12192(Class7521.field29276, 60, 100);
        class4011.method12192(Class7521.field29248, 30, 60);
        class4011.method12192(Class7521.field29249, 30, 60);
        class4011.method12192(Class7521.field29250, 30, 60);
        class4011.method12192(Class7521.field29251, 30, 60);
        class4011.method12192(Class7521.field29252, 30, 60);
        class4011.method12192(Class7521.field29253, 30, 60);
        class4011.method12192(Class7521.field29254, 30, 60);
        class4011.method12192(Class7521.field29255, 30, 60);
        class4011.method12192(Class7521.field29256, 30, 60);
        class4011.method12192(Class7521.field29257, 30, 60);
        class4011.method12192(Class7521.field29258, 30, 60);
        class4011.method12192(Class7521.field29259, 30, 60);
        class4011.method12192(Class7521.field29260, 30, 60);
        class4011.method12192(Class7521.field29261, 30, 60);
        class4011.method12192(Class7521.field29262, 30, 60);
        class4011.method12192(Class7521.field29263, 30, 60);
        class4011.method12192(Class7521.field29388, 15, 100);
        class4011.method12192(Class7521.field29547, 5, 5);
        class4011.method12192(Class7521.field29529, 60, 20);
        class4011.method12192(Class7521.field29530, 60, 20);
        class4011.method12192(Class7521.field29531, 60, 20);
        class4011.method12192(Class7521.field29532, 60, 20);
        class4011.method12192(Class7521.field29533, 60, 20);
        class4011.method12192(Class7521.field29534, 60, 20);
        class4011.method12192(Class7521.field29535, 60, 20);
        class4011.method12192(Class7521.field29536, 60, 20);
        class4011.method12192(Class7521.field29537, 60, 20);
        class4011.method12192(Class7521.field29538, 60, 20);
        class4011.method12192(Class7521.field29539, 60, 20);
        class4011.method12192(Class7521.field29540, 60, 20);
        class4011.method12192(Class7521.field29541, 60, 20);
        class4011.method12192(Class7521.field29542, 60, 20);
        class4011.method12192(Class7521.field29543, 60, 20);
        class4011.method12192(Class7521.field29544, 60, 20);
        class4011.method12192(Class7521.field29545, 60, 20);
        class4011.method12192(Class7521.field29715, 30, 60);
        class4011.method12192(Class7521.field29761, 60, 60);
        class4011.method12192(Class7521.field29805, 60, 60);
        class4011.method12192(Class7521.field29813, 30, 20);
        class4011.method12192(Class7521.field29822, 5, 20);
        class4011.method12192(Class7521.field29819, 60, 100);
        class4011.method12192(Class7521.field29824, 5, 20);
        class4011.method12192(Class7521.field29823, 30, 20);
    }
    
    static {
        field18071 = Class8970.field37774;
        field18072 = Class3967.field17921;
        field18073 = Class3967.field17922;
        field18074 = Class3967.field17923;
        field18075 = Class3967.field17924;
        field18076 = Class3967.field17925;
        field18077 = Class3967.field17927.entrySet().stream().filter(entry -> entry.getKey() != Direction.DOWN).collect((Collector<? super Object, ?, Map<Direction, Class7113>>)Class8349.method27834());
    }
}
