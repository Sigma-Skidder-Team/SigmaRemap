// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

import java.util.Comparator;
import java.util.Arrays;

public enum Class2202
{
    field13405(0, "options.off"), 
    field13406(1, "options.clouds.fast"), 
    field13407(2, "options.clouds.fancy");
    
    private static final Class2202[] field13408;
    private final int field13409;
    private final String field13410;
    
    Class2202(final int field13409, final String field13410) {
        this.field13409 = field13409;
        this.field13410 = field13410;
    }
    
    public int method8376() {
        return this.field13409;
    }
    
    public String method8377() {
        return this.field13410;
    }
    
    public static Class2202 method8378(final int n) {
        return Class2202.field13408[MathHelper.method35664(n, Class2202.field13408.length)];
    }
    
    static {
        field13408 = Arrays.stream(values()).sorted(Comparator.comparingInt(Class2202::method8376)).toArray(Class2202[]::new);
    }
}
