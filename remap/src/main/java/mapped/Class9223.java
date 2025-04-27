// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Map;
import java.util.LinkedHashMap;

public class Class9223
{
    private final String field39559;
    private final int field39560;
    private final LinkedHashMap<String, String> field39561;
    
    public static Class9223 method34004(final String s) {
        final String[] split = s.split("\\[");
        final Class9223 class9223 = new Class9223(split[0], Class8881.method31263(s));
        if (split.length > 1) {
            final String[] split2 = split[1].replace("]", "").split(",");
            for (int length = split2.length, i = 0; i < length; ++i) {
                final String[] split3 = split2[i].split("=");
                class9223.field39561.put(split3[0], split3[1]);
            }
        }
        return class9223;
    }
    
    public static Class9223 method34005(final int i) {
        final String method31264 = Class8881.method31264(i);
        if (method31264 == null) {
            Class8563.method28793().method34742().info("Unable to get blockdata from " + i);
            return method34004("minecraft:air");
        }
        return method34004(method31264);
    }
    
    private Class9223(final String field39559, final int field39560) {
        this.field39561 = new LinkedHashMap<String, String>();
        this.field39559 = field39559;
        this.field39560 = field39560;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(this.field39559 + "[");
        for (final Map.Entry entry : this.field39561.entrySet()) {
            sb.append((String)entry.getKey()).append('=').append((String)entry.getValue()).append(',');
        }
        return sb.substring() + "]";
    }
    
    public int method34006() {
        return Class8881.method31263(this.toString());
    }
    
    public Class9223 method34007(final String s, final Object o) {
        if (this.method34009(s)) {
            this.field39561.put(s, o.toString());
            return this;
        }
        throw new UnsupportedOperationException("No blockdata found for " + s + " at " + this.field39559);
    }
    
    public String method34008(final String key) {
        return this.field39561.get(key);
    }
    
    public boolean method34009(final String key) {
        return this.field39561.containsKey(key);
    }
    
    public String method34010() {
        return this.field39559;
    }
    
    public int method34011() {
        return this.field39560;
    }
}
