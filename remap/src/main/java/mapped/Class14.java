// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class14 extends Class11
{
    private static final long field28 = 155390537810310407L;
    private final Class22 field47;
    private final Class22 field48;
    
    public Class14(final long n) {
        this(n, true);
    }
    
    public Class14(final long n, final boolean b) {
        this.field29 = Class273.field1492;
        this.field31 = 4L;
        if (n > 0L) {
            this.field30 = n;
            this.field47 = new Class22(n, b);
            this.field48 = new Class22(n, b);
            return;
        }
        throw new IllegalArgumentException(n + " is not a positive long value");
    }
    
    public Class14(final long n, final float[] array) {
        this.field29 = Class273.field1492;
        this.field31 = 4L;
        if (n <= 0L) {
            throw new IllegalArgumentException(n + " is not a positive long value");
        }
        if (array != null && array.length == 2) {
            this.field30 = n;
            this.field32 = true;
            this.field47 = new Class22(n, array[0]);
            this.field48 = new Class22(n, array[1]);
            return;
        }
        throw new IllegalArgumentException("constantValue == null || constantValue.length != 2");
    }
    
    public Class14(final float[] array) {
        this(new Class22(array));
    }
    
    public Class14(final Class22 class22) {
        if (class22.method118() % 2L != 0L) {
            throw new IllegalArgumentException("The length of the data array must be even.");
        }
        if (class22.method118() > 0L) {
            this.field29 = Class273.field1492;
            this.field31 = 4L;
            this.field30 = class22.field30 / 2L;
            if (!(this.field32 = class22.field32)) {
                this.field47 = new Class22(this.field30, false);
                this.field48 = new Class22(this.field30, false);
                for (long n = 0L; n < this.field30; ++n) {
                    this.field47.method169(n, class22.method135(2L * n));
                    this.field48.method169(n, class22.method135(2L * n + 1L));
                }
            }
            else {
                this.field47 = new Class22(this.field30, class22.method135(0L));
                this.field48 = new Class22(this.field30, class22.method135(1L));
            }
            return;
        }
        throw new IllegalArgumentException(class22.method118() + " is not a positive long value");
    }
    
    public Class14(final float[] array, final float[] array2) {
        this(new Class22(array), new Class22(array2));
    }
    
    public Class14(final Class22 field47, final Class22 field48) {
        if (field47.method118() != field48.method118()) {
            throw new IllegalArgumentException("The length of the dataRe must be equal to the length of dataIm.");
        }
        if (field47.method118() <= 0L) {
            throw new IllegalArgumentException(field47.method118() + " is not a positive long value");
        }
        if (field47.method173() == field48.method173()) {
            this.field29 = Class273.field1492;
            this.field31 = 4L;
            this.field30 = field47.method118();
            this.field47 = field47;
            this.field48 = field48;
            return;
        }
        throw new IllegalArgumentException("dataRe.isLarge() != dataIm.isLarge()");
    }
    
    @Override
    public Class14 clone() {
        if (!this.field32) {
            final Class14 class14 = new Class14(this.field30, false);
            Class8601.method29156(this, 0L, class14, 0L, this.field30);
            return class14;
        }
        return new Class14(this.field30, new float[] { this.field47.method135(0L), this.field48.method135(0L) });
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!super.equals(o)) {
            return false;
        }
        final Class14 class14 = (Class14)o;
        return this.field47.equals(class14.field47) && this.field48.equals(class14.field48);
    }
    
    @Override
    public int hashCode() {
        return 29 * (29 * super.hashCode() + ((this.field47 == null) ? 0 : this.field47.hashCode())) + ((this.field48 == null) ? 0 : this.field48.hashCode());
    }
    
    @Override
    public boolean method173() {
        return this.field47.method173();
    }
    
    public final Class22 method186() {
        return this.field47;
    }
    
    public final Class22 method187() {
        return this.field48;
    }
    
    public final Class22 method188() {
        final Class22 class22 = new Class22(this.field30, false);
        for (long n = 0L; n < this.field30; ++n) {
            final double n2 = this.field47.method135(n);
            final double n3 = this.field48.method135(n);
            class22.method169(n, (float)Class7640.method24071(n2 * n2 + n3 * n3));
        }
        return class22;
    }
    
    public final Class22 method189() {
        final Class22 class22 = new Class22(this.field30, false);
        for (long n = 0L; n < this.field30; ++n) {
            class22.method169(n, (float)Class7640.method24107(this.field48.method135(n), this.field47.method135(n)));
        }
        return class22;
    }
    
    public final float[] method190(final long n) {
        return this.method192(n);
    }
    
    public final float[] method191(final long n) {
        return new float[] { this.field47.method229(n), this.field48.method229(n) };
    }
    
    @Override
    public final boolean method123(final long n) {
        return this.field47.method123(n);
    }
    
    @Override
    public final byte method125(final long n) {
        return this.field47.method125(n);
    }
    
    @Override
    public final short method127(final long n) {
        return this.field47.method127(n);
    }
    
    @Override
    public final short method129(final long n) {
        return this.field47.method129(n);
    }
    
    @Override
    public final int method131(final long n) {
        return this.field47.method131(n);
    }
    
    @Override
    public final long method133(final long n) {
        return this.field47.method133(n);
    }
    
    @Override
    public final float method135(final long n) {
        return this.field47.method135(n);
    }
    
    @Override
    public final double method137(final long n) {
        return this.field47.method137(n);
    }
    
    public final float[] method192(final long n) {
        return new float[] { this.field47.method135(n), this.field48.method135(n) };
    }
    
    public final double[] method193(final long n) {
        return new double[] { this.field47.method137(n), this.field48.method137(n) };
    }
    
    public final float[][] method194() {
        if (!this.method173()) {
            return new float[][] { this.field47.method230(), this.field48.method230() };
        }
        return null;
    }
    
    @Override
    public final boolean[] method140() {
        return this.field47.method140();
    }
    
    @Override
    public final boolean[] method141(final boolean[] array, final long n, final long n2, final long n3) {
        return this.field47.method141(array, n, n2, n3);
    }
    
    @Override
    public final byte[] method142() {
        return this.field47.method142();
    }
    
    @Override
    public final byte[] method143(final byte[] array, final long n, final long n2, final long n3) {
        return this.field47.method143(array, n, n2, n3);
    }
    
    @Override
    public final short[] method144() {
        return this.field47.method144();
    }
    
    @Override
    public final short[] method145(final short[] array, final long n, final long n2, final long n3) {
        return this.field47.method145(array, n, n2, n3);
    }
    
    @Override
    public final int[] method146() {
        return this.field47.method146();
    }
    
    @Override
    public final int[] method147(final int[] array, final long n, final long n2, final long n3) {
        return this.field47.method147(array, n, n2, n3);
    }
    
    @Override
    public final long[] method148() {
        return this.field47.method148();
    }
    
    @Override
    public final long[] method149(final long[] array, final long n, final long n2, final long n3) {
        return this.field47.method149(array, n, n2, n3);
    }
    
    @Override
    public final float[] method150() {
        return this.field47.method150();
    }
    
    @Override
    public final float[] method151(final float[] array, final long n, final long n2, final long n3) {
        return this.field47.method151(array, n, n2, n3);
    }
    
    @Override
    public final double[] method152() {
        return this.field47.method152();
    }
    
    @Override
    public final double[] method153(final double[] array, final long n, final long n2, final long n3) {
        return this.field47.method153(array, n, n2, n3);
    }
    
    public final float[] method195() {
        if (2L * this.field30 <= 1073741824L) {
            final float[] array = new float[(int)(2L * this.field30)];
            for (int n = 0; n < this.field30; ++n) {
                array[2 * n] = this.field47.method135(n);
                array[2 * n + 1] = this.field48.method135(n);
            }
            return array;
        }
        return null;
    }
    
    public final float[] method196(final float[] array, final long n, final long n2, final long n3) {
        if (n >= 0L && n < this.field30) {
            if (n2 >= 0L) {
                if (n2 <= this.field30) {
                    if (n2 >= n) {
                        if (n3 < 1L) {
                            throw new IllegalArgumentException("step < 1");
                        }
                        final long n4 = 2L * (long)Class7640.method24124((n2 - n) / (double)n3);
                        if (n4 <= 1073741824L) {
                            float[] array2;
                            if (array != null && array.length >= n4) {
                                array2 = array;
                            }
                            else {
                                array2 = new float[(int)n4];
                            }
                            int n5 = 0;
                            for (long n6 = n; n6 < n2; n6 += n3) {
                                array2[n5++] = this.field47.method135(n6);
                                array2[n5++] = this.field48.method135(n6);
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
        if (obj instanceof float[]) {
            this.field47.method155(n, ((float[])obj)[0]);
            this.field48.method155(n, ((float[])obj)[1]);
            return;
        }
        throw new IllegalArgumentException(obj + " is not an array of floats.");
    }
    
    @Override
    public final void method157(final long n, final boolean b) {
        this.field47.method157(n, b);
        this.field48.method157(n, false);
    }
    
    @Override
    public final void method159(final long n, final byte b) {
        this.field47.method159(n, b);
        this.field48.method159(n, (byte)0);
    }
    
    @Override
    public final void method161(final long n, final short n2) {
        this.field47.method161(n, n2);
        this.field48.method161(n, (short)0);
    }
    
    @Override
    public final void method163(final long n, final short n2) {
        this.field47.method163(n, n2);
        this.field48.method163(n, (short)0);
    }
    
    @Override
    public final void method165(final long n, final int n2) {
        this.field47.method165(n, n2);
        this.field48.method165(n, 0);
    }
    
    @Override
    public final void method167(final long n, final long n2) {
        this.field47.method167(n, n2);
        this.field48.method167(n, 0L);
    }
    
    @Override
    public final void method169(final long n, final float n2) {
        this.field47.method169(n, n2);
        this.field48.method169(n, 0.0f);
    }
    
    @Override
    public final void method171(final long n, final double n2) {
        this.field47.method171(n, n2);
        this.field48.method171(n, 0.0);
    }
    
    @Override
    public final void method154(final long n, final Object obj) {
        if (obj instanceof float[]) {
            this.method197(n, (float[])obj);
            return;
        }
        throw new IllegalArgumentException(obj + " is not an array of floats.");
    }
    
    public final void method197(final long n, final float[] array) {
        this.field47.method169(n, array[0]);
        this.field48.method169(n, array[1]);
    }
    
    public final void method198(final long n, final double[] array) {
        this.field47.method171(n, array[0]);
        this.field48.method171(n, array[1]);
    }
}
