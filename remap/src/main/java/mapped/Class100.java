// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collector;
import com.google.common.collect.ImmutableMap;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import java.util.Map;

public enum Class100
{
    field285("major_negative", -5, 100, 10, 10), 
    field286("minor_negative", -1, 200, 20, 20), 
    field287("minor_positive", 1, 200, 1, 5), 
    field288("major_positive", 5, 100, 0, 100), 
    field289("trading", 1, 25, 2, 20);
    
    public final String field290;
    public final int field291;
    public final int field292;
    public final int field293;
    public final int field294;
    private static final Map<String, Class100> field295;
    
    Class100(final String field290, final int field291, final int field292, final int field293, final int field294) {
        this.field290 = field290;
        this.field291 = field291;
        this.field292 = field292;
        this.field293 = field293;
        this.field294 = field294;
    }
    
    @Nullable
    public static Class100 method583(final String s) {
        return Class100.field295.get(s);
    }
    
    static {
        field295 = Stream.of(values()).collect((Collector<? super Class100, Object, Map<String, Class100>>)ImmutableMap.toImmutableMap(class100 -> class100.field290, Function.identity()));
    }
}
