// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

import java.util.Comparator;
import java.util.Arrays;

public enum Class2051
{
    field11699(0, "options.narrator.off"), 
    field11700(1, "options.narrator.all"), 
    field11701(2, "options.narrator.chat"), 
    field11702(3, "options.narrator.system");
    
    private static final Class2051[] field11703;
    private final int field11704;
    private final String field11705;
    
    Class2051(final int field11704, final String field11705) {
        this.field11704 = field11704;
        this.field11705 = field11705;
    }
    
    public int method8137() {
        return this.field11704;
    }
    
    public String method8138() {
        return this.field11705;
    }
    
    public static Class2051 method8139(final int n) {
        return Class2051.field11703[MathHelper.method35664(n, Class2051.field11703.length)];
    }
    
    static {
        field11703 = Arrays.stream(values()).sorted(Comparator.comparingInt(Class2051::method8137)).toArray(Class2051[]::new);
    }
}
