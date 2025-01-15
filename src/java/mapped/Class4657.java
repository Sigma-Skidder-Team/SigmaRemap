// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4657
{
    private static final int field20152 = 1;
    private static final int field20153 = 2;
    private static final int field20154 = 0;
    private static final long field20155 = 1L;
    private static final long field20156 = 2L;
    private static final long field20157 = 0L;
    private final int field20158;
    private final int field20159;
    private final long field20160;
    private final long field20161;
    
    public Class4657(final long field20161, final long field20162) {
        this.field20158 = (int)field20162;
        this.field20159 = (int)field20161;
        this.field20160 = field20162;
        this.field20161 = field20161;
    }
    
    public int method13931(final int n, final int n2) {
        final int n3 = n2 & 0x1;
        final int n4 = n << 1;
        if (n == 0) {
            if (n2 == 1 || n2 == this.field20158 + 1) {
                return Integer.MIN_VALUE;
            }
            if (n2 == this.field20158) {
                return 1;
            }
            if (n2 < this.field20158) {
                return n2;
            }
            if (n3 != 0) {
                return -((this.field20158 << 1) - n2 + 2);
            }
            return (this.field20158 << 1) - n2;
        }
        else if (n2 > 1) {
            if (n2 != this.field20158 && n2 != this.field20158 + 1) {
                if (n2 < this.field20158) {
                    return this.field20158 * n + n2;
                }
                if (n3 != 0) {
                    return -(this.field20158 * (this.field20159 + 2 - n) - n2 + 2);
                }
                return this.field20158 * (this.field20159 + 2 - n) - n2;
            }
            else if (n4 != this.field20159) {
                if (n4 >= this.field20159) {
                    return this.field20158 * n + 1 - n3;
                }
                if (n3 != 0) {
                    return -(this.field20158 * (this.field20159 - n));
                }
                return this.field20158 * (this.field20159 - n) + 1;
            }
            else {
                if (n3 != 1) {
                    return (this.field20159 * this.field20158 >> 1) + 1;
                }
                return Integer.MIN_VALUE;
            }
        }
        else if (n4 != this.field20159) {
            if (n4 < this.field20159) {
                return this.field20158 * n + n3;
            }
            if (n3 != 0) {
                return -(this.field20158 * (this.field20159 - n) + 1);
            }
            return this.field20158 * (this.field20159 - n);
        }
        else {
            if (n3 != 1) {
                return this.field20159 * this.field20158 >> 1;
            }
            return Integer.MIN_VALUE;
        }
    }
    
    public long method13932(final long n, final long n2) {
        final long n3 = n2 & 0x1L;
        final long n4 = n << 1;
        if (n == 0L) {
            if (n2 == 1L || n2 == this.field20160 + 1L) {
                return Long.MIN_VALUE;
            }
            if (n2 == this.field20160) {
                return 1L;
            }
            if (n2 < this.field20160) {
                return n2;
            }
            if (n3 != 0L) {
                return -((this.field20160 << 1) - n2 + 2L);
            }
            return (this.field20160 << 1) - n2;
        }
        else if (n2 > 1L) {
            if (n2 != this.field20160 && n2 != this.field20160 + 1L) {
                if (n2 < this.field20160) {
                    return this.field20160 * n + n2;
                }
                if (n3 != 0L) {
                    return -(this.field20160 * (this.field20161 + 2L - n) - n2 + 2L);
                }
                return this.field20160 * (this.field20161 + 2L - n) - n2;
            }
            else if (n4 != this.field20161) {
                if (n4 >= this.field20161) {
                    return this.field20160 * n + 1L - n3;
                }
                if (n3 != 0L) {
                    return -(this.field20160 * (this.field20161 - n));
                }
                return this.field20160 * (this.field20161 - n) + 1L;
            }
            else {
                if (n3 != 1L) {
                    return (this.field20161 * this.field20160 >> 1) + 1L;
                }
                return Long.MIN_VALUE;
            }
        }
        else if (n4 != this.field20161) {
            if (n4 < this.field20161) {
                return this.field20160 * n + n3;
            }
            if (n3 != 0L) {
                return -(this.field20160 * (this.field20161 - n) + 1L);
            }
            return this.field20160 * (this.field20161 - n);
        }
        else {
            if (n3 != 1L) {
                return this.field20161 * this.field20160 >> 1;
            }
            return Long.MIN_VALUE;
        }
    }
    
    public void method13933(final double n, final int i, final int j, final double[] array, final int n2) {
        final int method13931 = this.method13931(i, j);
        if (method13931 < 0) {
            if (method13931 <= Integer.MIN_VALUE) {
                throw new IllegalArgumentException(String.format("[%d][%d] component cannot be modified (always zero)", i, j));
            }
            array[n2 - method13931] = -n;
        }
        else {
            array[n2 + method13931] = n;
        }
    }
    
    public void method13934(final double n, final long l, final long i, final Class17 class17, final long n2) {
        final long method13932 = this.method13932(l, i);
        if (method13932 < 0L) {
            if (method13932 <= Long.MIN_VALUE) {
                throw new IllegalArgumentException(String.format("[%d][%d] component cannot be modified (always zero)", l, i));
            }
            class17.method171(n2 - method13932, -n);
        }
        else {
            class17.method171(n2 + method13932, n);
        }
    }
    
    public void method13935(final double n, final int i, final int j, final double[][] array) {
        final int method13931 = this.method13931(i, j);
        if (method13931 < 0) {
            if (method13931 <= Integer.MIN_VALUE) {
                throw new IllegalArgumentException(String.format("[%d][%d] component cannot be modified (always zero)", i, j));
            }
            array[-method13931 / this.field20158][-method13931 % this.field20158] = -n;
        }
        else {
            array[method13931 / this.field20158][method13931 % this.field20158] = n;
        }
    }
    
    public void method13936(final float n, final int i, final int j, final float[] array, final int n2) {
        final int method13931 = this.method13931(i, j);
        if (method13931 < 0) {
            if (method13931 <= Integer.MIN_VALUE) {
                throw new IllegalArgumentException(String.format("[%d][%d] component cannot be modified (always zero)", i, j));
            }
            array[n2 - method13931] = -n;
        }
        else {
            array[n2 + method13931] = n;
        }
    }
    
    public void method13937(final float n, final long l, final long i, final Class22 class22, final long n2) {
        final long method13932 = this.method13932(l, i);
        if (method13932 < 0L) {
            if (method13932 <= Long.MIN_VALUE) {
                throw new IllegalArgumentException(String.format("[%d][%d] component cannot be modified (always zero)", l, i));
            }
            class22.method169(n2 - method13932, -n);
        }
        else {
            class22.method169(n2 + method13932, n);
        }
    }
    
    public void method13938(final float n, final int i, final int j, final float[][] array) {
        final int method13931 = this.method13931(i, j);
        if (method13931 < 0) {
            if (method13931 <= Integer.MIN_VALUE) {
                throw new IllegalArgumentException(String.format("[%d][%d] component cannot be modified (always zero)", i, j));
            }
            array[-method13931 / this.field20158][-method13931 % this.field20158] = -n;
        }
        else {
            array[method13931 / this.field20158][method13931 % this.field20158] = n;
        }
    }
    
    public double method13939(final int n, final int n2, final double[] array, final int n3) {
        final int method13931 = this.method13931(n, n2);
        if (method13931 >= 0) {
            return array[n3 + method13931];
        }
        if (method13931 <= Integer.MIN_VALUE) {
            return 0.0;
        }
        return -array[n3 - method13931];
    }
    
    public double method13940(final long n, final long n2, final Class17 class17, final long n3) {
        final long method13932 = this.method13932(n, n2);
        if (method13932 >= 0L) {
            return class17.method137(n3 + method13932);
        }
        if (method13932 <= Long.MIN_VALUE) {
            return 0.0;
        }
        return -class17.method137(n3 - method13932);
    }
    
    public double method13941(final int n, final int n2, final double[][] array) {
        final int method13931 = this.method13931(n, n2);
        if (method13931 >= 0) {
            return array[method13931 / this.field20158][method13931 % this.field20158];
        }
        if (method13931 <= Integer.MIN_VALUE) {
            return 0.0;
        }
        return -array[-method13931 / this.field20158][-method13931 % this.field20158];
    }
    
    public float method13942(final int n, final int n2, final float[] array, final int n3) {
        final int method13931 = this.method13931(n, n2);
        if (method13931 >= 0) {
            return array[n3 + method13931];
        }
        if (method13931 <= Integer.MIN_VALUE) {
            return 0.0f;
        }
        return -array[n3 - method13931];
    }
    
    public float method13943(final long n, final long n2, final Class22 class22, final long n3) {
        final long method13932 = this.method13932(n, n2);
        if (method13932 >= 0L) {
            return class22.method135(n3 + method13932);
        }
        if (method13932 <= Long.MIN_VALUE) {
            return 0.0f;
        }
        return -class22.method135(n3 - method13932);
    }
    
    public float method13944(final int n, final int n2, final float[][] array) {
        final int method13931 = this.method13931(n, n2);
        if (method13931 >= 0) {
            return array[method13931 / this.field20158][method13931 % this.field20158];
        }
        if (method13931 <= Integer.MIN_VALUE) {
            return 0.0f;
        }
        return -array[-method13931 / this.field20158][-method13931 % this.field20158];
    }
}
