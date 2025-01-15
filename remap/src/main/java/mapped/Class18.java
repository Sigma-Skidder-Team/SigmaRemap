// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import sun.misc.Cleaner;

public class Class18 extends Class11
{
    private static final long field28 = 3135411647668758832L;
    private byte[] field54;
    
    public Class18(final long n) {
        this(n, true);
    }
    
    public Class18(final long n, final boolean b) {
        this.field29 = Class273.field1485;
        this.field31 = 1L;
        if (n > 0L) {
            this.field30 = n;
            if (n <= method177()) {
                this.field54 = new byte[(int)n];
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
    
    public Class18(final long n, final byte b) {
        this.field29 = Class273.field1485;
        this.field31 = 1L;
        if (n > 0L) {
            this.field30 = n;
            this.field32 = true;
            this.field54 = new byte[] { b };
            return;
        }
        throw new IllegalArgumentException(n + " is not a positive long value");
    }
    
    public Class18(final byte[] field54) {
        this.field29 = Class273.field1485;
        this.field31 = 1L;
        this.field30 = field54.length;
        this.field54 = field54;
    }
    
    @Override
    public Class18 clone() {
        if (!this.field32) {
            final Class18 class18 = new Class18(this.field30, false);
            Class8601.method29141(this, 0L, class18, 0L, this.field30);
            return class18;
        }
        return new Class18(this.field30, this.method125(0L));
    }
    
    @Override
    public boolean equals(final Object o) {
        return super.equals(o) && this.field54 == ((Class18)o).field54;
    }
    
    @Override
    public int hashCode() {
        return 29 * super.hashCode() + ((this.field54 == null) ? 0 : this.field54.hashCode());
    }
    
    public final Byte method207(final long n) {
        return this.method125(n);
    }
    
    public final Byte method180(final long n) {
        return Class8601.field36113.getByte(this.field34 + n);
    }
    
    @Override
    public final boolean method123(final long n) {
        if (this.field34 != 0L) {
            return Class8601.field36113.getByte(this.field34 + n) != 0;
        }
        if (!this.field32) {
            return this.field54[(int)n] != 0;
        }
        return this.field54[0] != 0;
    }
    
    @Override
    public final byte method125(final long n) {
        if (this.field34 != 0L) {
            return Class8601.field36113.getByte(this.field34 + n);
        }
        if (!this.field32) {
            return this.field54[(int)n];
        }
        return this.field54[0];
    }
    
    @Override
    public final short method127(final long n) {
        if (this.field34 != 0L) {
            return (short)(0xFF & Class8601.field36113.getByte(this.field34 + n));
        }
        if (!this.field32) {
            return (short)(0xFF & this.field54[(int)n]);
        }
        return (short)(0xFF & this.field54[0]);
    }
    
    @Override
    public final short method129(final long n) {
        if (this.field34 != 0L) {
            return Class8601.field36113.getByte(this.field34 + n);
        }
        if (!this.field32) {
            return this.field54[(int)n];
        }
        return this.field54[0];
    }
    
    @Override
    public final int method131(final long n) {
        if (this.field34 != 0L) {
            return Class8601.field36113.getByte(this.field34 + n);
        }
        if (!this.field32) {
            return this.field54[(int)n];
        }
        return this.field54[0];
    }
    
    @Override
    public final long method133(final long n) {
        if (this.field34 != 0L) {
            return Class8601.field36113.getByte(this.field34 + n);
        }
        if (!this.field32) {
            return this.field54[(int)n];
        }
        return this.field54[0];
    }
    
    @Override
    public final float method135(final long n) {
        if (this.field34 != 0L) {
            return Class8601.field36113.getByte(this.field34 + n);
        }
        if (!this.field32) {
            return this.field54[(int)n];
        }
        return this.field54[0];
    }
    
    @Override
    public final double method137(final long n) {
        if (this.field34 != 0L) {
            return Class8601.field36113.getByte(this.field34 + n);
        }
        if (!this.field32) {
            return this.field54[(int)n];
        }
        return this.field54[0];
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
                                        array2[n5++] = (this.field54[(int)n6] != 0);
                                    }
                                }
                                else {
                                    final boolean b = this.field54[0] != 0;
                                    for (long n7 = n; n7 < n2; n7 += n3) {
                                        array2[n5++] = b;
                                    }
                                }
                            }
                            else {
                                for (long n8 = n; n8 < n2; n8 += n3) {
                                    array2[n5++] = (Class8601.field36113.getByte(this.field34 + n8) != 0);
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
                        array[n] = (this.field54[n] != 0);
                    }
                }
                else {
                    final boolean b = this.field54[0] != 0;
                    for (int n2 = 0; n2 < this.field30; ++n2) {
                        array[n2] = b;
                    }
                }
            }
            else {
                for (int n3 = 0; n3 < this.field30; ++n3) {
                    array[n3] = (Class8601.field36113.getByte(this.field34 + n3) != 0);
                }
            }
            return array;
        }
        return null;
    }
    
    public final byte[] method181() {
        return this.field54;
    }
    
    @Override
    public final byte[] method142() {
        if (this.field30 <= 1073741824L) {
            final byte[] array = new byte[(int)this.field30];
            if (this.field34 == 0L) {
                if (!this.field32) {
                    System.arraycopy(this.field54, 0, array, 0, (int)this.field30);
                }
                else {
                    final byte b = this.field54[0];
                    for (int n = 0; n < this.field30; ++n) {
                        array[n] = b;
                    }
                }
            }
            else {
                for (int n2 = 0; n2 < this.field30; ++n2) {
                    array[n2] = Class8601.field36113.getByte(this.field34 + n2);
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
                                        array2[n5++] = this.field54[(int)n6];
                                    }
                                }
                                else {
                                    for (long n7 = n; n7 < n2; n7 += n3) {
                                        array2[n5++] = this.field54[0];
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
                        array[n] = this.field54[n];
                    }
                }
                else {
                    final short n2 = this.field54[0];
                    for (int n3 = 0; n3 < this.field30; ++n3) {
                        array[n3] = n2;
                    }
                }
            }
            else {
                for (int n4 = 0; n4 < this.field30; ++n4) {
                    array[n4] = Class8601.field36113.getByte(this.field34 + n4);
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
                                        array2[n5++] = this.field54[(int)n6];
                                    }
                                }
                                else {
                                    for (long n7 = n; n7 < n2; n7 += n3) {
                                        array2[n5++] = this.field54[0];
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
                        array[n] = this.field54[n];
                    }
                }
                else {
                    final byte b = this.field54[0];
                    for (int n2 = 0; n2 < this.field30; ++n2) {
                        array[n2] = b;
                    }
                }
            }
            else {
                for (int n3 = 0; n3 < this.field30; ++n3) {
                    array[n3] = Class8601.field36113.getByte(this.field34 + n3);
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
                                        array2[n5++] = this.field54[(int)n6];
                                    }
                                }
                                else {
                                    for (long n7 = n; n7 < n2; n7 += n3) {
                                        array2[n5++] = this.field54[0];
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
                        array[n] = this.field54[n];
                    }
                }
                else {
                    final byte b = this.field54[0];
                    for (int n2 = 0; n2 < this.field30; ++n2) {
                        array[n2] = b;
                    }
                }
            }
            else {
                for (int n3 = 0; n3 < this.field30; ++n3) {
                    array[n3] = Class8601.field36113.getByte(this.field34 + n3);
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
                                        array2[n5++] = this.field54[(int)n6];
                                    }
                                }
                                else {
                                    for (long n7 = n; n7 < n2; n7 += n3) {
                                        array2[n5++] = this.field54[0];
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
                        array[n] = this.field54[n];
                    }
                }
                else {
                    final byte b = this.field54[0];
                    for (int n2 = 0; n2 < this.field30; ++n2) {
                        array[n2] = b;
                    }
                }
            }
            else {
                for (int n3 = 0; n3 < this.field30; ++n3) {
                    array[n3] = Class8601.field36113.getByte(this.field34 + n3);
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
                                        array2[n5++] = this.field54[(int)n6];
                                    }
                                }
                                else {
                                    for (long n7 = n; n7 < n2; n7 += n3) {
                                        array2[n5++] = this.field54[0];
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
                        array[n] = this.field54[n];
                    }
                }
                else {
                    final byte b = this.field54[0];
                    for (int n2 = 0; n2 < this.field30; ++n2) {
                        array[n2] = b;
                    }
                }
            }
            else {
                for (int n3 = 0; n3 < this.field30; ++n3) {
                    array[n3] = Class8601.field36113.getByte(this.field34 + n3);
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
                                        array2[n5++] = this.field54[(int)n6];
                                    }
                                }
                                else {
                                    for (long n7 = n; n7 < n2; n7 += n3) {
                                        array2[n5++] = this.field54[0];
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
            this.field54[(int)n] = (byte)(b ? 1 : 0);
        }
        else {
            Class8601.field36113.putByte(this.field34 + n, (byte)(b ? 1 : 0));
        }
    }
    
    @Override
    public final void method159(final long n, final byte x) {
        if (this.field34 == 0L) {
            if (this.field32) {
                throw new IllegalAccessError("Constant arrays cannot be modified.");
            }
            this.field54[(int)n] = x;
        }
        else {
            Class8601.field36113.putByte(this.field34 + n, x);
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
            this.field54[(int)n] = (byte)n2;
        }
        else {
            Class8601.field36113.putByte(this.field34 + n, (byte)n2);
        }
    }
    
    @Override
    public final void method165(final long n, final int n2) {
        if (this.field34 == 0L) {
            if (this.field32) {
                throw new IllegalAccessError("Constant arrays cannot be modified.");
            }
            this.field54[(int)n] = (byte)n2;
        }
        else {
            Class8601.field36113.putByte(this.field34 + n, (byte)n2);
        }
    }
    
    @Override
    public final void method167(final long n, final long n2) {
        if (this.field34 == 0L) {
            if (this.field32) {
                throw new IllegalAccessError("Constant arrays cannot be modified.");
            }
            this.field54[(int)n] = (byte)n2;
        }
        else {
            Class8601.field36113.putByte(this.field34 + n, (byte)n2);
        }
    }
    
    @Override
    public final void method169(final long n, final float n2) {
        if (this.field34 == 0L) {
            if (this.field32) {
                throw new IllegalAccessError("Constant arrays cannot be modified.");
            }
            this.field54[(int)n] = (byte)n2;
        }
        else {
            Class8601.field36113.putByte(this.field34 + n, (byte)n2);
        }
    }
    
    @Override
    public final void method171(final long n, final double n2) {
        if (this.field34 == 0L) {
            if (this.field32) {
                throw new IllegalAccessError("Constant arrays cannot be modified.");
            }
            this.field54[(int)n] = (byte)n2;
        }
        else {
            Class8601.field36113.putByte(this.field34 + n, (byte)n2);
        }
    }
}
