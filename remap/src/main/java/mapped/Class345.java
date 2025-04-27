// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Optional;

public enum Class345
{
    field2124("master", 0), 
    field2125("music", 1), 
    field2126("record", 2), 
    field2127("weather", 3), 
    field2128("block", 4), 
    field2129("hostile", 5), 
    field2130("neutral", 6), 
    field2131("player", 7), 
    field2132("ambient", 8), 
    field2133("voice", 9);
    
    private final String field2134;
    private final int field2135;
    
    public static Optional<Class345> method1025(final String anotherString) {
        for (final Class345 class345 : values()) {
            if (class345.method1026().equalsIgnoreCase(anotherString)) {
                return (Optional<Class345>)Optional.of((Object)class345);
            }
        }
        return Optional.absent();
    }
    
    public String method1026() {
        return this.field2134;
    }
    
    public int method1027() {
        return this.field2135;
    }
    
    Class345(final String field2134, final int field2135) {
        this.field2134 = field2134;
        this.field2135 = field2135;
    }
}
