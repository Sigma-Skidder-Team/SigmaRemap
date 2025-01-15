// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;

public class Class5110 implements Class5106
{
    private Map<String, String> field22055;
    
    public Class5110(final Map<String, String> field22055) {
        this.field22055 = null;
        this.field22055 = field22055;
    }
    
    @Override
    public Class327 method16001(String s) {
        final String prefix = "defined_";
        if (s.startsWith(prefix)) {
            return this.field22055.containsKey(s.substring(prefix.length())) ? new Class341(Class305.field1819, null) : new Class341(Class305.field1820, null);
        }
        while (this.field22055.containsKey(s)) {
            final String s2 = this.field22055.get(s);
            if (s2 == null) {
                break;
            }
            if (s2.equals(s)) {
                break;
            }
            s = s2;
        }
        final int method28933 = Class8571.method28933(s, Integer.MIN_VALUE);
        if (method28933 != Integer.MIN_VALUE) {
            return new Class337((float)method28933);
        }
        Class8571.method28848("Unknown macro value: " + s);
        return new Class337(0.0f);
    }
}
