// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public class Class8440
{
    private final String field34690;
    private final List<String> field34691;
    private final Map<String, String> field34692;
    
    public Class8440(final String field34690) {
        this.field34691 = new ArrayList<String>();
        this.field34692 = new HashMap<String, String>();
        this.field34690 = field34690;
    }
    
    public String method28173() {
        return this.field34690;
    }
    
    public Map<String, String> method28174() {
        return this.field34692;
    }
    
    public List<String> method28175() {
        return this.field34691;
    }
    
    @Override
    public String toString() {
        return "CompactData: " + this.field34690 + " " + this.field34692;
    }
}
