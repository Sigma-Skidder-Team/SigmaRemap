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
import java.util.function.Function;

public class Class7306 extends Class7305
{
    public Class7306(final Function<Dynamic<?>, ? extends Class5117> function) {
        super(function);
        this.field28285 = (Set<Class3833>)ImmutableSet.of((Object)Class7521.field29148, (Object)Class7521.field29149, (Object)Class7521.field29151, (Object)Class7521.field29153, (Object)Class7521.field29156, (Object)Class7521.field29157, (Object[])new Class3833[] { Class7521.field29158, Class7521.field29155, Class7521.field29546, Class7521.field29482, Class7521.field29483, Class7521.field29484, Class7521.field29485, Class7521.field29486, Class7521.field29487, Class7521.field29488, Class7521.field29489, Class7521.field29490, Class7521.field29491, Class7521.field29492, Class7521.field29493, Class7521.field29494, Class7521.field29495, Class7521.field29496, Class7521.field29497, Class7521.field29217, Class7521.field29587, Class7521.field29392, Class7521.field29329, Class7521.field29175, Class7521.field29177, Class7521.field29173, Class7521.field29174, Class7521.field29286, Class7521.field29147, Class7521.field29764 });
    }
    
    @Override
    public boolean method22409(final Class1860 class1860, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        return false;
    }
    
    @Override
    public boolean method22396(final Class1860 class1860, final Function<BlockPos, Class3090> function, final BitSet set, final Random random, final Mutable class1861, final Mutable class1862, final Mutable class1863, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final AtomicBoolean atomicBoolean) {
        return Class7307.method22413(this, class1860, set, random, class1861, n, n2, n3, n4, n5, n6, n7, n8);
    }
}
