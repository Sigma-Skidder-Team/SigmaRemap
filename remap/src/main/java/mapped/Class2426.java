// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.newdawn.slick.geom.NeatTriangulator$InternalException;

public class Class2426 implements Class2422
{
    public static final float field14342 = 1.0E-6f;
    private float[] field14343;
    private float[] field14344;
    private int field14345;
    private Class6434[] field14346;
    private int[] field14347;
    private int field14348;
    private Class9268[] field14349;
    private int field14350;
    private float field14351;
    
    public Class2426() {
        this.field14351 = 1.0E-6f;
        this.field14343 = new float[100];
        this.field14344 = new float[100];
        this.field14345 = 0;
        this.field14346 = new Class6434[100];
        this.field14348 = 0;
        this.field14349 = new Class9268[100];
        this.field14350 = 0;
    }
    
    public void method9753() {
        this.field14345 = 0;
        this.field14348 = 0;
        this.field14350 = 0;
    }
    
    private int method9754(final int n, final int n2) {
        int n3;
        int n4;
        if (n >= n2) {
            n3 = n2;
            n4 = n;
        }
        else {
            n3 = n;
            n4 = n2;
        }
        for (int i = 0; i < this.field14348; ++i) {
            if (this.field14346[i].field25554 == n3 && this.field14346[i].field25555 == n4) {
                return i;
            }
        }
        return -1;
    }
    
    private void method9755(final int n, final int n2, final int n3) {
        final int method9754 = this.method9754(n, n2);
        Class6434 class6434;
        int field25556;
        int field25557;
        if (method9754 >= 0) {
            class6434 = this.field14346[method9754];
            field25556 = class6434.field25556;
            field25557 = class6434.field25557;
        }
        else {
            if (this.field14348 == this.field14346.length) {
                final Class6434[] field25558 = new Class6434[this.field14346.length * 2];
                System.arraycopy(this.field14346, 0, field25558, 0, this.field14348);
                this.field14346 = field25558;
            }
            field25556 = -1;
            field25557 = -1;
            final int n4 = this.field14348++;
            final Class6434[] field25559 = this.field14346;
            final int n5 = n4;
            final Class6434 class6435 = new Class6434(this);
            field25559[n5] = class6435;
            class6434 = class6435;
        }
        int field25560;
        int field25561;
        if (n >= n2) {
            field25560 = n2;
            field25561 = n;
            field25557 = n3;
        }
        else {
            field25560 = n;
            field25561 = n2;
            field25556 = n3;
        }
        class6434.field25554 = field25560;
        class6434.field25555 = field25561;
        class6434.field25556 = field25556;
        class6434.field25557 = field25557;
        class6434.field25558 = true;
    }
    
    private void method9756(final int n, final int n2) throws NeatTriangulator$InternalException {
        final int method9754;
        if (0 <= (method9754 = this.method9754(n, n2))) {
            final Class6434[] field14346 = this.field14346;
            final int n3 = method9754;
            final Class6434[] field14347 = this.field14346;
            final int field14348 = this.field14348 - 1;
            this.field14348 = field14348;
            field14346[n3] = field14347[field14348];
            return;
        }
        throw new Class2329(this, "Attempt to delete unknown edge");
    }
    
    public void method9757(final int n, final int n2, final boolean field25558) throws NeatTriangulator$InternalException {
        final int method9754;
        if (0 <= (method9754 = this.method9754(n, n2))) {
            this.field14346[method9754].field25558 = field25558;
            return;
        }
        throw new Class2329(this, "Attempt to mark unknown edge");
    }
    
    private Class6434 method9758() {
        for (int i = 0; i < this.field14348; ++i) {
            final Class6434 class6434 = this.field14346[i];
            if (class6434.field25558) {
                class6434.field25558 = false;
                if (class6434.field25556 >= 0) {
                    if (class6434.field25557 >= 0) {
                        return class6434;
                    }
                }
            }
        }
        return null;
    }
    
    private static float method9759(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        final float n7 = n5 - n3;
        final float n8 = n6 - n4;
        final float n9 = n - n5;
        final float n10 = n2 - n6;
        float n11 = n7 * n10 - n8 * n9;
        if (n11 <= 0.0f) {
            return -1.0f;
        }
        if (n11 < 1.0E-6f) {
            n11 = 1.0E-6f;
        }
        final float n12 = n7 * n7;
        final float n13 = n8 * n8;
        final float n14 = n9 * n9;
        final float n15 = n10 * n10;
        final float n16 = n3 - n;
        final float n17 = n4 - n2;
        return (n12 + n13) * (n14 + n15) * (n16 * n16 + n17 * n17) / (n11 * n11);
    }
    
    private static boolean method9760(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8) {
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
        if (n21 >= 0.0) {
            if (n23 >= 0.0) {
                return n22 >= 0.0;
            }
        }
        return false;
    }
    
    private boolean method9761(final int n, final int n2, final int n3, final int n4) {
        final float n5 = this.field14343[this.field14347[n]];
        final float n6 = this.field14344[this.field14347[n]];
        final float n7 = this.field14343[this.field14347[n2]];
        final float n8 = this.field14344[this.field14347[n2]];
        final float n9 = this.field14343[this.field14347[n3]];
        final float n10 = this.field14344[this.field14347[n3]];
        if (1.0E-6f <= (n7 - n5) * (n10 - n6) - (n8 - n6) * (n9 - n5)) {
            for (int i = 0; i < n4; ++i) {
                if (i != n) {
                    if (i != n2) {
                        if (i != n3) {
                            if (method9760(n5, n6, n7, n8, n9, n10, this.field14343[this.field14347[i]], this.field14344[this.field14347[i]])) {
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
    
    private float method9762() {
        float n = 0.0f;
        int n2 = this.field14345 - 1;
        for (int i = 0; i < this.field14345; n2 = i++) {
            n += this.field14343[n2] * this.field14344[i] - this.field14344[n2] * this.field14343[i];
        }
        return n * 0.5f;
    }
    
    public void method9763() throws NeatTriangulator$InternalException {
        int i = this.field14345;
        if (i >= 3) {
            this.field14348 = 0;
            this.field14350 = 0;
            this.field14347 = new int[i];
            if (0.0 >= this.method9762()) {
                for (int j = 0; j < i; ++j) {
                    this.field14347[j] = this.field14345 - 1 - j;
                }
            }
            else {
                for (int k = 0; k < i; ++k) {
                    this.field14347[k] = k;
                }
            }
            int n = 2 * i;
            int n2 = i - 1;
            while (i > 2) {
                if (0 >= n--) {
                    throw new Class2329(this, "Bad polygon");
                }
                int n3 = n2;
                if (i <= n3) {
                    n3 = 0;
                }
                n2 = n3 + 1;
                if (i <= n2) {
                    n2 = 0;
                }
                int n4 = n2 + 1;
                if (i <= n4) {
                    n4 = 0;
                }
                if (!this.method9761(n3, n2, n4, i)) {
                    continue;
                }
                final int n5 = this.field14347[n3];
                final int n6 = this.field14347[n2];
                final int n7 = this.field14347[n4];
                if (this.field14350 == this.field14349.length) {
                    final Class9268[] field14349 = new Class9268[this.field14349.length * 2];
                    System.arraycopy(this.field14349, 0, field14349, 0, this.field14350);
                    this.field14349 = field14349;
                }
                this.field14349[this.field14350] = new Class9268(this, n5, n6, n7);
                this.method9755(n5, n6, this.field14350);
                this.method9755(n6, n7, this.field14350);
                this.method9755(n7, n5, this.field14350);
                ++this.field14350;
                int n8 = n2;
                for (int l = n2 + 1; l < i; ++l) {
                    this.field14347[n8] = this.field14347[l];
                    ++n8;
                }
                --i;
                n = 2 * i;
            }
            this.field14347 = null;
        }
    }
    
    private void method9764() throws NeatTriangulator$InternalException {
        Class6434 method9758;
        while ((method9758 = this.method9758()) != null) {
            final int field25554 = method9758.field25554;
            final int field25555 = method9758.field25555;
            final int field25556 = method9758.field25556;
            final int field25557 = method9758.field25557;
            int n = -1;
            int n2 = -1;
            for (int i = 0; i < 3; ++i) {
                final int n3 = this.field14349[field25556].field39746[i];
                if (field25554 != n3 && field25555 != n3) {
                    n2 = n3;
                    break;
                }
            }
            for (int j = 0; j < 3; ++j) {
                final int n4 = this.field14349[field25557].field39746[j];
                if (field25554 != n4 && field25555 != n4) {
                    n = n4;
                    break;
                }
            }
            if (-1 == n || -1 == n2) {
                throw new Class2329(this, "can't find quad");
            }
            final float n5 = this.field14343[field25554];
            final float n6 = this.field14344[field25554];
            final float n7 = this.field14343[n];
            final float n8 = this.field14344[n];
            final float n9 = this.field14343[field25555];
            final float n10 = this.field14344[field25555];
            final float n11 = this.field14343[n2];
            final float n12 = this.field14344[n2];
            float method9759 = method9759(n5, n6, n7, n8, n9, n10);
            final float method9760 = method9759(n5, n6, n9, n10, n11, n12);
            float method9761 = method9759(n7, n8, n9, n10, n11, n12);
            final float method9762 = method9759(n7, n8, n11, n12, n5, n6);
            if (0.0f > method9759 || 0.0f > method9760) {
                throw new Class2329(this, "original triangles backwards");
            }
            if (0.0f > method9761) {
                continue;
            }
            if (0.0f > method9762) {
                continue;
            }
            if (method9759 > method9760) {
                method9759 = method9760;
            }
            if (method9761 > method9762) {
                method9761 = method9762;
            }
            if (method9759 <= method9761) {
                continue;
            }
            this.method9756(field25554, field25555);
            this.field14349[field25556].field39746[0] = n;
            this.field14349[field25556].field39746[1] = field25555;
            this.field14349[field25556].field39746[2] = n2;
            this.field14349[field25557].field39746[0] = n;
            this.field14349[field25557].field39746[1] = n2;
            this.field14349[field25557].field39746[2] = field25554;
            this.method9755(n, field25555, field25556);
            this.method9755(field25555, n2, field25556);
            this.method9755(n2, n, field25556);
            this.method9755(n2, field25554, field25557);
            this.method9755(field25554, n, field25557);
            this.method9755(n, n2, field25557);
            this.method9757(n, n2, false);
        }
    }
    
    @Override
    public boolean method9737() {
        try {
            this.method9763();
            return true;
        }
        catch (final Class2329 class2329) {
            this.field14348 = 0;
            return false;
        }
    }
    
    @Override
    public void method9735(final float n, float n2) {
        for (int i = 0; i < this.field14345; ++i) {
            if (this.field14343[i] == n) {
                if (this.field14344[i] == n2) {
                    n2 += this.field14351;
                    this.field14351 += 1.0E-6f;
                }
            }
        }
        if (this.field14345 == this.field14343.length) {
            final float[] field14343 = new float[this.field14345 * 2];
            System.arraycopy(this.field14343, 0, field14343, 0, this.field14345);
            this.field14343 = field14343;
            final float[] field14344 = new float[this.field14345 * 2];
            System.arraycopy(this.field14344, 0, field14344, 0, this.field14345);
            this.field14344 = field14344;
        }
        this.field14343[this.field14345] = n;
        this.field14344[this.field14345] = n2;
        ++this.field14345;
    }
    
    @Override
    public int method9733() {
        return this.field14350;
    }
    
    @Override
    public float[] method9734(final int n, final int n2) {
        return new float[] { this.field14343[this.field14349[n].field39746[n2]], this.field14344[this.field14349[n].field39746[n2]] };
    }
    
    @Override
    public void method9736() {
    }
}
