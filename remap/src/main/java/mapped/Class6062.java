// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Future;

public class Class6062
{
    private final int field24641;
    private final long field24642;
    private int[] field24643;
    private Class15 field24644;
    private double[] field24645;
    private Class17 field24646;
    private int field24647;
    private long field24648;
    private int field24649;
    private long field24650;
    private boolean field24651;
    private Class7992 field24652;
    private static final double field24653 = 3.141592653589793;
    private final boolean field24654;
    
    public Class6062(final long field24642) {
        this.field24651 = false;
        if (field24642 >= 1L) {
            this.field24654 = (Class9133.method33168() || field24642 > Class11.method177());
            this.field24641 = (int)field24642;
            this.field24642 = field24642;
            if (this.field24654) {
                if (!Class9133.method33175(field24642)) {
                    this.field24646 = this.method18045(field24642);
                    this.field24652 = new Class7992(2L * field24642);
                }
                else {
                    this.field24651 = true;
                    this.field24644 = new Class15((long)Class7640.method24124((double)(2L + (1L << (int)((long)(Class7640.method24089(field24642 / 2L + 0.5) / Class7640.method24089(2.0)) / 2L)))));
                    this.field24646 = new Class17(this.field24642 * 5L / 4L);
                    this.field24648 = this.field24644.method133(0L);
                    if (field24642 > this.field24648 << 2) {
                        Class9133.method33180(this.field24648 = this.field24642 >> 2, this.field24644, this.field24646);
                    }
                    this.field24650 = this.field24644.method133(1L);
                    if (field24642 > this.field24650) {
                        Class9133.method33182(this.field24650 = this.field24642, this.field24646, this.field24648, this.field24644);
                    }
                }
            }
            else {
                if (field24642 > 268435456L) {
                    throw new IllegalArgumentException("n must be smaller or equal to 268435456 when useLargeArrays argument is set to false");
                }
                if (!Class9133.method33175(field24642)) {
                    this.field24645 = this.method18044(this.field24641);
                    this.field24652 = new Class7992(2L * field24642);
                }
                else {
                    this.field24651 = true;
                    this.field24643 = new int[(int)Class7640.method24124(2 + (1 << (int)(Class7640.method24089(field24642 / 2L + 0.5) / Class7640.method24089(2.0)) / 2))];
                    this.field24645 = new double[this.field24641 * 5 / 4];
                    this.field24647 = this.field24643[0];
                    if (field24642 > (long) this.field24647 << 2) {
                        Class9133.method33179(this.field24647 = this.field24641 >> 2, this.field24643, this.field24645);
                    }
                    this.field24649 = this.field24643[1];
                    if (field24642 > this.field24649) {
                        Class9133.method33181(this.field24649 = this.field24641, this.field24645, this.field24647, this.field24643);
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException("n must be greater than 0");
    }
    
    public void method18036(final double[] array, final boolean b) {
        this.method18038(array, 0, b);
    }
    
    public void method18037(final Class17 class17, final boolean b) {
        this.method18039(class17, 0L, b);
    }
    
    public void method18038(final double[] array, final int n, final boolean b) {
        if (this.field24641 == 1) {
            return;
        }
        if (this.field24654) {
            this.method18039(new Class17(array), n, b);
        }
        else if (this.field24651) {
            final double n2 = array[n + this.field24641 - 1];
            for (int i = this.field24641 - 2; i >= 2; i -= 2) {
                array[n + i + 1] = array[n + i] - array[n + i - 1];
                final int n3 = n + i;
                array[n3] += array[n + i - 1];
            }
            array[n + 1] = array[n] - n2;
            array[n] += n2;
            if (this.field24641 > 4) {
                method18048(this.field24641, array, n, this.field24649, this.field24645, this.field24647);
                Class9133.method33189(this.field24641, array, n, this.field24643, this.field24647, this.field24645);
            }
            else if (this.field24641 == 4) {
                Class9133.method33189(this.field24641, array, n, this.field24643, this.field24647, this.field24645);
            }
            Class9133.method33243(this.field24641, array, n, this.field24649, this.field24645, this.field24647);
            if (b) {
                Class9133.method33303(this.field24641, Class7640.method24071(2.0 / this.field24641), array, n, false);
                array[n] /= Class7640.method24071(2.0);
            }
        }
        else {
            final int n4 = 2 * this.field24641;
            final double[] array2 = new double[n4];
            System.arraycopy(array, n, array2, 0, this.field24641);
            final int method27224 = Class8216.method27224();
            for (int j = this.field24641; j < n4; ++j) {
                array2[j] = array2[n4 - j - 1];
            }
            this.field24652.method26080(array2);
            if (method27224 > 1 && this.field24641 > Class9133.method33158()) {
                final int n5 = 2;
                final int n6 = this.field24641 / n5;
                final Future[] array3 = new Future[n5];
                for (int k = 0; k < n5; ++k) {
                    final int n7 = k * n6;
                    array3[k] = Class8216.method27227(new Class1200(this, n7, (k == n5 - 1) ? this.field24641 : (n7 + n6), n, array, array2));
                }
                try {
                    Class8216.method27228(array3);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class6062.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class6062.class.getName()).log(Level.SEVERE, null, thrown2);
                }
            }
            else {
                for (int l = 0; l < this.field24641; ++l) {
                    final int n8 = 2 * l;
                    array[n + l] = this.field24645[n8] * array2[n8] - this.field24645[n8 + 1] * array2[n8 + 1];
                }
            }
            if (b) {
                Class9133.method33303(this.field24641, 1.0 / Class7640.method24071(n4), array, n, false);
                array[n] /= Class7640.method24071(2.0);
            }
        }
    }
    
    public void method18039(final Class17 class17, final long n, final boolean b) {
        if (this.field24642 == 1L) {
            return;
        }
        if (!this.field24654) {
            if (class17.method173() || class17.method175() || n >= 2147483647L) {
                throw new IllegalArgumentException("The data array is too big.");
            }
            this.method18038(class17.method206(), (int)n, b);
        }
        else if (this.field24651) {
            final double method137 = class17.method137(n + this.field24642 - 1L);
            for (long n2 = this.field24642 - 2L; n2 >= 2L; n2 -= 2L) {
                class17.method171(n + n2 + 1L, class17.method137(n + n2) - class17.method137(n + n2 - 1L));
                class17.method171(n + n2, class17.method137(n + n2) + class17.method137(n + n2 - 1L));
            }
            class17.method171(n + 1L, class17.method137(n) - method137);
            class17.method171(n, class17.method137(n) + method137);
            if (this.field24642 > 4L) {
                method18049(this.field24642, class17, n, this.field24650, this.field24646, this.field24648);
                Class9133.method33190(this.field24642, class17, n, this.field24644, this.field24648, this.field24646);
            }
            else if (this.field24642 == 4L) {
                Class9133.method33190(this.field24642, class17, n, this.field24644, this.field24648, this.field24646);
            }
            Class9133.method33244(this.field24642, class17, n, this.field24650, this.field24646, this.field24648);
            if (b) {
                Class9133.method33304(this.field24642, Class7640.method24071(2.0 / this.field24642), class17, n, false);
                class17.method171(n, class17.method137(n) / Class7640.method24071(2.0));
            }
        }
        else {
            final long n3 = 2L * this.field24642;
            final Class17 class18 = new Class17(n3);
            Class8601.method29154(class17, n, class18, 0L, this.field24642);
            final int method138 = Class8216.method27224();
            for (long field24642 = this.field24642; field24642 < n3; ++field24642) {
                class18.method171(field24642, class18.method137(n3 - field24642 - 1L));
            }
            this.field24652.method26081(class18);
            if (method138 > 1 && this.field24642 > Class9133.method33158()) {
                final int n4 = 2;
                final long n5 = this.field24642 / n4;
                final Future[] array = new Future[n4];
                for (int i = 0; i < n4; ++i) {
                    final long n6 = i * n5;
                    array[i] = Class8216.method27227(new Class1254(this, n6, (i == n4 - 1) ? this.field24642 : (n6 + n5), n, class17, class18));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class6062.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class6062.class.getName()).log(Level.SEVERE, null, thrown2);
                }
            }
            else {
                for (long n7 = 0L; n7 < this.field24642; ++n7) {
                    final long n8 = 2L * n7;
                    class17.method171(n + n7, this.field24646.method137(n8) * class18.method137(n8) - this.field24646.method137(n8 + 1L) * class18.method137(n8 + 1L));
                }
            }
            if (b) {
                Class9133.method33304(this.field24642, 1.0 / Class7640.method24071((double)n3), class17, n, false);
                class17.method171(n, class17.method137(n) / Class7640.method24071(2.0));
            }
        }
    }
    
    public void method18040(final double[] array, final boolean b) {
        this.method18042(array, 0, b);
    }
    
    public void method18041(final Class17 class17, final boolean b) {
        this.method18043(class17, 0L, b);
    }
    
    public void method18042(final double[] array, final int n, final boolean b) {
        if (this.field24641 == 1) {
            return;
        }
        if (this.field24654) {
            this.method18043(new Class17(array), n, b);
        }
        else if (this.field24651) {
            if (b) {
                Class9133.method33303(this.field24641, Class7640.method24071(2.0 / this.field24641), array, n, false);
                array[n] /= Class7640.method24071(2.0);
            }
            Class9133.method33243(this.field24641, array, n, this.field24649, this.field24645, this.field24647);
            if (this.field24641 > 4) {
                Class9133.method33187(this.field24641, array, n, this.field24643, this.field24647, this.field24645);
                method18046(this.field24641, array, n, this.field24649, this.field24645, this.field24647);
            }
            else if (this.field24641 == 4) {
                Class9133.method33187(this.field24641, array, n, this.field24643, this.field24647, this.field24645);
            }
            final double n2 = array[n] - array[n + 1];
            array[n] += array[n + 1];
            for (int i = 2; i < this.field24641; i += 2) {
                array[n + i - 1] = array[n + i] - array[n + i + 1];
                final int n3 = n + i;
                array[n3] += array[n + i + 1];
            }
            array[n + this.field24641 - 1] = n2;
        }
        else {
            final int n4 = 2 * this.field24641;
            if (b) {
                Class9133.method33303(this.field24641, Class7640.method24071(n4), array, n, false);
                array[n] *= Class7640.method24071(2.0);
            }
            final double[] array2 = new double[n4];
            if (Class8216.method27224() > 1 && this.field24641 > Class9133.method33158()) {
                final int n5 = 2;
                final int n6 = this.field24641 / n5;
                final Future[] array3 = new Future[n5];
                for (int j = 0; j < n5; ++j) {
                    final int n7 = j * n6;
                    array3[j] = Class8216.method27227(new Class1237(this, n7, (j == n5 - 1) ? this.field24641 : (n7 + n6), array, n, array2));
                }
                try {
                    Class8216.method27228(array3);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class6062.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class6062.class.getName()).log(Level.SEVERE, null, thrown2);
                }
            }
            else {
                for (int k = 0; k < this.field24641; ++k) {
                    final int n8 = 2 * k;
                    final double n9 = array[n + k];
                    array2[n8] = this.field24645[n8] * n9;
                    array2[n8 + 1] = -this.field24645[n8 + 1] * n9;
                }
            }
            this.field24652.method26088(array2, true);
            System.arraycopy(array2, 0, array, n, this.field24641);
        }
    }
    
    public void method18043(final Class17 class17, final long n, final boolean b) {
        if (this.field24642 == 1L) {
            return;
        }
        if (!this.field24654) {
            if (class17.method173() || class17.method175() || n >= 2147483647L) {
                throw new IllegalArgumentException("The data array is too big.");
            }
            this.method18042(class17.method206(), (int)n, b);
        }
        else if (this.field24651) {
            if (b) {
                Class9133.method33304(this.field24642, Class7640.method24071(2.0 / this.field24642), class17, n, false);
                class17.method171(n, class17.method137(n) / Class7640.method24071(2.0));
            }
            Class9133.method33244(this.field24642, class17, n, this.field24650, this.field24646, this.field24648);
            if (this.field24642 > 4L) {
                Class9133.method33188(this.field24642, class17, n, this.field24644, this.field24648, this.field24646);
                method18047(this.field24642, class17, n, this.field24650, this.field24646, this.field24648);
            }
            else if (this.field24642 == 4L) {
                Class9133.method33188(this.field24642, class17, n, this.field24644, this.field24648, this.field24646);
            }
            final double n2 = class17.method137(n) - class17.method137(n + 1L);
            class17.method171(n, class17.method137(n) + class17.method137(n + 1L));
            for (long n3 = 2L; n3 < this.field24642; n3 += 2L) {
                class17.method171(n + n3 - 1L, class17.method137(n + n3) - class17.method137(n + n3 + 1L));
                class17.method171(n + n3, class17.method137(n + n3) + class17.method137(n + n3 + 1L));
            }
            class17.method171(n + this.field24642 - 1L, n2);
        }
        else {
            final long n4 = 2L * this.field24642;
            if (b) {
                Class9133.method33304(this.field24642, Class7640.method24071((double)n4), class17, n, false);
                class17.method171(n, class17.method137(n) * Class7640.method24071(2.0));
            }
            final Class17 class18 = new Class17(n4);
            if (Class8216.method27224() > 1 && this.field24642 > Class9133.method33158()) {
                final int n5 = 2;
                final long n6 = this.field24642 / n5;
                final Future[] array = new Future[n5];
                for (int i = 0; i < n5; ++i) {
                    final long n7 = i * n6;
                    array[i] = Class8216.method27227(new Class1409(this, n7, (i == n5 - 1) ? this.field24642 : (n7 + n6), class17, n, class18));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class6062.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class6062.class.getName()).log(Level.SEVERE, null, thrown2);
                }
            }
            else {
                for (long n8 = 0L; n8 < this.field24642; ++n8) {
                    final long n9 = 2L * n8;
                    final double method137 = class17.method137(n + n8);
                    class18.method171(n9, this.field24646.method137(n9) * method137);
                    class18.method171(n9 + 1L, -this.field24646.method137(n9 + 1L) * method137);
                }
            }
            this.field24652.method26089(class18, true);
            Class8601.method29154(class18, 0L, class17, n, this.field24642);
        }
    }
    
    private double[] method18044(final int n) {
        final int n2 = 2 * n;
        final double n3 = 3.141592653589793 / n2;
        final double[] array = new double[n2];
        array[0] = 1.0;
        for (int i = 1; i < n; ++i) {
            final int n4 = 2 * i;
            final double n5 = n3 * i;
            array[n4] = Class7640.method24103(n5);
            array[n4 + 1] = -Class7640.method24102(n5);
        }
        return array;
    }
    
    private Class17 method18045(final long n) {
        final long n2 = 2L * n;
        final double n3 = 3.141592653589793 / n2;
        final Class17 class17 = new Class17(n2);
        class17.method171(0L, 1.0);
        for (long n4 = 1L; n4 < n; ++n4) {
            final long n5 = 2L * n4;
            final double n6 = n3 * n4;
            class17.method171(n5, Class7640.method24103(n6));
            class17.method171(n5 + 1L, -Class7640.method24102(n6));
        }
        return class17;
    }
    
    private static void method18046(final int n, final double[] array, final int n2, final int n3, final double[] array2, final int n4) {
        final int n5 = n >> 1;
        final int n6 = 2 * n3 / n5;
        int n7 = 0;
        for (int i = 2; i < n5; i += 2) {
            final int n8 = n - i;
            n7 += n6;
            final double n9 = 0.5 - array2[n4 + n3 - n7];
            final double n10 = array2[n4 + n7];
            final int n11 = n2 + i;
            final int n12 = n2 + n8;
            final double n13 = array[n11] - array[n12];
            final double n14 = array[n11 + 1] + array[n12 + 1];
            final double n15 = n9 * n13 - n10 * n14;
            final double n16 = n9 * n14 + n10 * n13;
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
    
    private static void method18047(final long n, final Class17 class17, final long n2, final long n3, final Class17 class18, final long n4) {
        final long n5 = n >> 1;
        final long n6 = 2L * n3 / n5;
        long n7 = 0L;
        for (long n8 = 2L; n8 < n5; n8 += 2L) {
            final long n9 = n - n8;
            n7 += n6;
            final double n10 = 0.5 - class18.method137(n4 + n3 - n7);
            final double method137 = class18.method137(n4 + n7);
            final long n11 = n2 + n8;
            final long n12 = n2 + n9;
            final double n13 = class17.method137(n11) - class17.method137(n12);
            final double n14 = class17.method137(n11 + 1L) + class17.method137(n12 + 1L);
            final double n15 = n10 * n13 - method137 * n14;
            final double n16 = n10 * n14 + method137 * n13;
            class17.method171(n11, class17.method137(n11) - n15);
            class17.method171(n11 + 1L, class17.method137(n11 + 1L) - n16);
            class17.method171(n12, class17.method137(n12) + n15);
            class17.method171(n12 + 1L, class17.method137(n12 + 1L) - n16);
        }
    }
    
    private static void method18048(final int n, final double[] array, final int n2, final int n3, final double[] array2, final int n4) {
        final int n5 = n >> 1;
        final int n6 = 2 * n3 / n5;
        int n7 = 0;
        for (int i = 2; i < n5; i += 2) {
            final int n8 = n - i;
            n7 += n6;
            final double n9 = 0.5 - array2[n4 + n3 - n7];
            final double n10 = array2[n4 + n7];
            final int n11 = n2 + i;
            final int n12 = n2 + n8;
            final double n13 = array[n11] - array[n12];
            final double n14 = array[n11 + 1] + array[n12 + 1];
            final double n15 = n9 * n13 + n10 * n14;
            final double n16 = n9 * n14 - n10 * n13;
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
    
    private static void method18049(final long n, final Class17 class17, final long n2, final long n3, final Class17 class18, final long n4) {
        final long n5 = n >> 1;
        final long n6 = 2L * n3 / n5;
        long n7 = 0L;
        for (long n8 = 2L; n8 < n5; n8 += 2L) {
            final long n9 = n - n8;
            n7 += n6;
            final double n10 = 0.5 - class18.method137(n4 + n3 - n7);
            final double method137 = class18.method137(n4 + n7);
            final long n11 = n2 + n8;
            final long n12 = n2 + n9;
            final double n13 = class17.method137(n11) - class17.method137(n12);
            final double n14 = class17.method137(n11 + 1L) + class17.method137(n12 + 1L);
            final double n15 = n10 * n13 + method137 * n14;
            final double n16 = n10 * n14 - method137 * n13;
            class17.method171(n11, class17.method137(n11) - n15);
            class17.method171(n11 + 1L, class17.method137(n11 + 1L) - n16);
            class17.method171(n12, class17.method137(n12) + n15);
            class17.method171(n12 + 1L, class17.method137(n12 + 1L) - n16);
        }
    }
}
