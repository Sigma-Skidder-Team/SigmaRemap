// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8599 implements Class8598
{
    private static final int field36106 = 16;
    private static final int[][] field36107;
    private final int field36108;
    private final int[] field36109;
    private final float[] field36110;
    
    public Class8599(final int field36108) {
        if (!method29135(field36108)) {
            throw new IllegalArgumentException("N is not a power of 2");
        }
        if (field36108 > 0) {
            this.field36108 = field36108;
            final int method29132 = method29132(field36108);
            this.field36109 = new int[field36108];
            for (int i = 0; i < field36108; ++i) {
                this.field36109[i] = method29134(i, method29132);
            }
            this.field36110 = new float[field36108];
            for (int j = 0; j < field36108; ++j) {
                if (j > field36108 / 2) {
                    this.field36110[j] = -((field36108 - j) / (float)field36108);
                }
                else {
                    this.field36110[j] = (float)(j / field36108);
                }
            }
            return;
        }
        throw new IllegalArgumentException("N must be greater than 0");
    }
    
    @Override
    public float[][] method29130(final float[] array, final float[] array2) throws UnsupportedOperationException {
        final float[][] array3 = new float[2][array.length];
        this.method29131(true, array, array2, array3[0], array3[1]);
        return array3;
    }
    
    @Override
    public float[][] method29128(final float[] array) throws UnsupportedOperationException {
        final float[][] array2 = new float[3][array.length];
        this.method29131(false, array, null, array2[0], array2[1]);
        array2[2] = this.field36110.clone();
        return array2;
    }
    
    @Override
    public float[][] method29129(final float[] array, final float[] array2) throws UnsupportedOperationException {
        final float[][] array3 = new float[3][array.length];
        this.method29131(false, array, array2, array3[0], array3[1]);
        array3[2] = this.field36110.clone();
        return array3;
    }
    
    public void method29131(final boolean b, final float[] array, final float[] array2, final float[] array3, final float[] array4) {
        if (array.length == this.field36108) {
            for (int i = 0; i < this.field36108; ++i) {
                array3[this.field36109[i]] = array[i];
            }
            if (array2 != null) {
                for (int j = 0; j < this.field36108; ++j) {
                    array4[this.field36109[j]] = array2[j];
                }
            }
            int n = 1;
            double n2;
            if (!b) {
                n2 = 6.283185307179586;
            }
            else {
                n2 = -6.283185307179586;
            }
            for (int k = 2; k <= this.field36108; k <<= 1) {
                final double n3 = n2 / (float)k;
                final double n4 = -Math.sin(-2.0 * n3);
                final double n5 = -Math.sin(-n3);
                final double cos = Math.cos(-2.0 * n3);
                final double cos2 = Math.cos(-n3);
                final double n6 = 2.0 * cos2;
                for (int l = 0; l < this.field36108; l += k) {
                    double n7 = cos;
                    double n8 = cos2;
                    double n9 = n4;
                    double n10 = n5;
                    int n11 = l;
                    for (int n12 = 0; n12 < n; ++n12) {
                        final double n13 = n6 * n8 - n7;
                        n7 = n8;
                        n8 = n13;
                        final double n14 = n6 * n10 - n9;
                        n9 = n10;
                        n10 = n14;
                        final int n15 = n11 + n;
                        final double n16 = n13 * array3[n15] - n14 * array4[n15];
                        final double n17 = n13 * array4[n15] + n14 * array3[n15];
                        array3[n15] = (float)(array3[n11] - n16);
                        array4[n15] = (float)(array4[n11] - n17);
                        final int n18 = n11;
                        array3[n18] += (float)n16;
                        final int n19 = n11;
                        array4[n19] += (float)n17;
                        ++n11;
                    }
                }
                n = k;
            }
            if (b) {
                for (int n20 = 0; n20 < this.field36108; ++n20) {
                    final int n21 = n20;
                    array3[n21] /= this.field36108;
                    final int n22 = n20;
                    array4[n22] /= this.field36108;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Number of samples must be " + this.field36108 + " for this instance of JavaFFT");
    }
    
    private static int method29132(final int n) {
        int n2;
        for (n2 = 0; (n & 1 << n2) == 0x0; ++n2) {}
        return n2;
    }
    
    private static int method29133(final int n, final int n2) {
        int n3 = n;
        int n4 = 0;
        for (int i = 0; i < n2; ++i) {
            n4 = (n4 << 1 | (n3 & 0x1));
            n3 >>= 1;
        }
        return n4;
    }
    
    private static int method29134(final int n, final int n2) {
        if (n2 > 16) {
            return method29133(n, n2);
        }
        return Class8599.field36107[n2 - 1][n];
    }
    
    private static boolean method29135(final int n) {
        return (n & n - 1) == 0x0;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.field36108 == ((Class8599)o).field36108);
    }
    
    @Override
    public int hashCode() {
        return this.field36108;
    }
    
    @Override
    public String toString() {
        return "JavaFFT{N=" + this.field36108 + '}';
    }
    
    static {
        field36107 = new int[16][];
        int n = 2;
        for (int i = 1; i <= 16; ++i) {
            Class8599.field36107[i - 1] = new int[n];
            for (int j = 0; j < n; ++j) {
                Class8599.field36107[i - 1][j] = method29133(j, i);
            }
            n <<= 1;
        }
    }
}
