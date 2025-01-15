// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.UnsupportedEncodingException;
import sun.misc.Cleaner;

public class Class13 extends Class11
{
    private static final long field39 = -4096759496772248522L;
    private String[] field40;
    private Class16 field41;
    private int field42;
    private long field43;
    private byte[] field44;
    private static final String field45 = "UTF-8";
    private static final int field46 = 4;
    
    public Class13(final long n) {
        this(n, 100);
    }
    
    public Class13(final long n, final int n2) {
        this(n, n2, true);
    }
    
    public Class13(final long n, final int n2, final boolean b) {
        this.field29 = Class273.field1494;
        this.field31 = 1L;
        if (n <= 0L) {
            throw new IllegalArgumentException(n + " is not a positive long value.");
        }
        if (n2 > 0) {
            this.field30 = n;
            this.field43 = n * n2 * 4L;
            this.field42 = n2;
            if (n <= method177()) {
                this.field40 = new String[(int)n];
            }
            else {
                this.field34 = Class8601.field36113.allocateMemory(this.field43 * this.field31);
                if (b) {
                    this.method178(this.field43);
                }
                Cleaner.create((Object)this, (Runnable)new Class993(this.field34, this.field43, this.field31));
                Class7579.method23860(this.field43 * this.field31);
                this.field41 = new Class16(n);
                this.field44 = new byte[n2 * 4];
            }
            return;
        }
        throw new IllegalArgumentException(n2 + " is not a positive int value.");
    }
    
    public Class13(final long n, final String s) {
        this.field29 = Class273.field1494;
        this.field31 = 1L;
        if (n > 0L) {
            this.field30 = n;
            this.field32 = true;
            this.field40 = new String[] { s };
            return;
        }
        throw new IllegalArgumentException(n + " is not a positive long value");
    }
    
    public Class13(final String[] field40) {
        this.field29 = Class273.field1494;
        this.field31 = 1L;
        this.field30 = field40.length;
        this.field40 = field40;
    }
    
    @Override
    public Class13 clone() {
        if (!this.field32) {
            final Class13 class13 = new Class13(this.field30, Class7640.method24132(1, this.field42), false);
            Class8601.method29160(this, 0L, class13, 0L, this.field30);
            return class13;
        }
        return new Class13(this.field30, this.method182(0L));
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!super.equals(o)) {
            return false;
        }
        final Class13 class13 = (Class13)o;
        final boolean b = this.field42 == class13.field42 && this.field40 == class13.field40;
        if (this.field41 != null && class13.field41 != null) {
            return b && this.field41.equals(class13.field41);
        }
        return this.field41 == class13.field41 && b;
    }
    
    @Override
    public int hashCode() {
        return 29 * (29 * (29 * super.hashCode() + ((this.field40 == null) ? 0 : this.field40.hashCode())) + (this.field42 ^ this.field42 >>> 16)) + ((this.field41 == null) ? 0 : this.field41.hashCode());
    }
    
    public final String method182(final long n) {
        if (this.field34 != 0L) {
            final short method129 = this.field41.method129(n);
            if (method129 < 0) {
                return null;
            }
            final long n2 = this.field31 * n * this.field42 * 4L;
            for (short n3 = 0; n3 < method129; ++n3) {
                this.field44[n3] = Class8601.field36113.getByte(this.field34 + n2 + this.field31 * n3);
            }
            try {
                return new String(this.field44, 0, method129, "UTF-8");
            }
            catch (final UnsupportedEncodingException ex) {
                return null;
            }
        }
        if (this.field32) {
            return this.field40[0];
        }
        return this.field40[(int)n];
    }
    
    public final String method183(final long n) {
        final short method129 = this.field41.method129(n);
        if (method129 < 0) {
            return null;
        }
        final long n2 = this.field31 * n * this.field42 * 4L;
        for (short n3 = 0; n3 < method129; ++n3) {
            this.field44[n3] = Class8601.field36113.getByte(this.field34 + n2 + this.field31 * n3);
        }
        try {
            return new String(this.field44, 0, method129, "UTF-8");
        }
        catch (final UnsupportedEncodingException ex) {
            return null;
        }
    }
    
    @Override
    public final boolean method123(final long n) {
        final String method182 = this.method182(n);
        return method182 != null && method182.length() != 0;
    }
    
    @Override
    public final byte method125(final long n) {
        final String method182 = this.method182(n);
        return (byte)((method182 == null) ? 0 : method182.length());
    }
    
    @Override
    public final short method127(final long n) {
        final String method182 = this.method182(n);
        return (short)((method182 == null) ? 0 : (0xFF & method182.length()));
    }
    
    @Override
    public final short method129(final long n) {
        final String method182 = this.method182(n);
        return (short)((method182 == null) ? 0 : method182.length());
    }
    
    @Override
    public final int method131(final long n) {
        final String method182 = this.method182(n);
        return (method182 == null) ? 0 : method182.length();
    }
    
    @Override
    public final long method133(final long n) {
        final String method182 = this.method182(n);
        return (method182 == null) ? 0 : method182.length();
    }
    
    @Override
    public final float method135(final long n) {
        final String method182 = this.method182(n);
        return (float)((method182 == null) ? 0 : method182.length());
    }
    
    @Override
    public final double method137(final long n) {
        final String method182 = this.method182(n);
        return (method182 == null) ? 0 : method182.length();
    }
    
    public final String[] method184() {
        return this.field40;
    }
    
    @Override
    public final boolean[] method140() {
        if (this.field30 <= 1073741824L) {
            final boolean[] array = new boolean[(int)this.field30];
            if (this.field34 == 0L) {
                if (!this.field32) {
                    for (int n = 0; n < this.field30; ++n) {
                        array[n] = (this.field40[n] != null && this.field40[n].length() != 0);
                    }
                }
                else {
                    final boolean b = this.field40[0] != null && this.field40[0].length() != 0;
                    for (int n2 = 0; n2 < this.field30; ++n2) {
                        array[n2] = b;
                    }
                }
            }
            else {
                for (int n3 = 0; n3 < this.field30; ++n3) {
                    array[n3] = (this.field41.method129(n3) != 0);
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
                                        array2[n5++] = (((this.field40[(int)n6] == null) ? 0 : this.field40[(int)n6].length()) != 0);
                                    }
                                }
                                else {
                                    final boolean b = this.field40[0] != null && this.field40[0].length() != 0;
                                    for (long n7 = n; n7 < n2; n7 += n3) {
                                        array2[n5++] = b;
                                    }
                                }
                            }
                            else {
                                for (long n8 = n; n8 < n2; n8 += n3) {
                                    array2[n5++] = (this.field41.method129(n8) > 0);
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
                        array[n] = (byte)((this.field40[n] == null) ? 0 : this.field40[n].length());
                    }
                }
                else {
                    final byte b = (byte)((this.field40[0] == null) ? 0 : this.field40[0].length());
                    for (int n2 = 0; n2 < this.field30; ++n2) {
                        array[n2] = b;
                    }
                }
            }
            else {
                for (int n3 = 0; n3 < this.field30; ++n3) {
                    array[n3] = (byte)this.field41.method129(n3);
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
                                        array2[n5++] = (byte)((this.field40[(int)n6] == null) ? 0 : this.field40[(int)n6].length());
                                    }
                                }
                                else {
                                    for (long n7 = n; n7 < n2; n7 += n3) {
                                        array2[n5++] = (byte)((this.field40[0] == null) ? 0 : this.field40[0].length());
                                    }
                                }
                            }
                            else {
                                for (long n8 = n; n8 < n2; n8 += n3) {
                                    array2[n5++] = (byte)this.field41.method129(n8);
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
                        array[n] = (short)((this.field40[n] == null) ? 0 : this.field40[n].length());
                    }
                }
                else {
                    final short n2 = (short)((this.field40[0] == null) ? 0 : this.field40[0].length());
                    for (int n3 = 0; n3 < this.field30; ++n3) {
                        array[n3] = n2;
                    }
                }
            }
            else {
                for (int n4 = 0; n4 < this.field30; ++n4) {
                    array[n4] = this.field41.method129(n4);
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
                                        array2[n5++] = (short)((this.field40[(int)n6] == null) ? 0 : this.field40[(int)n6].length());
                                    }
                                }
                                else {
                                    for (long n7 = n; n7 < n2; n7 += n3) {
                                        array2[n5++] = (short)((this.field40[0] == null) ? 0 : this.field40[0].length());
                                    }
                                }
                            }
                            else {
                                for (long n8 = n; n8 < n2; n8 += n3) {
                                    array2[n5++] = this.field41.method129(n8);
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
                        array[n] = ((this.field40[n] == null) ? 0 : this.field40[n].length());
                    }
                }
                else {
                    final int n2 = (this.field40[0] == null) ? 0 : this.field40[0].length();
                    for (int n3 = 0; n3 < this.field30; ++n3) {
                        array[n3] = n2;
                    }
                }
            }
            else {
                for (int n4 = 0; n4 < this.field30; ++n4) {
                    array[n4] = this.field41.method129(n4);
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
                                        array2[n5++] = ((this.field40[(int)n6] == null) ? 0 : this.field40[(int)n6].length());
                                    }
                                }
                                else {
                                    for (long n7 = n; n7 < n2; n7 += n3) {
                                        array2[n5++] = ((this.field40[0] == null) ? 0 : this.field40[0].length());
                                    }
                                }
                            }
                            else {
                                for (long n8 = n; n8 < n2; n8 += n3) {
                                    array2[n5++] = this.field41.method129(n8);
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
                        array[n] = ((this.field40[n] == null) ? 0L : this.field40[n].length());
                    }
                }
                else {
                    final int n2 = (this.field40[0] == null) ? 0 : this.field40[0].length();
                    for (int n3 = 0; n3 < this.field30; ++n3) {
                        array[n3] = n2;
                    }
                }
            }
            else {
                for (int n4 = 0; n4 < this.field30; ++n4) {
                    array[n4] = this.field41.method129(n4);
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
                                        array2[n5++] = ((this.field40[(int)n6] == null) ? 0 : this.field40[(int)n6].length());
                                    }
                                }
                                else {
                                    for (long n7 = n; n7 < n2; n7 += n3) {
                                        array2[n5++] = ((this.field40[0] == null) ? 0 : this.field40[0].length());
                                    }
                                }
                            }
                            else {
                                for (long n8 = n; n8 < n2; n8 += n3) {
                                    array2[n5++] = this.field41.method129(n8);
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
                        array[n] = ((this.field40[n] == null) ? 0.0f : ((float)this.field40[n].length()));
                    }
                }
                else {
                    final int n2 = (this.field40[0] == null) ? 0 : this.field40[0].length();
                    for (int n3 = 0; n3 < this.field30; ++n3) {
                        array[n3] = (float)n2;
                    }
                }
            }
            else {
                for (int n4 = 0; n4 < this.field30; ++n4) {
                    array[n4] = this.field41.method129(n4);
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
                                        array2[n5++] = (float)((this.field40[(int)n6] == null) ? 0 : this.field40[(int)n6].length());
                                    }
                                }
                                else {
                                    for (long n7 = n; n7 < n2; n7 += n3) {
                                        array2[n5++] = ((this.field40[0] == null) ? 0.0f : ((float)this.field40[0].length()));
                                    }
                                }
                            }
                            else {
                                for (long n8 = n; n8 < n2; n8 += n3) {
                                    array2[n5++] = this.field41.method129(n8);
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
                        array[n] = ((this.field40[n] == null) ? 0.0 : this.field40[n].length());
                    }
                }
                else {
                    final int n2 = (this.field40[0] == null) ? 0 : this.field40[0].length();
                    for (int n3 = 0; n3 < this.field30; ++n3) {
                        array[n3] = n2;
                    }
                }
            }
            else {
                for (int n4 = 0; n4 < this.field30; ++n4) {
                    array[n4] = this.field41.method129(n4);
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
                                        array2[n5++] = ((this.field40[(int)n6] == null) ? 0 : this.field40[(int)n6].length());
                                    }
                                }
                                else {
                                    for (long n7 = n; n7 < n2; n7 += n3) {
                                        array2[n5++] = ((this.field40[0] == null) ? 0.0 : this.field40[0].length());
                                    }
                                }
                            }
                            else {
                                for (long n8 = n; n8 < n2; n8 += n3) {
                                    array2[n5++] = this.field41.method129(n8);
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
    public final void method155(final long n, final Object obj) {
        if (obj == null) {
            this.field41.method163(n, (short)(-1));
        }
        else {
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException(obj + " is not a string.");
            }
            final String s = (String)obj;
            if (s.length() > this.field42) {
                throw new IllegalArgumentException("String  " + s + " is too long.");
            }
            byte[] bytes;
            try {
                bytes = s.getBytes("UTF-8");
            }
            catch (final UnsupportedEncodingException ex) {
                return;
            }
            final int length = bytes.length;
            if (length > 32767) {
                throw new IllegalArgumentException("String  " + s + " is too long.");
            }
            this.field41.method163(n, (short)length);
            final long n2 = this.field31 * n * this.field42 * 4L;
            for (int i = 0; i < length; ++i) {
                Class8601.field36113.putByte(this.field34 + n2 + this.field31 * i, bytes[i]);
            }
        }
    }
    
    @Override
    public final void method154(final long n, final Object obj) {
        if (obj == null) {
            if (this.field34 != 0L) {
                this.field41.method163(n, (short)(-1));
            }
            else {
                if (this.field32) {
                    throw new IllegalAccessError("Constant arrays cannot be modified.");
                }
                this.field40[(int)n] = null;
            }
        }
        else {
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException(obj + " is not a string.");
            }
            final String s = (String)obj;
            if (this.field34 != 0L) {
                if (s.length() > this.field42) {
                    throw new IllegalArgumentException("String  " + s + " is too long.");
                }
                byte[] bytes;
                try {
                    bytes = s.getBytes("UTF-8");
                }
                catch (final UnsupportedEncodingException ex) {
                    return;
                }
                final int length = bytes.length;
                if (length > 32767) {
                    throw new IllegalArgumentException("String  " + s + " is too long.");
                }
                this.field41.method163(n, (short)length);
                final long n2 = this.field31 * n * this.field42 * 4L;
                for (int i = 0; i < length; ++i) {
                    Class8601.field36113.putByte(this.field34 + n2 + this.field31 * i, bytes[i]);
                }
            }
            else {
                if (this.field32) {
                    throw new IllegalAccessError("Constant arrays cannot be modified.");
                }
                this.field40[(int)n] = s;
            }
        }
    }
    
    @Override
    public final void method156(final long i, final Object o) {
        if (i >= 0L && i < this.field30) {
            this.method154(i, o);
            return;
        }
        throw new ArrayIndexOutOfBoundsException(Long.toString(i));
    }
    
    @Override
    public final void method157(final long n, final boolean b) {
        this.method154(n, Boolean.toString(b));
    }
    
    @Override
    public final void method159(final long n, final byte b) {
        this.method154(n, Byte.toString(b));
    }
    
    @Override
    public final void method161(final long n, final short n2) {
        this.method163(n, n2);
    }
    
    @Override
    public final void method163(final long n, final short s) {
        this.method154(n, Short.toString(s));
    }
    
    @Override
    public final void method165(final long n, final int i) {
        this.method154(n, Integer.toString(i));
    }
    
    @Override
    public final void method167(final long n, final long i) {
        this.method154(n, Long.toString(i));
    }
    
    @Override
    public final void method169(final long n, final float f) {
        this.method154(n, Float.toString(f));
    }
    
    @Override
    public final void method171(final long n, final double d) {
        this.method154(n, Double.toString(d));
    }
    
    public int method185() {
        return this.field42;
    }
}
