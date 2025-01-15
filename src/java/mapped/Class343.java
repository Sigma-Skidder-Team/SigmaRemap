// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collectors;
import java.util.Arrays;
import javax.annotation.Nullable;
import java.util.Map;

public enum Class343
{
    field2112("always", 0), 
    field2113("never", 1), 
    field2114("pushOtherTeams", 2), 
    field2115("pushOwnTeam", 3);
    
    private static final Map<String, Class343> field2116;
    public final String field2117;
    public final int field2118;
    
    @Nullable
    public static Class343 method1021(final String s) {
        return Class343.field2116.get(s);
    }
    
    private Class343(final String field2117, final int field2118) {
        this.field2117 = field2117;
        this.field2118 = field2118;
    }
    
    public Class2250 method1022() {
        return new Class2259("team.collision." + this.field2117, new Object[0]);
    }
    
    static {
        field2116 = Arrays.stream(values()).collect(Collectors.toMap(class343 -> class343.field2117, class344 -> class344));
    }
}
