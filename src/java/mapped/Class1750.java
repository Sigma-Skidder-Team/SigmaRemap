// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.InputStream;

public class Class1750 extends InputStream
{
    private static String[] field9731;
    private final Class8293 field9732;
    private Class1725 field9733;
    private volatile int field9734;
    private volatile int field9735;
    private volatile boolean field9736;
    private Thread field9737;
    
    public Class1750(final InputStream inputStream, final Class8293 field9732) {
        this.field9732 = field9732;
        this.field9733 = new Class1725(this);
        this.field9734 = 0;
        this.field9735 = 0;
        this.field9736 = false;
        (this.field9737 = new Thread(new Class1032(this, inputStream))).start();
    }
    
    public int method6179() {
        return this.field9734;
    }
    
    public int method6180() {
        return this.field9735;
    }
    
    @Override
    public void close() throws IOException {
        this.field9733.close();
        this.field9737.interrupt();
        this.field9737 = null;
        this.field9733 = null;
        this.field9734 = 0;
        this.field9735 = 0;
        this.field9736 = false;
        super.close();
    }
    
    @Override
    public int available() throws IOException {
        return this.field9734 - this.field9735;
    }
    
    @Override
    public int read() throws IOException {
        if (this.field9736 && this.field9735 > this.field9734) {
            return -1;
        }
        while (true) {
            if (this.field9734 >= this.field9735) {
                if (this.field9733.method6073().length > this.field9735) {
                    break;
                }
            }
            try {
                Thread.sleep(100L);
                if (this.field9736) {
                    return -1;
                }
                continue;
            }
            catch (final Exception ex) {}
        }
        return this.field9733.method6073()[this.field9735++] & 0xFF;
    }
    
    @Override
    public int read(final byte[] array) throws IOException {
        return this.read(array, 0, array.length);
    }
    
    @Override
    public void reset() throws IOException {
        this.field9735 = 0;
    }
    
    @Override
    public int read(final byte[] array, final int n, final int n2) throws IOException {
        while (this.field9734 < this.field9735 + n2) {
            try {
                Thread.sleep(100L);
                if (this.field9736) {
                    return -1;
                }
                continue;
            }
            catch (final Exception ex) {}
        }
        System.arraycopy(this.field9733.method6073(), this.field9735, array, n, n2);
        this.field9735 += n2;
        return n2;
    }
    
    @Override
    public long skip(final long n) throws IOException {
        this.field9735 += (int)n;
        return n;
    }
}
