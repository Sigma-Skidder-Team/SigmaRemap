// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class21 extends Class11
{
    private static final long field28 = 15533907580310407L;
    private Class17 field61;
    private Class17 field62;
    
    public Class21(final long n) {
        this(n, true);
    }
    
    public Class21(final long n, final boolean b) {
        this.field29 = Class273.field1493;
        this.field31 = 8L;
        if (n > 0L) {
            this.field30 = n;
            this.field61 = new Class17(n, b);
            this.field62 = new Class17(n, b);
            return;
        }
        throw new IllegalArgumentException(n + " is not a positive long value");
    }
    
    public Class21(final long n, final double[] array) {
        this.field29 = Class273.field1493;
        this.field31 = 8L;
        if (n <= 0L) {
            throw new IllegalArgumentException(n + " is not a positive long value");
        }
        if (array != null && array.length == 2) {
            this.field30 = n;
            this.field32 = true;
            this.field61 = new Class17(n, array[0]);
            this.field62 = new Class17(n, array[1]);
            return;
        }
        throw new IllegalArgumentException("constantValue == null || constantValue.length != 2");
    }
    
    public Class21(final double[] array) {
        this(new Class17(array));
    }
    
    public Class21(final Class17 class17) {
        if (class17.method118() % 2L != 0L) {
            throw new IllegalArgumentException("The length of the data array must be even.");
        }
        if (class17.method118() > 0L) {
            this.field29 = Class273.field1493;
            this.field31 = 8L;
            this.field30 = class17.field30 / 2L;
            if (!(this.field32 = class17.field32)) {
                this.field61 = new Class17(this.field30, false);
                this.field62 = new Class17(this.field30, false);
                for (long n = 0L; n < this.field30; ++n) {
                    this.field61.method171(n, class17.method137(2L * n));
                    this.field62.method171(n, class17.method137(2L * n + 1L));
                }
            }
            else {
                this.field61 = new Class17(this.field30, class17.method137(0L));
                this.field62 = new Class17(this.field30, class17.method137(1L));
            }
            return;
        }
        throw new IllegalArgumentException(class17.method118() + " is not a positive long value");
    }
    
    public Class21(final double[] array, final double[] array2) {
        this(new Class17(array), new Class17(array2));
    }
    
    public Class21(final Class17 field61, final Class17 field62) {
        if (field61.method118() != field62.method118()) {
            throw new IllegalArgumentException("The length of the dataRe must be equal to the length of dataIm.");
        }
        if (field61.method118() <= 0L) {
            throw new IllegalArgumentException(field61.method118() + " is not a positive long value");
        }
        if (field61.method173() == field62.method173()) {
            this.field29 = Class273.field1493;
            this.field31 = 8L;
            this.field30 = field61.method118();
            this.field61 = field61;
            this.field62 = field62;
            return;
        }
        throw new IllegalArgumentException("dataRe.isLarge() != dataIm.isLarge()");
    }
    
    @Override
    public Class21 clone() {
        if (!this.field32) {
            final Class21 class21 = new Class21(this.field30, false);
            Class8601.method29158(this, 0L, class21, 0L, this.field30);
            return class21;
        }
        return new Class21(this.field30, new double[] { this.field61.method137(0L), this.field62.method137(0L) });
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!super.equals(o)) {
            return false;
        }
        final Class21 class21 = (Class21)o;
        return this.field61.equals(class21.field61) && this.field62.equals(class21.field62);
    }
    
    @Override
    public int hashCode() {
        return 29 * (29 * super.hashCode() + ((this.field61 == null) ? 0 : this.field61.hashCode())) + ((this.field62 == null) ? 0 : this.field62.hashCode());
    }
    
    @Override
    public boolean method173() {
        return this.field61.method173();
    }
    
    public final Class17 method215() {
        return this.field61;
    }
    
    public final Class17 method216() {
        return this.field62;
    }
    
    public final Class17 method217() {
        final Class17 class17 = new Class17(this.field30, false);
        for (long n = 0L; n < this.field30; ++n) {
            final double method137 = this.field61.method137(n);
            final double method138 = this.field62.method137(n);
            class17.method171(n, Class7640.method24071(method137 * method137 + method138 * method138));
        }
        return class17;
    }
    
    public final Class17 method218() {
        final Class17 class17 = new Class17(this.field30, false);
        for (long n = 0L; n < this.field30; ++n) {
            class17.method171(n, Class7640.method24107(this.field62.method137(n), this.field61.method137(n)));
        }
        return class17;
    }
    
    public final double[] method219(final long n) {
        return this.method222(n);
    }
    
    public final double[] method220(final long n) {
        return new double[] { this.field61.method205(n), this.field62.method205(n) };
    }
    
    @Override
    public final boolean method123(final long n) {
        return this.field61.method123(n);
    }
    
    @Override
    public final byte method125(final long n) {
        return this.field61.method125(n);
    }
    
    @Override
    public final short method127(final long n) {
        return this.field61.method127(n);
    }
    
    @Override
    public final short method129(final long n) {
        return this.field61.method129(n);
    }
    
    @Override
    public final int method131(final long n) {
        return this.field61.method131(n);
    }
    
    @Override
    public final long method133(final long n) {
        return this.field61.method133(n);
    }
    
    @Override
    public final float method135(final long n) {
        return this.field61.method135(n);
    }
    
    @Override
    public final double method137(final long n) {
        return this.field61.method137(n);
    }
    
    public final float[] method221(final long n) {
        return new float[] { this.field61.method135(n), this.field62.method135(n) };
    }
    
    public final double[] method222(final long n) {
        return new double[] { this.field61.method137(n), this.field62.method137(n) };
    }
    
    public final double[][] method223() {
        if (!this.method173()) {
            return new double[][] { this.field61.method206(), this.field62.method206() };
        }
        return null;
    }
    
    @Override
    public final boolean[] method140() {
        return this.field61.method140();
    }
    
    @Override
    public final boolean[] method141(final boolean[] array, final long n, final long n2, final long n3) {
        return this.field61.method141(array, n, n2, n3);
    }
    
    @Override
    public final byte[] method142() {
        return this.field61.method142();
    }
    
    @Override
    public final byte[] method143(final byte[] array, final long n, final long n2, final long n3) {
        return this.field61.method143(array, n, n2, n3);
    }
    
    @Override
    public final short[] method144() {
        return this.field61.method144();
    }
    
    @Override
    public final short[] method145(final short[] array, final long n, final long n2, final long n3) {
        return this.field61.method145(array, n, n2, n3);
    }
    
    @Override
    public final int[] method146() {
        return this.field61.method146();
    }
    
    @Override
    public final int[] method147(final int[] array, final long n, final long n2, final long n3) {
        return this.field61.method147(array, n, n2, n3);
    }
    
    @Override
    public final long[] method148() {
        return this.field61.method148();
    }
    
    @Override
    public final long[] method149(final long[] array, final long n, final long n2, final long n3) {
        return this.field61.method149(array, n, n2, n3);
    }
    
    @Override
    public final float[] method150() {
        return this.field61.method150();
    }
    
    @Override
    public final float[] method151(final float[] array, final long n, final long n2, final long n3) {
        return this.field61.method151(array, n, n2, n3);
    }
    
    @Override
    public final double[] method152() {
        return this.field61.method152();
    }
    
    @Override
    public final double[] method153(final double[] array, final long n, final long n2, final long n3) {
        return this.field61.method153(array, n, n2, n3);
    }
    
    public final double[] method224() {
        if (2L * this.field30 <= 1073741824L) {
            final double[] array = new double[(int)(2L * this.field30)];
            for (int n = 0; n < this.field30; ++n) {
                array[2 * n] = this.field61.method137(n);
                array[2 * n + 1] = this.field62.method137(n);
            }
            return array;
        }
        return null;
    }
    
    public final double[] method225(final double[] array, final long n, final long n2, final long n3) {
        if (n >= 0L && n < this.field30) {
            if (n2 >= 0L) {
                if (n2 <= this.field30) {
                    if (n2 >= n) {
                        if (n3 < 1L) {
                            throw new IllegalArgumentException("step < 1");
                        }
                        final long n4 = 2L * (long)Class7640.method24124((n2 - n) / (double)n3);
                        if (n4 <= 1073741824L) {
                            double[] array2;
                            if (array != null && array.length >= n4) {
                                array2 = array;
                            }
                            else {
                                array2 = new double[(int)n4];
                            }
                            int n5 = 0;
                            for (long n6 = n; n6 < n2; n6 += n3) {
                                array2[n5++] = this.field61.method137(n6);
                                array2[n5++] = this.field62.method137(n6);
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
        if (obj instanceof double[]) {
            this.field61.method155(n, ((double[])obj)[0]);
            this.field62.method155(n, ((double[])obj)[1]);
            return;
        }
        throw new IllegalArgumentException(obj + " is not an array of doubles.");
    }
    
    @Override
    public final void method157(final long n, final boolean b) {
        this.field61.method157(n, b);
        this.field62.method157(n, false);
    }
    
    @Override
    public final void method159(final long n, final byte b) {
        this.field61.method159(n, b);
        this.field62.method159(n, (byte)0);
    }
    
    @Override
    public final void method161(final long n, final short n2) {
        this.field61.method161(n, n2);
        this.field62.method161(n, (short)0);
    }
    
    @Override
    public final void method163(final long n, final short n2) {
        this.field61.method163(n, n2);
        this.field62.method163(n, (short)0);
    }
    
    @Override
    public final void method165(final long n, final int n2) {
        this.field61.method165(n, n2);
        this.field62.method165(n, 0);
    }
    
    @Override
    public final void method167(final long n, final long n2) {
        this.field61.method167(n, n2);
        this.field62.method167(n, 0L);
    }
    
    @Override
    public final void method169(final long n, final float n2) {
        this.field61.method169(n, n2);
        this.field62.method169(n, 0.0f);
    }
    
    @Override
    public final void method171(final long n, final double n2) {
        this.field61.method171(n, n2);
        this.field62.method171(n, 0.0);
    }
    
    @Override
    public final void method154(final long n, final Object obj) {
        if (obj instanceof double[]) {
            this.method227(n, (double[])obj);
            return;
        }
        throw new IllegalArgumentException(obj + " is not an array of doubles.");
    }
    
    public final void method226(final long n, final float[] array) {
        this.field61.method169(n, array[0]);
        this.field62.method169(n, array[1]);
    }
    
    public final void method227(final long n, final double[] array) {
        this.field61.method171(n, array[0]);
        this.field62.method171(n, array[1]);
    }
}
