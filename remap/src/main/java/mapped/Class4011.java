// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collector;
import java.util.Random;
import javax.annotation.Nullable;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
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
    
    public Class4011(final Properties class9288) {
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
        return this.method11843(class7096, class7099, class7100) ? this.method12184(class7099, class7100).with((IProperty<Comparable>)Class4011.field18071, (Comparable)class7096.get((IProperty<V>)Class4011.field18071)) : Blocks.AIR.getDefaultState();
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
    public int tickRate(final Class1852 class1852) {
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
                if (!(class7097.dimension instanceof Class6738) || method21696 != Blocks.field29172) {
                    if (method21696 != Blocks.field29338) {
                        if (method21696 != Blocks.MAGMA_BLOCK) {
                            b = false;
                            break Label_0104;
                        }
                    }
                }
                b = true;
            }
            final boolean b2 = b;
            final int intValue = class7096.get(Class4011.field18071);
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
                class7097.method6907().method21345(class7098, this, this.tickRate(class7097) + random.nextInt(10));
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
                        return class1847.method6772(class1848.method1143());
                    }
                }
            }
        }
        return true;
    }
    
    private int method12186(final BlockState class7096) {
        return (class7096.method21771((IProperty<Comparable>)Class8970.field37747) && class7096.get(Class8970.field37747)) ? 0 : this.field18079.getInt(class7096.getBlock());
    }
    
    private int method12187(final BlockState class7096) {
        return (class7096.method21771((IProperty<Comparable>)Class8970.field37747) && class7096.get(Class8970.field37747)) ? 0 : this.field18078.getInt(class7096.getBlock());
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
    public void onBlockAdded(final BlockState class7096, final World class7097, final BlockPos class7098, final BlockState class7099, final boolean b) {
        if (class7099.getBlock() != class7096.getBlock()) {
            if ((class7097.dimension.getType() != DimensionType.field2223 && class7097.dimension.getType() != DimensionType.field2224) || !((Class3998) Blocks.field29341).method12147(class7097, class7098)) {
                if (class7096.method21752(class7097, class7098)) {
                    class7097.method6833().method21345(class7098, this, this.tickRate(class7097) + class7097.rand.nextInt(10));
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
        final Class4011 class4011 = (Class4011) Blocks.FIRE;
        class4011.method12192(Blocks.OAK_PLANKS, 5, 20);
        class4011.method12192(Blocks.SPRUCE_PLANKS, 5, 20);
        class4011.method12192(Blocks.BIRCH_PLANKS, 5, 20);
        class4011.method12192(Blocks.JUNGLE_PLANKS, 5, 20);
        class4011.method12192(Blocks.ACACIA_PLANKS, 5, 20);
        class4011.method12192(Blocks.DARK_OAK_PLANKS, 5, 20);
        class4011.method12192(Blocks.field29591, 5, 20);
        class4011.method12192(Blocks.field29592, 5, 20);
        class4011.method12192(Blocks.field29593, 5, 20);
        class4011.method12192(Blocks.field29594, 5, 20);
        class4011.method12192(Blocks.field29595, 5, 20);
        class4011.method12192(Blocks.field29596, 5, 20);
        class4011.method12192(Blocks.field29389, 5, 20);
        class4011.method12192(Blocks.SPRUCE_FENCE_GATE, 5, 20);
        class4011.method12192(Blocks.BIRCH_FENCE_GATE, 5, 20);
        class4011.method12192(Blocks.JUNGLE_FENCE_GATE, 5, 20);
        class4011.method12192(Blocks.DARK_OAK_FENCE_GATE, 5, 20);
        class4011.method12192(Blocks.ACACIA_FENCE_GATE, 5, 20);
        class4011.method12192(Blocks.field29336, 5, 20);
        class4011.method12192(Blocks.SPRUCE_FENCE, 5, 20);
        class4011.method12192(Blocks.BIRCH_FENCE, 5, 20);
        class4011.method12192(Blocks.JUNGLE_FENCE, 5, 20);
        class4011.method12192(Blocks.DARK_OAK_FENCE, 5, 20);
        class4011.method12192(Blocks.ACACIA_FENCE, 5, 20);
        class4011.method12192(Blocks.OAK_STAIRS, 5, 20);
        class4011.method12192(Blocks.field29414, 5, 20);
        class4011.method12192(Blocks.field29413, 5, 20);
        class4011.method12192(Blocks.field29415, 5, 20);
        class4011.method12192(Blocks.field29514, 5, 20);
        class4011.method12192(Blocks.field29515, 5, 20);
        class4011.method12192(Blocks.field29181, 5, 5);
        class4011.method12192(Blocks.field29182, 5, 5);
        class4011.method12192(Blocks.field29183, 5, 5);
        class4011.method12192(Blocks.field29184, 5, 5);
        class4011.method12192(Blocks.field29185, 5, 5);
        class4011.method12192(Blocks.field29186, 5, 5);
        class4011.method12192(Blocks.field29192, 5, 5);
        class4011.method12192(Blocks.field29187, 5, 5);
        class4011.method12192(Blocks.field29188, 5, 5);
        class4011.method12192(Blocks.field29189, 5, 5);
        class4011.method12192(Blocks.field29190, 5, 5);
        class4011.method12192(Blocks.field29191, 5, 5);
        class4011.method12192(Blocks.field29199, 5, 5);
        class4011.method12192(Blocks.field29200, 5, 5);
        class4011.method12192(Blocks.field29201, 5, 5);
        class4011.method12192(Blocks.field29202, 5, 5);
        class4011.method12192(Blocks.field29203, 5, 5);
        class4011.method12192(Blocks.field29204, 5, 5);
        class4011.method12192(Blocks.field29193, 5, 5);
        class4011.method12192(Blocks.field29194, 5, 5);
        class4011.method12192(Blocks.field29195, 5, 5);
        class4011.method12192(Blocks.field29196, 5, 5);
        class4011.method12192(Blocks.field29197, 5, 5);
        class4011.method12192(Blocks.field29198, 5, 5);
        class4011.method12192(Blocks.field29205, 30, 60);
        class4011.method12192(Blocks.field29206, 30, 60);
        class4011.method12192(Blocks.field29207, 30, 60);
        class4011.method12192(Blocks.field29208, 30, 60);
        class4011.method12192(Blocks.field29209, 30, 60);
        class4011.method12192(Blocks.field29210, 30, 60);
        class4011.method12192(Blocks.BOOKSHELF, 30, 20);
        class4011.method12192(Blocks.TNT, 15, 100);
        class4011.method12192(Blocks.field29241, 60, 100);
        class4011.method12192(Blocks.field29242, 60, 100);
        class4011.method12192(Blocks.field29243, 60, 100);
        class4011.method12192(Blocks.field29549, 60, 100);
        class4011.method12192(Blocks.field29550, 60, 100);
        class4011.method12192(Blocks.field29551, 60, 100);
        class4011.method12192(Blocks.field29552, 60, 100);
        class4011.method12192(Blocks.field29553, 60, 100);
        class4011.method12192(Blocks.field29554, 60, 100);
        class4011.method12192(Blocks.DANDELION, 60, 100);
        class4011.method12192(Blocks.POPPY, 60, 100);
        class4011.method12192(Blocks.BLUE_ORCHID, 60, 100);
        class4011.method12192(Blocks.ALLIUM, 60, 100);
        class4011.method12192(Blocks.AZURE_BLUET, 60, 100);
        class4011.method12192(Blocks.RED_TULIP, 60, 100);
        class4011.method12192(Blocks.ORANGE_TULIP, 60, 100);
        class4011.method12192(Blocks.WHITE_TULIP, 60, 100);
        class4011.method12192(Blocks.PINK_TULIP, 60, 100);
        class4011.method12192(Blocks.OXEYE_DAISY, 60, 100);
        class4011.method12192(Blocks.CORNFLOWER, 60, 100);
        class4011.method12192(Blocks.LILY_OF_THE_VALLEY, 60, 100);
        class4011.method12192(Blocks.WITHER_ROSE, 60, 100);
        class4011.method12192(Blocks.field29248, 30, 60);
        class4011.method12192(Blocks.field29249, 30, 60);
        class4011.method12192(Blocks.field29250, 30, 60);
        class4011.method12192(Blocks.field29251, 30, 60);
        class4011.method12192(Blocks.field29252, 30, 60);
        class4011.method12192(Blocks.field29253, 30, 60);
        class4011.method12192(Blocks.field29254, 30, 60);
        class4011.method12192(Blocks.GRAY_WOOL, 30, 60);
        class4011.method12192(Blocks.LIGHT_GRAY_WOOL, 30, 60);
        class4011.method12192(Blocks.CYAN_WOOL, 30, 60);
        class4011.method12192(Blocks.PURPLE_WOOL, 30, 60);
        class4011.method12192(Blocks.BLUE_WOOL, 30, 60);
        class4011.method12192(Blocks.BROWN_WOOL, 30, 60);
        class4011.method12192(Blocks.GREEN_WOOL, 30, 60);
        class4011.method12192(Blocks.RED_WOOL, 30, 60);
        class4011.method12192(Blocks.BLACK_WOOL, 30, 60);
        class4011.method12192(Blocks.field29388, 15, 100);
        class4011.method12192(Blocks.field29547, 5, 5);
        class4011.method12192(Blocks.field29529, 60, 20);
        class4011.method12192(Blocks.field29530, 60, 20);
        class4011.method12192(Blocks.field29531, 60, 20);
        class4011.method12192(Blocks.field29532, 60, 20);
        class4011.method12192(Blocks.field29533, 60, 20);
        class4011.method12192(Blocks.field29534, 60, 20);
        class4011.method12192(Blocks.field29535, 60, 20);
        class4011.method12192(Blocks.field29536, 60, 20);
        class4011.method12192(Blocks.field29537, 60, 20);
        class4011.method12192(Blocks.field29538, 60, 20);
        class4011.method12192(Blocks.field29539, 60, 20);
        class4011.method12192(Blocks.field29540, 60, 20);
        class4011.method12192(Blocks.field29541, 60, 20);
        class4011.method12192(Blocks.field29542, 60, 20);
        class4011.method12192(Blocks.field29543, 60, 20);
        class4011.method12192(Blocks.field29544, 60, 20);
        class4011.method12192(Blocks.field29545, 60, 20);
        class4011.method12192(Blocks.DRIED_KELP_BLOCK, 30, 60);
        class4011.method12192(Blocks.BAMBOO, 60, 60);
        class4011.method12192(Blocks.SCAFFOLDING, 60, 60);
        class4011.method12192(Blocks.LECTERN, 30, 20);
        class4011.method12192(Blocks.COMPOSTER, 5, 20);
        class4011.method12192(Blocks.SWEET_BERRY_BUSH, 60, 100);
        class4011.method12192(Blocks.BEEHIVE, 5, 20);
        class4011.method12192(Blocks.BEE_NEST, 30, 20);
    }
    
    static {
        field18071 = Class8970.field37774;
        field18072 = Class3967.field17921;
        field18073 = Class3967.field17922;
        field18074 = Class3967.field17923;
        field18075 = Class3967.field17924;
        field18076 = Class3967.field17925;
        field18077 = Class3967.field17927.entrySet().stream().filter(entry -> entry.getKey() != Direction.DOWN).collect((Collector<? super Object, ?, Map<Direction, Class7113>>) Util.method27834());
    }
}
