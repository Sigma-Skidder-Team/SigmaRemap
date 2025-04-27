// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Random;
import java.util.BitSet;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.chunk.IChunk;

import java.util.function.Function;
import java.util.Set;

public abstract class Class7304<C extends Class5118>
{
    public static final Class7304<Class5117> field28276;
    public static final Class7304<Class5117> field28277;
    public static final Class7304<Class5117> field28278;
    public static final Class7304<Class5117> field28279;
    public static final Class7304<Class5117> field28280;
    public static final BlockState field28281;
    public static final BlockState field28282;
    public static final IFluidState field28283;
    public static final IFluidState field28284;
    public Set<Block> field28285;
    public Set<Fluid> field28286;
    private final Function<Dynamic<?>, ? extends C> field28287;
    public final int field28288;
    
    private static <C extends Class5118, F extends Class7304<C>> F method22404(final String s, final F n) {
        return Registry.register(Registry.field213, s, n);
    }
    
    public Class7304(final Function<Dynamic<?>, ? extends C> field28287, final int field28288) {
        this.field28285 = (Set<Block>)ImmutableSet.of(Blocks.STONE, Blocks.GRANITE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.DIRT, Blocks.COARSE_DIRT, (Object[])new Block[] { Blocks.PODZOL, Blocks.GRASS_BLOCK, Blocks.field29546, Blocks.field29482, Blocks.field29483, Blocks.field29484, Blocks.field29485, Blocks.field29486, Blocks.field29487, Blocks.field29488, Blocks.field29489, Blocks.field29490, Blocks.field29491, Blocks.field29492, Blocks.field29493, Blocks.field29494, Blocks.field29495, Blocks.field29496, Blocks.field29497, Blocks.field29217, Blocks.field29587, Blocks.field29392, Blocks.field29329, Blocks.field29548 });
        this.field28286 = (Set<Fluid>)ImmutableSet.of((Object)Class7558.field29976);
        this.field28287 = field28287;
        this.field28288 = field28288;
    }
    
    public int method22405() {
        return 4;
    }
    
    public boolean method22406(final IChunk class1860, final Function<BlockPos, Biome> function, final long n, final int n2, final int n3, final int n4, final double n5, final double n6, final double n7, final double n8, final double n9, final BitSet set) {
        final Random random = new Random(n + n3 + n4);
        final double n10 = n3 * 16 + 8;
        final double n11 = n4 * 16 + 8;
        if (n5 >= n10 - 16.0 - n8 * 2.0) {
            if (n7 >= n11 - 16.0 - n8 * 2.0) {
                if (n5 <= n10 + 16.0 + n8 * 2.0) {
                    if (n7 <= n11 + 16.0 + n8 * 2.0) {
                        final int max = Math.max(MathHelper.floor(n5 - n8) - n3 * 16 - 1, 0);
                        final int min = Math.min(MathHelper.floor(n5 + n8) - n3 * 16 + 1, 16);
                        final int max2 = Math.max(MathHelper.floor(n6 - n9) - 1, 1);
                        final int min2 = Math.min(MathHelper.floor(n6 + n9) + 1, this.field28288 - 8);
                        final int max3 = Math.max(MathHelper.floor(n7 - n8) - n4 * 16 - 1, 0);
                        final int min3 = Math.min(MathHelper.floor(n7 + n8) - n4 * 16 + 1, 16);
                        if (!this.method22409(class1860, n3, n4, max, min, max2, min2, max3, min3)) {
                            boolean b = false;
                            final Mutable class1861 = new Mutable();
                            final Mutable class1862 = new Mutable();
                            final Mutable class1863 = new Mutable();
                            for (int i = max; i < min; ++i) {
                                final int n12 = i + n3 * 16;
                                final double n13 = (n12 + 0.5 - n5) / n8;
                                for (int j = max3; j < min3; ++j) {
                                    final int n14 = j + n4 * 16;
                                    final double n15 = (n14 + 0.5 - n7) / n8;
                                    if (n13 * n13 + n15 * n15 < 1.0) {
                                        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                                        for (int k = min2; k > max2; --k) {
                                            if (!this.method22401(n13, (k - 0.5 - n6) / n9, n15, k)) {
                                                b |= this.method22396(class1860, function, set, random, class1861, class1862, class1863, n2, n3, n4, n12, n14, i, k, j, atomicBoolean);
                                            }
                                        }
                                    }
                                }
                            }
                            return b;
                        }
                        return false;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean method22396(final IChunk class1860, final Function<BlockPos, Biome> function, final BitSet set, final Random random, final Mutable class1861, final Mutable class1862, final Mutable class1863, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final AtomicBoolean atomicBoolean) {
        final int n9 = n6 | n8 << 4 | n7 << 8;
        if (set.get(n9)) {
            return false;
        }
        set.set(n9);
        class1861.setPos(n4, n7, n5);
        final BlockState method6701 = class1860.getBlockState(class1861);
        final BlockState method6702 = class1860.getBlockState(class1862.method1287(class1861).method1290(Direction.UP));
        if (method6701.getBlock() == Blocks.GRASS_BLOCK || method6701.getBlock() == Blocks.field29392) {
            atomicBoolean.set(true);
        }
        if (this.method22408(method6701, method6702)) {
            if (n7 >= 11) {
                class1860.method7008(class1861, Class7304.field28282, false);
                if (atomicBoolean.get()) {
                    class1863.method1287(class1861).method1290(Direction.DOWN);
                    if (class1860.getBlockState(class1863).getBlock() == Blocks.DIRT) {
                        class1860.method7008(class1863, function.apply(class1861).method9872().method13338(), false);
                    }
                }
            }
            else {
                class1860.method7008(class1861, Class7304.field28284.getBlockState(), false);
            }
            return true;
        }
        return false;
    }
    
    public abstract boolean method22403(final IChunk p0, final Function<BlockPos, Biome> p1, final Random p2, final int p3, final int p4, final int p5, final int p6, final int p7, final BitSet p8, final C p9);
    
    public abstract boolean method22402(final Random p0, final int p1, final int p2, final C p3);
    
    public boolean method22407(final BlockState class7096) {
        return this.field28285.contains(class7096.getBlock());
    }
    
    public boolean method22408(final BlockState class7096, final BlockState class7097) {
        final Block method21696 = class7096.getBlock();
        if (!this.method22407(class7096)) {
            if (method21696 == Blocks.field29175 || method21696 == Blocks.field29177) {
                return !class7097.getFluidState().isTagged(Class7324.field28319);
            }
            return false;
        }
        return true;
    }
    
    public boolean method22409(final IChunk class1860, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        final Mutable class1861 = new Mutable();
        for (int i = n3; i < n4; ++i) {
            for (int j = n7; j < n8; ++j) {
                for (int k = n5 - 1; k <= n6 + 1; ++k) {
                    if (this.field28286.contains(class1860.getFluidState(class1861.setPos(i + n * 16, k, j + n2 * 16)).getFluid())) {
                        return true;
                    }
                    if (k != n6 + 1) {
                        if (!this.method22410(n3, n4, n7, n8, i, j)) {
                            k = n6;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    private boolean method22410(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        if (n5 != n) {
            if (n5 != n2 - 1) {
                if (n6 != n3) {
                    return n6 == n4 - 1;
                }
            }
        }
        return true;
    }
    
    public boolean method22411(final int n, final int n2, final double n3, final double n4, final int n5, final int n6, final float n7) {
        final double n8 = n * 16 + 8;
        final double n9 = n2 * 16 + 8;
        final double n10 = n3 - n8;
        final double n11 = n4 - n9;
        final double n12 = n6 - n5;
        final double n13 = n7 + 2.0f + 16.0f;
        return n10 * n10 + n11 * n11 - n12 * n12 <= n13 * n13;
    }
    
    public abstract boolean method22401(final double p0, final double p1, final double p2, final int p3);
    
    static {
        field28276 = method22404("cave", new Class7303(Class5117::method16023, 256));
        field28277 = method22404("hell_cave", new Class7302(Class5117::method16023));
        field28278 = method22404("canyon", new Class7305(Class5117::method16023));
        field28279 = method22404("underwater_canyon", new Class7306(Class5117::method16023));
        field28280 = method22404("underwater_cave", new Class7307(Class5117::method16023));
        field28281 = Blocks.AIR.getDefaultState();
        field28282 = Blocks.CAVE_AIR.getDefaultState();
        field28283 = Class7558.field29976.getDefaultState();
        field28284 = Class7558.field29978.getDefaultState();
    }
}
