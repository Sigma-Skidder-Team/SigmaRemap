// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Sets;
import javax.annotation.Nullable;
import java.util.Random;
import java.util.List;
import java.util.Set;
import com.google.common.collect.ImmutableSet;

public class Class1869 extends Class1868
{
    private static String[] field10195;
    private final Class3090 field10196;
    
    public Class1869(final Class5471 class5471) {
        super((Set<Class3090>)ImmutableSet.of((Object)class5471.method16710()));
        this.field10196 = class5471.method16710();
    }
    
    @Override
    public Class3090 method6960(final int n, final int n2, final int n3) {
        return this.field10196;
    }
    
    @Nullable
    @Override
    public Class354 method7119(final int n, final int n2, final int n3, final int n4, final List<Class3090> list, final Random random) {
        return list.contains(this.field10196) ? new Class354(n - n4 + random.nextInt(n4 * 2 + 1), n2, n3 - n4 + random.nextInt(n4 * 2 + 1)) : null;
    }
    
    @Override
    public Set<Class3090> method7118(final int n, final int n2, final int n3, final int n4) {
        return Sets.newHashSet((Object[])new Class3090[] { this.field10196 });
    }
}
