// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public abstract class Class2400 implements Serializable
{
    public float[] field14212;
    public float[] field14213;
    public float field14214;
    public float field14215;
    public float field14216;
    public float field14217;
    public float field14218;
    public float field14219;
    public float field14220;
    public boolean field14221;
    public transient Class2422 field14222;
    public boolean field14223;
    
    public Class2400() {
        this.field14221 = true;
    }
    
    public void method9518(final float n, final float n2) {
        this.method9522(n);
        this.method9523(n2);
    }
    
    public abstract Class2400 method9519(final Class7310 p0);
    
    public abstract void method9520();
    
    public float method9521() {
        return this.field14214;
    }
    
    public void method9522(float field14214) {
        if (field14214 != this.field14214) {
            final float n = field14214 - this.field14214;
            this.field14214 = field14214;
            if (this.field14212 == null || this.field14213 == null) {
                this.method9552();
            }
            for (int i = 0; i < this.field14212.length / 2; ++i) {
                final float[] field14215 = this.field14212;
                final int n2 = i * 2;
                field14215[n2] += n;
            }
            final float[] field14216 = this.field14213;
            final int n3 = 0;
            field14216[n3] += n;
            field14214 += n;
            this.field14216 += n;
            this.field14218 += n;
            this.field14223 = true;
        }
    }
    
    public void method9523(float field14215) {
        if (field14215 != this.field14215) {
            final float n = field14215 - this.field14215;
            this.field14215 = field14215;
            if (this.field14212 == null || this.field14213 == null) {
                this.method9552();
            }
            for (int i = 0; i < this.field14212.length / 2; ++i) {
                final float[] field14216 = this.field14212;
                final int n2 = i * 2 + 1;
                field14216[n2] += n;
            }
            final float[] field14217 = this.field14213;
            final int n3 = 1;
            field14217[n3] += n;
            field14215 += n;
            this.field14217 += n;
            this.field14219 += n;
            this.field14223 = true;
        }
    }
    
    public float method9524() {
        return this.field14215;
    }
    
    public void method9525(final Class2412 class2412) {
        this.method9522(class2412.field14278);
        this.method9523(class2412.field14279);
    }
    
    public float method9526() {
        this.method9552();
        return this.field14213[0];
    }
    
    public void method9527(final float n) {
        if (this.field14212 == null || this.field14213 == null) {
            this.method9552();
        }
        this.method9522(this.field14214 + (n - this.method9526()));
    }
    
    public float method9528() {
        this.method9552();
        return this.field14213[1];
    }
    
    public void method9529(final float n) {
        if (this.field14212 == null || this.field14213 == null) {
            this.method9552();
        }
        this.method9523(this.field14215 + (n - this.method9528()));
    }
    
    public float method9530() {
        this.method9552();
        return this.field14216;
    }
    
    public float method9531() {
        this.method9552();
        return this.field14217;
    }
    
    public float method9532() {
        this.method9552();
        return this.field14218;
    }
    
    public float method9533() {
        this.method9552();
        return this.field14219;
    }
    
    public float method9534() {
        this.method9552();
        return this.field14220;
    }
    
    public float[] method9535() {
        this.method9552();
        return this.field14213;
    }
    
    public float[] method9536() {
        this.method9552();
        return this.field14212;
    }
    
    public int method9537() {
        this.method9552();
        return this.field14212.length / 2;
    }
    
    public float[] method9538(final int n) {
        this.method9552();
        return new float[] { this.field14212[n * 2], this.field14212[n * 2 + 1] };
    }
    
    public float[] method9539(final int n) {
        final float[] method9538 = this.method9538(n);
        final float[] method9539 = this.method9538((n - 1 >= 0) ? (n - 1) : (this.method9537() - 1));
        final float[] method9540 = this.method9538((n + 1 < this.method9537()) ? (n + 1) : 0);
        final float[] method9541 = this.method9541(method9539, method9538);
        final float[] method9542 = this.method9541(method9538, method9540);
        if (n == 0 && !this.method9554()) {
            return method9542;
        }
        if (n == this.method9537() - 1 && !this.method9554()) {
            return method9541;
        }
        final float n2 = (method9541[0] + method9542[0]) / 2.0f;
        final float n3 = (method9541[1] + method9542[1]) / 2.0f;
        final float n4 = (float)Math.sqrt(n2 * n2 + n3 * n3);
        return new float[] { n2 / n4, n3 / n4 };
    }
    
    public boolean method9540(final Class2400 class2400) {
        if (!class2400.method9545(this)) {
            for (int i = 0; i < class2400.method9537(); ++i) {
                final float[] method9538 = class2400.method9538(i);
                if (!this.method9544(method9538[0], method9538[1])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    private float[] method9541(final float[] array, final float[] array2) {
        final float n = array[0] - array2[0];
        final float n2 = array[1] - array2[1];
        final float n3 = (float)Math.sqrt(n * n + n2 * n2);
        return new float[] { -(n2 / n3), n / n3 };
    }
    
    public boolean method9542(final float n, final float n2) {
        if (this.field14212.length != 0) {
            this.method9552();
            final Class2402 class2402 = new Class2402(0.0f, 0.0f, 0.0f, 0.0f);
            final Class2412 class2403 = new Class2412(n, n2);
            for (int i = 0; i < this.field14212.length; i += 2) {
                int n3 = i + 2;
                if (n3 >= this.field14212.length) {
                    n3 = 0;
                }
                class2402.method9573(this.field14212[i], this.field14212[i + 1], this.field14212[n3], this.field14212[n3 + 1]);
                if (class2402.method9581(class2403)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    public int method9543(final float n, final float n2) {
        for (int i = 0; i < this.field14212.length; i += 2) {
            if (this.field14212[i] == n && this.field14212[i + 1] == n2) {
                return i / 2;
            }
        }
        return -1;
    }
    
    public boolean method9544(final float n, final float n2) {
        this.method9552();
        if (this.field14212.length != 0) {
            boolean b = false;
            final int length = this.field14212.length;
            float n3 = this.field14212[length - 2];
            float n4 = this.field14212[length - 1];
            for (int i = 0; i < length; i += 2) {
                final float n5 = this.field14212[i];
                final float n6 = this.field14212[i + 1];
                float n7;
                float n8;
                float n9;
                float n10;
                if (n5 <= n3) {
                    n7 = n5;
                    n8 = n3;
                    n9 = n6;
                    n10 = n4;
                }
                else {
                    n7 = n3;
                    n8 = n5;
                    n9 = n4;
                    n10 = n6;
                }
                if (n5 < n == n <= n3) {
                    if ((n2 - (double)n9) * (n8 - n7) < (n10 - (double)n9) * (n - n7)) {
                        b = !b;
                    }
                }
                n3 = n5;
                n4 = n6;
            }
            return b;
        }
        return false;
    }
    
    public boolean method9545(final Class2400 class2400) {
        this.method9552();
        boolean b = false;
        final float[] method9536 = this.method9536();
        final float[] method9537 = class2400.method9536();
        int length = method9536.length;
        int length2 = method9537.length;
        if (!this.method9554()) {
            length -= 2;
        }
        if (!class2400.method9554()) {
            length2 -= 2;
        }
        for (int i = 0; i < length; i += 2) {
            int n = i + 2;
            if (n >= method9536.length) {
                n = 0;
            }
            for (int j = 0; j < length2; j += 2) {
                int n2 = j + 2;
                if (n2 >= method9537.length) {
                    n2 = 0;
                }
                final double n3 = ((method9536[n] - method9536[i]) * (double)(method9537[j + 1] - method9536[i + 1]) - (method9536[n + 1] - method9536[i + 1]) * (method9537[j] - method9536[i])) / ((method9536[n + 1] - method9536[i + 1]) * (method9537[n2] - method9537[j]) - (method9536[n] - method9536[i]) * (method9537[n2 + 1] - method9537[j + 1]));
                final double n4 = ((method9537[n2] - method9537[j]) * (double)(method9537[j + 1] - method9536[i + 1]) - (method9537[n2 + 1] - method9537[j + 1]) * (method9537[j] - method9536[i])) / ((method9536[n + 1] - method9536[i + 1]) * (method9537[n2] - method9537[j]) - (method9536[n] - method9536[i]) * (method9537[n2 + 1] - method9537[j + 1]));
                if (n3 >= 0.0) {
                    if (n3 <= 1.0) {
                        if (n4 >= 0.0) {
                            if (n4 <= 1.0) {
                                b = true;
                                break;
                            }
                        }
                    }
                }
            }
            if (b) {
                break;
            }
        }
        return b;
    }
    
    public boolean method9546(final float n, final float n2) {
        if (this.field14212.length != 0) {
            this.method9552();
            for (int i = 0; i < this.field14212.length; i += 2) {
                if (this.field14212[i] == n && this.field14212[i + 1] == n2) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    public void method9547() {
        this.field14213 = new float[] { 0.0f, 0.0f };
        final int length = this.field14212.length;
        for (int i = 0; i < length; i += 2) {
            final float[] field14213 = this.field14213;
            final int n = 0;
            field14213[n] += this.field14212[i];
            final float[] field14214 = this.field14213;
            final int n2 = 1;
            field14214[n2] += this.field14212[i + 1];
        }
        final float[] field14215 = this.field14213;
        final int n3 = 0;
        field14215[n3] /= length / 2;
        final float[] field14216 = this.field14213;
        final int n4 = 1;
        field14216[n4] /= length / 2;
    }
    
    public void method9548() {
        this.field14220 = 0.0f;
        for (int i = 0; i < this.field14212.length; i += 2) {
            final float n = (this.field14212[i] - this.field14213[0]) * (this.field14212[i] - this.field14213[0]) + (this.field14212[i + 1] - this.field14213[1]) * (this.field14212[i + 1] - this.field14213[1]);
            this.field14220 = ((this.field14220 <= n) ? n : this.field14220);
        }
        this.field14220 = (float)Math.sqrt(this.field14220);
    }
    
    public void method9549() {
        if (!this.field14223 && this.field14222 != null) {
            return;
        }
        if (this.field14212.length >= 6) {
            float n = 0.0f;
            for (int i = 0; i < this.field14212.length / 2 - 1; ++i) {
                n += this.field14212[i * 2] * this.field14212[i * 2 + 3] - this.field14212[i * 2 + 1] * this.field14212[i * 2 + 2];
            }
            final boolean b = n / 2.0f > 0.0f;
            this.field14222 = new Class2426();
            for (int j = 0; j < this.field14212.length; j += 2) {
                this.field14222.method9735(this.field14212[j], this.field14212[j + 1]);
            }
            this.field14222.method9737();
        }
        this.field14223 = false;
    }
    
    public void method9550() {
        this.method9552();
        this.method9549();
        this.field14222 = new Class2423(this.field14222);
    }
    
    public Class2422 method9551() {
        this.method9552();
        this.method9549();
        return this.field14222;
    }
    
    public final void method9552() {
        if (this.field14221) {
            this.method9520();
            this.method9547();
            this.method9548();
            if (this.field14212.length > 0) {
                this.field14216 = this.field14212[0];
                this.field14217 = this.field14212[1];
                this.field14218 = this.field14212[0];
                this.field14219 = this.field14212[1];
                for (int i = 0; i < this.field14212.length / 2; ++i) {
                    this.field14216 = Math.max(this.field14212[i * 2], this.field14216);
                    this.field14217 = Math.max(this.field14212[i * 2 + 1], this.field14217);
                    this.field14218 = Math.min(this.field14212[i * 2], this.field14218);
                    this.field14219 = Math.min(this.field14212[i * 2 + 1], this.field14219);
                }
            }
            this.field14221 = false;
            this.field14223 = true;
        }
    }
    
    public void method9553() {
        this.method9552();
        this.method9551();
    }
    
    public boolean method9554() {
        return true;
    }
    
    public Class2400 method9555() {
        final Class2410 class2410 = new Class2410();
        for (int i = 0; i < this.method9537(); ++i) {
            final int n = (i + 1 < this.method9537()) ? (i + 1) : 0;
            final int n2 = (i - 1 >= 0) ? (i - 1) : (this.method9537() - 1);
            final float n3 = this.method9538(i)[0] - this.method9538(n2)[0];
            final float n4 = this.method9538(i)[1] - this.method9538(n2)[1];
            final float n5 = this.method9538(n)[0] - this.method9538(i)[0];
            final float n6 = this.method9538(n)[1] - this.method9538(i)[1];
            final float n7 = (float)Math.sqrt(n3 * n3 + n4 * n4);
            final float n8 = (float)Math.sqrt(n5 * n5 + n6 * n6);
            final float n9 = n3 / n7;
            final float n10 = n4 / n7;
            final float n11 = n5 / n8;
            final float n12 = n6 / n8;
            if (n9 != n11 || n10 != n12) {
                class2410.method9617(this.method9538(i)[0], this.method9538(i)[1]);
            }
        }
        return class2410;
    }
    
    public Class2400[] method9556(final Class2400 class2400) {
        return new Class8858().method31013(this, class2400);
    }
    
    public Class2400[] method9557(final Class2400 class2400) {
        return new Class8858().method31016(this, class2400);
    }
    
    public float method9558() {
        return this.field14216 - this.field14218;
    }
    
    public float method9559() {
        return this.field14217 - this.field14219;
    }
}
