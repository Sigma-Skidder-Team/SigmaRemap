// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ByteArrayInputStream;
import com.sun.xml.internal.ws.encoding.soap.SerializationException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.ByteArrayOutputStream;
import sun.misc.Cleaner;

public class Class20 extends Class11
{
    private static final long field28 = -4096759496772248522L;
    private Object[] field56;
    private Class16 field57;
    private int field58;
    private long field59;
    private byte[] field60;
    
    public Class20(final long n) {
        this(n, 1024);
    }
    
    public Class20(final long n, final int n2) {
        this(n, n2, true);
    }
    
    public Class20(final long n, final int n2, final boolean b) {
        this.field29 = Class273.field1495;
        this.field31 = 1L;
        if (n <= 0L) {
            throw new IllegalArgumentException(n + " is not a positive long value.");
        }
        if (n2 > 0) {
            this.field30 = n;
            this.field59 = n * n2;
            this.field58 = n2;
            if (n <= method177()) {
                this.field56 = new Object[(int)n];
            }
            else {
                this.field34 = Class8601.field36113.allocateMemory(this.field59 * this.field31);
                if (b) {
                    this.method178(this.field59);
                }
                Cleaner.create((Object)this, (Runnable)new Class993(this.field34, this.field59, this.field31));
                Class7579.method23860(this.field59 * this.field31);
                this.field57 = new Class16(n);
                this.field60 = new byte[n2];
            }
            return;
        }
        throw new IllegalArgumentException(n2 + " is not a positive int value.");
    }
    
    public Class20(final long n, final Object o) {
        this.field29 = Class273.field1495;
        this.field31 = 1L;
        if (n > 0L) {
            this.field30 = n;
            this.field32 = true;
            this.field56 = new Object[] { o };
            return;
        }
        throw new IllegalArgumentException(n + " is not a positive long value");
    }
    
    public Class20(final Object[] field56) {
        this.field29 = Class273.field1495;
        this.field31 = 1L;
        this.field30 = field56.length;
        this.field56 = field56;
    }
    
    @Override
    public Class20 clone() {
        if (!this.field32) {
            final Class20 class20 = new Class20(this.field30, Class7640.method24132(1, this.field58), false);
            Class8601.method29162(this, 0L, class20, 0L, this.field30);
            return class20;
        }
        return new Class20(this.field30, this.method120(0L));
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!super.equals(o)) {
            return false;
        }
        final Class20 class20 = (Class20)o;
        final boolean b = this.field58 == class20.field58 && this.field56 == class20.field56;
        if (this.field57 != null && class20.field57 != null) {
            return b && this.field57.equals(class20.field57);
        }
        return this.field57 == class20.field57 && b;
    }
    
    @Override
    public int hashCode() {
        return 29 * (29 * (29 * super.hashCode() + ((this.field56 == null) ? 0 : this.field56.hashCode())) + (this.field58 ^ this.field58 >>> 16)) + ((this.field57 == null) ? 0 : this.field57.hashCode());
    }
    
    @Override
    public final Object method120(final long n) {
        if (this.field34 == 0L) {
            if (!this.field32) {
                return this.field56[(int)n];
            }
            return this.field56[0];
        }
        else {
            final short method129 = this.field57.method129(n);
            if (method129 >= 0) {
                final long n2 = this.field31 * n * this.field58;
                for (short n3 = 0; n3 < method129; ++n3) {
                    this.field60[n3] = Class8601.field36113.getByte(this.field34 + n2 + this.field31 * n3);
                }
                return method213(this.field60);
            }
            return null;
        }
    }
    
    @Override
    public final Object method122(final long n) {
        final short method129 = this.field57.method129(n);
        if (method129 >= 0) {
            final long n2 = this.field31 * n * this.field58;
            for (short n3 = 0; n3 < method129; ++n3) {
                this.field60[n3] = Class8601.field36113.getByte(this.field34 + n2 + this.field31 * n3);
            }
            return method213(this.field60);
        }
        return null;
    }
    
    @Override
    public final boolean method123(final long n) {
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    @Override
    public final byte method125(final long n) {
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    @Override
    public final short method127(final long n) {
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    @Override
    public final short method129(final long n) {
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    @Override
    public final int method131(final long n) {
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    @Override
    public final long method133(final long n) {
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    @Override
    public final float method135(final long n) {
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    @Override
    public final double method137(final long n) {
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    public final Object[] method211() {
        return this.field56;
    }
    
    @Override
    public final boolean[] method140() {
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    @Override
    public final boolean[] method141(final boolean[] array, final long n, final long n2, final long n3) {
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    @Override
    public final byte[] method142() {
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    @Override
    public final byte[] method143(final byte[] array, final long n, final long n2, final long n3) {
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    @Override
    public final short[] method144() {
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    @Override
    public final short[] method145(final short[] array, final long n, final long n2, final long n3) {
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    @Override
    public final int[] method146() {
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    @Override
    public final int[] method147(final int[] array, final long n, final long n2, final long n3) {
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    @Override
    public final long[] method148() {
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    @Override
    public final long[] method149(final long[] array, final long n, final long n2, final long n3) {
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    @Override
    public final float[] method150() {
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    @Override
    public final float[] method151(final float[] array, final long n, final long n2, final long n3) {
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    @Override
    public final double[] method152() {
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    @Override
    public final double[] method153(final double[] array, final long n, final long n2, final long n3) {
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    @Override
    public final void method155(final long n, final Object o) {
        if (o != null) {
            final byte[] method212 = method212(o);
            if (method212.length > this.field58) {
                throw new IllegalArgumentException("Object  " + o + " is too long.");
            }
            final int length = method212.length;
            if (length > 32767) {
                throw new IllegalArgumentException("Object  " + o + " is too long.");
            }
            this.field57.method163(n, (short)length);
            final long n2 = this.field31 * n * this.field58;
            for (int i = 0; i < length; ++i) {
                Class8601.field36113.putByte(this.field34 + n2 + this.field31 * i, method212[i]);
            }
        }
        else {
            this.field57.method163(n, (short)(-1));
        }
    }
    
    @Override
    public final void method154(final long n, final Object o) {
        if (o != null) {
            if (this.field34 == 0L) {
                if (this.field32) {
                    throw new IllegalAccessError("Constant arrays cannot be modified.");
                }
                this.field56[(int)n] = o;
            }
            else {
                final byte[] method212 = method212(o);
                if (method212.length > this.field58) {
                    throw new IllegalArgumentException("Object  " + o + " is too long.");
                }
                final int length = method212.length;
                if (length > 32767) {
                    throw new IllegalArgumentException("Object  " + o + " is too long.");
                }
                this.field57.method163(n, (short)length);
                final long n2 = this.field31 * n * this.field58;
                for (int i = 0; i < length; ++i) {
                    Class8601.field36113.putByte(this.field34 + n2 + this.field31 * i, method212[i]);
                }
            }
        }
        else if (this.field34 == 0L) {
            if (this.field32) {
                throw new IllegalAccessError("Constant arrays cannot be modified.");
            }
            this.field56[(int)n] = null;
        }
        else {
            this.field57.method163(n, (short)(-1));
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
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    @Override
    public final void method159(final long n, final byte b) {
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    @Override
    public final void method161(final long n, final short n2) {
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    @Override
    public final void method163(final long n, final short n2) {
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    @Override
    public final void method165(final long n, final int n2) {
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    @Override
    public final void method167(final long n, final long n2) {
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    @Override
    public final void method169(final long n, final float n2) {
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    @Override
    public final void method171(final long n, final double n2) {
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    private static byte[] method212(final Object obj) {
        final ByteArrayOutputStream out = new ByteArrayOutputStream(512);
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(out);
            objectOutputStream.writeObject(obj);
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
                return out.toByteArray();
            }
            catch (final IOException ex) {
                return out.toByteArray();
            }
        }
        catch (final Exception ex2) {
            throw new SerializationException((Throwable)ex2);
        }
        finally {
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
            }
            catch (final IOException ex3) {}
        }
        return out.toByteArray();
    }
    
    private static Object method213(final byte[] buf) {
        final ByteArrayInputStream in = new ByteArrayInputStream(buf);
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(in);
            return objectInputStream.readObject();
        }
        catch (final Exception ex) {
            throw new SerializationException((Throwable)ex);
        }
        finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            }
            catch (final IOException ex2) {}
        }
    }
    
    public int method214() {
        return this.field58;
    }
}
