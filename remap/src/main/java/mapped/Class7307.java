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
import net.minecraft.util2.Direction;

import java.util.function.Function;

public class Class7307 extends Class7303
{
    public Class7307(final Function<Dynamic<?>, ? extends Class5117> function) {
        super(function, 256);
        this.field28285 = (Set<Block>)ImmutableSet.of((Object)Class7521.field29148, (Object)Class7521.field29149, (Object)Class7521.field29151, (Object)Class7521.field29153, (Object)Class7521.field29156, (Object)Class7521.field29157, (Object[])new Block[] { Class7521.field29158, Class7521.field29155, Class7521.field29546, Class7521.field29482, Class7521.field29483, Class7521.field29484, Class7521.field29485, Class7521.field29486, Class7521.field29487, Class7521.field29488, Class7521.field29489, Class7521.field29490, Class7521.field29491, Class7521.field29492, Class7521.field29493, Class7521.field29494, Class7521.field29495, Class7521.field29496, Class7521.field29497, Class7521.field29217, Class7521.field29587, Class7521.field29392, Class7521.field29329, Class7521.field29175, Class7521.field29177, Class7521.field29173, Class7521.field29174, Class7521.field29286, Class7521.field29147, Class7521.field29764, Class7521.field29548 });
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
                class7305.method7008(class7306, Class7521.field29286.getDefaultState(), false);
            }
            else {
                class7305.method7008(class7306, Class7521.field29642.getDefaultState(), false);
                class7305.method7036().method21345(class7306, Class7521.field29642, 0);
            }
            return true;
        }
        if (n7 < 10) {
            class7305.method7008(class7306, Class7521.field29174.getDefaultState(), false);
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
