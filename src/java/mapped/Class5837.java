// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.net.URISyntaxException;
import javax.net.SocketFactory;
import javax.net.ssl.HttpsURLConnection;
import java.util.HashMap;

public class Class5837
{
    private Class959 field23930;
    private static Thread field23931;
    public Class7679 field23932;
    
    public void method17548() {
        this.method17549();
    }
    
    public void method17549() {
        final HashMap hashMap = new HashMap();
        hashMap.put("Cookie", "agoratk=00");
        hashMap.put("X-Forwarded-For", "1.1.1.1");
        hashMap.put("User-Agent", "Agora client");
        hashMap.put("Referer", "https://agora.sigmaclient.info");
        final String replaceAll = Class9463.method35173().method35201().method19351().replaceAll("-", "");
        try {
            (this.field23930 = new Class959(this, "wss://wsprg.sigmaclient.info/ws/agora/" + replaceAll, hashMap)).method5487(HttpsURLConnection.getDefaultSSLSocketFactory());
            this.field23930.method5453();
        }
        catch (final URISyntaxException ex) {
            ex.printStackTrace();
        }
    }
    
    public void method17550() {
        Class9198.method33654();
    }
    
    public synchronized void method17551() {
        if (Class5837.field23931 == null) {
            (Class5837.field23931 = new Thread(() -> {
                try {
                    Thread.sleep(10000L);
                }
                catch (final InterruptedException ex) {
                    ex.printStackTrace();
                }
                this.method17549();
                Class5837.field23931 = null;
            })).start();
        }
    }
    
    public void method17552(final Class7679 field23932) {
        if (this.field23932 != null) {
            return;
        }
        while (!Class9146.field38766) {
            try {
                Thread.sleep(1000L);
            }
            catch (final InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        this.field23932 = field23932;
        if (!(field23932 instanceof Class7678)) {
            if (field23932 instanceof Class7680) {
                for (final Object next : Class9146.field38765) {
                    for (Class<?> key = next.getClass(); key != null; key = key.getSuperclass()) {
                        for (final Method method : key.getDeclaredMethods()) {
                            if (Class9463.method35173().method35188().method21087(method)) {
                                method.setAccessible(true);
                                final Class2046 method2 = Class9463.method35173().method35188().method21091(method);
                                final Class<?> clazz = method.getParameterTypes()[0];
                                final Class7557 class7557 = new Class7557(next, key, method, method2);
                                final Map<Class<? extends Class5730>, List<Class7557>> map = Class9463.method35173().method35188().field26968.getOrDefault(key, new HashMap<Class<? extends Class5730>, List<Class7557>>());
                                List<Class7557> list = map.get(clazz);
                                if (list == null) {
                                    map.put((Class<? extends Class5730>)clazz, (ArrayList)(list = new ArrayList<Class7557>()));
                                }
                                list.add(class7557);
                                map.put((Class<? extends Class5730>)clazz, (ArrayList)list);
                                Class9463.method35173().method35188().field26968.put((Class)key, map);
                            }
                        }
                    }
                }
                Class9463.method35173().method35188().method21096();
                for (final Class3167 class7558 : Class9463.method35173().method35189().method21553().values()) {
                    final Iterator<Class4997> iterator3 = class7558.method9899().values().iterator();
                    while (iterator3.hasNext()) {
                        iterator3.next().method15201();
                    }
                    if (class7558 instanceof Class3247) {
                        final Class3167[] field23933 = ((Class3247)class7558).field15742;
                        for (int length2 = field23933.length, j = 0; j < length2; ++j) {
                            final Iterator<Class4997> iterator4 = field23933[j].method9899().values().iterator();
                            while (iterator4.hasNext()) {
                                iterator4.next().method15201();
                            }
                        }
                    }
                    if (class7558.method9906()) {
                        Class9463.method35173().method35188().method21092(class7558);
                        if (!(class7558 instanceof Class3247)) {
                            continue;
                        }
                        final Class3247 class7559 = (Class3247)class7558;
                        if (class7559.field15743 == null) {
                            continue;
                        }
                        Class9463.method35173().method35188().method21092(class7559.field15743);
                    }
                    else {
                        Class9463.method35173().method35188().method21093(class7558);
                        if (!(class7558 instanceof Class3247)) {
                            continue;
                        }
                        final Class3167[] field23934 = ((Class3247)class7558).field15742;
                        for (int length3 = field23934.length, k = 0; k < length3; ++k) {
                            Class9463.method35173().method35188().method21093(field23934[k]);
                        }
                    }
                }
            }
        }
    }
    
    public void method17553() {
        Class8250.method27359();
    }
    
    static {
        Class5837.field23931 = null;
    }
}
