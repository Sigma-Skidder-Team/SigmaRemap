// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import java.util.Map;

public enum Class2032
{
    field11582("vertex", ".vsh", 35633), 
    field11583("fragment", ".fsh", 35632);
    
    private final String field11584;
    private final String field11585;
    private final int field11586;
    private final Map<String, Class9331> field11587;
    
    Class2032(final String field11584, final String field11585, final int field11586) {
        this.field11587 = Maps.newHashMap();
        this.field11584 = field11584;
        this.field11585 = field11585;
        this.field11586 = field11586;
    }
    
    public String method8091() {
        return this.field11584;
    }
    
    public String method8092() {
        return this.field11585;
    }
    
    private int method8093() {
        return this.field11586;
    }
    
    public Map<String, Class9331> method8094() {
        return this.field11587;
    }
}
