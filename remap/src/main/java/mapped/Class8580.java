// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.List;

public final class Class8580
{
    private final List<Class7917> field36063;
    
    public Class8580() {
        this.field36063 = new ArrayList<Class7917>();
    }
    
    public Class8580 method29036(final String s, final String... array) {
        if (s != null) {
            for (int length = array.length, i = 0; i < length; ++i) {
                this.field36063.add(new Class7917(s, array[i]));
            }
            return this;
        }
        throw new NullPointerException("pattern == null");
    }
    
    public Class8645 method29037() {
        return new Class8645(new LinkedHashSet<Class7917>(this.field36063), null);
    }
}
