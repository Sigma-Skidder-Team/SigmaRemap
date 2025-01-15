// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;

public final class Class5238<T> extends Class5233
{
    private final String field22261;
    private final List<T> field22262;
    
    public Class5238(final String field22261, final List<T> field22262, final Class2314 class2314, final Class2314 class2315) {
        super(class2314, class2315);
        this.field22261 = field22261;
        if (field22262 != null && field22262.size() != 2) {
            throw new Class2386("Two strings must be provided instead of " + String.valueOf(field22262.size()));
        }
        this.field22262 = field22262;
    }
    
    public String method16350() {
        return this.field22261;
    }
    
    public List<T> method16351() {
        return this.field22262;
    }
    
    @Override
    public Class2207 method16347() {
        return Class2207.field13435;
    }
}
