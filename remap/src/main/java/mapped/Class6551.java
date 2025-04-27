// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.security.cert.X509Certificate;
import java.lang.reflect.InvocationTargetException;
import android.util.Log;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Class6551 extends Class6550
{
    private static final int field26031 = 4000;
    private final Class<?> field26032;
    private final Class7539<Socket> field26033;
    private final Class7539<Socket> field26034;
    private final Class7539<Socket> field26035;
    private final Class7539<Socket> field26036;
    private final Class9227 field26037;
    
    public Class6551(final Class<?> field26032, final Class7539<Socket> field26033, final Class7539<Socket> field26034, final Class7539<Socket> field26035, final Class7539<Socket> field26036) {
        this.field26037 = Class9227.method34031();
        this.field26032 = field26032;
        this.field26033 = field26033;
        this.field26034 = field26034;
        this.field26035 = field26035;
        this.field26036 = field26036;
    }
    
    @Override
    public void method19845(final Socket socket, final InetSocketAddress endpoint, final int timeout) throws IOException {
        try {
            socket.connect(endpoint, timeout);
        }
        catch (final AssertionError cause) {
            if (Class7690.method24444(cause)) {
                throw new IOException(cause);
            }
            goto Label_0031;
        }
        catch (final SecurityException cause2) {
            final IOException ex = new IOException("Exception in connect", cause2);
            throw ex;
        }
    }
    
    @Override
    public X509TrustManager method19844(final SSLSocketFactory sslSocketFactory) {
        Object o = Class6550.method19854(sslSocketFactory, this.field26032, "sslParameters");
        if (o == null) {
            try {
                o = Class6550.method19854(sslSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sslSocketFactory.getClass().getClassLoader()), "sslParameters");
            }
            catch (final ClassNotFoundException ex) {
                return super.method19844(sslSocketFactory);
            }
        }
        final X509TrustManager x509TrustManager = Class6550.method19854(o, X509TrustManager.class, "x509TrustManager");
        if (x509TrustManager != null) {
            return x509TrustManager;
        }
        return Class6550.method19854(o, X509TrustManager.class, "trustManager");
    }
    
    @Override
    public void method19838(final SSLSocket sslSocket, final String s, final List<Class190> list) {
        if (s != null) {
            this.field26033.method23621(sslSocket, true);
            this.field26034.method23621(sslSocket, s);
        }
        if (this.field26036 != null) {
            if (this.field26036.method23619(sslSocket)) {
                this.field26036.method23623(sslSocket, Class6550.method19853(list));
            }
        }
    }
    
    @Override
    public String method19840(final SSLSocket sslSocket) {
        if (this.field26035 == null) {
            return null;
        }
        if (this.field26035.method23619(sslSocket)) {
            final byte[] bytes = (byte[])this.field26035.method23623(sslSocket, new Object[0]);
            return (bytes == null) ? null : new String(bytes, Class7690.field30549);
        }
        return null;
    }
    
    @Override
    public void method19846(final int n, String string, final Throwable t) {
        final int n2 = (n != 5) ? 3 : 5;
        if (t != null) {
            string = string + '\n' + Log.getStackTraceString(t);
        }
        for (int i = 0, length = string.length(); i < length; ++i) {
            final int index = string.indexOf(10, i);
            final int a = (index == -1) ? length : index;
            do {
                final int min = Math.min(a, i + 4000);
                Log.println(n2, "OkHttp", string.substring(i, min));
                i = min;
            } while (i < a);
        }
    }
    
    @Override
    public Object method19848(final String s) {
        return this.field26037.method34029(s);
    }
    
    @Override
    public void method19849(final String s, final Object o) {
        if (!this.field26037.method34030(o)) {
            this.method19846(5, s, null);
        }
    }
    
    @Override
    public boolean method19847(final String s) {
        try {
            final Class<?> forName = Class.forName("android.security.NetworkSecurityPolicy");
            return (boolean)forName.getMethod("isCleartextTrafficPermitted", String.class).invoke(forName.getMethod("getInstance", new Class[0]).invoke(null), s);
        }
        catch (final ClassNotFoundException | NoSuchMethodException ex) {
            return super.method19847(s);
        }
        catch (final IllegalAccessException | IllegalArgumentException | InvocationTargetException ex2) {
            throw new AssertionError();
        }
    }
    
    @Override
    public Class7744 method19851(final X509TrustManager x509TrustManager) {
        try {
            final Class<?> forName = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new Class7743(forName.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), forName.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        }
        catch (final Exception ex) {
            return super.method19851(x509TrustManager);
        }
    }
    
    public static Class6550 method19855() {
        try {
            Class<?> clazz;
            try {
                clazz = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            }
            catch (final ClassNotFoundException ex) {
                clazz = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            }
            final Class7539<Socket> class7539 = new Class7539<Socket>(null, "setUseSessionTickets", Boolean.TYPE);
            final Class7539<Socket> class7540 = new Class7539<Socket>(null, "setHostname", String.class);
            Class7539<Socket> class7541 = null;
            Class7539<Socket> class7542 = null;
            try {
                Class.forName("android.net.Network");
                class7541 = new Class7539<Socket>(byte[].class, "getAlpnSelectedProtocol");
                class7542 = new Class7539<Socket>(null, "setAlpnProtocols", byte[].class);
            }
            catch (final ClassNotFoundException ex2) {}
            return new Class6551(clazz, class7539, class7540, class7541, class7542);
        }
        catch (final ClassNotFoundException ex3) {
            return null;
        }
    }
}
