// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.concurrent.Executor;

public class Class8731 extends Class8730
{
    private static String[] field36677;
    public final /* synthetic */ Class388 field36678;
    
    public Class8731(final Class388 field36678, final Executor executor, final Executor executor2) {
        this.field36678 = field36678;
        super(executor, executor2);
    }
    
    @Override
    public boolean method30124(final long n) {
        return Class388.method1411(this.field36678).contains(n);
    }
    
    @Nullable
    @Override
    public Class9298 method30125(final long n) {
        return this.field36678.method1316(n);
    }
    
    @Nullable
    @Override
    public Class9298 method30126(final long n, final int n2, final Class9298 class9298, final int n3) {
        return Class388.method1412(this.field36678, n, n2, class9298, n3);
    }
}
