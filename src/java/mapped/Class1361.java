// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import java.io.IOException;
import com.google.common.collect.Lists;
import java.net.ServerSocket;
import java.net.DatagramSocket;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.Logger;

public abstract class Class1361 implements Runnable
{
    private static final Logger field7459;
    private static final AtomicInteger field7460;
    public boolean field7461;
    public final Class396 field7462;
    public final String field7463;
    public Thread field7464;
    public final int field7465 = 5;
    public final List<DatagramSocket> field7466;
    public final List<ServerSocket> field7467;
    
    public Class1361(final Class396 field7462, final String field7463) {
        this.field7466 = Lists.newArrayList();
        this.field7467 = Lists.newArrayList();
        this.field7462 = field7462;
        this.field7463 = field7463;
        if (this.field7462.method1487()) {
            this.method5634("Debugging is enabled, performance maybe reduced!");
        }
    }
    
    public synchronized void method5629() {
        (this.field7464 = new Thread(this, this.field7463 + " #" + Class1361.field7460.incrementAndGet())).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new Class8237(Class1361.field7459));
        this.field7464.start();
        this.field7461 = true;
    }
    
    public synchronized void method5630() {
        this.field7461 = false;
        if (null != this.field7464) {
            int n = 0;
            while (this.field7464.isAlive()) {
                try {
                    this.field7464.join(1000L);
                    ++n;
                    if (5 <= n) {
                        this.method5634("Waited " + n + " seconds attempting force stop!");
                        this.method5642(true);
                    }
                    else {
                        if (!this.field7464.isAlive()) {
                            continue;
                        }
                        this.method5634("Thread " + this + " (" + this.field7464.getState() + ") failed to exit after " + n + " second(s)");
                        this.method5634("Stack:");
                        final StackTraceElement[] stackTrace = this.field7464.getStackTrace();
                        for (int length = stackTrace.length, i = 0; i < length; ++i) {
                            this.method5634(stackTrace[i].toString());
                        }
                        this.field7464.interrupt();
                    }
                }
                catch (final InterruptedException ex) {}
            }
            this.method5642(true);
            this.field7464 = null;
        }
    }
    
    public boolean method5631() {
        return this.field7461;
    }
    
    public void method5632(final String s) {
        this.field7462.method1489(s);
    }
    
    public void method5633(final String s) {
        this.field7462.method1479(s);
    }
    
    public void method5634(final String s) {
        this.field7462.method1480(s);
    }
    
    public void method5635(final String s) {
        this.field7462.method1488(s);
    }
    
    public int method5636() {
        return this.field7462.method1484();
    }
    
    public void method5637(final DatagramSocket obj) {
        this.method5632("registerSocket: " + obj);
        this.field7466.add(obj);
    }
    
    public boolean method5638(final DatagramSocket obj, final boolean b) {
        this.method5632("closeSocket: " + obj);
        if (null != obj) {
            boolean b2 = false;
            if (!obj.isClosed()) {
                obj.close();
                b2 = true;
            }
            if (b) {
                this.field7466.remove(obj);
            }
            return b2;
        }
        return false;
    }
    
    public boolean method5639(final ServerSocket serverSocket) {
        return this.method5640(serverSocket, true);
    }
    
    public boolean method5640(final ServerSocket obj, final boolean b) {
        this.method5632("closeSocket: " + obj);
        if (null == obj) {
            return false;
        }
        boolean b2 = false;
        try {
            if (!obj.isClosed()) {
                obj.close();
                b2 = true;
            }
        }
        catch (final IOException ex) {
            this.method5634("IO: " + ex.getMessage());
        }
        if (b) {
            this.field7467.remove(obj);
        }
        return b2;
    }
    
    public void method5641() {
        this.method5642(false);
    }
    
    public void method5642(final boolean b) {
        int i = 0;
        final Iterator<DatagramSocket> iterator = this.field7466.iterator();
        while (iterator.hasNext()) {
            if (!this.method5638(iterator.next(), false)) {
                continue;
            }
            ++i;
        }
        this.field7466.clear();
        final Iterator<ServerSocket> iterator2 = this.field7467.iterator();
        while (iterator2.hasNext()) {
            if (!this.method5640(iterator2.next(), false)) {
                continue;
            }
            ++i;
        }
        this.field7467.clear();
        if (b) {
            if (0 < i) {
                this.method5634("Force closed " + i + " sockets");
            }
        }
    }
    
    static {
        field7459 = LogManager.getLogger();
        field7460 = new AtomicInteger(0);
    }
}
