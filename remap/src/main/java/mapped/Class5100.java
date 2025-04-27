// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.List;

public class Class5100
{
    private static String[] field22024;
    public final Class357 field22025;
    public final Class357 field22026;
    private final List<Class367> field22027;
    private int field22028;
    
    public Class5100(final Class357 field22025, final Class357 field22026) {
        this.field22027 = Lists.newArrayList();
        this.field22028 = 0;
        this.field22025 = field22025;
        this.field22026 = field22026;
    }
    
    public Class5100 method15991(final int field22028) {
        this.field22028 = field22028;
        return this;
    }
    
    public Class5127 method15990() {
        return new Class5127(this.field22025, this.field22026, this.field22027, this.field22028);
    }
}
