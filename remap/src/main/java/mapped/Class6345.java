// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

import java.util.List;

public class Class6345 extends Class6343<Class7068>
{
    private static String[] field25375;
    private static final float[] field25376;
    private final Class8577 field25377;
    private final boolean field25378;
    private final Class8011 field25379;
    private final Class8589 field25380;
    private final Class8615 field25381;
    private final Class8671 field25382;
    
    public Class6345(final Class1851 class1851, final Class1868 class1852, final Class7068 class1853) {
        super(class1851, class1852, 4, 8, 256, class1853, true);
        this.field25379 = new Class8011();
        this.field25380 = new Class8589();
        this.field25381 = new Class8615();
        this.field25382 = new Class8671();
        this.field25366.method9436(2620);
        this.field25377 = new Class8577(this.field25366, 15, 0);
        this.field25378 = (class1851.method6764().method29570() == Class9505.field40895);
    }
    
    @Override
    public void method18868(final Class1878 class1878) {
        final int method7150 = class1878.method7150();
        final int method7151 = class1878.method7151();
        final Class3090 method7152 = class1878.method6959(new Class7859(method7150, method7151).method25435());
        final Class2317 class1879 = new Class2317();
        class1879.method9438(class1878.method6753(), method7150 << 4, method7151 << 4);
        Class8532.method28622(class1878, method7152, method7150, method7151, class1879);
    }
    
    @Override
    public void method18847(final double[] array, final int n, final int n2) {
        this.method18856(array, n, n2, 684.4119873046875, 684.4119873046875, 8.555149841308594, 4.277574920654297, 3, -10);
    }
    
    @Override
    public double method18849(final double n, final double n2, final int n3) {
        double n4 = (n3 - (8.5 + n * 8.5 / 8.0 * 4.0)) * 12.0 * 128.0 / 256.0 / n2;
        if (n4 < 0.0) {
            n4 *= 4.0;
        }
        return n4;
    }
    
    @Override
    public double[] method18848(final int n, final int n2) {
        final double[] array = new double[2];
        float n3 = 0.0f;
        float n4 = 0.0f;
        float n5 = 0.0f;
        final int method18853 = this.method18853();
        final float method18854 = this.field25385.method6960(n, method18853, n2).method9862();
        for (int i = -2; i <= 2; ++i) {
            for (int j = -2; j <= 2; ++j) {
                final Class3090 method18855 = this.field25385.method6960(n + i, method18853, n2 + j);
                float method18856 = method18855.method9862();
                float method18857 = method18855.method9866();
                if (this.field25378) {
                    if (method18856 > 0.0f) {
                        method18856 = 1.0f + method18856 * 2.0f;
                        method18857 = 1.0f + method18857 * 4.0f;
                    }
                }
                float n6 = Class6345.field25376[i + 2 + (j + 2) * 5] / (method18856 + 2.0f);
                if (method18855.method9862() > method18854) {
                    n6 /= 2.0f;
                }
                n3 += method18857 * n6;
                n4 += method18856 * n6;
                n5 += n6;
            }
        }
        final float n7 = n3 / n5;
        final float n8 = n4 / n5;
        final float n9 = n7 * 0.9f + 0.1f;
        array[0] = (n8 * 4.0f - 1.0f) / 8.0f + this.method18869(n, n2);
        array[1] = n9;
        return array;
    }
    
    private double method18869(final int n, final int n2) {
        double n3 = this.field25377.method29030(n * 200, 10.0, n2 * 200, 1.0, 0.0, true) * 65535.0 / 8000.0;
        if (n3 < 0.0) {
            n3 = -n3 * 0.3;
        }
        double n4 = n3 * 3.0 - 2.0;
        double n5;
        if (n4 >= 0.0) {
            if (n4 > 1.0) {
                n4 = 1.0;
            }
            n5 = n4 / 40.0;
        }
        else {
            n5 = n4 / 28.0;
        }
        return n5;
    }
    
    @Override
    public List<Class6828> method18866(final Class1976 class1976, final BlockPos class1977) {
        if (!Class4535.field19965.method13606(this.field25383, class1977)) {
            if (class1976 == Class1976.field10948) {
                if (Class4535.field19958.method13589(this.field25383, class1977)) {
                    return Class4535.field19958.method13530();
                }
                if (Class4535.field19967.method13589(this.field25383, class1977)) {
                    return Class4535.field19967.method13530();
                }
            }
        }
        else {
            if (class1976 == Class1976.field10948) {
                return Class4535.field19965.method13530();
            }
            if (class1976 == Class1976.field10949) {
                return Class4535.field19965.method13531();
            }
        }
        return super.method18866(class1976, class1977);
    }
    
    @Override
    public void method18870(final Class1849 class1849, final boolean b, final boolean b2) {
        this.field25379.method26227(class1849, b, b2);
        this.field25380.method29087(class1849, b, b2);
        this.field25381.method29217(class1849, b, b2);
        this.field25382.method29680(class1849, b, b2);
    }
    
    @Override
    public int method18852() {
        return this.field25383.method6743() + 1;
    }
    
    @Override
    public int method18853() {
        return 63;
    }
    
    static {
        field25376 = Class8349.method27851(new float[25], array -> {
            int i = 0;
            while (i <= 2) {
                int j = 0;
                while (j <= 2) {
                    array[i + 2 + (j + 2) * 5] = 10.0f / MathHelper.method35640(i * i + j * j + 0.2f);
                    ++j;
                }
                ++i;
            }
        });
    }
}
