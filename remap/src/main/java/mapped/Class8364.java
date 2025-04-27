// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

public class Class8364
{
    private static String[] field34300;
    public static final Class8895 field34301;
    public static final Class8895 field34302;
    public static final Class8895 field34303;
    
    private static int method27895(final Class1856 class1856, final BlockPos class1857, final Class8895 class1858) {
        return class1856.method6849(class1857, class1858);
    }
    
    public static int method27896(final Class1856 class1856, final BlockPos class1857) {
        return method27895(class1856, class1857, Class8364.field34301);
    }
    
    public static int method27897(final Class1856 class1856, final BlockPos class1857) {
        return method27895(class1856, class1857, Class8364.field34302);
    }
    
    public static int method27898(final Class1856 class1856, final BlockPos class1857) {
        return method27895(class1856, class1857, Class8364.field34303);
    }
    
    static {
        field34301 = Biome::method9858;
        field34302 = ((class3090, n, n2) -> class3090.method9859());
        field34303 = ((class3090, n, n2) -> class3090.method9868());
    }
}
