// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.net.ssl.SSLException;
import org.java_websocket.exceptions.InvalidHandshakeException;
import java.util.Iterator;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import javax.net.ssl.TrustManager;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.io.IOException;
import java.util.Collections;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.Map;
import java.net.Proxy;
import java.io.OutputStream;
import javax.net.SocketFactory;
import java.net.Socket;
import java.net.URI;

public abstract class Class956 extends Class960 implements Runnable, Class957
{
    public URI field5064;
    private Class958 field5065;
    private Socket field5066;
    private SocketFactory field5067;
    private OutputStream field5068;
    private Proxy field5069;
    private Thread field5070;
    private Thread field5071;
    private Class9122 field5072;
    private Map<String, String> field5073;
    private CountDownLatch field5074;
    private CountDownLatch field5075;
    private int field5076;
    
    public Class956(final URI uri) {
        this(uri, new Class9121());
    }
    
    public Class956(final URI uri, final Class9122 class9122) {
        this(uri, class9122, null, 0);
    }
    
    public Class956(final URI uri, final Map<String, String> map) {
        this(uri, new Class9121(), map);
    }
    
    public Class956(final URI uri, final Class9122 class9122, final Map<String, String> map) {
        this(uri, class9122, map, 0);
    }
    
    public Class956(final URI field5064, final Class9122 field5065, final Map<String, String> map, final int field5066) {
        this.field5064 = null;
        this.field5065 = null;
        this.field5066 = null;
        this.field5067 = null;
        this.field5069 = Proxy.NO_PROXY;
        this.field5074 = new CountDownLatch(1);
        this.field5075 = new CountDownLatch(1);
        this.field5076 = 0;
        if (field5064 == null) {
            throw new IllegalArgumentException();
        }
        if (field5065 != null) {
            this.field5064 = field5064;
            this.field5072 = field5065;
            if (map != null) {
                (this.field5073 = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER)).putAll(map);
            }
            this.field5076 = field5066;
            this.method5544(false);
            this.method5546(false);
            this.field5065 = new Class958(this, field5065);
            return;
        }
        throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
    }
    
    public URI method5444() {
        return this.field5064;
    }
    
    @Override
    public Class9122 method5445() {
        return this.field5072;
    }
    
    public Socket method5446() {
        return this.field5066;
    }
    
    public void method5447(final String s, final String s2) {
        if (this.field5073 == null) {
            this.field5073 = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
        }
        this.field5073.put(s, s2);
    }
    
    public String method5448(final String s) {
        if (this.field5073 != null) {
            return this.field5073.remove(s);
        }
        return null;
    }
    
    public void method5449() {
        this.field5073 = null;
    }
    
    public void method5450() {
        this.method5452();
        this.method5453();
    }
    
    public boolean method5451() throws InterruptedException {
        this.method5452();
        return this.method5454();
    }
    
    private void method5452() {
        final Thread currentThread = Thread.currentThread();
        if (currentThread == this.field5070 || currentThread == this.field5071) {
            throw new IllegalStateException("You cannot initialize a reconnect out of the websocket thread. Use reconnect in another thread to insure a successful cleanup.");
        }
        try {
            this.method5457();
            if (this.field5070 != null) {
                this.field5070.interrupt();
                this.field5070 = null;
            }
            if (this.field5071 != null) {
                this.field5071.interrupt();
                this.field5071 = null;
            }
            this.field5072.method33044();
            if (this.field5066 != null) {
                this.field5066.close();
                this.field5066 = null;
            }
        }
        catch (final Exception ex) {
            this.method5483(ex);
            this.field5065.method5496(1006, ex.getMessage());
            return;
        }
        this.field5074 = new CountDownLatch(1);
        this.field5075 = new CountDownLatch(1);
        this.field5065 = new Class958(this, this.field5072);
    }
    
    public void method5453() {
        if (this.field5071 == null) {
            (this.field5071 = new Thread(this)).setName("WebSocketConnectReadThread-" + this.field5071.getId());
            this.field5071.start();
            return;
        }
        throw new IllegalStateException("WebSocketClient objects are not reuseable");
    }
    
    public boolean method5454() throws InterruptedException {
        this.method5453();
        this.field5074.await();
        return this.field5065.method5489();
    }
    
    public boolean method5455(final long timeout, final TimeUnit unit) throws InterruptedException {
        this.method5453();
        return this.field5074.await(timeout, unit) && this.field5065.method5489();
    }
    
    @Override
    public void method5456() {
        if (this.field5070 != null) {
            this.field5065.method5494(1000);
        }
    }
    
    public void method5457() throws InterruptedException {
        this.method5456();
        this.field5075.await();
    }
    
    @Override
    public void method5458(final String s) {
        this.field5065.method5458(s);
    }
    
    @Override
    public void method5459(final byte[] array) {
        this.field5065.method5459(array);
    }
    
    @Override
    public <T> T method5460() {
        return this.field5065.method5460();
    }
    
    @Override
    public <T> void method5461(final T t) {
        this.field5065.method5461(t);
    }
    
    @Override
    public Collection<Class957> method5462() {
        return (Collection<Class957>)Collections.singletonList(this.field5065);
    }
    
    @Override
    public void method5463() {
        this.field5065.method5463();
    }
    
    @Override
    public void run() {
        InputStream inputStream;
        try {
            boolean b = false;
            if (this.field5067 != null) {
                this.field5066 = this.field5067.createSocket();
            }
            else if (this.field5066 == null) {
                this.field5066 = new Socket(this.field5069);
                b = true;
            }
            else if (this.field5066.isClosed()) {
                throw new IOException();
            }
            this.field5066.setTcpNoDelay(this.method5543());
            this.field5066.setReuseAddress(this.method5545());
            if (!this.field5066.isBound()) {
                this.field5066.connect(new InetSocketAddress(this.field5064.getHost(), this.method5464()), this.field5076);
            }
            if (b && "wss".equals(this.field5064.getScheme())) {
                final SSLContext instance = SSLContext.getInstance("TLSv1.2");
                instance.init(null, null, null);
                this.field5066 = instance.getSocketFactory().createSocket(this.field5066, this.field5064.getHost(), this.method5464(), true);
            }
            inputStream = this.field5066.getInputStream();
            this.field5068 = this.field5066.getOutputStream();
            this.method5465();
        }
        catch (final UnknownHostException ex) {
            return;
        }
        catch (final Exception ex2) {
            this.method5471(this.field5065, ex2);
            this.field5065.method5496(-1, ex2.getMessage());
            return;
        }
        (this.field5070 = new Thread(new Class1103(this, this))).start();
        final byte[] array = new byte[16384];
        try {
            int read;
            while (!this.method5492() && !this.method5491() && (read = inputStream.read(array)) != -1) {
                this.field5065.method5509(ByteBuffer.wrap(array, 0, read));
            }
            this.field5065.method5520();
        }
        catch (final IOException ex3) {
            this.method5503(ex3);
        }
        catch (final RuntimeException ex4) {
            this.method5483(ex4);
            this.field5065.method5496(1006, ex4.getMessage());
        }
        this.field5071 = null;
    }
    
    private int method5464() {
        final int port = this.field5064.getPort();
        if (port != -1) {
            return port;
        }
        final String scheme = this.field5064.getScheme();
        if ("wss".equals(scheme)) {
            return 443;
        }
        if (!"ws".equals(scheme)) {
            throw new IllegalArgumentException("unknown scheme: " + scheme);
        }
        return 80;
    }
    
    private void method5465() throws InvalidHandshakeException {
        final String rawPath = this.field5064.getRawPath();
        final String rawQuery = this.field5064.getRawQuery();
        String string;
        if (rawPath != null && rawPath.length() != 0) {
            string = rawPath;
        }
        else {
            string = "/";
        }
        if (rawQuery != null) {
            string = string + '?' + rawQuery;
        }
        final int method5464 = this.method5464();
        final String string2 = this.field5064.getHost() + ((method5464 != 80 && method5464 != 443) ? (":" + method5464) : "");
        final Class6085 class6085 = new Class6085();
        class6085.method18143(string);
        class6085.method18148("Host", string2);
        if (this.field5073 != null) {
            for (final Map.Entry entry : this.field5073.entrySet()) {
                class6085.method18148((String)entry.getKey(), (String)entry.getValue());
            }
        }
        this.field5065.method5523(class6085);
    }
    
    @Override
    public Class2154 method5466() {
        return this.field5065.method5466();
    }
    
    @Override
    public final void method5467(final Class957 class957, final String s) {
        this.method5481(s);
    }
    
    @Override
    public final void method5468(final Class957 class957, final ByteBuffer byteBuffer) {
        this.method5484(byteBuffer);
    }
    
    @Override
    public final void method5469(final Class957 class957, final Class6090 class958) {
        this.method5539();
        this.method5480((Class6089)class958);
        this.field5074.countDown();
    }
    
    @Override
    public final void method5470(final Class957 class957, final int n, final String s, final boolean b) {
        this.method5538();
        if (this.field5070 != null) {
            this.field5070.interrupt();
        }
        this.method5482(n, s, b);
        this.field5074.countDown();
        this.field5075.countDown();
    }
    
    @Override
    public final void method5471(final Class957 class957, final Exception ex) {
        this.method5483(ex);
    }
    
    @Override
    public final void method5472(final Class957 class957) {
    }
    
    @Override
    public void method5473(final Class957 class957, final int n, final String s) {
        this.method5475(n, s);
    }
    
    @Override
    public void method5474(final Class957 class957, final int n, final String s, final boolean b) {
        this.method5476(n, s, b);
    }
    
    public void method5475(final int n, final String s) {
    }
    
    public void method5476(final int n, final String s, final boolean b) {
    }
    
    public Class957 method5477() {
        return this.field5065;
    }
    
    @Override
    public InetSocketAddress method5478(final Class957 class957) {
        if (this.field5066 == null) {
            return null;
        }
        return (InetSocketAddress)this.field5066.getLocalSocketAddress();
    }
    
    @Override
    public InetSocketAddress method5479(final Class957 class957) {
        if (this.field5066 == null) {
            return null;
        }
        return (InetSocketAddress)this.field5066.getRemoteSocketAddress();
    }
    
    public abstract void method5480(final Class6089 p0);
    
    public abstract void method5481(final String p0);
    
    public abstract void method5482(final int p0, final String p1, final boolean p2);
    
    public abstract void method5483(final Exception p0);
    
    public void method5484(final ByteBuffer byteBuffer) {
    }
    
    public void method5485(final Proxy field5069) {
        if (field5069 != null) {
            this.field5069 = field5069;
            return;
        }
        throw new IllegalArgumentException();
    }
    
    @Deprecated
    public void method5486(final Socket field5066) {
        if (this.field5066 == null) {
            this.field5066 = field5066;
            return;
        }
        throw new IllegalStateException("socket has already been set");
    }
    
    public void method5487(final SocketFactory field5067) {
        this.field5067 = field5067;
    }
    
    @Override
    public void method5488(final Class2058 class2058, final ByteBuffer byteBuffer, final boolean b) {
        this.field5065.method5488(class2058, byteBuffer, b);
    }
    
    @Override
    public boolean method5489() {
        return this.field5065.method5489();
    }
    
    @Override
    public boolean method5490() {
        return this.field5065.method5490();
    }
    
    @Override
    public boolean method5491() {
        return this.field5065.method5491();
    }
    
    @Override
    public boolean method5492() {
        return this.field5065.method5492();
    }
    
    @Override
    public boolean method5493() {
        return this.field5065.method5493();
    }
    
    @Override
    public void method5494(final int n) {
        this.field5065.method5494(n);
    }
    
    @Override
    public void method5495(final int n, final String s) {
        this.field5065.method5495(n, s);
    }
    
    @Override
    public void method5496(final int n, final String s) {
        this.field5065.method5496(n, s);
    }
    
    @Override
    public void method5497(final ByteBuffer byteBuffer) {
        this.field5065.method5497(byteBuffer);
    }
    
    @Override
    public void method5498(final Class2776 class2776) {
        this.field5065.method5498(class2776);
    }
    
    @Override
    public void method5499(final Collection<Class2776> collection) {
        this.field5065.method5499(collection);
    }
    
    @Override
    public InetSocketAddress method5500() {
        return this.field5065.method5500();
    }
    
    @Override
    public InetSocketAddress method5501() {
        return this.field5065.method5501();
    }
    
    @Override
    public String method5502() {
        return this.field5064.getPath();
    }
    
    private void method5503(final IOException ex) {
        if (ex instanceof SSLException) {
            this.method5483(ex);
        }
        this.field5065.method5520();
    }
}
