// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.BitSet;
import java.util.Random;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.chunk.IChunk;

import java.util.function.Function;

public class Class7302 extends Class7303
{
    public Class7302(final Function<Dynamic<?>, ? extends Class5117> function) {
        super(function, 128);
        this.field28285 = (Set<Block>)ImmutableSet.of((Object) Blocks.STONE, (Object) Blocks.GRANITE, (Object) Blocks.DIORITE, (Object) Blocks.ANDESITE, (Object) Blocks.DIRT, (Object) Blocks.COARSE_DIRT, (Object[])new Block[] { Blocks.PODZOL, Blocks.GRASS_BLOCK, Blocks.field29338 });
        this.field28286 = (Set<Fluid>)ImmutableSet.of((Object)Class7558.field29978, (Object)Class7558.field29976);
    }
    
    @Override
    public int method22392() {
        return 10;
    }
    
    @Override
    public float method22393(final Random random) {
        return (random.nextFloat() * 2.0f + random.nextFloat()) * 2.0f;
    }
    
    @Override
    public double method22394() {
        return 5.0;
    }
    
    @Override
    public int method22395(final Random random) {
        return random.nextInt(this.field28288);
    }
    
    @Override
    public boolean method22396(final IChunk class1860, final Function<BlockPos, Class3090> function, final BitSet set, final Random random, final Mutable class1861, final Mutable class1862, final Mutable class1863, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final AtomicBoolean atomicBoolean) {
        final int n9 = n6 | n8 << 4 | n7 << 8;
        if (set.get(n9)) {
            return false;
        }
        set.set(n9);
        class1861.setPos(n4, n7, n5);
        if (!this.method22407(class1860.getBlockState(class1861))) {
            return false;
        }
        BlockState class1864;
        if (n7 > 31) {
            class1864 = Class7302.field28282;
        }
        else {
            class1864 = Class7302.field28284.getBlockState();
        }
        class1860.method7008(class1861, class1864, false);
        return true;
    }
}
