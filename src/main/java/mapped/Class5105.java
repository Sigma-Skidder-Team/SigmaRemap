// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.Map;

public class Class5105 implements Class5106
{
    private static String[] field22046;
    private Map<String, Class339> field22047;
    
    public Class5105(final Class5601[] array) {
        this.field22047 = new HashMap<String, Class339>();
        for (int i = 0; i < array.length; ++i) {
            final Class5601 class5601 = array[i];
            if (class5601 instanceof Class5604) {
                this.field22047.put(class5601.method16860(), new Class339((Class5604)class5601));
            }
        }
    }
    
    @Override
    public Class327 method16001(final String s) {
        return this.field22047.get(s);
    }
}
