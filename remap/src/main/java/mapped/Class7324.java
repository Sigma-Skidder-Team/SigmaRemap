// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;

public class Class7324
{
    private static Class6208<Fluid> field28317;
    private static int field28318;
    public static final Class7909<Fluid> field28319;
    public static final Class7909<Fluid> field28320;
    
    public static void method22477(final Class6208<Fluid> field28317) {
        Class7324.field28317 = field28317;
        ++Class7324.field28318;
    }
    
    public static Class6208<Fluid> method22478() {
        return Class7324.field28317;
    }
    
    private static Class7909<Fluid> method22479(final String s) {
        return new Class7911(new ResourceLocation(s));
    }
    
    static {
        Class7324.field28317 = new Class6208<Fluid>(p0 -> Optional.empty(), "", false, "");
        field28319 = method22479("water");
        field28320 = method22479("lava");
    }
}
