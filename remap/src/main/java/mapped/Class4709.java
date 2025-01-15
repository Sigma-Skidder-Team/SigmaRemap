// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class4709 extends Class4708<Class432>
{
    private static String[] field20299;
    
    public Class4709(final Class8551 class8551) {
        super(class8551);
    }
    
    public void method13976(final Class432 class432, final float n, final Class7096 class433, final Class7351 class434, final Class7807 class435, final int n2) {
        final int method2154 = class432.method2154();
        if (method2154 > -1) {
            if (method2154 - n + 1.0f < 10.0f) {
                final float method2155 = MathHelper.method35653(1.0f - (method2154 - n + 1.0f) / 10.0f, 0.0f, 1.0f);
                final float n3 = method2155 * method2155;
                final float n4 = 1.0f + n3 * n3 * 0.3f;
                class434.method22565(n4, n4, n4);
            }
        }
        method13977(class433, class434, class435, n2, method2154 > -1 && method2154 / 5 % 2 == 0);
    }
    
    public static void method13977(final Class7096 class7096, final Class7351 class7097, final Class7807 class7098, final int n, final boolean b) {
        int n2;
        if (!b) {
            n2 = Class1904.field10335;
        }
        else {
            n2 = Class1904.method7387(Class1904.method7385(1.0f), 10);
        }
        Class869.method5277().method5305().method5795(class7096, class7097, class7098, n, n2);
    }
}
