// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2425 implements Class2422
{
    private static final float field14338 = 1.0E-10f;
    private final Class8031 field14339;
    private final Class8031 field14340;
    private boolean field14341;
    
    public Class2425() {
        this.field14339 = new Class8031(this);
        this.field14340 = new Class8031(this);
    }
    
    @Override
    public void method9735(final float n, final float n2) {
        final Class9579 class9579 = new Class9579(this, n, n2);
        if (!this.field14339.method26338(class9579)) {
            this.field14339.method26339(class9579);
        }
    }
    
    public int method9747() {
        return this.field14339.method26341();
    }
    
    public float[] method9748(final int n) {
        return new float[] { Class9579.method35884(this.field14339.method26342(n)), Class9579.method35885(this.field14339.method26342(n)) };
    }
    
    @Override
    public boolean method9737() {
        this.field14341 = true;
        return this.method9752(this.field14339, this.field14340);
    }
    
    @Override
    public int method9733() {
        if (this.field14341) {
            return this.field14340.method26341() / 3;
        }
        throw new RuntimeException("Call triangulate() before accessing triangles");
    }
    
    @Override
    public float[] method9734(final int n, final int n2) {
        if (this.field14341) {
            return this.field14340.method26342(n * 3 + n2).method35883();
        }
        throw new RuntimeException("Call triangulate() before accessing triangles");
    }
    
    private float method9749(final Class8031 class8031) {
        final int method26341 = class8031.method26341();
        float n = 0.0f;
        int n2 = method26341 - 1;
        for (int i = 0; i < method26341; n2 = i++) {
            final Class9579 method26342 = class8031.method26342(n2);
            final Class9579 method26343 = class8031.method26342(i);
            n += method26342.method35881() * method26343.method35882() - method26343.method35881() * method26342.method35882();
        }
        return n * 0.5f;
    }
    
    private boolean method9750(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8) {
        final float n9 = n5 - n3;
        final float n10 = n6 - n4;
        final float n11 = n - n5;
        final float n12 = n2 - n6;
        final float n13 = n3 - n;
        final float n14 = n4 - n2;
        final float n15 = n7 - n;
        final float n16 = n8 - n2;
        final float n17 = n7 - n3;
        final float n18 = n8 - n4;
        final float n19 = n7 - n5;
        final float n20 = n8 - n6;
        final float n21 = n9 * n18 - n10 * n17;
        final float n22 = n13 * n16 - n14 * n15;
        final float n23 = n11 * n20 - n12 * n19;
        if (n21 >= 0.0f) {
            if (n23 >= 0.0f) {
                return n22 >= 0.0f;
            }
        }
        return false;
    }
    
    private boolean method9751(final Class8031 class8031, final int n, final int n2, final int n3, final int n4, final int[] array) {
        final float method35881 = class8031.method26342(array[n]).method35881();
        final float method35882 = class8031.method26342(array[n]).method35882();
        final float method35883 = class8031.method26342(array[n2]).method35881();
        final float method35884 = class8031.method26342(array[n2]).method35882();
        final float method35885 = class8031.method26342(array[n3]).method35881();
        final float method35886 = class8031.method26342(array[n3]).method35882();
        if (1.0E-10f <= (method35883 - method35881) * (method35886 - method35882) - (method35884 - method35882) * (method35885 - method35881)) {
            for (int i = 0; i < n4; ++i) {
                if (i != n) {
                    if (i != n2) {
                        if (i != n3) {
                            if (this.method9750(method35881, method35882, method35883, method35884, method35885, method35886, class8031.method26342(array[i]).method35881(), class8031.method26342(array[i]).method35882())) {
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    private boolean method9752(final Class8031 class8031, final Class8031 class8032) {
        class8032.method26343();
        final int method26341 = class8031.method26341();
        if (method26341 >= 3) {
            final int[] array = new int[method26341];
            if (0.0f >= this.method9749(class8031)) {
                for (int i = 0; i < method26341; ++i) {
                    array[i] = method26341 - 1 - i;
                }
            }
            else {
                for (int j = 0; j < method26341; ++j) {
                    array[j] = j;
                }
            }
            int k = method26341;
            int n = 2 * k;
            int n2 = 0;
            int n3 = k - 1;
            while (k > 2) {
                if (0 >= n--) {
                    return false;
                }
                int n4 = n3;
                if (k <= n4) {
                    n4 = 0;
                }
                n3 = n4 + 1;
                if (k <= n3) {
                    n3 = 0;
                }
                int n5 = n3 + 1;
                if (k <= n5) {
                    n5 = 0;
                }
                if (!this.method9751(class8031, n4, n3, n5, k, array)) {
                    continue;
                }
                final int n6 = array[n4];
                final int n7 = array[n3];
                final int n8 = array[n5];
                class8032.method26339(class8031.method26342(n6));
                class8032.method26339(class8031.method26342(n7));
                class8032.method26339(class8031.method26342(n8));
                ++n2;
                int n9 = n3;
                for (int l = n3 + 1; l < k; ++l) {
                    array[n9] = array[l];
                    ++n9;
                }
                --k;
                n = 2 * k;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public void method9736() {
    }
}
