// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import okhttp3.OkHttpClient;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.logging.Level;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import javax.net.ssl.SSLSocketFactory;
import java.util.logging.Logger;

public class Class6550
{
    private static final Class6550 field26027;
    public static final int field26028 = 4;
    public static final int field26029 = 5;
    private static final Logger field26030;
    
    public static Class6550 method19842() {
        return Class6550.field26027;
    }
    
    public String method19843() {
        return "OkHttp";
    }
    
    public X509TrustManager method19844(final SSLSocketFactory sslSocketFactory) {
        try {
            final Object method19854 = method19854(sslSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (method19854 == null) {
                return null;
            }
            return method19854(method19854, X509TrustManager.class, "trustManager");
        }
        catch (final ClassNotFoundException ex) {
            return null;
        }
    }
    
    public void method19838(final SSLSocket sslSocket, final String s, final List<Class190> list) {
    }
    
    public void method19839(final SSLSocket sslSocket) {
    }
    
    public String method19840(final SSLSocket sslSocket) {
        return null;
    }
    
    public void method19845(final Socket socket, final InetSocketAddress endpoint, final int timeout) throws IOException {
        socket.connect(endpoint, timeout);
    }
    
    public void method19846(final int n, final String msg, final Throwable thrown) {
        Class6550.field26030.log((n != 5) ? Level.INFO : Level.WARNING, msg, thrown);
    }
    
    public boolean method19847(final String s) {
        return true;
    }
    
    public Object method19848(final String message) {
        if (!Class6550.field26030.isLoggable(Level.FINE)) {
            return null;
        }
        return new Throwable(message);
    }
    
    public void method19849(String string, final Object o) {
        if (o == null) {
            string += " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        this.method19846(5, string, (Throwable)o);
    }
    
    public static List<String> method19850(final List<Class190> list) {
        final ArrayList list2 = new ArrayList(list.size());
        for (int i = 0; i < list.size(); ++i) {
            final Class190 class190 = list.get(i);
            if (class190 != Class190.field622) {
                list2.add(class190.toString());
            }
        }
        return list2;
    }
    
    public Class7744 method19851(final X509TrustManager x509TrustManager) {
        return new Class7745(Class7195.method22082(x509TrustManager));
    }
    
    private static Class6550 method19852() {
        final Class6550 method19855 = Class6551.method19855();
        if (method19855 != null) {
            return method19855;
        }
        final Class6552 method19856 = Class6552.method19856();
        if (method19856 != null) {
            return method19856;
        }
        final Class6550 method19857 = Class6549.method19841();
        if (method19857 == null) {
            return new Class6550();
        }
        return method19857;
    }
    
    public static byte[] method19853(final List<Class190> list) {
        final Class1680 class1680 = new Class1680();
        for (int i = 0; i < list.size(); ++i) {
            final Class190 class1681 = list.get(i);
            if (class1681 != Class190.field622) {
                class1680.method6004(class1681.toString().length());
                class1680.method5997(class1681.toString());
            }
        }
        return class1680.method5989();
    }
    
    public static <T> T method19854(final Object obj, final Class<T> clazz, final String name) {
        for (Class<?> clazz2 = obj.getClass(); clazz2 != Object.class; clazz2 = clazz2.getSuperclass()) {
            try {
                final Field declaredField = clazz2.getDeclaredField(name);
                declaredField.setAccessible(true);
                final Object value = declaredField.get(obj);
                if (value == null || !clazz.isInstance(value)) {
                    return null;
                }
                return (T)clazz.cast(value);
            }
            catch (final NoSuchFieldException ex) {}
            catch (final IllegalAccessException ex2) {
                throw new AssertionError();
            }
        }
        if (!name.equals("delegate")) {
            final Object method19854 = method19854(obj, Object.class, "delegate");
            if (method19854 != null) {
                return (T)method19854(method19854, (Class<Object>)clazz, name);
            }
        }
        return null;
    }
    
    static {
        field26027 = method19852();
        field26030 = Logger.getLogger(OkHttpClient.class.getName());
    }
}
