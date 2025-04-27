// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

import java.util.Comparator;
import java.util.Arrays;

public enum Class2047
{
    field11661(0, "options.chat.visibility.full"), 
    field11662(1, "options.chat.visibility.system"), 
    field11663(2, "options.chat.visibility.hidden");
    
    private static final Class2047[] field11664;
    private final int field11665;
    private final String field11666;
    
    Class2047(final int field11665, final String field11666) {
        this.field11665 = field11665;
        this.field11666 = field11666;
    }
    
    public int method8132() {
        return this.field11665;
    }
    
    public String method8133() {
        return this.field11666;
    }
    
    public static Class2047 method8134(final int n) {
        return Class2047.field11664[MathHelper.method35664(n, Class2047.field11664.length)];
    }
    
    static {
        field11664 = Arrays.stream(values()).sorted(Comparator.comparingInt(Class2047::method8132)).toArray(Class2047[]::new);
    }
}
