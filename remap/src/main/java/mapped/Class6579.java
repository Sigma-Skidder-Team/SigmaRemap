// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.io.InterruptedIOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.net.URL;
import java.io.IOException;
import java.net.Proxy;
import java.util.Map;

public class Class6579
{
    private static Map<Object, Class6794> field26103;
    public static final String field26104 = "User-Agent";
    public static final String field26105 = "Host";
    public static final String field26106 = "Accept";
    public static final String field26107 = "Location";
    public static final String field26108 = "Keep-Alive";
    public static final String field26109 = "Connection";
    public static final String field26110 = "keep-alive";
    public static final String field26111 = "Transfer-Encoding";
    public static final String field26112 = "chunked";
    
    private Class6579() {
    }
    
    public static void method19917(final String s, final Class8814 class8814) throws IOException {
        method19918(s, class8814, Proxy.NO_PROXY);
    }
    
    public static void method19918(final String s, final Class8814 class8814, final Proxy proxy) throws IOException {
        method19920(new Class8821(method19919(s, proxy), class8814));
    }
    
    public static Class8153 method19919(final String spec, final Proxy proxy) throws IOException {
        final URL obj = new URL(spec);
        if (obj.getProtocol().equals("http")) {
            final String file = obj.getFile();
            final String host = obj.getHost();
            int port = obj.getPort();
            if (port <= 0) {
                port = 80;
            }
            final String s = "GET";
            final String s2 = "HTTP/1.1";
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("User-Agent", "Java/" + System.getProperty("java.version"));
            linkedHashMap.put("Host", host);
            linkedHashMap.put("Accept", "text/html, image/gif, image/png");
            linkedHashMap.put("Connection", "keep-alive");
            return new Class8153(host, port, proxy, s, file, s2, linkedHashMap, new byte[0]);
        }
        throw new IOException("Only protocol http is supported: " + obj);
    }
    
    public static void method19920(final Class8821 class8821) {
        final Class8153 method30768 = class8821.method30768();
        for (Class6794 class8822 = method19921(method30768.method26851(), method30768.method26852(), method30768.method26860()); !class8822.method20797(class8821); class8822 = method19921(method30768.method26851(), method30768.method26852(), method30768.method26860())) {
            method19922(method30768.method26851(), method30768.method26852(), method30768.method26860(), class8822);
        }
    }
    
    private static synchronized Class6794 method19921(final String s, final int n, final Proxy proxy) {
        final String method19923 = method19923(s, n, proxy);
        Class6794 class6794 = Class6579.field26103.get(method19923);
        if (class6794 == null) {
            class6794 = new Class6794(s, n, proxy);
            Class6579.field26103.put(method19923, class6794);
        }
        return class6794;
    }
    
    private static synchronized void method19922(final String s, final int n, final Proxy proxy, final Class6794 class6794) {
        final String method19923 = method19923(s, n, proxy);
        if (Class6579.field26103.get(method19923) == class6794) {
            Class6579.field26103.remove(method19923);
        }
    }
    
    private static String method19923(final String str, final int i, final Proxy obj) {
        return str + ":" + i + "-" + obj;
    }
    
    public static byte[] method19924(final String s) throws IOException {
        return method19925(s, Proxy.NO_PROXY);
    }
    
    public static byte[] method19925(final String spec, final Proxy proxy) throws IOException {
        if (spec.startsWith("file:")) {
            return Config.method28961(new URL(spec).openStream());
        }
        final Class8215 method19926 = method19926(method19919(spec, proxy));
        if (method19926.method27216() / 100 == 2) {
            return method19926.method27220();
        }
        throw new IOException("HTTP response: " + method19926.method27216());
    }
    
    public static Class8215 method19926(final Class8153 class8153) throws IOException {
        final HashMap hashMap = new HashMap();
        final Class8815 class8154 = new Class8815(hashMap);
        synchronized (hashMap) {
            method19920(new Class8821(class8153, class8154));
            try {
                hashMap.wait();
            }
            catch (final InterruptedException ex) {
                throw new InterruptedIOException("Interrupted");
            }
            final Exception cause = (Exception)hashMap.get("Exception");
            if (cause != null) {
                if (cause instanceof IOException) {
                    throw (IOException)cause;
                }
                if (cause instanceof RuntimeException) {
                    throw (RuntimeException)cause;
                }
                throw new RuntimeException(cause.getMessage(), cause);
            }
            else {
                final Class8215 class8155 = (Class8215)hashMap.get("Response");
                if (class8155 == null) {
                    throw new IOException("Response is null");
                }
                return class8155;
            }
        }
    }
    
    public static boolean method19927() {
        final Iterator<Class6794> iterator = Class6579.field26103.values().iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().method20818()) {
                continue;
            }
            return true;
        }
        return false;
    }
    
    static {
        Class6579.field26103 = new HashMap<Object, Class6794>();
    }
}
