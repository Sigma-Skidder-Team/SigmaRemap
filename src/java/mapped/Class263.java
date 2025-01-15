// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap$Builder;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public enum Class263
{
    field1256("integer"), 
    field1257("hearts");
    
    private final String field1258;
    private static final Map<String, Class263> field1259;
    
    private Class263(final String field1258) {
        this.field1258 = field1258;
    }
    
    public String method902() {
        return this.field1258;
    }
    
    public static Class263 method903(final String key) {
        return Class263.field1259.getOrDefault(key, Class263.field1256);
    }
    
    static {
        final ImmutableMap$Builder builder = ImmutableMap.builder();
        for (final Class263 class263 : values()) {
            builder.put((Object)class263.field1258, (Object)class263);
        }
        field1259 = (Map)builder.build();
    }
}
