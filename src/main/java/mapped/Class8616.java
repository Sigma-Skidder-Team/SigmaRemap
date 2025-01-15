// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.regex.Pattern;

public final class Class8616
{
    private final Class8542 field36153;
    private final Pattern field36154;
    
    public Class8616(final Class8542 field36153, final Pattern field36154) {
        this.field36153 = field36153;
        this.field36154 = field36154;
    }
    
    public Class8542 method29221() {
        return this.field36153;
    }
    
    public Pattern method29222() {
        return this.field36154;
    }
    
    @Override
    public String toString() {
        return "Tuple tag=" + this.field36153 + " regexp=" + this.field36154;
    }
}
