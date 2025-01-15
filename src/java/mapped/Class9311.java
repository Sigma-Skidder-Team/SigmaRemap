// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.MoreObjects;
import java.util.List;

public class Class9311
{
    private static String[] field39970;
    private final Class6988 field39971;
    private final List<Class6991> field39972;
    private final int field39973;
    
    public Class9311(final Class6988 field39971, final List<Class6991> field39972, final int field39973) {
        this.field39971 = field39971;
        this.field39972 = field39972;
        this.field39973 = field39973;
    }
    
    public Class6991 method34431(final int n) {
        return (Class6991)((n >= 0 && n < this.field39972.size()) ? MoreObjects.firstNonNull((Object)this.field39972.get(n), (Object)Class9039.field38256) : Class9039.field38256);
    }
    
    public int method34432() {
        return this.field39973;
    }
}
