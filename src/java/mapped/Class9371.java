// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.Map;

public class Class9371
{
    private static String[] field40186;
    private Class8685 field40187;
    private Class101 field40188;
    private final Map<Class9455<?>, Class8685> field40189;
    private final Object2BooleanMap<Class1932> field40190;
    private final Map<Class1932, Class170> field40191;
    
    public Class9371() {
        this.field40187 = Class8685.field36500;
        this.field40188 = Class101.field297;
        this.field40189 = Maps.newHashMap();
        this.field40190 = (Object2BooleanMap<Class1932>)new Object2BooleanOpenHashMap();
        this.field40191 = Maps.newHashMap();
    }
    
    public Class8139 method34774() {
        return new Class8139(this.field40187, this.field40188, this.field40189, this.field40190, this.field40191, null);
    }
}
