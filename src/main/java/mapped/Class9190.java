// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9190
{
    private static final int field38944 = 1;
    private static final int field38945 = 2;
    private static final int field38946 = 0;
    private static final long field38947 = 1L;
    private static final long field38948 = 2L;
    private static final long field38949 = 0L;
    private final int field38950;
    private final long field38951;
    private final int field38952;
    private final long field38953;
    private final int field38954;
    private final long field38955;
    private final int field38956;
    private final long field38957;
    private final int field38958;
    private final long field38959;
    
    public Class9190(final long field38957, final long field38958, final long n) {
        this.field38956 = (int)field38957;
        this.field38952 = (int)field38958;
        this.field38950 = (int)n;
        this.field38954 = (int)n;
        this.field38958 = (int)field38958 * this.field38954;
        this.field38957 = field38957;
        this.field38953 = field38958;
        this.field38951 = n;
        this.field38955 = n;
        this.field38959 = field38958 * this.field38955;
    }
    
    public int method33613(final int n, final int n2, final int n3) {
        final int n4 = n3 & 0x1;
        final int n5 = n2 << 1;
        final int n6 = n << 1;
        final int n7 = (n != 0) ? (this.field38956 - n) : 0;
        final int n8 = (n2 != 0) ? (this.field38952 - n2) : 0;
        if (n3 > 1) {
            if (n3 < this.field38950) {
                return n * this.field38958 + n2 * this.field38954 + n3;
            }
            if (n3 > this.field38950 + 1) {
                final int n9 = n7 * this.field38958 + n8 * this.field38954 + ((this.field38950 << 1) - n3);
                return (n4 != 0) ? (-(n9 + 2)) : n9;
            }
            if (n2 != 0) {
                if (n5 < this.field38952) {
                    final int n10 = n7 * this.field38958 + n8 * this.field38954;
                    return (n4 != 0) ? (-n10) : (n10 + 1);
                }
                if (n5 > this.field38952) {
                    final int n11 = n * this.field38958 + n2 * this.field38954;
                    return (n4 != 0) ? n11 : (n11 + 1);
                }
                if (n == 0) {
                    final int n12 = n2 * this.field38954 + 1;
                    return (n4 != 0) ? Integer.MIN_VALUE : n12;
                }
                if (n6 < this.field38956) {
                    final int n13 = n7 * this.field38958 + n2 * this.field38954;
                    return (n4 != 0) ? (-n13) : (n13 + 1);
                }
                if (n6 <= this.field38956) {
                    final int n14 = n * this.field38958 + n2 * this.field38954;
                    return (n4 != 0) ? Integer.MIN_VALUE : (n14 + 1);
                }
                final int n15 = n * this.field38958 + n2 * this.field38954;
                return (n4 != 0) ? n15 : (n15 + 1);
            }
            else {
                if (n == 0) {
                    return (n4 != 0) ? Integer.MIN_VALUE : 1;
                }
                if (n6 < this.field38956) {
                    final int n16 = n7 * this.field38958;
                    return (n4 != 0) ? (-n16) : (n16 + 1);
                }
                if (n6 <= this.field38956) {
                    final int n17 = n * this.field38958;
                    return (n4 != 0) ? Integer.MIN_VALUE : (n17 + 1);
                }
                final int n18 = n * this.field38958;
                return (n4 != 0) ? n18 : (n18 + 1);
            }
        }
        else if (n2 != 0) {
            if (n5 < this.field38952) {
                return n * this.field38958 + n2 * this.field38954 + n3;
            }
            if (n5 > this.field38952) {
                final int n19 = n7 * this.field38958 + n8 * this.field38954;
                return (n4 != 0) ? (-(n19 + 1)) : n19;
            }
            if (n == 0) {
                return (n4 != 0) ? Integer.MIN_VALUE : (n2 * this.field38954);
            }
            if (n6 < this.field38956) {
                return n * this.field38958 + n2 * this.field38954 + n3;
            }
            if (n6 <= this.field38956) {
                final int n20 = n * this.field38958 + n2 * this.field38954;
                return (n4 != 0) ? Integer.MIN_VALUE : n20;
            }
            final int n21 = n7 * this.field38958 + n2 * this.field38954;
            return (n4 != 0) ? (-(n21 + 1)) : n21;
        }
        else {
            if (n == 0) {
                return (n3 != 0) ? Integer.MIN_VALUE : 0;
            }
            if (n6 < this.field38956) {
                return n * this.field38958 + n3;
            }
            if (n6 <= this.field38956) {
                return (n4 != 0) ? Integer.MIN_VALUE : (n * this.field38958);
            }
            final int n22 = n7 * this.field38958;
            return (n4 != 0) ? (-(n22 + 1)) : n22;
        }
    }
    
    public long method33614(final long n, final long n2, final long n3) {
        final long n4 = n3 & 0x1L;
        final long n5 = n2 << 1;
        final long n6 = n << 1;
        final long n7 = (n != 0L) ? (this.field38957 - n) : 0L;
        final long n8 = (n2 != 0L) ? (this.field38953 - n2) : 0L;
        if (n3 > 1L) {
            if (n3 < this.field38951) {
                return n * this.field38959 + n2 * this.field38955 + n3;
            }
            if (n3 > this.field38951 + 1L) {
                final long n9 = n7 * this.field38959 + n8 * this.field38955 + ((this.field38951 << 1) - n3);
                return (n4 != 0L) ? (-(n9 + 2L)) : n9;
            }
            if (n2 != 0L) {
                if (n5 < this.field38953) {
                    final long n10 = n7 * this.field38959 + n8 * this.field38955;
                    return (n4 != 0L) ? (-n10) : (n10 + 1L);
                }
                if (n5 > this.field38953) {
                    final long n11 = n * this.field38959 + n2 * this.field38955;
                    return (n4 != 0L) ? n11 : (n11 + 1L);
                }
                if (n == 0L) {
                    final long n12 = n2 * this.field38955 + 1L;
                    return (n4 != 0L) ? Long.MIN_VALUE : n12;
                }
                if (n6 < this.field38957) {
                    final long n13 = n7 * this.field38959 + n2 * this.field38955;
                    return (n4 != 0L) ? (-n13) : (n13 + 1L);
                }
                if (n6 <= this.field38957) {
                    final long n14 = n * this.field38959 + n2 * this.field38955;
                    return (n4 != 0L) ? Long.MIN_VALUE : (n14 + 1L);
                }
                final long n15 = n * this.field38959 + n2 * this.field38955;
                return (n4 != 0L) ? n15 : (n15 + 1L);
            }
            else {
                if (n == 0L) {
                    return (n4 != 0L) ? Long.MIN_VALUE : 1L;
                }
                if (n6 < this.field38957) {
                    final long n16 = n7 * this.field38959;
                    return (n4 != 0L) ? (-n16) : (n16 + 1L);
                }
                if (n6 <= this.field38957) {
                    final long n17 = n * this.field38959;
                    return (n4 != 0L) ? Long.MIN_VALUE : (n17 + 1L);
                }
                final long n18 = n * this.field38959;
                return (n4 != 0L) ? n18 : (n18 + 1L);
            }
        }
        else if (n2 != 0L) {
            if (n5 < this.field38953) {
                return n * this.field38959 + n2 * this.field38955 + n3;
            }
            if (n5 > this.field38953) {
                final long n19 = n7 * this.field38959 + n8 * this.field38955;
                return (n4 != 0L) ? (-(n19 + 1L)) : n19;
            }
            if (n == 0L) {
                return (n4 != 0L) ? Long.MIN_VALUE : (n2 * this.field38955);
            }
            if (n6 < this.field38957) {
                return n * this.field38959 + n2 * this.field38955 + n3;
            }
            if (n6 <= this.field38957) {
                final long n20 = n * this.field38959 + n2 * this.field38955;
                return (n4 != 0L) ? Long.MIN_VALUE : n20;
            }
            final long n21 = n7 * this.field38959 + n2 * this.field38955;
            return (n4 != 0L) ? (-(n21 + 1L)) : n21;
        }
        else {
            if (n == 0L) {
                return (n3 != 0L) ? Long.MIN_VALUE : 0L;
            }
            if (n6 < this.field38957) {
                return n * this.field38959 + n3;
            }
            if (n6 <= this.field38957) {
                return (n4 != 0L) ? Long.MIN_VALUE : (n * this.field38959);
            }
            final long n22 = n7 * this.field38959;
            return (n4 != 0L) ? (-(n22 + 1L)) : n22;
        }
    }
    
    public void method33615(final double n, final int i, final int j, final int k, final double[] array, final int n2) {
        final int method33613 = this.method33613(i, j, k);
        if (method33613 < 0) {
            if (method33613 <= Integer.MIN_VALUE) {
                throw new IllegalArgumentException(String.format("[%d][%d][%d] component cannot be modified (always zero)", i, j, k));
            }
            array[n2 - method33613] = -n;
        }
        else {
            array[n2 + method33613] = n;
        }
    }
    
    public void method33616(final double n, final long l, final long i, final long j, final Class17 class17, final long n2) {
        final long method33614 = this.method33614(l, i, j);
        if (method33614 < 0L) {
            if (method33614 <= Long.MIN_VALUE) {
                throw new IllegalArgumentException(String.format("[%d][%d][%d] component cannot be modified (always zero)", l, i, j));
            }
            class17.method171(n2 - method33614, -n);
        }
        else {
            class17.method171(n2 + method33614, n);
        }
    }
    
    public void method33617(final double n, final int n2, final int i, final int j, final double[][][] array) {
        final int method33613 = this.method33613(n2, i, j);
        final int method33614 = Class7640.method24113(method33613);
        final int n3 = method33614 / this.field38958;
        final int n4 = method33614 % this.field38958;
        final int n5 = n4 / this.field38954;
        final int n6 = n4 % this.field38954;
        if (method33613 < 0) {
            if (method33613 <= Integer.MIN_VALUE) {
                throw new IllegalArgumentException(String.format("[%d][%d] component cannot be modified (always zero)", i, j));
            }
            array[n3][n5][n6] = -n;
        }
        else {
            array[n3][n5][n6] = n;
        }
    }
    
    public void method33618(final float n, final int i, final int j, final int k, final float[] array, final int n2) {
        final int method33613 = this.method33613(i, j, k);
        if (method33613 < 0) {
            if (method33613 <= Integer.MIN_VALUE) {
                throw new IllegalArgumentException(String.format("[%d][%d][%d] component cannot be modified (always zero)", i, j, k));
            }
            array[n2 - method33613] = -n;
        }
        else {
            array[n2 + method33613] = n;
        }
    }
    
    public void method33619(final float n, final long l, final long i, final long j, final Class22 class22, final long n2) {
        final long method33614 = this.method33614(l, i, j);
        if (method33614 < 0L) {
            if (method33614 <= Long.MIN_VALUE) {
                throw new IllegalArgumentException(String.format("[%d][%d][%d] component cannot be modified (always zero)", l, i, j));
            }
            class22.method169(n2 - method33614, -n);
        }
        else {
            class22.method169(n2 + method33614, n);
        }
    }
    
    public void method33620(final float n, final int i, final int j, final int k, final float[][][] array) {
        final int method33613 = this.method33613(i, j, k);
        final int method33614 = Class7640.method24113(method33613);
        final int n2 = method33614 / this.field38958;
        final int n3 = method33614 % this.field38958;
        final int n4 = n3 / this.field38954;
        final int n5 = n3 % this.field38954;
        if (method33613 < 0) {
            if (method33613 <= Integer.MIN_VALUE) {
                throw new IllegalArgumentException(String.format("[%d][%d][%d] component cannot be modified (always zero)", i, j, k));
            }
            array[n2][n4][n5] = -n;
        }
        else {
            array[n2][n4][n5] = n;
        }
    }
    
    public double method33621(final int n, final int n2, final int n3, final double[] array, final int n4) {
        final int method33613 = this.method33613(n, n2, n3);
        if (method33613 >= 0) {
            return array[n4 + method33613];
        }
        if (method33613 <= Integer.MIN_VALUE) {
            return 0.0;
        }
        return -array[n4 - method33613];
    }
    
    public double method33622(final long n, final long n2, final long n3, final Class17 class17, final long n4) {
        final long method33614 = this.method33614(n, n2, n3);
        if (method33614 >= 0L) {
            return class17.method137(n4 + method33614);
        }
        if (method33614 <= Long.MIN_VALUE) {
            return 0.0;
        }
        return -class17.method137(n4 - method33614);
    }
    
    public double method33623(final int n, final int n2, final int n3, final double[][][] array) {
        final int method33613 = this.method33613(n, n2, n3);
        final int method33614 = Class7640.method24113(method33613);
        final int n4 = method33614 / this.field38958;
        final int n5 = method33614 % this.field38958;
        final int n6 = n5 / this.field38954;
        final int n7 = n5 % this.field38954;
        if (method33613 >= 0) {
            return array[n4][n6][n7];
        }
        if (method33613 <= Integer.MIN_VALUE) {
            return 0.0;
        }
        return -array[n4][n6][n7];
    }
    
    public float method33624(final int n, final int n2, final int n3, final float[] array, final int n4) {
        final int method33613 = this.method33613(n, n2, n3);
        if (method33613 >= 0) {
            return array[n4 + method33613];
        }
        if (method33613 <= Integer.MIN_VALUE) {
            return 0.0f;
        }
        return -array[n4 - method33613];
    }
    
    public float method33625(final long n, final long n2, final long n3, final Class22 class22, final long n4) {
        final long method33614 = this.method33614(n, n2, n3);
        if (method33614 >= 0L) {
            return class22.method135(n4 + method33614);
        }
        if (method33614 <= Long.MIN_VALUE) {
            return 0.0f;
        }
        return -class22.method135(n4 - method33614);
    }
    
    public float method33626(final int n, final int n2, final int n3, final float[][][] array) {
        final int method33613 = this.method33613(n, n2, n3);
        final int method33614 = Class7640.method24113(method33613);
        final int n4 = method33614 / this.field38958;
        final int n5 = method33614 % this.field38958;
        final int n6 = n5 / this.field38954;
        final int n7 = n5 % this.field38954;
        if (method33613 >= 0) {
            return array[n4][n6][n7];
        }
        if (method33613 <= Integer.MIN_VALUE) {
            return 0.0f;
        }
        return -array[n4][n6][n7];
    }
}
