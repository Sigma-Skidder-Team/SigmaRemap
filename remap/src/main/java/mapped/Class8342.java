// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;

public class Class8342
{
    private final Class2206 field34249;
    private final Map<String, String> field34250;
    
    public Class8342(final Class2206 field34249, final Map<String, String> field34250) {
        this.field34249 = field34249;
        this.field34250 = field34250;
    }
    
    public Class2206 method27806() {
        return this.field34249;
    }
    
    public Map<String, String> method27807() {
        return this.field34250;
    }
    
    @Override
    public String toString() {
        return String.format("VersionTagsTuple<%s, %s>", this.field34249, this.field34250);
    }
}
