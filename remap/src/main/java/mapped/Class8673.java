// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Future;

public class Class8673
{
    private final int field36461;
    private final long field36462;
    private int[] field36463;
    private Class15 field36464;
    private float[] field36465;
    private Class22 field36466;
    private int field36467;
    private long field36468;
    private int field36469;
    private long field36470;
    private boolean field36471;
    private Class7978 field36472;
    private static final float field36473 = 3.1415927f;
    private final boolean field36474;
    
    public Class8673(final long field36462) {
        this.field36471 = false;
        if (field36462 >= 1L) {
            this.field36474 = (Class9133.method33168() || field36462 > Class11.method177());
            this.field36461 = (int)field36462;
            this.field36462 = field36462;
            if (this.field36474) {
                if (!Class9133.method33175(field36462)) {
                    this.field36466 = this.method29698(field36462);
                    this.field36472 = new Class7978(2L * field36462);
                }
                else {
                    this.field36471 = true;
                    this.field36464 = new Class15((long)Class7640.method24124((double)(2L + (1L << (int)((long)(Class7640.method24089(field36462 / 2L + 0.5) / Class7640.method24089(2.0)) / 2L)))));
                    this.field36466 = new Class22(this.field36462 * 5L / 4L);
                    this.field36468 = this.field36464.method133(0L);
                    if (field36462 > this.field36468 << 2) {
                        Class9133.method33186(this.field36468 = this.field36462 >> 2, this.field36464, this.field36466);
                    }
                    this.field36470 = this.field36464.method133(1L);
                    if (field36462 > this.field36470) {
                        Class9133.method33184(this.field36470 = this.field36462, this.field36466, this.field36468, this.field36464);
                    }
                }
            }
            else {
                if (field36462 > 268435456L) {
                    throw new IllegalArgumentException("n must be smaller or equal to 268435456 when useLargeArrays argument is set to false");
                }
                if (!Class9133.method33175(field36462)) {
                    this.field36465 = this.method29697(this.field36461);
                    this.field36472 = new Class7978(2L * field36462);
                }
                else {
                    this.field36471 = true;
                    this.field36463 = new int[(int)Class7640.method24124(2 + (1 << (int)(Class7640.method24089(field36462 / 2L + 0.5) / Class7640.method24089(2.0)) / 2))];
                    this.field36465 = new float[this.field36461 * 5 / 4];
                    this.field36467 = this.field36463[0];
                    if (field36462 > (long) this.field36467 << 2) {
                        Class9133.method33185(this.field36467 = this.field36461 >> 2, this.field36463, this.field36465);
                    }
                    this.field36469 = this.field36463[1];
                    if (field36462 > this.field36469) {
                        Class9133.method33183(this.field36469 = this.field36461, this.field36465, this.field36467, this.field36463);
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException("n must be greater than 0");
    }
    
    public void method29689(final float[] array, final boolean b) {
        this.method29691(array, 0, b);
    }
    
    public void method29690(final Class22 class22, final boolean b) {
        this.method29692(class22, 0L, b);
    }
    
    public void method29691(final float[] array, final int n, final boolean b) {
        if (this.field36461 == 1) {
            return;
        }
        if (this.field36474) {
            this.method29692(new Class22(array), n, b);
        }
        else if (this.field36471) {
            final float n2 = array[n + this.field36461 - 1];
            for (int i = this.field36461 - 2; i >= 2; i -= 2) {
                array[n + i + 1] = array[n + i] - array[n + i - 1];
                final int n3 = n + i;
                array[n3] += array[n + i - 1];
            }
            array[n + 1] = array[n] - n2;
            array[n] += n2;
            if (this.field36461 > 4) {
                method29701(this.field36461, array, n, this.field36469, this.field36465, this.field36467);
                Class9133.method33247(this.field36461, array, n, this.field36463, this.field36467, this.field36465);
            }
            else if (this.field36461 == 4) {
                Class9133.method33247(this.field36461, array, n, this.field36463, this.field36467, this.field36465);
            }
            Class9133.method33301(this.field36461, array, n, this.field36469, this.field36465, this.field36467);
            if (b) {
                Class9133.method33305(this.field36461, (float)Class7640.method24071(2.0 / this.field36461), array, n, false);
                array[n] /= (float)Class7640.method24071(2.0);
            }
        }
        else {
            final int n4 = 2 * this.field36461;
            final float[] array2 = new float[n4];
            System.arraycopy(array, n, array2, 0, this.field36461);
            final int method27224 = Class8216.method27224();
            for (int j = this.field36461; j < n4; ++j) {
                array2[j] = array2[n4 - j - 1];
            }
            this.field36472.method25933(array2);
            if (method27224 > 1 && this.field36461 > Class9133.method33158()) {
                final int n5 = 2;
                final int n6 = this.field36461 / n5;
                final Future[] array3 = new Future[n5];
                for (int k = 0; k < n5; ++k) {
                    final int n7 = k * n6;
                    array3[k] = Class8216.method27227(new Class1118(this, n7, (k == n5 - 1) ? this.field36461 : (n7 + n6), n, array, array2));
                }
                try {
                    Class8216.method27228(array3);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class8673.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class8673.class.getName()).log(Level.SEVERE, null, thrown2);
                }
            }
            else {
                for (int l = 0; l < this.field36461; ++l) {
                    final int n8 = 2 * l;
                    array[n + l] = this.field36465[n8] * array2[n8] - this.field36465[n8 + 1] * array2[n8 + 1];
                }
            }
            if (b) {
                Class9133.method33305(this.field36461, 1.0f / (float)Class7640.method24071(n4), array, n, false);
                array[n] /= (float)Class7640.method24071(2.0);
            }
        }
    }
    
    public void method29692(final Class22 class22, final long n, final boolean b) {
        if (this.field36462 == 1L) {
            return;
        }
        if (!this.field36474) {
            if (class22.method173() || class22.method175() || n >= 2147483647L) {
                throw new IllegalArgumentException("The data array is too big.");
            }
            this.method29691(class22.method230(), (int)n, b);
        }
        else if (this.field36471) {
            final float method135 = class22.method135(n + this.field36462 - 1L);
            for (long n2 = this.field36462 - 2L; n2 >= 2L; n2 -= 2L) {
                class22.method169(n + n2 + 1L, class22.method135(n + n2) - class22.method135(n + n2 - 1L));
                class22.method169(n + n2, class22.method135(n + n2) + class22.method135(n + n2 - 1L));
            }
            class22.method169(n + 1L, class22.method135(n) - method135);
            class22.method169(n, class22.method135(n) + method135);
            if (this.field36462 > 4L) {
                method29702(this.field36462, class22, n, this.field36470, this.field36466, this.field36468);
                Class9133.method33248(this.field36462, class22, n, this.field36464, this.field36468, this.field36466);
            }
            else if (this.field36462 == 4L) {
                Class9133.method33248(this.field36462, class22, n, this.field36464, this.field36468, this.field36466);
            }
            Class9133.method33302(this.field36462, class22, n, this.field36470, this.field36466, this.field36468);
            if (b) {
                Class9133.method33306(this.field36462, (float)Class7640.method24071(2.0 / this.field36462), class22, n, false);
                class22.method169(n, class22.method135(n) / (float)Class7640.method24071(2.0));
            }
        }
        else {
            final long n3 = 2L * this.field36462;
            final Class22 class23 = new Class22(n3);
            Class8601.method29152(class22, n, class23, 0L, this.field36462);
            final int method136 = Class8216.method27224();
            for (long field36462 = this.field36462; field36462 < n3; ++field36462) {
                class23.method169(field36462, class23.method135(n3 - field36462 - 1L));
            }
            this.field36472.method25934(class23);
            if (method136 > 1 && this.field36462 > Class9133.method33158()) {
                final int n4 = 2;
                final long n5 = this.field36462 / n4;
                final Future[] array = new Future[n4];
                for (int i = 0; i < n4; ++i) {
                    final long n6 = i * n5;
                    array[i] = Class8216.method27227(new Class1044(this, n6, (i == n4 - 1) ? this.field36462 : (n6 + n5), n, class22, class23));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class8673.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class8673.class.getName()).log(Level.SEVERE, null, thrown2);
                }
            }
            else {
                for (long n7 = 0L; n7 < this.field36462; ++n7) {
                    final long n8 = 2L * n7;
                    class22.method169(n + n7, this.field36466.method135(n8) * class23.method135(n8) - this.field36466.method135(n8 + 1L) * class23.method135(n8 + 1L));
                }
            }
            if (b) {
                Class9133.method33306(this.field36462, 1.0f / (float)Class7640.method24071((double)n3), class22, n, false);
                class22.method169(n, class22.method135(n) / (float)Class7640.method24071(2.0));
            }
        }
    }
    
    public void method29693(final float[] array, final boolean b) {
        this.method29695(array, 0, b);
    }
    
    public void method29694(final Class22 class22, final boolean b) {
        this.method29696(class22, 0L, b);
    }
    
    public void method29695(final float[] array, final int n, final boolean b) {
        if (this.field36461 == 1) {
            return;
        }
        if (this.field36474) {
            this.method29696(new Class22(array), n, b);
        }
        else if (this.field36471) {
            if (b) {
                Class9133.method33305(this.field36461, (float)Class7640.method24071(2.0 / this.field36461), array, n, false);
                array[n] /= (float)Class7640.method24071(2.0);
            }
            Class9133.method33301(this.field36461, array, n, this.field36469, this.field36465, this.field36467);
            if (this.field36461 > 4) {
                Class9133.method33245(this.field36461, array, n, this.field36463, this.field36467, this.field36465);
                method29699(this.field36461, array, n, this.field36469, this.field36465, this.field36467);
            }
            else if (this.field36461 == 4) {
                Class9133.method33245(this.field36461, array, n, this.field36463, this.field36467, this.field36465);
            }
            final float n2 = array[n] - array[n + 1];
            array[n] += array[n + 1];
            for (int i = 2; i < this.field36461; i += 2) {
                array[n + i - 1] = array[n + i] - array[n + i + 1];
                final int n3 = n + i;
                array[n3] += array[n + i + 1];
            }
            array[n + this.field36461 - 1] = n2;
        }
        else {
            final int n4 = 2 * this.field36461;
            if (b) {
                Class9133.method33305(this.field36461, (float)Class7640.method24071(n4), array, n, false);
                array[n] *= (float)Class7640.method24071(2.0);
            }
            final float[] array2 = new float[n4];
            if (Class8216.method27224() > 1 && this.field36461 > Class9133.method33158()) {
                final int n5 = 2;
                final int n6 = this.field36461 / n5;
                final Future[] array3 = new Future[n5];
                for (int j = 0; j < n5; ++j) {
                    final int n7 = j * n6;
                    array3[j] = Class8216.method27227(new Class1610(this, n7, (j == n5 - 1) ? this.field36461 : (n7 + n6), array, n, array2));
                }
                try {
                    Class8216.method27228(array3);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class8673.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class8673.class.getName()).log(Level.SEVERE, null, thrown2);
                }
            }
            else {
                for (int k = 0; k < this.field36461; ++k) {
                    final int n8 = 2 * k;
                    final float n9 = array[n + k];
                    array2[n8] = this.field36465[n8] * n9;
                    array2[n8 + 1] = -this.field36465[n8 + 1] * n9;
                }
            }
            this.field36472.method25941(array2, true);
            System.arraycopy(array2, 0, array, n, this.field36461);
        }
    }
    
    public void method29696(final Class22 class22, final long n, final boolean b) {
        if (this.field36462 == 1L) {
            return;
        }
        if (!this.field36474) {
            if (class22.method173() || class22.method175() || n >= 2147483647L) {
                throw new IllegalArgumentException("The data array is too big.");
            }
            this.method29695(class22.method230(), (int)n, b);
        }
        else if (this.field36471) {
            if (b) {
                Class9133.method33306(this.field36462, (float)Class7640.method24071(2.0 / this.field36462), class22, n, false);
                class22.method169(n, class22.method135(n) / (float)Class7640.method24071(2.0));
            }
            Class9133.method33302(this.field36462, class22, n, this.field36470, this.field36466, this.field36468);
            if (this.field36462 > 4L) {
                Class9133.method33246(this.field36462, class22, n, this.field36464, this.field36468, this.field36466);
                method29700(this.field36462, class22, n, this.field36470, this.field36466, this.field36468);
            }
            else if (this.field36462 == 4L) {
                Class9133.method33246(this.field36462, class22, n, this.field36464, this.field36468, this.field36466);
            }
            final float n2 = class22.method135(n) - class22.method135(n + 1L);
            class22.method169(n, class22.method135(n) + class22.method135(n + 1L));
            for (long n3 = 2L; n3 < this.field36462; n3 += 2L) {
                class22.method169(n + n3 - 1L, class22.method135(n + n3) - class22.method135(n + n3 + 1L));
                class22.method169(n + n3, class22.method135(n + n3) + class22.method135(n + n3 + 1L));
            }
            class22.method169(n + this.field36462 - 1L, n2);
        }
        else {
            final long n4 = 2L * this.field36462;
            if (b) {
                Class9133.method33306(this.field36462, (float)Class7640.method24071((double)n4), class22, n, false);
                class22.method169(n, class22.method135(n) * (float)Class7640.method24071(2.0));
            }
            final Class22 class23 = new Class22(n4);
            if (Class8216.method27224() > 1 && this.field36462 > Class9133.method33158()) {
                final int n5 = 2;
                final long n6 = this.field36462 / n5;
                final Future[] array = new Future[n5];
                for (int i = 0; i < n5; ++i) {
                    final long n7 = i * n6;
                    array[i] = Class8216.method27227(new Class1212(this, n7, (i == n5 - 1) ? this.field36462 : (n7 + n6), class22, n, class23));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class8673.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class8673.class.getName()).log(Level.SEVERE, null, thrown2);
                }
            }
            else {
                for (long n8 = 0L; n8 < this.field36462; ++n8) {
                    final long n9 = 2L * n8;
                    final float method135 = class22.method135(n + n8);
                    class23.method169(n9, this.field36466.method135(n9) * method135);
                    class23.method169(n9 + 1L, -this.field36466.method135(n9 + 1L) * method135);
                }
            }
            this.field36472.method25942(class23, true);
            Class8601.method29152(class23, 0L, class22, n, this.field36462);
        }
    }
    
    private float[] method29697(final int n) {
        final int n2 = 2 * n;
        final float n3 = 3.1415927f / n2;
        final float[] array = new float[n2];
        array[0] = 1.0f;
        for (int i = 1; i < n; ++i) {
            final int n4 = 2 * i;
            final float n5 = n3 * i;
            array[n4] = (float)Class7640.method24103(n5);
            array[n4 + 1] = -(float)Class7640.method24102(n5);
        }
        return array;
    }
    
    private Class22 method29698(final long n) {
        final long n2 = 2L * n;
        final float n3 = 3.1415927f / n2;
        final Class22 class22 = new Class22(n2);
        class22.method169(0L, 1.0f);
        for (long n4 = 1L; n4 < n; ++n4) {
            final long n5 = 2L * n4;
            final float n6 = n3 * n4;
            class22.method169(n5, (float)Class7640.method24103(n6));
            class22.method169(n5 + 1L, -(float)Class7640.method24102(n6));
        }
        return class22;
    }
    
    private static void method29699(final int n, final float[] array, final int n2, final int n3, final float[] array2, final int n4) {
        final int n5 = n >> 1;
        final int n6 = 2 * n3 / n5;
        int n7 = 0;
        for (int i = 2; i < n5; i += 2) {
            final int n8 = n - i;
            n7 += n6;
            final float n9 = 0.5f - array2[n4 + n3 - n7];
            final float n10 = array2[n4 + n7];
            final int n11 = n2 + i;
            final int n12 = n2 + n8;
            final float n13 = array[n11] - array[n12];
            final float n14 = array[n11 + 1] + array[n12 + 1];
            final float n15 = n9 * n13 - n10 * n14;
            final float n16 = n9 * n14 + n10 * n13;
            final int n17 = n11;
            array[n17] -= n15;
            final int n18 = n11 + 1;
            array[n18] -= n16;
            final int n19 = n12;
            array[n19] += n15;
            final int n20 = n12 + 1;
            array[n20] -= n16;
        }
    }
    
    private static void method29700(final long n, final Class22 class22, final long n2, final long n3, final Class22 class23, final long n4) {
        final long n5 = n >> 1;
        final long n6 = 2L * n3 / n5;
        long n7 = 0L;
        for (long n8 = 2L; n8 < n5; n8 += 2L) {
            final long n9 = n - n8;
            n7 += n6;
            final float n10 = 0.5f - class23.method135(n4 + n3 - n7);
            final float method135 = class23.method135(n4 + n7);
            final long n11 = n2 + n8;
            final long n12 = n2 + n9;
            final float n13 = class22.method135(n11) - class22.method135(n12);
            final float n14 = class22.method135(n11 + 1L) + class22.method135(n12 + 1L);
            final float n15 = n10 * n13 - method135 * n14;
            final float n16 = n10 * n14 + method135 * n13;
            class22.method169(n11, class22.method135(n11) - n15);
            class22.method169(n11 + 1L, class22.method135(n11 + 1L) - n16);
            class22.method169(n12, class22.method135(n12) + n15);
            class22.method169(n12 + 1L, class22.method135(n12 + 1L) - n16);
        }
    }
    
    private static void method29701(final int n, final float[] array, final int n2, final int n3, final float[] array2, final int n4) {
        final int n5 = n >> 1;
        final int n6 = 2 * n3 / n5;
        int n7 = 0;
        for (int i = 2; i < n5; i += 2) {
            final int n8 = n - i;
            n7 += n6;
            final float n9 = 0.5f - array2[n4 + n3 - n7];
            final float n10 = array2[n4 + n7];
            final int n11 = n2 + i;
            final int n12 = n2 + n8;
            final float n13 = array[n11] - array[n12];
            final float n14 = array[n11 + 1] + array[n12 + 1];
            final float n15 = n9 * n13 + n10 * n14;
            final float n16 = n9 * n14 - n10 * n13;
            final int n17 = n11;
            array[n17] -= n15;
            final int n18 = n11 + 1;
            array[n18] -= n16;
            final int n19 = n12;
            array[n19] += n15;
            final int n20 = n12 + 1;
            array[n20] -= n16;
        }
    }
    
    private static void method29702(final long n, final Class22 class22, final long n2, final long n3, final Class22 class23, final long n4) {
        final long n5 = n >> 1;
        final long n6 = 2L * n3 / n5;
        long n7 = 0L;
        for (long n8 = 2L; n8 < n5; n8 += 2L) {
            final long n9 = n - n8;
            n7 += n6;
            final float n10 = 0.5f - class23.method135(n4 + n3 - n7);
            final float method135 = class23.method135(n4 + n7);
            final long n11 = n2 + n8;
            final long n12 = n2 + n9;
            final float n13 = class22.method135(n11) - class22.method135(n12);
            final float n14 = class22.method135(n11 + 1L) + class22.method135(n12 + 1L);
            final float n15 = n10 * n13 + method135 * n14;
            final float n16 = n10 * n14 - method135 * n13;
            class22.method169(n11, class22.method135(n11) - n15);
            class22.method169(n11 + 1L, class22.method135(n11 + 1L) - n16);
            class22.method169(n12, class22.method135(n12) + n15);
            class22.method169(n12 + 1L, class22.method135(n12 + 1L) - n16);
        }
    }
}
