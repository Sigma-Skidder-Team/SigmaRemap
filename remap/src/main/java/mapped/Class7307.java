// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Random;
import java.util.BitSet;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.world.chunk.IChunk;

import java.util.function.Function;

public class Class7307 extends Class7303
{
    public Class7307(final Function<Dynamic<?>, ? extends Class5117> function) {
        super(function, 256);
        this.field28285 = (Set<Block>)ImmutableSet.of((Object) Blocks.STONE, (Object) Blocks.GRANITE, (Object) Blocks.DIORITE, (Object) Blocks.ANDESITE, (Object) Blocks.DIRT, (Object) Blocks.COARSE_DIRT, (Object[])new Block[] { Blocks.PODZOL, Blocks.GRASS_BLOCK, Blocks.field29546, Blocks.field29482, Blocks.field29483, Blocks.field29484, Blocks.field29485, Blocks.field29486, Blocks.field29487, Blocks.field29488, Blocks.field29489, Blocks.field29490, Blocks.field29491, Blocks.field29492, Blocks.field29493, Blocks.field29494, Blocks.field29495, Blocks.field29496, Blocks.field29497, Blocks.field29217, Blocks.field29587, Blocks.field29392, Blocks.field29329, Blocks.field29175, Blocks.field29177, Blocks.field29173, Blocks.field29174, Blocks.OBSIDIAN, Blocks.AIR, Blocks.CAVE_AIR, Blocks.field29548 });
    }
    
    @Override
    public boolean method22409(final IChunk class1860, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        return false;
    }
    
    @Override
    public boolean method22396(final IChunk class1860, final Function<BlockPos, Class3090> function, final BitSet set, final Random random, final Mutable class1861, final Mutable class1862, final Mutable class1863, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final AtomicBoolean atomicBoolean) {
        return method22413(this, class1860, set, random, class1861, n, n2, n3, n4, n5, n6, n7, n8);
    }
    
    public static boolean method22413(final Class7304<?> class7304, final IChunk class7305, final BitSet set, final Random random, final Mutable class7306, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        if (n7 >= n) {
            return false;
        }
        final int n9 = n6 | n8 << 4 | n7 << 8;
        if (set.get(n9)) {
            return false;
        }
        set.set(n9);
        class7306.setPos(n4, n7, n5);
        if (!class7304.method22407(class7305.getBlockState(class7306))) {
            return false;
        }
        if (n7 == 10) {
            if (random.nextFloat() >= 0.25) {
                class7305.method7008(class7306, Blocks.OBSIDIAN.getDefaultState(), false);
            }
            else {
                class7305.method7008(class7306, Blocks.MAGMA_BLOCK.getDefaultState(), false);
                class7305.method7036().method21345(class7306, Blocks.MAGMA_BLOCK, 0);
            }
            return true;
        }
        if (n7 < 10) {
            class7305.method7008(class7306, Blocks.field29174.getDefaultState(), false);
            return false;
        }
        int n10 = 0;
        for (final Direction class7307 : Plane.HORIZONTAL) {
            final int n11 = n4 + class7307.getXOffset();
            final int n12 = n5 + class7307.getZOffset();
            if (n11 >> 4 == n2) {
                if (n12 >> 4 == n3) {
                    if (!class7305.getBlockState(class7306.setPos(n11, n7, n12)).method21706()) {
                        continue;
                    }
                }
            }
            class7305.method7008(class7306, Class7307.field28283.getBlockState(), false);
            class7305.method7037().method21345(class7306, Class7307.field28283.getFluid(), 0);
            n10 = 1;
            break;
        }
        class7306.setPos(n4, n7, n5);
        if (n10 != 0) {
            return true;
        }
        class7305.method7008(class7306, Class7307.field28283.getBlockState(), false);
        return true;
    }
}
