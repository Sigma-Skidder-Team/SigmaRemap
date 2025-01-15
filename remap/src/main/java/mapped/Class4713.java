// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Map;

public class Class4713 extends Class4712<Class805, Class5931<Class805>>
{
    private static final Map<Class1983, Class1932> field20314;
    
    public Class4713(final Class8551 class8551) {
        super(class8551, new Class5931(), 0.7f);
        this.method13978((Class1799<Class805, Class5931<Class805>>)new Class1814(this));
    }
    
    public Class1932 method14010(final Class805 class805) {
        return Class4713.field20314.get(class805.method4708());
    }
    
    static {
        field20314 = Class8349.method27851(Maps.newHashMap(), hashMap -> {
            hashMap.put(Class1983.field10982, new Class1932("textures/entity/cow/brown_mooshroom.png"));
            hashMap.put(Class1983.field10981, new Class1932("textures/entity/cow/red_mooshroom.png"));
        });
    }
}
