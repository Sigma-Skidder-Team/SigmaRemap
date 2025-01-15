// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.net.SocketAddress;
import java.net.Socket;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Comparator;
import com.google.common.collect.Lists;
import java.util.List;

public class Class9240
{
    private static String[] field39625;
    
    public static List<Class7433> method34066(final Class2000... array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            method34067(Class2000.method8020(array[i]));
        }
        final ArrayList arrayList = Lists.newArrayList();
        for (final Class2000 class2000 : array) {
            arrayList.add(new Class7433(Class2000.method8021(class2000), method34067(Class2000.method8020(class2000))));
        }
        arrayList.sort(Comparator.comparingInt(Class7433::method22867));
        return arrayList;
    }
    
    private static int method34067(final String hostname) {
        long n = 0L;
        Socket socket = null;
        for (int i = 0; i < 5; ++i) {
            try {
                final InetSocketAddress endpoint = new InetSocketAddress(hostname, 80);
                socket = new Socket();
                final long method34069 = method34069();
                socket.connect(endpoint, 700);
                n += method34069() - method34069;
            }
            catch (final Exception ex) {
                n += 700L;
            }
            finally {
                method34068(socket);
            }
        }
        return (int)(n / 5.0);
    }
    
    private static void method34068(final Socket socket) {
        try {
            if (socket != null) {
                socket.close();
            }
        }
        catch (final Throwable t) {}
    }
    
    private static long method34069() {
        return System.currentTimeMillis();
    }
    
    public static List<Class7433> method34070() {
        return method34066(Class2000.values());
    }
}
