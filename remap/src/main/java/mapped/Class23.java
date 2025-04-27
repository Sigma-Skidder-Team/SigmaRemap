// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import sun.misc.Cleaner;

public class Class23 extends Class11
{
    private static final long field28 = 3135411647668758832L;
    private byte[] field65;
    
    public Class23(final long n) {
        this(n, true);
    }
    
    public Class23(final long n, final boolean b) {
        this.field29 = Class273.field1484;
        this.field31 = 1L;
        if (n > 0L) {
            this.field30 = n;
            if (n <= method177()) {
                this.field65 = new byte[(int)n];
            }
            else {
                this.field34 = Class8601.field36113.allocateMemory(this.field30 * this.field31);
                if (b) {
                    this.method178(n);
                }
                Cleaner.create(this, new Class993(this.field34, this.field30, this.field31));
                Class7579.method23860(this.field30 * this.field31);
            }
            return;
        }
        throw new IllegalArgumentException(n + " is not a positive long value");
    }
    
    public Class23(final long n, final byte b) {
        this.field29 = Class273.field1484;
        this.field31 = 1L;
        if (n > 0L) {
            this.field30 = n;
            this.field32 = true;
            this.field65 = new byte[] { (byte)((b != 0) ? 1 : 0) };
            return;
        }
        throw new IllegalArgumentException(n + " is not a positive long value");
    }
    
    public Class23(final byte[] field65) {
        this.field29 = Class273.field1484;
        this.field31 = 1L;
        this.field30 = field65.length;
        for (int i = 0; i < field65.length; ++i) {
            if (field65[i] != 0 && field65[i] != 1) {
                throw new IllegalArgumentException("The array contans values different than 0 and 1.");
            }
        }
        this.field65 = field65;
    }
    
    public Class23(final boolean[] array) {
        this.field29 = Class273.field1484;
        this.field31 = 1L;
        this.field30 = array.length;
        this.field65 = new byte[array.length];
        for (int i = 0; i < array.length; ++i) {
            this.field65[i] = (byte)(array[i] ? 1 : 0);
        }
    }
    
    @Override
    public Class23 clone() {
        if (!this.field32) {
            final Class23 class23 = new Class23(this.field30, false);
            Class8601.method29139(this, 0L, class23, 0L, this.field30);
            return class23;
        }
        return new Class23(this.field30, this.method125(0L));
    }
    
    @Override
    public boolean equals(final Object o) {
        return super.equals(o) && this.field65 == ((Class23)o).field65;
    }
    
    @Override
    public int hashCode() {
        return 29 * super.hashCode() + ((this.field65 == null) ? 0 : this.field65.hashCode());
    }
    
    public final Byte method207(final long n) {
        return this.method125(n);
    }
    
    public final Byte method180(final long n) {
        return Class8601.field36113.getByte(this.field34 + n);
    }

    @Override
    public Object method120(long p0) {
        return null;
    }

    @Override
    public Object method122(long p0) {
        return null;
    }

    @Override
    public final boolean method123(final long n) {
        if (this.field34 != 0L) {
            return Class8601.field36113.getByte(this.field34 + n) != 0;
        }
        if (!this.field32) {
            return this.field65[(int)n] != 0;
        }
        return this.field65[0] != 0;
    }
    
    @Override
    public final byte method125(final long n) {
        if (this.field34 != 0L) {
            return Class8601.field36113.getByte(this.field34 + n);
        }
        if (!this.field32) {
            return this.field65[(int)n];
        }
        return this.field65[0];
    }
    
    @Override
    public final short method127(final long n) {
        return this.method125(n);
    }
    
    @Override
    public final short method129(final long n) {
        if (this.field34 != 0L) {
            return Class8601.field36113.getByte(this.field34 + n);
        }
        if (!this.field32) {
            return this.field65[(int)n];
        }
        return this.field65[0];
    }
    
    @Override
    public final int method131(final long n) {
        if (this.field34 != 0L) {
            return Class8601.field36113.getByte(this.field34 + n);
        }
        if (!this.field32) {
            return this.field65[(int)n];
        }
        return this.field65[0];
    }
    
    @Override
    public final long method133(final long n) {
        if (this.field34 != 0L) {
            return Class8601.field36113.getByte(this.field34 + n);
        }
        if (!this.field32) {
            return this.field65[(int)n];
        }
        return this.field65[0];
    }
    
    @Override
    public final float method135(final long n) {
        if (this.field34 != 0L) {
            return Class8601.field36113.getByte(this.field34 + n);
        }
        if (!this.field32) {
            return this.field65[(int)n];
        }
        return this.field65[0];
    }
    
    @Override
    public final double method137(final long n) {
        if (this.field34 != 0L) {
            return Class8601.field36113.getByte(this.field34 + n);
        }
        if (!this.field32) {
            return this.field65[(int)n];
        }
        return this.field65[0];
    }

    @Override
    public Object method139() {
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
                                        array2[n5++] = (this.field65[(int)n6] != 0);
                                    }
                                }
                                else {
                                    final boolean b = this.field65[0] != 0;
                                    for (long n7 = n; n7 < n2; n7 += n3) {
                                        array2[n5++] = b;
                                    }
                                }
                            }
                            else {
                                for (long n8 = n; n8 < n2; n8 += n3) {
                                    array2[n5++] = (Class8601.field36113.getByte(this.field34 + n8) == 1);
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
    public final boolean[] method140() {
        if (this.field30 <= 1073741824L) {
            final boolean[] array = new boolean[(int)this.field30];
            if (this.field34 == 0L) {
                if (!this.field32) {
                    for (int n = 0; n < this.field30; ++n) {
                        array[n] = (this.field65[n] != 0);
                    }
                }
                else {
                    final boolean b = this.field65[0] != 0;
                    for (int n2 = 0; n2 < this.field30; ++n2) {
                        array[n2] = b;
                    }
                }
            }
            else {
                for (int n3 = 0; n3 < this.field30; ++n3) {
                    array[n3] = (Class8601.field36113.getByte(this.field34 + this.field31 * n3) != 0);
                }
            }
            return array;
        }
        return null;
    }
    
    public final byte[] method181() {
        return this.field65;
    }
    
    @Override
    public final byte[] method142() {
        if (this.field30 <= 1073741824L) {
            final byte[] array = new byte[(int)this.field30];
            if (this.field34 == 0L) {
                if (!this.field32) {
                    System.arraycopy(this.field65, 0, array, 0, (int)this.field30);
                }
                else {
                    final byte b = this.field65[0];
                    for (int n = 0; n < this.field30; ++n) {
                        array[n] = b;
                    }
                }
            }
            else {
                for (int n2 = 0; n2 < this.field30; ++n2) {
                    array[n2] = Class8601.field36113.getByte(this.field34 + this.field31 * n2);
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
                                        array2[n5++] = this.field65[(int)n6];
                                    }
                                }
                                else {
                                    for (long n7 = n; n7 < n2; n7 += n3) {
                                        array2[n5++] = this.field65[0];
                                    }
                                }
                            }
                            else {
                                for (long n8 = n; n8 < n2; n8 += n3) {
                                    array2[n5++] = Class8601.field36113.getByte(this.field34 + n8);
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
                        array[n] = this.field65[n];
                    }
                }
                else {
                    final byte b = this.field65[0];
                    for (int n2 = 0; n2 < this.field30; ++n2) {
                        array[n2] = b;
                    }
                }
            }
            else {
                for (int n3 = 0; n3 < this.field30; ++n3) {
                    array[n3] = Class8601.field36113.getByte(this.field34 + this.field31 * n3);
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
                                        array2[n5++] = this.field65[(int)n6];
                                    }
                                }
                                else {
                                    for (long n7 = n; n7 < n2; n7 += n3) {
                                        array2[n5++] = this.field65[0];
                                    }
                                }
                            }
                            else {
                                for (long n8 = n; n8 < n2; n8 += n3) {
                                    array2[n5++] = Class8601.field36113.getByte(this.field34 + n8);
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
                        array[n] = this.field65[n];
                    }
                }
                else {
                    final byte b = this.field65[0];
                    for (int n2 = 0; n2 < this.field30; ++n2) {
                        array[n2] = b;
                    }
                }
            }
            else {
                for (int n3 = 0; n3 < this.field30; ++n3) {
                    array[n3] = Class8601.field36113.getByte(this.field34 + this.field31 * n3);
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
                                        array2[n5++] = this.field65[(int)n6];
                                    }
                                }
                                else {
                                    for (long n7 = n; n7 < n2; n7 += n3) {
                                        array2[n5++] = this.field65[0];
                                    }
                                }
                            }
                            else {
                                for (long n8 = n; n8 < n2; n8 += n3) {
                                    array2[n5++] = Class8601.field36113.getByte(this.field34 + n8);
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
                    for (int n = 0; n < this.field30; ++n) {
                        array[n] = this.field65[n];
                    }
                }
                else {
                    final byte b = this.field65[0];
                    for (int n2 = 0; n2 < this.field30; ++n2) {
                        array[n2] = b;
                    }
                }
            }
            else {
                for (int n3 = 0; n3 < this.field30; ++n3) {
                    array[n3] = Class8601.field36113.getByte(this.field34 + this.field31 * n3);
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
                                        array2[n5++] = this.field65[(int)n6];
                                    }
                                }
                                else {
                                    for (long n7 = n; n7 < n2; n7 += n3) {
                                        array2[n5++] = this.field65[0];
                                    }
                                }
                            }
                            else {
                                for (long n8 = n; n8 < n2; n8 += n3) {
                                    array2[n5++] = Class8601.field36113.getByte(this.field34 + n8);
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
                        array[n] = this.field65[n];
                    }
                }
                else {
                    final float n2 = this.field65[0];
                    for (int n3 = 0; n3 < this.field30; ++n3) {
                        array[n3] = n2;
                    }
                }
            }
            else {
                for (int n4 = 0; n4 < this.field30; ++n4) {
                    array[n4] = Class8601.field36113.getByte(this.field34 + this.field31 * n4);
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
                                        array2[n5++] = this.field65[(int)n6];
                                    }
                                }
                                else {
                                    for (long n7 = n; n7 < n2; n7 += n3) {
                                        array2[n5++] = this.field65[0];
                                    }
                                }
                            }
                            else {
                                for (long n8 = n; n8 < n2; n8 += n3) {
                                    array2[n5++] = Class8601.field36113.getByte(this.field34 + n8);
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
                        array[n] = this.field65[n];
                    }
                }
                else {
                    final double n2 = this.field65[0];
                    for (int n3 = 0; n3 < this.field30; ++n3) {
                        array[n3] = n2;
                    }
                }
            }
            else {
                for (int n4 = 0; n4 < this.field30; ++n4) {
                    array[n4] = Class8601.field36113.getByte(this.field34 + this.field31 * n4);
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
                                        array2[n5++] = this.field65[(int)n6];
                                    }
                                }
                                else {
                                    for (long n7 = n; n7 < n2; n7 += n3) {
                                        array2[n5++] = this.field65[0];
                                    }
                                }
                            }
                            else {
                                for (long n8 = n; n8 < n2; n8 += n3) {
                                    array2[n5++] = Class8601.field36113.getByte(this.field34 + n8);
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
        Class8601.field36113.putByte(this.field34 + n, (byte)o);
    }
    
    @Override
    public final void method157(final long n, final boolean b) {
        if (this.field34 == 0L) {
            if (this.field32) {
                throw new IllegalAccessError("Constant arrays cannot be modified.");
            }
            this.field65[(int)n] = (byte)(b ? 1 : 0);
        }
        else {
            Class8601.field36113.putByte(this.field34 + n, (byte)(b ? 1 : 0));
        }
    }
    
    @Override
    public final void method159(final long n, final byte x) {
        if (x >= 0 && x <= 1) {
            if (this.field34 == 0L) {
                if (this.field32) {
                    throw new IllegalAccessError("Constant arrays cannot be modified.");
                }
                this.field65[(int)n] = x;
            }
            else {
                Class8601.field36113.putByte(this.field34 + n, x);
            }
            return;
        }
        throw new IllegalArgumentException("The value has to be 0 or 1.");
    }
    
    @Override
    public final void method161(final long n, final short n2) {
        this.method163(n, n2);
    }
    
    @Override
    public final void method163(final long n, final short n2) {
        if (n2 >= 0 && n2 <= 1) {
            if (this.field34 == 0L) {
                if (this.field32) {
                    throw new IllegalAccessError("Constant arrays cannot be modified.");
                }
                this.field65[(int)n] = (byte)n2;
            }
            else {
                Class8601.field36113.putByte(this.field34 + n, (byte)n2);
            }
            return;
        }
        throw new IllegalArgumentException("The value has to be 0 or 1.");
    }
    
    @Override
    public final void method165(final long n, final int n2) {
        if (n2 >= 0 && n2 <= 1) {
            if (this.field34 == 0L) {
                if (this.field32) {
                    throw new IllegalAccessError("Constant arrays cannot be modified.");
                }
                this.field65[(int)n] = (byte)n2;
            }
            else {
                Class8601.field36113.putByte(this.field34 + n, (byte)n2);
            }
            return;
        }
        throw new IllegalArgumentException("The value has to be 0 or 1.");
    }
    
    @Override
    public final void method167(final long n, final long n2) {
        if (n2 >= 0L && n2 <= 1L) {
            if (this.field34 == 0L) {
                if (this.field32) {
                    throw new IllegalAccessError("Constant arrays cannot be modified.");
                }
                this.field65[(int)n] = (byte)n2;
            }
            else {
                Class8601.field36113.putByte(this.field34 + n, (byte)n2);
            }
            return;
        }
        throw new IllegalArgumentException("The value has to be 0 or 1.");
    }
    
    @Override
    public final void method169(final long n, final float n2) {
        if (n2 != 0.0 && n2 != 1.0) {
            throw new IllegalArgumentException("The value has to be 0 or 1.");
        }
        if (this.field34 == 0L) {
            if (this.field32) {
                throw new IllegalAccessError("Constant arrays cannot be modified.");
            }
            this.field65[(int)n] = (byte)n2;
        }
        else {
            Class8601.field36113.putByte(this.field34 + n, (byte)n2);
        }
    }
    
    @Override
    public final void method171(final long n, final double n2) {
        if (n2 != 0.0 && n2 != 1.0) {
            throw new IllegalArgumentException("The value has to be 0 or 1.");
        }
        if (this.field34 == 0L) {
            if (this.field32) {
                throw new IllegalAccessError("Constant arrays cannot be modified.");
            }
            this.field65[(int)n] = (byte)n2;
        }
        else {
            Class8601.field36113.putByte(this.field34 + n, (byte)n2);
        }
    }
    
    public Class23 method231(final Class23 class23) {
        if (class23 == null || class23.method118() != this.field30) {
            throw new IllegalArgumentException("array == null || array.length() != length");
        }
        final Class23 class24 = new Class23(class23.method118(), false);
        final int n = (int)Class7640.method24129(this.field30, Class8216.method27224());
        if (n <= 2 || this.field30 < Class8216.method27221()) {
            for (long n2 = 0L; n2 < this.field30; ++n2) {
                class24.method159(n2, (byte)(this.method125(n2) & class23.method125(n2)));
            }
        }
        else {
            final long n3 = this.field30 / n;
            final Future[] array = new Future[n];
            for (int i = 0; i < n; ++i) {
                final long n4 = i * n3;
                array[i] = Class8216.method27227(new Class1270(this, n4, (i == n - 1) ? this.field30 : (n4 + n3), class24, class23));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException ex) {
                for (long n5 = 0L; n5 < this.field30; ++n5) {
                    class24.method159(n5, (byte)(this.method125(n5) & class23.method125(n5)));
                }
            }
            catch (final ExecutionException ex2) {
                for (long n6 = 0L; n6 < this.field30; ++n6) {
                    class24.method159(n6, (byte)(this.method125(n6) & class23.method125(n6)));
                }
            }
        }
        return class24;
    }
    
    public Class23 method232(final Class23 class23) {
        if (class23 == null || class23.method118() != this.field30) {
            throw new IllegalArgumentException("array == null || array.length() != length");
        }
        final Class23 class24 = new Class23(class23.method118(), false);
        final int n = (int)Class7640.method24129(this.field30, Class8216.method27224());
        if (n <= 2 || this.field30 < Class8216.method27221()) {
            for (long n2 = 0L; n2 < this.field30; ++n2) {
                class24.method159(n2, (byte)(this.method125(n2) | class23.method125(n2)));
            }
        }
        else {
            final long n3 = this.field30 / n;
            final Future[] array = new Future[n];
            for (int i = 0; i < n; ++i) {
                final long n4 = i * n3;
                array[i] = Class8216.method27227(new Class1159(this, n4, (i == n - 1) ? this.field30 : (n4 + n3), class24, class23));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException ex) {
                for (long n5 = 0L; n5 < this.field30; ++n5) {
                    class24.method159(n5, (byte)(this.method125(n5) | class23.method125(n5)));
                }
            }
            catch (final ExecutionException ex2) {
                for (long n6 = 0L; n6 < this.field30; ++n6) {
                    class24.method159(n6, (byte)(this.method125(n6) | class23.method125(n6)));
                }
            }
        }
        return class24;
    }
    
    public Class23 method233(final Class23 class23) {
        if (class23 == null || class23.method118() != this.field30) {
            throw new IllegalArgumentException("array == null || array.length() != length");
        }
        final Class23 class24 = new Class23(class23.method118(), false);
        final int n = (int)Class7640.method24129(this.field30, Class8216.method27224());
        if (n <= 2 || this.field30 < Class8216.method27221()) {
            for (long n2 = 0L; n2 < this.field30; ++n2) {
                class24.method159(n2, (byte)(this.method125(n2) ^ class23.method125(n2)));
            }
        }
        else {
            final long n3 = this.field30 / n;
            final Future[] array = new Future[n];
            for (int i = 0; i < n; ++i) {
                final long n4 = i * n3;
                array[i] = Class8216.method27227(new Class1305(this, n4, (i == n - 1) ? this.field30 : (n4 + n3), class24, class23));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException ex) {
                for (long n5 = 0L; n5 < this.field30; ++n5) {
                    class24.method159(n5, (byte)(this.method125(n5) ^ class23.method125(n5)));
                }
            }
            catch (final ExecutionException ex2) {
                for (long n6 = 0L; n6 < this.field30; ++n6) {
                    class24.method159(n6, (byte)(this.method125(n6) ^ class23.method125(n6)));
                }
            }
        }
        return class24;
    }
    
    public Class23 method234() {
        final Class23 class23 = new Class23(this.field30, false);
        final int n = (int)Class7640.method24129(this.field30, Class8216.method27224());
        if (n <= 2 || this.field30 < Class8216.method27221()) {
            for (long n2 = 0L; n2 < this.field30; ++n2) {
                class23.method159(n2, (byte)(1 - this.method125(n2)));
            }
        }
        else {
            final long n3 = this.field30 / n;
            final Future[] array = new Future[n];
            for (int i = 0; i < n; ++i) {
                final long n4 = i * n3;
                array[i] = Class8216.method27227(new Class1374(this, n4, (i == n - 1) ? this.field30 : (n4 + n3), class23));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException ex) {
                for (long n5 = 0L; n5 < this.field30; ++n5) {
                    class23.method159(n5, (byte)(1 - this.method125(n5)));
                }
            }
            catch (final ExecutionException ex2) {
                for (long n6 = 0L; n6 < this.field30; ++n6) {
                    class23.method159(n6, (byte)(1 - this.method125(n6)));
                }
            }
        }
        return class23;
    }
}
