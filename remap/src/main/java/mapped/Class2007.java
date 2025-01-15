// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

import java.util.Comparator;
import java.util.Arrays;

public enum Class2007
{
    field11398(0, "options.ao.off"), 
    field11399(1, "options.ao.min"), 
    field11400(2, "options.ao.max");
    
    private static final Class2007[] field11401;
    private final int field11402;
    private final String field11403;
    
    private Class2007(final int field11402, final String field11403) {
        this.field11402 = field11402;
        this.field11403 = field11403;
    }
    
    public int method8039() {
        return this.field11402;
    }
    
    public String method8040() {
        return this.field11403;
    }
    
    public static Class2007 method8041(final int n) {
        return Class2007.field11401[MathHelper.method35664(n, Class2007.field11401.length)];
    }
    
    static {
        field11401 = Arrays.stream(values()).sorted(Comparator.comparingInt(Class2007::method8039)).toArray(Class2007[]::new);
    }
}
