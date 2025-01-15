// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Arrays;
import com.google.common.collect.ImmutableList;
import java.util.Map;

public enum Class261
{
    field1246("terrain_matching", (ImmutableList<Class4107>)ImmutableList.of((Object)new Class4112(Class2020.field11521, -1))), 
    field1247("rigid", (ImmutableList<Class4107>)ImmutableList.of());
    
    private static final Map<String, Class261> field1248;
    private final String field1249;
    private final ImmutableList<Class4107> field1250;
    
    private Class261(final String field1249, final ImmutableList<Class4107> field1250) {
        this.field1249 = field1249;
        this.field1250 = field1250;
    }
    
    public String method898() {
        return this.field1249;
    }
    
    public static Class261 method899(final String s) {
        return Class261.field1248.get(s);
    }
    
    public ImmutableList<Class4107> method900() {
        return this.field1250;
    }
    
    static {
        field1248 = Arrays.stream(values()).collect(Collectors.toMap((Function<? super Class261, ? extends String>)Class261::method898, class261 -> class261));
    }
}
