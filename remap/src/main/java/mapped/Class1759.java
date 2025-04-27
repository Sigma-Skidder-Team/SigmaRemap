// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.logging.Level;
import java.io.IOException;
import java.util.logging.Logger;
import java.io.Closeable;

public final class Class1759 implements Closeable
{
    private static final Logger field9798;
    private final Class1679 field9799;
    private final boolean field9800;
    private final Class1680 field9801;
    private int field9802;
    private boolean field9803;
    public final Class8034 field9804;
    
    public Class1759(final Class1679 field9799, final boolean field9800) {
        this.field9799 = field9799;
        this.field9800 = field9800;
        this.field9801 = new Class1680();
        this.field9804 = new Class8034(this.field9801);
        this.field9802 = 16384;
    }
    
    public synchronized void method6263() throws IOException {
        if (this.field9803) {
            throw new IOException("closed");
        }
        if (this.field9800) {
            if (Class1759.field9798.isLoggable(Level.FINE)) {
                Class1759.field9798.fine(Class7690.method24456(">> CONNECTION %s", Class6885.field26977.method7757()));
            }
            this.field9799.method5928(Class6885.field26977.method7767());
            this.field9799.flush();
        }
    }
    
    public synchronized void method6264(final Class8703 class8703) throws IOException {
        if (!this.field9803) {
            this.field9802 = class8703.method29868(this.field9802);
            if (class8703.method29865() != -1) {
                this.field9804.method26356(class8703.method29865());
            }
            this.method6278(0, 0, (byte)4, (byte)1);
            this.field9799.flush();
            return;
        }
        throw new IOException("closed");
    }
    
    public synchronized void method6265(final int n, final int n2, final List<Class8975> list) throws IOException {
        if (!this.field9803) {
            this.field9804.method26353(list);
            final long method5949 = this.field9801.method5949();
            final int n3 = (int)Math.min(this.field9802 - 4, method5949);
            this.method6278(n, n3 + 4, (byte)5, (byte)((method5949 != n3) ? 0 : 4));
            this.field9799.method5940(n2 & Integer.MAX_VALUE);
            this.field9799.method5920(this.field9801, n3);
            if (method5949 > n3) {
                this.method6280(n, method5949 - n3);
            }
            return;
        }
        throw new IOException("closed");
    }
    
    public synchronized void method6266() throws IOException {
        if (!this.field9803) {
            this.field9799.flush();
            return;
        }
        throw new IOException("closed");
    }
    
    public synchronized void method6267(final boolean b, final int n, final int n2, final List<Class8975> list) throws IOException {
        if (!this.field9803) {
            this.method6281(b, n, list);
            return;
        }
        throw new IOException("closed");
    }
    
    public synchronized void method6268(final boolean b, final int n, final List<Class8975> list) throws IOException {
        if (!this.field9803) {
            this.method6281(b, n, list);
            return;
        }
        throw new IOException("closed");
    }
    
    public synchronized void method6269(final int n, final List<Class8975> list) throws IOException {
        if (!this.field9803) {
            this.method6281(false, n, list);
            return;
        }
        throw new IOException("closed");
    }
    
    public synchronized void method6270(final int n, final Class2082 class2082) throws IOException {
        if (this.field9803) {
            throw new IOException("closed");
        }
        if (class2082.field12045 != -1) {
            this.method6278(n, 4, (byte)3, (byte)0);
            this.field9799.method5940(class2082.field12045);
            this.field9799.flush();
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public int method6271() {
        return this.field9802;
    }
    
    public synchronized void method6272(final boolean b, final int n, final Class1680 class1680, final int n2) throws IOException {
        if (!this.field9803) {
            byte b2 = 0;
            if (b) {
                b2 |= 0x1;
            }
            this.method6273(n, b2, class1680, n2);
            return;
        }
        throw new IOException("closed");
    }
    
    public void method6273(final int n, final byte b, final Class1680 class1680, final int n2) throws IOException {
        this.method6278(n, n2, (byte)0, b);
        if (n2 > 0) {
            this.field9799.method5920(class1680, n2);
        }
    }
    
    public synchronized void method6274(final Class8703 class8703) throws IOException {
        if (!this.field9803) {
            this.method6278(0, class8703.method29864() * 6, (byte)4, (byte)0);
            for (int i = 0; i < 10; ++i) {
                if (class8703.method29862(i)) {
                    int n = i;
                    if (n != 4) {
                        if (n == 7) {
                            n = 4;
                        }
                    }
                    else {
                        n = 3;
                    }
                    this.field9799.method5938(n);
                    this.field9799.method5940(class8703.method29863(i));
                }
            }
            this.field9799.flush();
            return;
        }
        throw new IOException("closed");
    }
    
    public synchronized void method6275(final boolean b, final int n, final int n2) throws IOException {
        if (!this.field9803) {
            this.method6278(0, 8, (byte)6, (byte)(b ? 1 : 0));
            this.field9799.method5940(n);
            this.field9799.method5940(n2);
            this.field9799.flush();
            return;
        }
        throw new IOException("closed");
    }
    
    public synchronized void method6276(final int n, final Class2082 class2082, final byte[] array) throws IOException {
        if (this.field9803) {
            throw new IOException("closed");
        }
        if (class2082.field12045 != -1) {
            this.method6278(0, 8 + array.length, (byte)7, (byte)0);
            this.field9799.method5940(n);
            this.field9799.method5940(class2082.field12045);
            if (array.length > 0) {
                this.field9799.method5928(array);
            }
            this.field9799.flush();
            return;
        }
        throw Class6885.method21139("errorCode.httpCode == -1");
    }
    
    public synchronized void method6277(final int n, final long l) throws IOException {
        if (this.field9803) {
            throw new IOException("closed");
        }
        if (l != 0L && l <= 2147483647L) {
            this.method6278(n, 4, (byte)8, (byte)0);
            this.field9799.method5940((int)l);
            this.field9799.flush();
            return;
        }
        throw Class6885.method21139("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", l);
    }
    
    public void method6278(final int i, final int j, final byte b, final byte b2) throws IOException {
        if (Class1759.field9798.isLoggable(Level.FINE)) {
            Class1759.field9798.fine(Class6885.method21141(false, i, j, b, b2));
        }
        if (j > this.field9802) {
            throw Class6885.method21139("FRAME_SIZE_ERROR length > %d: %d", this.field9802, j);
        }
        if ((i & Integer.MIN_VALUE) == 0x0) {
            method6279(this.field9799, j);
            this.field9799.method5937(b & 0xFF);
            this.field9799.method5937(b2 & 0xFF);
            this.field9799.method5940(i & Integer.MAX_VALUE);
            return;
        }
        throw Class6885.method21139("reserved bit set: %s", i);
    }
    
    @Override
    public synchronized void close() throws IOException {
        this.field9803 = true;
        this.field9799.close();
    }
    
    private static void method6279(final Class1679 class1679, final int n) throws IOException {
        class1679.method5937(n >>> 16 & 0xFF);
        class1679.method5937(n >>> 8 & 0xFF);
        class1679.method5937(n & 0xFF);
    }
    
    private void method6280(final int n, long b) throws IOException {
        while (b > 0L) {
            final int n2 = (int)Math.min(this.field9802, b);
            b -= n2;
            this.method6278(n, n2, (byte)9, (byte)((b != 0L) ? 0 : 4));
            this.field9799.method5920(this.field9801, n2);
        }
    }
    
    public void method6281(final boolean b, final int n, final List<Class8975> list) throws IOException {
        if (!this.field9803) {
            this.field9804.method26353(list);
            final long method5949 = this.field9801.method5949();
            final int n2 = (int)Math.min(this.field9802, method5949);
            final byte b2 = 1;
            int n3 = (method5949 != n2) ? 0 : 4;
            if (b) {
                n3 = (byte)(n3 | 0x1);
            }
            this.method6278(n, n2, b2, (byte)n3);
            this.field9799.method5920(this.field9801, n2);
            if (method5949 > n2) {
                this.method6280(n, method5949 - n2);
            }
            return;
        }
        throw new IOException("closed");
    }
    
    static {
        field9798 = Logger.getLogger(Class6885.class.getName());
    }
}
