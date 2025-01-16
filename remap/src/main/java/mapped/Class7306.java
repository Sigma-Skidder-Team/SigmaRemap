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
import net.minecraft.world.chunk.IChunk;

import java.util.function.Function;

public class Class7306 extends Class7305
{
    public Class7306(final Function<Dynamic<?>, ? extends Class5117> function) {
        super(function);
        this.field28285 = (Set<Block>)ImmutableSet.of((Object) Blocks.STONE, (Object) Blocks.GRANITE, (Object) Blocks.DIORITE, (Object) Blocks.ANDESITE, (Object) Blocks.DIRT, (Object) Blocks.COARSE_DIRT, (Object[])new Block[] { Blocks.PODZOL, Blocks.GRASS_BLOCK, Blocks.field29546, Blocks.field29482, Blocks.field29483, Blocks.field29484, Blocks.field29485, Blocks.field29486, Blocks.field29487, Blocks.field29488, Blocks.field29489, Blocks.field29490, Blocks.field29491, Blocks.field29492, Blocks.field29493, Blocks.field29494, Blocks.field29495, Blocks.field29496, Blocks.field29497, Blocks.field29217, Blocks.field29587, Blocks.field29392, Blocks.field29329, Blocks.field29175, Blocks.field29177, Blocks.field29173, Blocks.field29174, Blocks.OBSIDIAN, Blocks.AIR, Blocks.CAVE_AIR});
    }
    
    @Override
    public boolean method22409(final IChunk class1860, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        return false;
    }
    
    @Override
    public boolean method22396(final IChunk class1860, final Function<BlockPos, Class3090> function, final BitSet set, final Random random, final Mutable class1861, final Mutable class1862, final Mutable class1863, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final AtomicBoolean atomicBoolean) {
        return Class7307.method22413(this, class1860, set, random, class1861, n, n2, n3, n4, n5, n6, n7, n8);
    }
}
