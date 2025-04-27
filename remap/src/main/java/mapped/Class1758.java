// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.SynchronousQueue;
import java.io.InterruptedIOException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.io.Closeable;

public final class Class1758 implements Closeable
{
    public static final ExecutorService field9775;
    public final boolean field9776;
    public final Class5041 field9777;
    public final Map<Integer, Class8082> field9778;
    public final String field9779;
    public int field9780;
    public int field9781;
    public boolean field9782;
    private final ExecutorService field9783;
    private Map<Integer, Class9116> field9784;
    public final Class7547 field9785;
    private int field9786;
    public long field9787;
    public long field9788;
    public Class8703 field9789;
    private static final int field9790 = 16777216;
    public final Class8703 field9791;
    public boolean field9792;
    public final Socket field9793;
    public final Class1759 field9794;
    public final Class1583 field9795;
    public final Set<Integer> field9796;
    public static final /* synthetic */ boolean field9797;
    
    public Class1758(final Class9164 class9164) {
        this.field9778 = new LinkedHashMap<Integer, Class8082>();
        this.field9787 = 0L;
        this.field9789 = new Class8703();
        this.field9791 = new Class8703();
        this.field9792 = false;
        this.field9796 = new LinkedHashSet<Integer>();
        this.field9785 = class9164.field38829;
        this.field9776 = class9164.field38830;
        this.field9777 = class9164.field38828;
        this.field9781 = (class9164.field38830 ? 1 : 2);
        if (class9164.field38830) {
            this.field9781 += 2;
        }
        this.field9786 = (class9164.field38830 ? 1 : 2);
        if (class9164.field38830) {
            this.field9789.method29861(7, 16777216);
        }
        this.field9779 = class9164.field38825;
        this.field9783 = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), Class7690.method24439(Class7690.method24456("OkHttp %s Push Observer", this.field9779), true));
        this.field9791.method29861(7, 65535);
        this.field9791.method29861(5, 16384);
        this.field9788 = this.field9791.method29870();
        this.field9793 = class9164.field38824;
        this.field9794 = new Class1759(class9164.field38827, this.field9776);
        this.field9795 = new Class1583(this, new Class1736(class9164.field38826, this.field9776));
    }
    
    public Class190 method6234() {
        return Class190.field625;
    }
    
    public synchronized int method6235() {
        return this.field9778.size();
    }
    
    public synchronized Class8082 method6236(final int i) {
        return this.field9778.get(i);
    }
    
    public synchronized Class8082 method6237(final int i) {
        final Class8082 class8082 = this.field9778.remove(i);
        this.notifyAll();
        return class8082;
    }
    
    public synchronized int method6238() {
        return this.field9791.method29867(Integer.MAX_VALUE);
    }
    
    public Class8082 method6239(final int n, final List<Class8975> list, final boolean b) throws IOException {
        if (!this.field9776) {
            return this.method6241(n, list, b);
        }
        throw new IllegalStateException("Client cannot push requests.");
    }
    
    public Class8082 method6240(final List<Class8975> list, final boolean b) throws IOException {
        return this.method6241(0, list, b);
    }
    
    private Class8082 method6241(final int n, final List<Class8975> list, final boolean b) throws IOException {
        final boolean b2 = !b;
        final boolean b3 = false;
        final Class8082 class8082;
        final boolean b4;
        synchronized (this.field9794) {
            final int field9781;
            synchronized (this) {
                if (this.field9782) {
                    throw new Class2352();
                }
                field9781 = this.field9781;
                this.field9781 += 2;
                class8082 = new Class8082(field9781, this, b2, b3, list);
                b4 = (!b || this.field9788 == 0L || class8082.field33278 == 0L);
                if (class8082.method26518()) {
                    this.field9778.put(field9781, class8082);
                }
            }
            if (n == 0) {
                this.field9794.method6267(b2, field9781, n, list);
            }
            else {
                if (this.field9776) {
                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                }
                this.field9794.method6265(n, field9781, list);
            }
        }
        if (b4) {
            this.field9794.method6266();
        }
        return class8082;
    }
    
    public void method6242(final int n, final boolean b, final List<Class8975> list) throws IOException {
        this.field9794.method6268(b, n, list);
    }
    
    public void method6243(final int i, final boolean b, final Class1680 class1680, long a) throws IOException {
        if (a == 0L) {
            this.field9794.method6272(b, i, class1680, 0);
            return;
        }
        while (a > 0L) {
            int min;
            synchronized (this) {
                try {
                    while (this.field9788 <= 0L) {
                        if (!this.field9778.containsKey(i)) {
                            throw new IOException("stream closed");
                        }
                        this.wait();
                    }
                }
                catch (final InterruptedException ex) {
                    throw new InterruptedIOException();
                }
                min = (int)Math.min(a, this.field9788);
                min = Math.min(min, this.field9794.method6271());
                this.field9788 -= min;
            }
            a -= min;
            this.field9794.method6272(b && a == 0L, i, class1680, min);
        }
    }
    
    public void method6244(final long n) {
        this.field9788 += n;
        if (n > 0L) {
            this.notifyAll();
        }
    }
    
    public void method6245(final int i, final Class2082 class2082) {
        Class1758.field9775.execute(new Class1578(this, "OkHttp %s stream %d", new Object[] { this.field9779, i }, i, class2082));
    }
    
    public void method6246(final int n, final Class2082 class2082) throws IOException {
        this.field9794.method6270(n, class2082);
    }
    
    public void method6247(final int i, final long n) {
        Class1758.field9775.execute(new Class1585(this, "OkHttp Window Update %s stream %d", new Object[] { this.field9779, i }, i, n));
    }
    
    public Class9116 method6248() throws IOException {
        final Class9116 class9116 = new Class9116();
        final int field9786;
        synchronized (this) {
            if (this.field9782) {
                throw new Class2352();
            }
            field9786 = this.field9786;
            this.field9786 += 2;
            if (this.field9784 == null) {
                this.field9784 = new LinkedHashMap<Integer, Class9116>();
            }
            this.field9784.put(field9786, class9116);
        }
        this.method6250(false, field9786, 1330343787, class9116);
        return class9116;
    }
    
    public void method6249(final boolean b, final int i, final int j, final Class9116 class9116) {
        Class1758.field9775.execute(new Class1580(this, "OkHttp %s ping %08x%08x", new Object[] { this.field9779, i, j }, b, i, j, class9116));
    }
    
    public void method6250(final boolean b, final int n, final int n2, final Class9116 class9116) throws IOException {
        synchronized (this.field9794) {
            if (class9116 != null) {
                class9116.method32979();
            }
            this.field9794.method6275(b, n, n2);
        }
    }
    
    public synchronized Class9116 method6251(final int i) {
        return (this.field9784 == null) ? null : this.field9784.remove(i);
    }
    
    public void method6252() throws IOException {
        this.field9794.method6266();
    }
    
    public void method6253(final Class2082 class2082) throws IOException {
        synchronized (this.field9794) {
            final int field9780;
            synchronized (this) {
                if (this.field9782) {
                    return;
                }
                this.field9782 = true;
                field9780 = this.field9780;
            }
            this.field9794.method6276(field9780, class2082, Class7690.field30540);
        }
    }
    
    @Override
    public void close() throws IOException {
        this.close(Class2082.field12039, Class2082.field12044);
    }
    
    public void close(final Class2082 class2082, final Class2082 class2083) throws IOException {
        if (!Class1758.field9797 && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        IOException ex = null;
        try {
            this.method6253(class2082);
        }
        catch (final IOException ex2) {
            ex = ex2;
        }
        Class8082[] array = null;
        Class9116[] array2 = null;
        synchronized (this) {
            if (!this.field9778.isEmpty()) {
                array = this.field9778.values().toArray(new Class8082[this.field9778.size()]);
                this.field9778.clear();
            }
            if (this.field9784 != null) {
                array2 = this.field9784.values().toArray(new Class9116[this.field9784.size()]);
                this.field9784 = null;
            }
        }
        if (array != null) {
            for (final Class8082 class2084 : array) {
                try {
                    class2084.method26529(class2083);
                }
                catch (final IOException ex3) {
                    if (ex != null) {
                        ex = ex3;
                    }
                }
            }
        }
        if (array2 != null) {
            final Class9116[] array4 = array2;
            for (int length2 = array4.length, j = 0; j < length2; ++j) {
                array4[j].method32981();
            }
        }
        try {
            this.field9794.close();
        }
        catch (final IOException ex4) {
            if (ex == null) {
                ex = ex4;
            }
        }
        try {
            this.field9793.close();
        }
        catch (final IOException ex5) {
            ex = ex5;
        }
        if (ex != null) {
            throw ex;
        }
    }
    
    public void method6254() throws IOException {
        this.method6255(true);
    }
    
    public void method6255(final boolean b) throws IOException {
        if (b) {
            this.field9794.method6263();
            this.field9794.method6274(this.field9789);
            final int method29870 = this.field9789.method29870();
            if (method29870 != 65535) {
                this.field9794.method6277(0, method29870 - 65535);
            }
        }
        new Thread(this.field9795).start();
    }
    
    public void method6256(final Class8703 class8703) throws IOException {
        synchronized (this.field9794) {
            synchronized (this) {
                if (this.field9782) {
                    throw new Class2352();
                }
                this.field9789.method29871(class8703);
                this.field9794.method6274(class8703);
            }
        }
    }
    
    public synchronized boolean method6257() {
        return this.field9782;
    }
    
    public boolean method6258(final int n) {
        return n != 0;
    }
    
    public void method6259(final int i, final List<Class8975> list) {
        synchronized (this) {
            if (this.field9796.contains(i)) {
                this.method6245(i, Class2082.field12040);
                return;
            }
            this.field9796.add(i);
        }
        this.field9783.execute(new Class1586(this, "OkHttp %s Push Request[%s]", new Object[] { this.field9779, i }, i, list));
    }
    
    public void method6260(final int i, final List<Class8975> list, final boolean b) {
        this.field9783.execute(new Class1581(this, "OkHttp %s Push Headers[%s]", new Object[] { this.field9779, i }, i, list, b));
    }
    
    public void method6261(final int i, final Class1681 class1681, final int j, final boolean b) throws IOException {
        final Class1680 class1682 = new Class1680();
        class1681.method5952(j);
        class1681.method6014(class1682, j);
        if (class1682.method5949() == j) {
            this.field9783.execute(new Class1576(this, "OkHttp %s Push Data[%s]", new Object[] { this.field9779, i }, i, class1682, j, b));
            return;
        }
        throw new IOException(class1682.method5949() + " != " + j);
    }
    
    public void method6262(final int i, final Class2082 class2082) {
        this.field9783.execute(new Class1579(this, "OkHttp %s Push Reset[%s]", new Object[] { this.field9779, i }, i, class2082));
    }
    
    static {
        field9797 = !Class1758.class.desiredAssertionStatus();
        field9775 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), Class7690.method24439("OkHttp Http2Connection", true));
    }
}
