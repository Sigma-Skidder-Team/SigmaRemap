// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.io.Serializable;

public abstract class Class11 implements Serializable, Cloneable
{
    private static final long field28 = 7921589398878016801L;
    public Class273 field29;
    public long field30;
    public long field31;
    public boolean field32;
    public Object field33;
    public long field34;
    private static int field35;
    public static final int field36 = 1073741824;
    
    public Class11() {
        this.field32 = false;
        this.field33 = null;
        this.field34 = 0L;
    }
    
    public Class11(final Object field33, final long field34, final Class273 field35, final long n) {
        this.field32 = false;
        this.field33 = null;
        this.field34 = 0L;
        this.field33 = field33;
        this.field34 = field34;
        this.field29 = field35;
        this.field31 = field35.method922();
        if (n > 0L) {
            this.field30 = n;
            return;
        }
        throw new IllegalArgumentException(n + " is not a positive long value");
    }
    
    public long method117() {
        return this.field34;
    }
    
    public long method118() {
        return this.field30;
    }
    
    public Class273 method119() {
        return this.field29;
    }
    
    public abstract Object method120(final long p0);
    
    public Object method121(final long i) {
        if (i >= 0L && i < this.field30) {
            return this.method120(i);
        }
        throw new ArrayIndexOutOfBoundsException(Long.toString(i));
    }
    
    public abstract Object method122(final long p0);
    
    public abstract boolean method123(final long p0);
    
    public boolean method124(final long i) {
        if (i >= 0L && i < this.field30) {
            return this.method123(i);
        }
        throw new ArrayIndexOutOfBoundsException(Long.toString(i));
    }
    
    public abstract byte method125(final long p0);
    
    public byte method126(final long i) {
        if (i >= 0L && i < this.field30) {
            return this.method125(i);
        }
        throw new ArrayIndexOutOfBoundsException(Long.toString(i));
    }
    
    public abstract short method127(final long p0);
    
    public short method128(final long i) {
        if (i >= 0L && i < this.field30) {
            return this.method127(i);
        }
        throw new ArrayIndexOutOfBoundsException(Long.toString(i));
    }
    
    public abstract short method129(final long p0);
    
    public short method130(final long i) {
        if (i >= 0L && i < this.field30) {
            return this.method129(i);
        }
        throw new ArrayIndexOutOfBoundsException(Long.toString(i));
    }
    
    public abstract int method131(final long p0);
    
    public int method132(final long i) {
        if (i >= 0L && i < this.field30) {
            return this.method131(i);
        }
        throw new ArrayIndexOutOfBoundsException(Long.toString(i));
    }
    
    public abstract long method133(final long p0);
    
    public long method134(final long i) {
        if (i >= 0L && i < this.field30) {
            return this.method133(i);
        }
        throw new ArrayIndexOutOfBoundsException(Long.toString(i));
    }
    
    public abstract float method135(final long p0);
    
    public float method136(final long i) {
        if (i >= 0L && i < this.field30) {
            return this.method135(i);
        }
        throw new ArrayIndexOutOfBoundsException(Long.toString(i));
    }
    
    public abstract double method137(final long p0);
    
    public double method138(final long i) {
        if (i >= 0L && i < this.field30) {
            return this.method137(i);
        }
        throw new ArrayIndexOutOfBoundsException(Long.toString(i));
    }
    
    public abstract Object method139();
    
    public abstract boolean[] method140();
    
    public abstract boolean[] method141(final boolean[] p0, final long p1, final long p2, final long p3);
    
    public abstract byte[] method142();
    
    public abstract byte[] method143(final byte[] p0, final long p1, final long p2, final long p3);
    
    public abstract short[] method144();
    
    public abstract short[] method145(final short[] p0, final long p1, final long p2, final long p3);
    
    public abstract int[] method146();
    
    public abstract int[] method147(final int[] p0, final long p1, final long p2, final long p3);
    
    public abstract long[] method148();
    
    public abstract long[] method149(final long[] p0, final long p1, final long p2, final long p3);
    
    public abstract float[] method150();
    
    public abstract float[] method151(final float[] p0, final long p1, final long p2, final long p3);
    
    public abstract double[] method152();
    
    public abstract double[] method153(final double[] p0, final long p1, final long p2, final long p3);
    
    public void method154(final long n, final Object o) {
        if (!(o instanceof Boolean)) {
            if (!(o instanceof Byte)) {
                if (!(o instanceof Short)) {
                    if (!(o instanceof Integer)) {
                        if (!(o instanceof Long)) {
                            if (!(o instanceof Float)) {
                                if (!(o instanceof Double)) {
                                    throw new IllegalArgumentException("Unsupported type.");
                                }
                                this.method171(n, (double)o);
                            }
                            else {
                                this.method169(n, (float)o);
                            }
                        }
                        else {
                            this.method167(n, (long)o);
                        }
                    }
                    else {
                        this.method165(n, (int)o);
                    }
                }
                else {
                    this.method163(n, (short)o);
                }
            }
            else {
                this.method159(n, (byte)o);
            }
        }
        else {
            this.method157(n, (boolean)o);
        }
    }
    
    public abstract void method155(final long p0, final Object p1);
    
    public void method156(final long n, final Object o) {
        if (!(o instanceof Boolean)) {
            if (!(o instanceof Byte)) {
                if (!(o instanceof Short)) {
                    if (!(o instanceof Integer)) {
                        if (!(o instanceof Long)) {
                            if (!(o instanceof Float)) {
                                if (!(o instanceof Double)) {
                                    throw new IllegalArgumentException("Unsupported type.");
                                }
                                this.method172(n, (double)o);
                            }
                            else {
                                this.method170(n, (float)o);
                            }
                        }
                        else {
                            this.method168(n, (long)o);
                        }
                    }
                    else {
                        this.method166(n, (int)o);
                    }
                }
                else {
                    this.method164(n, (short)o);
                }
            }
            else {
                this.method160(n, (byte)o);
            }
        }
        else {
            this.method158(n, (boolean)o);
        }
    }
    
    public abstract void method157(final long p0, final boolean p1);
    
    public void method158(final long i, final boolean b) {
        if (i >= 0L && i < this.field30) {
            this.method157(i, b);
            return;
        }
        throw new ArrayIndexOutOfBoundsException(Long.toString(i));
    }
    
    public abstract void method159(final long p0, final byte p1);
    
    public void method160(final long i, final byte b) {
        if (i >= 0L && i < this.field30) {
            this.method159(i, b);
            return;
        }
        throw new ArrayIndexOutOfBoundsException(Long.toString(i));
    }
    
    public abstract void method161(final long p0, final short p1);
    
    public void method162(final long i, final byte b) {
        if (i >= 0L && i < this.field30) {
            this.method161(i, b);
            return;
        }
        throw new ArrayIndexOutOfBoundsException(Long.toString(i));
    }
    
    public abstract void method163(final long p0, final short p1);
    
    public void method164(final long i, final short n) {
        if (i >= 0L && i < this.field30) {
            this.method163(i, n);
            return;
        }
        throw new ArrayIndexOutOfBoundsException(Long.toString(i));
    }
    
    public abstract void method165(final long p0, final int p1);
    
    public void method166(final long i, final int n) {
        if (i >= 0L && i < this.field30) {
            this.method165(i, n);
            return;
        }
        throw new ArrayIndexOutOfBoundsException(Long.toString(i));
    }
    
    public abstract void method167(final long p0, final long p1);
    
    public void method168(final long i, final long n) {
        if (i >= 0L && i < this.field30) {
            this.method167(i, n);
            return;
        }
        throw new ArrayIndexOutOfBoundsException(Long.toString(i));
    }
    
    public abstract void method169(final long p0, final float p1);
    
    public void method170(final long i, final float n) {
        if (i >= 0L && i < this.field30) {
            this.method169(i, n);
            return;
        }
        throw new ArrayIndexOutOfBoundsException(Long.toString(i));
    }
    
    public abstract void method171(final long p0, final double p1);
    
    public void method172(final long i, final double n) {
        if (i >= 0L && i < this.field30) {
            this.method171(i, n);
            return;
        }
        throw new ArrayIndexOutOfBoundsException(Long.toString(i));
    }
    
    public boolean method173() {
        return this.field34 != 0L;
    }
    
    public boolean method174() {
        return this.field29.method923();
    }
    
    public boolean method175() {
        return this.field32;
    }
    
    public static void method176(final int field35) {
        if (field35 >= 0) {
            Class11.field35 = field35;
            return;
        }
        throw new IllegalArgumentException("index cannot be negative");
    }
    
    public static int method177() {
        return Class11.field35;
    }
    
    public Object clone() {
        try {
            return super.clone();
        }
        catch (final CloneNotSupportedException ex) {
            throw new InternalError();
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o != null && o instanceof Class11) {
            final Class11 class11 = (Class11)o;
            boolean b = false;
            Label_0109: {
                if (this.field29 == class11.field29) {
                    if (this.field30 == class11.field30) {
                        if (this.field31 == class11.field31) {
                            if (this.field32 == class11.field32) {
                                if (this.field34 == class11.field34) {
                                    b = true;
                                    break Label_0109;
                                }
                            }
                        }
                    }
                }
                b = false;
            }
            final boolean b2 = b;
            boolean b3;
            if (this.field33 != null && class11.field33 != null) {
                b3 = (b2 && this.field33.equals(class11.field33));
            }
            else {
                b3 = (this.field33 == null && class11.field33 == null && b2);
            }
            return b3;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 29 * (29 * (29 * (29 * (29 * (29 * 7 + ((this.field29 == null) ? 0 : this.field29.hashCode())) + (int)(this.field30 ^ this.field30 >>> 32)) + (int)(this.field31 ^ this.field31 >>> 32)) + (this.field32 ? 1 : 0)) + ((this.field33 == null) ? 0 : this.field33.hashCode())) + (int)(this.field34 ^ this.field34 >>> 32);
    }
    
    public void method178(final long n) {
        if (this.field34 != 0L) {
            final int n2 = (int)Class7640.method24129(n, Class8216.method27224());
            if (n2 <= 2 || n < Class8216.method27221()) {
                Class8601.field36113.setMemory(this.field34, n * this.field31, (byte)0);
            }
            else {
                final long n3 = n / n2;
                final Future[] array = new Future[n2];
                final long field34 = this.field34;
                for (int i = 0; i < n2; ++i) {
                    final long n4 = i * n3;
                    array[i] = Class8216.method27227(new Class1250(this, n4, (i == n2 - 1) ? n : (n4 + n3), field34));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException ex) {
                    Class8601.field36113.setMemory(this.field34, n * this.field31, (byte)0);
                }
                catch (final ExecutionException ex2) {
                    Class8601.field36113.setMemory(this.field34, n * this.field31, (byte)0);
                }
            }
        }
    }
    
    static {
        Class11.field35 = 1073741824;
    }
}
