// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Enumeration;
import java.util.Collections;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Properties;

public class Class27 extends Properties
{
    private static String[] field74;
    private final Set<Object> field75;
    
    public Class27() {
        this.field75 = new LinkedHashSet<Object>();
    }
    
    @Override
    public synchronized Object put(Object trim, Object trim2) {
        if (trim instanceof String) {
            trim = ((String)trim).trim();
        }
        if (trim2 instanceof String) {
            trim2 = ((String)trim2).trim();
        }
        this.field75.add(trim);
        return super.put(trim, trim2);
    }
    
    @Override
    public Set<Object> keySet() {
        this.field75.retainAll(super.keySet());
        return Collections.unmodifiableSet(this.field75);
    }
    
    @Override
    public synchronized Enumeration<Object> keys() {
        return Collections.enumeration(this.keySet());
    }
}
