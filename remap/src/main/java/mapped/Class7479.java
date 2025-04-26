// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import okhttp3.Call;
import okhttp3.OkHttpClient;

import java.util.Collections;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.net.ProtocolException;
import java.util.concurrent.ScheduledFuture;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.Random;
import java.util.List;

public final class Class7479 implements Class7481, Class7480
{
    private static final List<Class190> field28878;
    private static final long field28879 = 16777216L;
    private static final long field28880 = 60000L;
    private final Request field28881;
    public final Class9345 field28882;
    private final Random field28883;
    private final String field28884;
    private Call field28885;
    private final Runnable field28886;
    private Class8939 field28887;
    private Class8625 field28888;
    private ScheduledExecutorService field28889;
    private Class1669 field28890;
    private final ArrayDeque<Class1929> field28891;
    private final ArrayDeque<Object> field28892;
    private long field28893;
    private boolean field28894;
    private ScheduledFuture<?> field28895;
    private int field28896;
    private String field28897;
    private boolean field28898;
    public int field28899;
    public int field28900;
    public static final /* synthetic */ boolean field28901;
    
    public Class7479(final Request field28881, final Class9345 field28882, final Random field28883) {
        this.field28891 = new ArrayDeque<Class1929>();
        this.field28892 = new ArrayDeque<Object>();
        this.field28896 = -1;
        if ("GET".equals(field28881.method29110())) {
            this.field28881 = field28881;
            this.field28882 = field28882;
            this.field28883 = field28883;
            final byte[] bytes = new byte[16];
            field28883.nextBytes(bytes);
            this.field28884 = Class1929.method7738(bytes).method7745();
            this.field28886 = new Class1133(this);
            return;
        }
        throw new IllegalArgumentException("Request must be GET: " + field28881.method29110());
    }
    
    @Override
    public Request method23109() {
        return this.field28881;
    }
    
    @Override
    public synchronized long method23110() {
        return this.field28893;
    }
    
    @Override
    public void method23111() {
        this.field28885.cancel();
    }
    
    public void method23112(OkHttpClient method33531) {
        method33531 = method33531.method9417().method33523(Class7479.field28878).method33531();
        final int method33532 = method33531.method9392();
        final Request method33533 = this.field28881.method29116().method31312("Upgrade", "websocket").method31312("Connection", "Upgrade").method31312("Sec-WebSocket-Key", this.field28884).method31312("Sec-WebSocket-Version", "13").method31326();
        (this.field28885 = Class9013.field38043.method32277(method33531, method33533)).enqueue(new Class6393(this, method33533, method33532));
    }
    
    public void method23113(final Response class1753) throws ProtocolException {
        if (class1753.method6188() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + class1753.method6188() + " " + class1753.method6190() + "'");
        }
        final String method6193 = class1753.method6193("Connection");
        if (!"Upgrade".equalsIgnoreCase(method6193)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + method6193 + "'");
        }
        final String method6194 = class1753.method6193("Upgrade");
        if (!"websocket".equalsIgnoreCase(method6194)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + method6194 + "'");
        }
        final String method6195 = class1753.method6193("Sec-WebSocket-Accept");
        final String method6196 = Class1929.method7741(this.field28884 + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").method7747().method7745();
        if (method6196.equals(method6195)) {
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + method6196 + "' but was '" + method6195 + "'");
    }
    
    public void method23114(final String s, final long n, final Class1669 field28890) throws IOException {
        synchronized (this) {
            this.field28890 = field28890;
            this.field28888 = new Class8625(field28890.field9453, field28890.field9455, this.field28883);
            this.field28889 = new ScheduledThreadPoolExecutor(1, Class7690.method24439(s, false));
            if (n != 0L) {
                this.field28889.scheduleAtFixedRate(new Class1635(this), n, n, TimeUnit.MILLISECONDS);
            }
            if (!this.field28892.isEmpty()) {
                this.method23132();
            }
        }
        this.field28887 = new Class8939(field28890.field9453, field28890.field9454, this);
    }
    
    public void method23115() throws IOException {
        while (this.field28896 == -1) {
            this.field28887.method31702();
        }
    }
    
    public boolean method23116() throws IOException {
        try {
            this.field28887.method31702();
            return this.field28896 == -1;
        }
        catch (final Exception ex) {
            this.method23135(ex, null);
            return false;
        }
    }
    
    public void method23117(final int n, final TimeUnit timeUnit) throws InterruptedException {
        this.field28889.awaitTermination(n, timeUnit);
    }
    
    public void method23118() throws InterruptedException {
        if (this.field28895 != null) {
            this.field28895.cancel(false);
        }
        this.field28889.shutdown();
        this.field28889.awaitTermination(10L, TimeUnit.SECONDS);
    }
    
    public synchronized int method23119() {
        return this.field28899;
    }
    
    public synchronized int method23120() {
        return this.field28900;
    }
    
    @Override
    public void method23121(final String s) throws IOException {
        this.field28882.method34635(this, s);
    }
    
    @Override
    public void method23122(final Class1929 class1929) throws IOException {
        this.field28882.method34636(this, class1929);
    }
    
    @Override
    public synchronized void method23123(final Class1929 e) {
        if (!this.field28898 && (!this.field28894 || !this.field28892.isEmpty())) {
            this.field28891.add(e);
            this.method23132();
            ++this.field28899;
        }
    }
    
    @Override
    public synchronized void method23124(final Class1929 class1929) {
        ++this.field28900;
    }
    
    @Override
    public void method23125(final int field28896, final String field28897) {
        if (field28896 == -1) {
            throw new IllegalArgumentException();
        }
        Closeable field28898 = null;
        synchronized (this) {
            if (this.field28896 != -1) {
                throw new IllegalStateException("already closed");
            }
            this.field28896 = field28896;
            this.field28897 = field28897;
            if (this.field28894 && this.field28892.isEmpty()) {
                field28898 = this.field28890;
                this.field28890 = null;
                if (this.field28895 != null) {
                    this.field28895.cancel(false);
                }
                this.field28889.shutdown();
            }
        }
        try {
            this.field28882.method34639(this, field28896, field28897);
            if (field28898 != null) {
                this.field28882.method34637(this, field28896, field28897);
            }
        }
        finally {
            Class7690.method24432(field28898);
        }
    }
    
    @Override
    public boolean method23126(final String s) {
        if (s != null) {
            return this.method23128(Class1929.method7741(s), 1);
        }
        throw new NullPointerException("text == null");
    }
    
    @Override
    public boolean method23127(final Class1929 class1929) {
        if (class1929 != null) {
            return this.method23128(class1929, 2);
        }
        throw new NullPointerException("bytes == null");
    }
    
    private synchronized boolean method23128(final Class1929 class1929, final int n) {
        if (this.field28898 || this.field28894) {
            return false;
        }
        if (this.field28893 + class1929.method7766() <= 16777216L) {
            this.field28893 += class1929.method7766();
            this.field28892.add(new Class9064(n, class1929));
            this.method23132();
            return true;
        }
        this.method23130(1001, null);
        return false;
    }
    
    public synchronized boolean method23129(final Class1929 e) {
        if (!this.field28898 && (!this.field28894 || !this.field28892.isEmpty())) {
            this.field28891.add(e);
            this.method23132();
            return true;
        }
        return false;
    }
    
    @Override
    public boolean method23130(final int n, final String s) {
        return this.method23131(n, s, 60000L);
    }
    
    public synchronized boolean method23131(final int n, final String str, final long n2) {
        Class8402.method28022(n);
        Class1929 method7741 = null;
        if (str != null) {
            method7741 = Class1929.method7741(str);
            if (method7741.method7766() > 123L) {
                throw new IllegalArgumentException("reason.size() > 123: " + str);
            }
        }
        if (!this.field28898 && !this.field28894) {
            this.field28894 = true;
            this.field28892.add(new Class8416(n, method7741, n2));
            this.method23132();
            return true;
        }
        return false;
    }
    
    private void method23132() {
        if (!Class7479.field28901 && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (this.field28889 != null) {
            this.field28889.execute(this.field28886);
        }
    }
    
    public boolean method23133() throws IOException {
        Class9064 poll = null;
        int field28896 = -1;
        String field28897 = null;
        Closeable field28898 = null;
        final Class8625 field28899;
        final Class1929 class1929;
        synchronized (this) {
            if (this.field28898) {
                return false;
            }
            field28899 = this.field28888;
            class1929 = this.field28891.poll();
            if (class1929 == null) {
                poll = this.field28892.poll();
                if (poll instanceof Class8416) {
                    field28896 = this.field28896;
                    field28897 = this.field28897;
                    if (field28896 != -1) {
                        field28898 = this.field28890;
                        this.field28890 = null;
                        this.field28889.shutdown();
                    }
                    else {
                        this.field28895 = this.field28889.schedule(new Class989(this), ((Class8416)poll).field34554, TimeUnit.MILLISECONDS);
                    }
                }
                else if (poll == null) {
                    return false;
                }
            }
        }
        try {
            if (class1929 != null) {
                field28899.method29268(class1929);
            }
            else if (poll instanceof Class9064) {
                final Class1929 field28900 = poll.field38378;
                final Class1679 method30276 = Class8753.method30276(field28899.method29271(poll.field38377, field28900.method7766()));
                method30276.method5927(field28900);
                method30276.close();
                synchronized (this) {
                    this.field28893 -= field28900.method7766();
                }
            }
            else {
                if (!(poll instanceof Class8416)) {
                    throw new AssertionError();
                }
                final Class8416 class1930 = (Class8416)poll;
                field28899.method29269(class1930.field34552, class1930.field34553);
                if (field28898 != null) {
                    this.field28882.method34637(this, field28896, field28897);
                }
            }
            return true;
        }
        finally {
            Class7690.method24432(field28898);
        }
    }
    
    public void method23134() {
        final Class8625 field28888;
        synchronized (this) {
            if (this.field28898) {
                return;
            }
            field28888 = this.field28888;
        }
        try {
            field28888.method29267(Class1929.field10532);
        }
        catch (final IOException ex) {
            this.method23135(ex, null);
        }
    }
    
    public void method23135(final Exception ex, final Response class1753) {
        final Class1669 field28890;
        synchronized (this) {
            if (this.field28898) {
                return;
            }
            this.field28898 = true;
            field28890 = this.field28890;
            this.field28890 = null;
            if (this.field28895 != null) {
                this.field28895.cancel(false);
            }
            if (this.field28889 != null) {
                this.field28889.shutdown();
            }
        }
        try {
            this.field28882.method34638(this, ex, class1753);
        }
        finally {
            Class7690.method24432(field28890);
        }
    }
    
    static {
        field28901 = !Class7479.class.desiredAssertionStatus();
        field28878 = Collections.singletonList(Class190.field623);
    }
}
