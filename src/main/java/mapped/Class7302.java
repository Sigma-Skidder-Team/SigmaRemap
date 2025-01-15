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
import java.util.function.Function;

public class Class7302 extends Class7303
{
    public Class7302(final Function<Dynamic<?>, ? extends Class5117> function) {
        super(function, 128);
        this.field28285 = (Set<Class3833>)ImmutableSet.of((Object)Class7521.field29148, (Object)Class7521.field29149, (Object)Class7521.field29151, (Object)Class7521.field29153, (Object)Class7521.field29156, (Object)Class7521.field29157, (Object[])new Class3833[] { Class7521.field29158, Class7521.field29155, Class7521.field29338 });
        this.field28286 = (Set<Class7255>)ImmutableSet.of((Object)Class7558.field29978, (Object)Class7558.field29976);
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
    public boolean method22396(final Class1860 class1860, final Function<Class354, Class3090> function, final BitSet set, final Random random, final Class385 class1861, final Class385 class1862, final Class385 class1863, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final AtomicBoolean atomicBoolean) {
        final int n9 = n6 | n8 << 4 | n7 << 8;
        if (set.get(n9)) {
            return false;
        }
        set.set(n9);
        class1861.method1284(n4, n7, n5);
        if (!this.method22407(class1860.method6701(class1861))) {
            return false;
        }
        Class7096 class1864;
        if (n7 > 31) {
            class1864 = Class7302.field28282;
        }
        else {
            class1864 = Class7302.field28284.method21791();
        }
        class1860.method7008(class1861, class1864, false);
        return true;
    }
}
