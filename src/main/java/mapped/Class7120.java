// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.Queue;

public final class Class7120<T> implements Class7121<T, T>
{
    private static String[] field27759;
    private final Queue<T> field27760;
    
    public Class7120(final Queue<T> field27760) {
        this.field27760 = field27760;
    }
    
    @Nullable
    @Override
    public T method21856() {
        return this.field27760.poll();
    }
    
    @Override
    public boolean method21857(final T t) {
        return this.field27760.add(t);
    }
    
    @Override
    public boolean method21858() {
        return this.field27760.isEmpty();
    }
}
