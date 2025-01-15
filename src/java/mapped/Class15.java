// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import sun.misc.Cleaner;

public class Class15 extends Class11
{
    private static final long field49 = -2579271120060523901L;
    private long[] field50;
    
    public Class15(final long n) {
        this(n, true);
    }
    
    public Class15(final long n, final boolean b) {
        this.field29 = Class273.field1489;
        this.field31 = 8L;
        if (n > 0L) {
            this.field30 = n;
            if (n <= method177()) {
                this.field50 = new long[(int)n];
            }
            else {
                this.field34 = Class8601.field36113.allocateMemory(this.field30 * this.field31);
                if (b) {
                    this.method178(n);
                }
                Cleaner.create((Object)this, (Runnable)new Class993(this.field34, this.field30, this.field31));
                Class7579.method23860(this.field30 * this.field31);
            }
            return;
        }
        throw new IllegalArgumentException(n + " is not a positive long value");
    }
    
    public Class15(final long n, final long n2) {
        this.field29 = Class273.field1491;
        this.field31 = 8L;
        if (n > 0L) {
            this.field30 = n;
            this.field32 = true;
            this.field50 = new long[] { n2 };
            return;
        }
        throw new IllegalArgumentException(n + " is not a positive long value");
    }
    
    public Class15(final long[] field50) {
        this.field29 = Class273.field1489;
        this.field31 = 8L;
        this.field30 = field50.length;
        this.field50 = field50;
    }
    
    @Override
    public Class15 clone() {
        if (!this.field32) {
            final Class15 class15 = new Class15(this.field30, false);
            Class8601.method29150(this, 0L, class15, 0L, this.field30);
            return class15;
        }
        return new Class15(this.field30, this.method133(0L));
    }
    
    @Override
    public boolean equals(final Object o) {
        return super.equals(o) && this.field50 == ((Class15)o).field50;
    }
    
    @Override
    public int hashCode() {
        return 29 * super.hashCode() + ((this.field50 == null) ? 0 : this.field50.hashCode());
    }
    
    public final Long method199(final long n) {
        return this.method133(n);
    }
    
    public final Long method200(final long n) {
        return Class8601.field36113.getLong(this.field34 + this.field31 * n);
    }
    
    @Override
    public final boolean method123(final long n) {
        if (this.field34 != 0L) {
            return Class8601.field36113.getLong(this.field34 + this.field31 * n) != 0L;
        }
        if (!this.field32) {
            return this.field50[(int)n] != 0L;
        }
        return this.field50[0] != 0L;
    }
    
    @Override
    public final byte method125(final long n) {
        if (this.field34 != 0L) {
            return (byte)Class8601.field36113.getLong(this.field34 + this.field31 * n);
        }
        if (!this.field32) {
            return (byte)this.field50[(int)n];
        }
        return (byte)this.field50[0];
    }
    
    @Override
    public final short method127(final long n) {
        if (this.field34 != 0L) {
            return (short)(0xFFL & Class8601.field36113.getLong(this.field34 + this.field31 * n));
        }
        if (!this.field32) {
            return (short)(0xFFL & this.field50[(int)n]);
        }
        return (short)(0xFFL & this.field50[0]);
    }
    
    @Override
    public final short method129(final long n) {
        if (this.field34 != 0L) {
            return (short)Class8601.field36113.getLong(this.field34 + this.field31 * n);
        }
        if (!this.field32) {
            return (short)this.field50[(int)n];
        }
        return (short)this.field50[0];
    }
    
    @Override
    public final int method131(final long n) {
        if (this.field34 != 0L) {
            return (int)Class8601.field36113.getLong(this.field34 + this.field31 * n);
        }
        if (!this.field32) {
            return (int)this.field50[(int)n];
        }
        return (int)this.field50[0];
    }
    
    @Override
    public final long method133(final long n) {
        if (this.field34 != 0L) {
            return Class8601.field36113.getLong(this.field34 + this.field31 * n);
        }
        if (!this.field32) {
            return this.field50[(int)n];
        }
        return this.field50[0];
    }
    
    @Override
    public final float method135(final long n) {
        if (this.field34 != 0L) {
            return (float)Class8601.field36113.getLong(this.field34 + this.field31 * n);
        }
        if (!this.field32) {
            return (float)this.field50[(int)n];
        }
        return (float)this.field50[0];
    }
    
    @Override
    public final double method137(final long n) {
        if (this.field34 != 0L) {
            return (double)Class8601.field36113.getLong(this.field34 + this.field31 * n);
        }
        if (!this.field32) {
            return (double)this.field50[(int)n];
        }
        return (double)this.field50[0];
    }
    
    public final long[] method201() {
        return this.field50;
    }
    
    @Override
    public final boolean[] method140() {
        if (this.field30 <= 1073741824L) {
            final boolean[] array = new boolean[(int)this.field30];
            if (this.field34 == 0L) {
                if (!this.field32) {
                    for (int n = 0; n < this.field30; ++n) {
                        array[n] = (this.field50[n] != 0L);
                    }
                }
                else {
                    final boolean b = this.field50[0] != 0L;
                    for (int n2 = 0; n2 < this.field30; ++n2) {
                        array[n2] = b;
                    }
                }
            }
            else {
                for (int n3 = 0; n3 < this.field30; ++n3) {
                    array[n3] = (Class8601.field36113.getLong(this.field34 + this.field31 * n3) != 0L);
                }
            }
            return array;
        }
        return null;
    }
    
    @Override
    public final boolean[] method141(final boolean[] array, final long n, final long n2, final long n3) {
        if (n >= 0L && n < this.field30) {
            if (n2 >= 0L) {
                if (n2 <= this.field30) {
                    if (n2 >= n) {
                        if (n3 < 1L) {
                            throw new IllegalArgumentException("step < 1");
                        }
                        final long n4 = (long)Class7640.method24124((n2 - n) / (double)n3);
                        if (n4 <= 1073741824L) {
                            boolean[] array2;
                            if (array != null && array.length >= n4) {
                                array2 = array;
                            }
                            else {
                                array2 = new boolean[(int)n4];
                            }
                            int n5 = 0;
                            if (this.field34 == 0L) {
                                if (!this.field32) {
                                    for (long n6 = n; n6 < n2; n6 += n3) {
                                        array2[n5++] = (this.field50[(int)n6] != 0L);
                                    }
                                }
                                else {
                                    for (long n7 = n; n7 < n2; n7 += n3) {
                                        array2[n5++] = (this.field50[0] != 0L);
                                    }
                                }
                            }
                            else {
                                for (long n8 = n; n8 < n2; n8 += n3) {
                                    array2[n5++] = (Class8601.field36113.getLong(this.field34 + this.field31 * n8) != 0L);
                                }
                            }
                            return array2;
                        }
                        return null;
                    }
                }
            }
            throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
        }
        throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
    }
    
    @Override
    public final byte[] method142() {
        if (this.field30 <= 1073741824L) {
            final byte[] array = new byte[(int)this.field30];
            if (this.field34 == 0L) {
                if (!this.field32) {
                    for (int n = 0; n < this.field30; ++n) {
                        array[n] = (byte)this.field50[n];
                    }
                }
                else {
                    final byte b = (byte)this.field50[0];
                    for (int n2 = 0; n2 < this.field30; ++n2) {
                        array[n2] = b;
                    }
                }
            }
            else {
                for (int n3 = 0; n3 < this.field30; ++n3) {
                    array[n3] = (byte)Class8601.field36113.getLong(this.field34 + this.field31 * n3);
                }
            }
            return array;
        }
        return null;
    }
    
    @Override
    public final byte[] method143(final byte[] array, final long n, final long n2, final long n3) {
        if (n >= 0L && n < this.field30) {
            if (n2 >= 0L) {
                if (n2 <= this.field30) {
                    if (n2 >= n) {
                        if (n3 < 1L) {
                            throw new IllegalArgumentException("step < 1");
                        }
                        final long n4 = (long)Class7640.method24124((n2 - n) / (double)n3);
                        if (n4 <= 1073741824L) {
                            byte[] array2;
                            if (array != null && array.length >= n4) {
                                array2 = array;
                            }
                            else {
                                array2 = new byte[(int)n4];
                            }
                            int n5 = 0;
                            if (this.field34 == 0L) {
                                if (!this.field32) {
                                    for (long n6 = n; n6 < n2; n6 += n3) {
                                        array2[n5++] = (byte)this.field50[(int)n6];
                                    }
                                }
                                else {
                                    for (long n7 = n; n7 < n2; n7 += n3) {
                                        array2[n5++] = (byte)this.field50[0];
                                    }
                                }
                            }
                            else {
                                for (long n8 = n; n8 < n2; n8 += n3) {
                                    array2[n5++] = (byte)Class8601.field36113.getLong(this.field34 + this.field31 * n8);
                                }
                            }
                            return array2;
                        }
                        return null;
                    }
                }
            }
            throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
        }
        throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
    }
    
    @Override
    public final short[] method144() {
        if (this.field30 <= 1073741824L) {
            final short[] array = new short[(int)this.field30];
            if (this.field34 == 0L) {
                if (!this.field32) {
                    for (int n = 0; n < this.field30; ++n) {
                        array[n] = (short)this.field50[n];
                    }
                }
                else {
                    final short n2 = (short)this.field50[0];
                    for (int n3 = 0; n3 < this.field30; ++n3) {
                        array[n3] = n2;
                    }
                }
            }
            else {
                for (int n4 = 0; n4 < this.field30; ++n4) {
                    array[n4] = (short)Class8601.field36113.getLong(this.field34 + this.field31 * n4);
                }
            }
            return array;
        }
        return null;
    }
    
    @Override
    public final short[] method145(final short[] array, final long n, final long n2, final long n3) {
        if (n >= 0L && n < this.field30) {
            if (n2 >= 0L) {
                if (n2 <= this.field30) {
                    if (n2 >= n) {
                        if (n3 < 1L) {
                            throw new IllegalArgumentException("step < 1");
                        }
                        final long n4 = (long)Class7640.method24124((n2 - n) / (double)n3);
                        if (n4 <= 1073741824L) {
                            short[] array2;
                            if (array != null && array.length >= n4) {
                                array2 = array;
                            }
                            else {
                                array2 = new short[(int)n4];
                            }
                            int n5 = 0;
                            if (this.field34 == 0L) {
                                if (!this.field32) {
                                    for (long n6 = n; n6 < n2; n6 += n3) {
                                        array2[n5++] = (short)this.field50[(int)n6];
                                    }
                                }
                                else {
                                    for (long n7 = n; n7 < n2; n7 += n3) {
                                        array2[n5++] = (short)this.field50[0];
                                    }
                                }
                            }
                            else {
                                for (long n8 = n; n8 < n2; n8 += n3) {
                                    array2[n5++] = (short)Class8601.field36113.getLong(this.field34 + this.field31 * n8);
                                }
                            }
                            return array2;
                        }
                        return null;
                    }
                }
            }
            throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
        }
        throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
    }
    
    @Override
    public final int[] method146() {
        if (this.field30 <= 1073741824L) {
            final int[] array = new int[(int)this.field30];
            if (this.field34 == 0L) {
                if (!this.field32) {
                    for (int n = 0; n < this.field30; ++n) {
                        array[n] = (int)this.field50[n];
                    }
                }
                else {
                    final int n2 = (int)this.field50[0];
                    for (int n3 = 0; n3 < this.field30; ++n3) {
                        array[n3] = n2;
                    }
                }
            }
            else {
                for (int n4 = 0; n4 < this.field30; ++n4) {
                    array[n4] = (int)Class8601.field36113.getLong(this.field34 + this.field31 * n4);
                }
            }
            return array;
        }
        return null;
    }
    
    @Override
    public final int[] method147(final int[] array, final long n, final long n2, final long n3) {
        if (n >= 0L && n < this.field30) {
            if (n2 >= 0L) {
                if (n2 <= this.field30) {
                    if (n2 >= n) {
                        if (n3 < 1L) {
                            throw new IllegalArgumentException("step < 1");
                        }
                        final long n4 = (long)Class7640.method24124((n2 - n) / (double)n3);
                        if (n4 <= 1073741824L) {
                            int[] array2;
                            if (array != null && array.length >= n4) {
                                array2 = array;
                            }
                            else {
                                array2 = new int[(int)n4];
                            }
                            int n5 = 0;
                            if (this.field34 == 0L) {
                                if (!this.field32) {
                                    for (long n6 = n; n6 < n2; n6 += n3) {
                                        array2[n5++] = (int)this.field50[(int)n6];
                                    }
                                }
                                else {
                                    for (long n7 = n; n7 < n2; n7 += n3) {
                                        array2[n5++] = (int)this.field50[0];
                                    }
                                }
                            }
                            else {
                                for (long n8 = n; n8 < n2; n8 += n3) {
                                    array2[n5++] = (int)Class8601.field36113.getLong(this.field34 + this.field31 * n8);
                                }
                            }
                            return array2;
                        }
                        return null;
                    }
                }
            }
            throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
        }
        throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
    }
    
    @Override
    public final long[] method148() {
        if (this.field30 <= 1073741824L) {
            final long[] array = new long[(int)this.field30];
            if (this.field34 == 0L) {
                if (!this.field32) {
                    System.arraycopy(this.field50, 0, array, 0, (int)this.field30);
                }
                else {
                    final long n = this.field50[0];
                    for (int n2 = 0; n2 < this.field30; ++n2) {
                        array[n2] = n;
                    }
                }
            }
            else {
                for (int n3 = 0; n3 < this.field30; ++n3) {
                    array[n3] = Class8601.field36113.getLong(this.field34 + this.field31 * n3);
                }
            }
            return array;
        }
        return null;
    }
    
    @Override
    public final long[] method149(final long[] array, final long n, final long n2, final long n3) {
        if (n >= 0L && n < this.field30) {
            if (n2 >= 0L) {
                if (n2 <= this.field30) {
                    if (n2 >= n) {
                        if (n3 < 1L) {
                            throw new IllegalArgumentException("step < 1");
                        }
                        final long n4 = (long)Class7640.method24124((n2 - n) / (double)n3);
                        if (n4 <= 1073741824L) {
                            long[] array2;
                            if (array != null && array.length >= n4) {
                                array2 = array;
                            }
                            else {
                                array2 = new long[(int)n4];
                            }
                            int n5 = 0;
                            if (this.field34 == 0L) {
                                if (!this.field32) {
                                    for (long n6 = n; n6 < n2; n6 += n3) {
                                        array2[n5++] = this.field50[(int)n6];
                                    }
                                }
                                else {
                                    for (long n7 = n; n7 < n2; n7 += n3) {
                                        array2[n5++] = this.field50[0];
                                    }
                                }
                            }
                            else {
                                for (long n8 = n; n8 < n2; n8 += n3) {
                                    array2[n5++] = Class8601.field36113.getLong(this.field34 + this.field31 * n8);
                                }
                            }
                            return array2;
                        }
                        return null;
                    }
                }
            }
            throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
        }
        throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
    }
    
    @Override
    public final float[] method150() {
        if (this.field30 <= 1073741824L) {
            final float[] array = new float[(int)this.field30];
            if (this.field34 == 0L) {
                if (!this.field32) {
                    for (int n = 0; n < this.field30; ++n) {
                        array[n] = (float)this.field50[n];
                    }
                }
                else {
                    final float n2 = (float)this.field50[0];
                    for (int n3 = 0; n3 < this.field30; ++n3) {
                        array[n3] = n2;
                    }
                }
            }
            else {
                for (int n4 = 0; n4 < this.field30; ++n4) {
                    array[n4] = (float)Class8601.field36113.getLong(this.field34 + this.field31 * n4);
                }
            }
            return array;
        }
        return null;
    }
    
    @Override
    public final float[] method151(final float[] array, final long n, final long n2, final long n3) {
        if (n >= 0L && n < this.field30) {
            if (n2 >= 0L) {
                if (n2 <= this.field30) {
                    if (n2 >= n) {
                        if (n3 < 1L) {
                            throw new IllegalArgumentException("step < 1");
                        }
                        final long n4 = (long)Class7640.method24124((n2 - n) / (double)n3);
                        if (n4 <= 1073741824L) {
                            float[] array2;
                            if (array != null && array.length >= n4) {
                                array2 = array;
                            }
                            else {
                                array2 = new float[(int)n4];
                            }
                            int n5 = 0;
                            if (this.field34 == 0L) {
                                if (!this.field32) {
                                    for (long n6 = n; n6 < n2; n6 += n3) {
                                        array2[n5++] = (float)this.field50[(int)n6];
                                    }
                                }
                                else {
                                    for (long n7 = n; n7 < n2; n7 += n3) {
                                        array2[n5++] = (float)this.field50[0];
                                    }
                                }
                            }
                            else {
                                for (long n8 = n; n8 < n2; n8 += n3) {
                                    array2[n5++] = (float)Class8601.field36113.getLong(this.field34 + this.field31 * n8);
                                }
                            }
                            return array2;
                        }
                        return null;
                    }
                }
            }
            throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
        }
        throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
    }
    
    @Override
    public final double[] method152() {
        if (this.field30 <= 1073741824L) {
            final double[] array = new double[(int)this.field30];
            if (this.field34 == 0L) {
                if (!this.field32) {
                    for (int n = 0; n < this.field30; ++n) {
                        array[n] = (double)this.field50[n];
                    }
                }
                else {
                    final double n2 = (double)this.field50[0];
                    for (int n3 = 0; n3 < this.field30; ++n3) {
                        array[n3] = n2;
                    }
                }
            }
            else {
                for (int n4 = 0; n4 < this.field30; ++n4) {
                    array[n4] = (double)Class8601.field36113.getLong(this.field34 + this.field31 * n4);
                }
            }
            return array;
        }
        return null;
    }
    
    @Override
    public final double[] method153(final double[] array, final long n, final long n2, final long n3) {
        if (n >= 0L && n < this.field30) {
            if (n2 >= 0L) {
                if (n2 <= this.field30) {
                    if (n2 >= n) {
                        if (n3 < 1L) {
                            throw new IllegalArgumentException("step < 1");
                        }
                        final long n4 = (long)Class7640.method24124((n2 - n) / (double)n3);
                        if (n4 <= 1073741824L) {
                            double[] array2;
                            if (array != null && array.length >= n4) {
                                array2 = array;
                            }
                            else {
                                array2 = new double[(int)n4];
                            }
                            int n5 = 0;
                            if (this.field34 == 0L) {
                                if (!this.field32) {
                                    for (long n6 = n; n6 < n2; n6 += n3) {
                                        array2[n5++] = (double)this.field50[(int)n6];
                                    }
                                }
                                else {
                                    for (long n7 = n; n7 < n2; n7 += n3) {
                                        array2[n5++] = (double)this.field50[0];
                                    }
                                }
                            }
                            else {
                                for (long n8 = n; n8 < n2; n8 += n3) {
                                    array2[n5++] = (double)Class8601.field36113.getLong(this.field34 + this.field31 * n8);
                                }
                            }
                            return array2;
                        }
                        return null;
                    }
                }
            }
            throw new ArrayIndexOutOfBoundsException("endPos < 0 || endPos > length || endPos < startPos");
        }
        throw new ArrayIndexOutOfBoundsException("startPos < 0 || startPos >= length");
    }
    
    @Override
    public final void method155(final long n, final Object o) {
        Class8601.field36113.putLong(this.field34 + this.field31 * n, (long)o);
    }
    
    @Override
    public final void method157(final long n, final boolean b) {
        if (this.field34 == 0L) {
            if (this.field32) {
                throw new IllegalAccessError("Constant arrays cannot be modified.");
            }
            this.field50[(int)n] = (b ? 1 : 0);
        }
        else {
            Class8601.field36113.putLong(this.field34 + this.field31 * n, b ? 1 : 0);
        }
    }
    
    @Override
    public final void method159(final long n, final byte b) {
        if (this.field34 == 0L) {
            if (this.field32) {
                throw new IllegalAccessError("Constant arrays cannot be modified.");
            }
            this.field50[(int)n] = b;
        }
        else {
            Class8601.field36113.putLong(this.field34 + this.field31 * n, b);
        }
    }
    
    @Override
    public final void method161(final long n, final short n2) {
        this.method163(n, n2);
    }
    
    @Override
    public final void method163(final long n, final short n2) {
        if (this.field34 == 0L) {
            if (this.field32) {
                throw new IllegalAccessError("Constant arrays cannot be modified.");
            }
            this.field50[(int)n] = n2;
        }
        else {
            Class8601.field36113.putLong(this.field34 + this.field31 * n, n2);
        }
    }
    
    @Override
    public final void method165(final long n, final int n2) {
        if (this.field34 == 0L) {
            if (this.field32) {
                throw new IllegalAccessError("Constant arrays cannot be modified.");
            }
            this.field50[(int)n] = n2;
        }
        else {
            Class8601.field36113.putLong(this.field34 + this.field31 * n, n2);
        }
    }
    
    @Override
    public final void method167(final long n, final long x) {
        if (this.field34 == 0L) {
            if (this.field32) {
                throw new IllegalAccessError("Constant arrays cannot be modified.");
            }
            this.field50[(int)n] = x;
        }
        else {
            Class8601.field36113.putLong(this.field34 + this.field31 * n, x);
        }
    }
    
    @Override
    public final void method169(final long n, final float n2) {
        if (this.field34 == 0L) {
            if (this.field32) {
                throw new IllegalAccessError("Constant arrays cannot be modified.");
            }
            this.field50[(int)n] = (long)n2;
        }
        else {
            Class8601.field36113.putLong(this.field34 + this.field31 * n, (long)n2);
        }
    }
    
    @Override
    public final void method171(final long n, final double n2) {
        if (this.field34 == 0L) {
            if (this.field32) {
                throw new IllegalAccessError("Constant arrays cannot be modified.");
            }
            this.field50[(int)n] = (long)n2;
        }
        else {
            Class8601.field36113.putLong(this.field34 + this.field31 * n, (long)n2);
        }
    }
}
