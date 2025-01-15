// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableSet;
import java.util.Random;
import java.util.Set;

public class Class1870 extends Class1868
{
    private static String[] field10197;
    private final Class8820 field10198;
    private final Class2317 field10199;
    private static final Set<Class3090> field10200;
    
    public Class1870(final Class5473 class5473) {
        super(Class1870.field10200);
        (this.field10199 = new Class2317(class5473.method16715())).method9436(17292);
        this.field10198 = new Class8820(this.field10199);
    }
    
    @Override
    public Class3090 method6960(final int n, final int n2, final int n3) {
        final int n4 = n >> 2;
        final int n5 = n3 >> 2;
        if (n4 * (long)n4 + n5 * (long)n5 <= 4096L) {
            return Class7102.field27641;
        }
        final float method7120 = this.method7120(n4 * 2 + 1, n5 * 2 + 1);
        if (method7120 > 40.0f) {
            return Class7102.field27674;
        }
        if (method7120 < 0.0f) {
            return (method7120 >= -20.0f) ? Class7102.field27675 : Class7102.field27672;
        }
        return Class7102.field27673;
    }
    
    @Override
    public float method7120(final int n, final int n2) {
        final int n3 = n / 2;
        final int n4 = n2 / 2;
        final int n5 = n % 2;
        final int n6 = n2 % 2;
        float a = Class9546.method35653(100.0f - Class9546.method35640((float)(n * n + n2 * n2)) * 8.0f, -100.0f, 80.0f);
        for (int i = -12; i <= 12; ++i) {
            for (int j = -12; j <= 12; ++j) {
                final long n7 = n3 + i;
                final long n8 = n4 + j;
                if (n7 * n7 + n8 * n8 > 4096L) {
                    if (this.field10198.method30766((double)n7, (double)n8) < -0.8999999761581421) {
                        final float n9 = (Class9546.method35647((float)n7) * 3439.0f + Class9546.method35647((float)n8) * 147.0f) % 13.0f + 9.0f;
                        final float n10 = (float)(n5 - i * 2);
                        final float n11 = (float)(n6 - j * 2);
                        a = Math.max(a, Class9546.method35653(100.0f - Class9546.method35640(n10 * n10 + n11 * n11) * n9, -100.0f, 80.0f));
                    }
                }
            }
        }
        return a;
    }
    
    static {
        field10200 = (Set)ImmutableSet.of((Object)Class7102.field27641, (Object)Class7102.field27674, (Object)Class7102.field27673, (Object)Class7102.field27672, (Object)Class7102.field27675);
    }
}
