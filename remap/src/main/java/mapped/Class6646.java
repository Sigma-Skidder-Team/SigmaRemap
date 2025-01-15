// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import com.google.common.collect.Sets;
import java.util.Set;

public class Class6646 extends Class6635
{
    private static String[] field26276;
    private final Set<Long> field26277;
    private final Set<Long> field26278;
    
    public Class6646(final Class6108 class6108) {
        super(class6108);
        this.field26277 = Sets.newConcurrentHashSet();
        this.field26278 = Sets.newConcurrentHashSet();
    }
    
    public static long method20186(final int n, final int n2) {
        return ((long)n << 32) + n2 + 2147483648L;
    }
    
    public List<Object> method20187(final Object o) throws Exception {
        return Class8563.method28794().method33549().method29950(Class6479.class).method19504(o, this);
    }
    
    public Set<Long> method20188() {
        return this.field26277;
    }
    
    public Set<Long> method20189() {
        return this.field26278;
    }
}
