// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.net.ssl.X509TrustManager;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.SSLParameters;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import javax.net.ssl.SSLSocket;
import java.lang.reflect.Method;

public final class Class6552 extends Class6550
{
    public final Method field26038;
    public final Method field26039;
    
    public Class6552(final Method field26038, final Method field26039) {
        this.field26038 = field26038;
        this.field26039 = field26039;
    }
    
    @Override
    public void method19838(final SSLSocket sslSocket, final String s, final List<Class190> list) {
        try {
            final SSLParameters sslParameters = sslSocket.getSSLParameters();
            final List<String> method19850 = Class6550.method19850(list);
            this.field26038.invoke(sslParameters, method19850.toArray(new String[method19850.size()]));
            sslSocket.setSSLParameters(sslParameters);
        }
        catch (final IllegalAccessException | InvocationTargetException ex) {
            throw new AssertionError();
        }
    }
    
    @Override
    public String method19840(final SSLSocket obj) {
        try {
            final String s = (String)this.field26039.invoke(obj, new Object[0]);
            if (s == null || s.equals("")) {
                return null;
            }
            return s;
        }
        catch (final IllegalAccessException | InvocationTargetException ex) {
            throw new AssertionError();
        }
    }
    
    @Override
    public X509TrustManager method19844(final SSLSocketFactory sslSocketFactory) {
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }
    
    public static Class6552 method19856() {
        try {
            return new Class6552(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        }
        catch (final NoSuchMethodException ex) {
            return null;
        }
    }
}
