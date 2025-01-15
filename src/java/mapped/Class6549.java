// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import java.lang.reflect.Method;

public class Class6549 extends Class6550
{
    private final Method field26022;
    private final Method field26023;
    private final Method field26024;
    private final Class<?> field26025;
    private final Class<?> field26026;
    
    public Class6549(final Method field26022, final Method field26023, final Method field26024, final Class<?> field26025, final Class<?> field26026) {
        this.field26022 = field26022;
        this.field26023 = field26023;
        this.field26024 = field26024;
        this.field26025 = field26025;
        this.field26026 = field26026;
    }
    
    @Override
    public void method19838(final SSLSocket sslSocket, final String s, final List<Class190> list) {
        final List<String> method19850 = Class6550.method19850(list);
        try {
            this.field26022.invoke(null, sslSocket, Proxy.newProxyInstance(Class6550.class.getClassLoader(), new Class[] { this.field26025, this.field26026 }, new Class3(method19850)));
        }
        catch (final InvocationTargetException | IllegalAccessException detailMessage) {
            throw new AssertionError(detailMessage);
        }
    }
    
    @Override
    public void method19839(final SSLSocket sslSocket) {
        try {
            this.field26024.invoke(null, sslSocket);
        }
        catch (final IllegalAccessException | InvocationTargetException ex) {
            throw new AssertionError();
        }
    }
    
    @Override
    public String method19840(final SSLSocket sslSocket) {
        try {
            final Class3 class3 = (Class3)Proxy.getInvocationHandler(this.field26023.invoke(null, sslSocket));
            if (!class3.field4 && class3.field5 == null) {
                Class6550.method19842().method19846(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            return class3.field4 ? null : class3.field5;
        }
        catch (final InvocationTargetException | IllegalAccessException ex) {
            throw new AssertionError();
        }
    }
    
    public static Class6550 method19841() {
        try {
            final String s = "org.eclipse.jetty.alpn.ALPN";
            final Class<?> forName = Class.forName(s);
            return new Class6549(forName.getMethod("put", SSLSocket.class, Class.forName(s + "$Provider")), forName.getMethod("get", SSLSocket.class), forName.getMethod("remove", SSLSocket.class), Class.forName(s + "$ClientProvider"), Class.forName(s + "$ServerProvider"));
        }
        catch (final ClassNotFoundException | NoSuchMethodException ex) {
            return null;
        }
    }
}
