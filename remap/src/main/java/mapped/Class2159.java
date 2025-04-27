// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

import java.util.Comparator;
import java.util.Arrays;

public enum Class2159
{
    field12819(0, "options.particles.all"), 
    field12820(1, "options.particles.decreased"), 
    field12821(2, "options.particles.minimal");
    
    private static final Class2159[] field12822;
    private final int field12823;
    private final String field12824;
    
    Class2159(final int field12823, final String field12824) {
        this.field12823 = field12823;
        this.field12824 = field12824;
    }
    
    public String method8325() {
        return this.field12824;
    }
    
    public int method8326() {
        return this.field12823;
    }
    
    public static Class2159 method8327(final int n) {
        return Class2159.field12822[MathHelper.method35664(n, Class2159.field12822.length)];
    }
    
    static {
        field12822 = Arrays.stream(values()).sorted(Comparator.comparingInt(Class2159::method8326)).toArray(Class2159[]::new);
    }
}
