// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

import java.util.Comparator;
import java.util.Arrays;

public enum Class323
{
    field1925(0, "options.off"), 
    field1926(1, "options.attack.crosshair"), 
    field1927(2, "options.attack.hotbar");
    
    private static final Class323[] field1928;
    private final int field1929;
    private final String field1930;
    
    private Class323(final int field1929, final String field1930) {
        this.field1929 = field1929;
        this.field1930 = field1930;
    }
    
    public int method994() {
        return this.field1929;
    }
    
    public String method995() {
        return this.field1930;
    }
    
    public static Class323 method996(final int n) {
        return Class323.field1928[MathHelper.method35664(n, Class323.field1928.length)];
    }
    
    static {
        field1928 = Arrays.stream(values()).sorted(Comparator.comparingInt(Class323::method994)).toArray(Class323[]::new);
    }
}
