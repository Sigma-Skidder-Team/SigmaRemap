// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.BitSet;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class7305 extends Class7304<Class5117>
{
    private final float[] field28289;
    
    public Class7305(final Function<Dynamic<?>, ? extends Class5117> function) {
        super(function, 256);
        this.field28289 = new float[1024];
    }
    
    public boolean method22397(final Random random, final int n, final int n2, final Class5117 class5117) {
        return random.nextFloat() <= class5117.field22066;
    }
    
    public boolean method22398(final Class1860 class1860, final Function<Class354, Class3090> function, final Random random, final int n, final int n2, final int n3, final int n4, final int n5, final BitSet set, final Class5117 class1861) {
        final int n6 = (this.method22405() * 2 - 1) * 16;
        this.method22412(class1860, function, random.nextLong(), n, n4, n5, n2 * 16 + random.nextInt(16), random.nextInt(random.nextInt(40) + 8) + 20, n3 * 16 + random.nextInt(16), (random.nextFloat() * 2.0f + random.nextFloat()) * 2.0f, random.nextFloat() * 6.2831855f, (random.nextFloat() - 0.5f) * 2.0f / 8.0f, 0, n6 - random.nextInt(n6 / 4), 3.0, set);
        return true;
    }
    
    private void method22412(final Class1860 class1860, final Function<Class354, Class3090> function, final long seed, final int n, final int n2, final int n3, double n4, double n5, double n6, final float n7, float n8, float n9, final int n10, final int n11, final double n12, final BitSet set) {
        final Random random = new Random(seed);
        float n13 = 1.0f;
        for (int i = 0; i < 256; ++i) {
            if (i == 0 || random.nextInt(3) == 0) {
                n13 = 1.0f + random.nextFloat() * random.nextFloat();
            }
            this.field28289[i] = n13 * n13;
        }
        float n14 = 0.0f;
        float n15 = 0.0f;
        for (int j = n10; j < n11; ++j) {
            final double n16 = 1.5 + Class9546.method35638(j * 3.1415927f / n11) * n7;
            final double n17 = n16 * n12;
            final double n18 = n16 * (random.nextFloat() * 0.25 + 0.75);
            final double n19 = n17 * (random.nextFloat() * 0.25 + 0.75);
            final float method35639 = Class9546.method35639(n9);
            final float method35640 = Class9546.method35638(n9);
            n4 += Class9546.method35639(n8) * method35639;
            n5 += method35640;
            n6 += Class9546.method35638(n8) * method35639;
            n9 *= 0.7f;
            n9 += n15 * 0.05f;
            n8 += n14 * 0.05f;
            final float n20 = n15 * 0.8f;
            final float n21 = n14 * 0.5f;
            n15 = n20 + (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0f;
            n14 = n21 + (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 4.0f;
            if (random.nextInt(4) != 0) {
                if (!this.method22411(n2, n3, n4, n6, j, n11, n7)) {
                    return;
                }
                this.method22406(class1860, function, seed, n, n2, n3, n4, n5, n6, n18, n19, set);
            }
        }
    }
    
    @Override
    public boolean method22401(final double n, final double n2, final double n3, final int n4) {
        return (n * n + n3 * n3) * this.field28289[n4 - 1] + n2 * n2 / 6.0 >= 1.0;
    }
}
